package example.hellosecurity.service;

import example.hellosecurity.bo.NormalUserDetails;
import example.hellosecurity.mapper.UserDynamicSqlSupport;
import example.hellosecurity.mapper.UserMapper;
import example.hellosecurity.model.User;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 实现
 *
 * @author linmeng
 * @version 1.0
 * @date 2022年1月29日 15:02
 */
@Component
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userMapper.selectOne(s -> s.where(UserDynamicSqlSupport.username, IsEqualTo.of(() -> username)));
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("用户不存在");
        }

        return new NormalUserDetails(userOptional.get(),null);
    }
}
