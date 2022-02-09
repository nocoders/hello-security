package example.hellosecurity;

import example.hellosecurity.mapper.RoleMapper;
import example.hellosecurity.mapper.UserMapper;
import example.hellosecurity.mapper.UserRoleMapper;
import example.hellosecurity.model.Role;
import example.hellosecurity.model.User;
import example.hellosecurity.model.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class HelloSecurityApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	/*数据插入*/
	@Test
	void contextLoads() {
		User user = new User();
		user.setUsername("root");
		user.setPassword("root");
		Role role = new Role();
		role.setName("ROLE_admin");
		role.setNamezh("管理员");
		userMapper.insertSelective(user);
		roleMapper.insert(role);
		UserRole userRole = new UserRole();
		userRole.setUserId(user.getId());
		userRole.setRoleId(role.getId());
		userRoleMapper.insert(userRole);
	}

}
