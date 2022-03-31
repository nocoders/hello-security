package example.hellosecurity.service;

import org.springframework.security.core.userdetails.UserDetails;

import javax.security.auth.login.CredentialException;

/**
 * @author linmeng
 * @version 1.0
 * @date 2022年3月31日 11:17
 */
public interface UserService {
    UserDetails loadUserByUsername(String username);

    String login(String username, String password) throws CredentialException;
}
