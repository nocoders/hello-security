package example.hellosecurity.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PersonDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source Table: person")
    public static final Person person = new Person();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.id")
    public static final SqlColumn<Integer> id = person.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.first_name")
    public static final SqlColumn<String> firstName = person.firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.last_name")
    public static final SqlColumn<String> lastName = person.lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.birth_date")
    public static final SqlColumn<Date> birthDate = person.birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.employed")
    public static final SqlColumn<String> employed = person.employed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.occupation")
    public static final SqlColumn<String> occupation = person.occupation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source field: person.address_id")
    public static final SqlColumn<Integer> addressId = person.addressId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source Table: person")
    public static final class Person extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> firstName = column("first_name", JDBCType.VARCHAR);

        public final SqlColumn<String> lastName = column("last_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> birthDate = column("birth_date", JDBCType.DATE);

        public final SqlColumn<String> employed = column("employed", JDBCType.VARCHAR);

        public final SqlColumn<String> occupation = column("occupation", JDBCType.VARCHAR);

        public final SqlColumn<Integer> addressId = column("address_id", JDBCType.INTEGER);

        public Person() {
            super("person");
        }
    }
}