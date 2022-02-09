package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.505+08:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.505+08:00", comments="Source field: user.id")
    public static final SqlColumn<Integer> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.505+08:00", comments="Source field: user.username")
    public static final SqlColumn<String> username = user.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.505+08:00", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.506+08:00", comments="Source field: user.accountNonExpired")
    public static final SqlColumn<Boolean> accountnonexpired = user.accountnonexpired;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.506+08:00", comments="Source field: user.accountNonLocked")
    public static final SqlColumn<Boolean> accountnonlocked = user.accountnonlocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.506+08:00", comments="Source field: user.credentialsNonExpired")
    public static final SqlColumn<Boolean> credentialsnonexpired = user.credentialsnonexpired;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.506+08:00", comments="Source field: user.enabled")
    public static final SqlColumn<Boolean> enabled = user.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.505+08:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> accountnonexpired = column("accountNonExpired", JDBCType.BIT);

        public final SqlColumn<Boolean> accountnonlocked = column("accountNonLocked", JDBCType.BIT);

        public final SqlColumn<Boolean> credentialsnonexpired = column("credentialsNonExpired", JDBCType.BIT);

        public final SqlColumn<Boolean> enabled = column("enabled", JDBCType.BIT);

        public User() {
            super("user");
        }
    }
}