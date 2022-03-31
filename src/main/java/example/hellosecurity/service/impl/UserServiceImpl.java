package example.hellosecurity.service.impl;

import example.hellosecurity.bo.NormalUserDetails;
import example.hellosecurity.mapper.RoleMapper;
import example.hellosecurity.mapper.UserDynamicSqlSupport;
import example.hellosecurity.mapper.UserMapper;
import example.hellosecurity.model.Role;
import example.hellosecurity.model.User;
import example.hellosecurity.service.UserService;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialException;
import java.util.List;
import java.util.Optional;

import static example.hellosecurity.mapper.RoleDynamicSqlSupport.role;
import static example.hellosecurity.mapper.UserDynamicSqlSupport.user;
import static example.hellosecurity.mapper.UserRoleDynamicSqlSupport.userRole;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 实现
 *
 * @author linmeng
 * @version 1.0
 * @date 2022年1月29日 15:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userMapper.selectOne(s -> s.where(UserDynamicSqlSupport.username, IsEqualTo.of(username)));
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("用户不存在");
        }
        SelectStatementProvider selectStatement = select(role.allColumns())
                .from(role, "role")
                .rightJoin(userRole, "userRole").on(userRole.roleId, equalTo(role.id))
                .rightJoin(user, "user").on(user.id, equalTo(userRole.userId))
                .where(user.username, isEqualTo(username)).build()
                .render(RenderingStrategies.MYBATIS3);
        List<Role> roles = roleMapper.selectMany(selectStatement);

        return new NormalUserDetails(userOptional.get(), roles);
    }
    /*
     * 用户登录
     *
     * @param username
     * @param password
     * @author linmeng
     * @date 2022年3月16日 10:36
     * @return java.lang.String
     */
    public String login(String username, String password) throws CredentialException {
        UserDetails userDetails = loadUserByUsername(username);
        if (!passwordEncoder.matches(userDetails.getPassword(),password)) {
            throw new CredentialException("密码错误");
        }
        if (!userDetails.isEnabled()) {
            throw new CredentialException("密码不可用");
        }
        return null;
    }
}
