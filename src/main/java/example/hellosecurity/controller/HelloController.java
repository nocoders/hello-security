package example.hellosecurity.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmeng
 * @version 1.0
 * @date 2022年1月26日 14:58
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/admin/hello")
    public String adminHello(){
        return "admin hello world";
    }
    @GetMapping("/user/hello")
    public String userHello(){
        return "user hello world";
    }

    @GetMapping("/hello1")
    public String hello1() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication a = context.getAuthentication();
        return "Hello, " + a.getName() + "!";
    }
    @GetMapping("/hello2")
    public String hello2(Authentication a) {
        return "Hello, " + a.getName() + "!";
    }

}
