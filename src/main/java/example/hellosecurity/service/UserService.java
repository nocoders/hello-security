package example.hellosecurity.service;

import example.hellosecurity.bo.NormalUserDetails;
import static example.hellosecurity.mapper.UserDynamicSqlSupport.*;

import example.hellosecurity.mapper.RoleMapper;
import example.hellosecurity.mapper.UserDynamicSqlSupport;
import example.hellosecurity.mapper.UserMapper;
import example.hellosecurity.model.Role;
import example.hellosecurity.model.User;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.management.relation.RoleInfoNotFoundException;
import java.util.List;
import java.util.Optional;

import static example.hellosecurity.mapper.RoleDynamicSqlSupport.role;
import static example.hellosecurity.mapper.UserRoleDynamicSqlSupport.userRole;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

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
    @Autowired
    private RoleMapper roleMapper;
    @Override
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
}
