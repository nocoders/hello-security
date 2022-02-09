package example.hellosecurity.controller;

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
}
