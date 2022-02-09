package example.hellosecurity.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source Table: order")
    public static final Order order = new Order();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.id")
    public static final SqlColumn<Long> id = order.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.user_id")
    public static final SqlColumn<Long> userId = order.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.order_no")
    public static final SqlColumn<String> orderNo = order.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.status")
    public static final SqlColumn<Byte> status = order.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.create_at")
    public static final SqlColumn<Date> createAt = order.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source field: order.update_at")
    public static final SqlColumn<Date> updateAt = order.updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.467+08:00", comments="Source Table: order")
    public static final class Order extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateAt = column("update_at", JDBCType.TIMESTAMP);

        public Order() {
            super("order");
        }
    }
}