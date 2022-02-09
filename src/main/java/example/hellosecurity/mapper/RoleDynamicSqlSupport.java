package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.446+08:00", comments="Source Table: role")
    public static final Role role = new Role();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.446+08:00", comments="Source field: role.id")
    public static final SqlColumn<Integer> id = role.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.446+08:00", comments="Source field: role.name")
    public static final SqlColumn<String> name = role.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.446+08:00", comments="Source field: role.nameZh")
    public static final SqlColumn<String> namezh = role.namezh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.446+08:00", comments="Source Table: role")
    public static final class Role extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> namezh = column("nameZh", JDBCType.VARCHAR);

        public Role() {
            super("role");
        }
    }
}