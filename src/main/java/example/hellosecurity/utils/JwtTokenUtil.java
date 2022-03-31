package example.hellosecurity.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

/**
 * jwt 工具类
 *
 * @author linmeng
 * @version 1.0
 * @date 2022年3月14日 15:39
 */
@Slf4j
public class JwtTokenUtil {
    /*负载用户名*/
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /*
     * 根据负载生成token
     *
     * @param claims
     * @author linmeng
     * @date 2022年3月14日 16:48
     * @return java.lang.String
     */
    public String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(getSecretKeyBySecret(secret))
                .compact();
    }

    /**
     * 根据秘钥获取对应的secretKey对象
     *
     * @param secret 秘钥字符串
     * @author linmeng
     * @date 2022年3月15日 10:45
     * @return javax.crypto.SecretKey
     */
    public SecretKey getSecretKeyBySecret(String secret){
        return Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
    }
    /**
     * 根据token和秘钥获取claims
     *
     * @param token
     * @param secret
     * @return io.jsonwebtoken.Claims
     * @author linmeng
     * @date 2022年3月14日 17:16
     */
    public Claims getClaimsFromToken(String token, String secret) {
        Claims claims = null;
        try {
            claims = Jwts.parserBuilder()
                    .setSigningKey(getSecretKeyBySecret(secret)).build()
                    .parseClaimsJws(token).getBody();
        } catch (Exception e) {
            log.error("JWT格式验证失败:{}", token);
        }
        return claims;
    }

    /*
     * 根据算法生成秘钥
     * @param algorithm 指定算法
     * @author linmeng
     * @date 2022年3月14日 16:28
     * @return java.lang.String
     */
    public SecretKey generateSecretByAlgorithm(SignatureAlgorithm algorithm) {
        return Keys.secretKeyFor(algorithm);
    }

    /**
     * 根据HS256生成秘钥
     *
     * @return java.lang.String
     * @author linmeng
     * @date 2022年3月14日 16:43
     */
    public SecretKey generateSecretKey() {
        return generateSecretByAlgorithm(SignatureAlgorithm.HS256);
    }

    /**
     * 根据指定的对称算法生成秘钥字符串
     *
     * @param algorithm
     * @return java.lang.String
     * @author linmeng
     * @date 2022年3月15日 10:05
     */
    public String generateSecretStr(SignatureAlgorithm algorithm) {
        return Encoders.BASE64.encode(generateSecretByAlgorithm(algorithm).getEncoded());
    }

    /**
     * 生成token的过期时间
     */
    public Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 获取token的失效时间
     *
     * @param token
     * @author linmeng
     * @date 2022年3月15日 10:48
     * @return java.util.Date
     */
    public Date getExpiredDateFromToken(String token){
        Claims claims = getClaimsFromToken(token, secret);

        return claims.getExpiration();
    }

    /*
     * 判断token是否过期
     *
     * @param token
     * @author linmeng
     * @date 2022年3月15日 10:59
     * @return java.lang.Boolean
     */
    public Boolean isTokenExpired(String token){
        Date expiredDate = getExpiredDateFromToken(token);

        return expiredDate.before(new Date());
    }
}
