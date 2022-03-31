package example.hellosecurity.jwt;

import example.hellosecurity.utils.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * Jwt 工具类测试
 * @author linmeng
 * @version 1.0
 * @date 2022年3月14日 16:43
 */
@SpringBootTest
public class JwtTokenUtilTest {


    @Test
    void SecretStrGetTest(){
        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String keyEncode = Encoders.BASE64.encode(secretKey.getEncoded());
        SecretKey secretKey1 = Keys.hmacShaKeyFor(keyEncode.getBytes(StandardCharsets.UTF_8));
        SecretKey secretKey2 = Keys.hmacShaKeyFor(keyEncode.getBytes(StandardCharsets.UTF_8));
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        System.out.println(jwtTokenUtil.generateSecretStr(SignatureAlgorithm.HS256));
        System.out.println();
    }

    @Test
    void SecretTest(){
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        SecretKey secretKey = jwtTokenUtil.generateSecretKey();
        SecretKey secretKey2 = jwtTokenUtil.generateSecretKey();
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","tom");
        map.put("age",25);
    }

    @Test
    void generateExpirationDateTest(){
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        System.out.println(jwtTokenUtil.generateExpirationDate());
    }
}
