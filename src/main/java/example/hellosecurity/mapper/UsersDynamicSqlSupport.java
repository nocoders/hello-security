package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.48+08:00", comments="Source Table: users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.48+08:00", comments="Source field: users.username")
    public static final SqlColumn<String> username = users.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.481+08:00", comments="Source field: users.password")
    public static final SqlColumn<String> password = users.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.481+08:00", comments="Source field: users.enabled")
    public static final SqlColumn<Boolean> enabled = users.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.48+08:00", comments="Source Table: users")
    public static final class Users extends SqlTable {
        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BIT);

        public Users() {
            super("users");
        }
    }
}