package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AuthoritiesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.473+08:00", comments="Source Table: authorities")
    public static final Authorities authorities = new Authorities();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source field: authorities.username")
    public static final SqlColumn<String> username = authorities.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source field: authorities.authority")
    public static final SqlColumn<String> authority = authorities.authority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    public static final class Authorities extends SqlTable {
        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> authority = column("authority", JDBCType.VARCHAR);

        public Authorities() {
            super("authorities");
        }
    }
}