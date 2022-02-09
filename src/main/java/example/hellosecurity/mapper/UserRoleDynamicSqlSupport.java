package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.514+08:00", comments="Source Table: user_role")
    public static final UserRole userRole = new UserRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.514+08:00", comments="Source field: user_role.id")
    public static final SqlColumn<Integer> id = userRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.514+08:00", comments="Source field: user_role.user_id")
    public static final SqlColumn<Integer> userId = userRole.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.514+08:00", comments="Source field: user_role.role_id")
    public static final SqlColumn<Integer> roleId = userRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.514+08:00", comments="Source Table: user_role")
    public static final class UserRole extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);

        public UserRole() {
            super("user_role");
        }
    }
}