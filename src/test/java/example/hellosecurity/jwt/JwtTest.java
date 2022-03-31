package example.hellosecurity.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;
import java.util.UUID;

/**
 * @author linmeng
 * @version 1.0
 * @date 2022年3月10日 17:10
 */
public class JwtTest {
    /*生成一个带签名的jwt字符串*/
    @Test
    public void signedJwtCompact(){
        // 指定算法生成算法秘钥
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        // 获取生成秘钥
        String secretString = Encoders.BASE64.encode(key.getEncoded());
        System.out.println(secretString);
        // 生成
//        String jws = Jwts.builder().setSubject("tom").signWith(key).compact();
//        System.out.println(jws);
//        // 获取负载
//        Jws<Claims> claimsJws = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jws);
//        Assert.isTrue(claimsJws.getBody().getSubject().equals("tom"));
//        String header = "{\"alg\":\"HS256\"}";
//        String claims = "{\"sub\":\"Joe\"}";
//        String encodedHeader = Encoders.BASE64URL.encode(header.getBytes(StandardCharsets.UTF_8));
//        String encodedClaims = Encoders.BASE64URL.encode(claims.getBytes(StandardCharsets.UTF_8));
//
//        String concatenated = encodedHeader + '.' + encodedClaims;
//        // 非对称秘钥
//        KeyPair keyPair = Keys.keyPairFor(SignatureAlgorithm.RS256); //or RS384, RS512, PS256, PS384, PS512, ES256, ES384, ES512
//        PrivateKey aPrivate = keyPair.getPrivate();
//        System.out.println(Encoders.BASE64.encode(aPrivate.getEncoded()));
//
//        PublicKey aPublic = keyPair.getPublic();
//        String jws2 = Jwts.builder().signWith(aPrivate).setId(UUID.randomUUID().toString())
//                .setSubject("tom").setAudience("xiaoming").setExpiration(new Date()).compact();
    }
}
