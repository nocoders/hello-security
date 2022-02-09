package example.hellosecurity.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DepartDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.495+08:00", comments="Source Table: depart")
    public static final Depart depart = new Depart();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.496+08:00", comments="Source field: depart.id")
    public static final SqlColumn<Integer> id = depart.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.496+08:00", comments="Source field: depart.name")
    public static final SqlColumn<String> name = depart.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.495+08:00", comments="Source Table: depart")
    public static final class Depart extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public Depart() {
            super("depart");
        }
    }
}