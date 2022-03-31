package example.hellosecurity.controller;

import example.hellosecurity.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.CredentialException;

/**
 * @author linmeng
 * @version 1.0
 * @date 2022年3月16日 09:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/login")
    public Object login(String username, String password) throws CredentialException {
        return userServiceImpl.login(username, password);
    }
}
