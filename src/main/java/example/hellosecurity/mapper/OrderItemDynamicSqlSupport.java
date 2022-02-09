package example.hellosecurity.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.489+08:00", comments="Source Table: order_item")
    public static final OrderItem orderItem = new OrderItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.489+08:00", comments="Source field: order_item.id")
    public static final SqlColumn<Long> id = orderItem.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.489+08:00", comments="Source field: order_item.order_no")
    public static final SqlColumn<String> orderNo = orderItem.orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.order_id")
    public static final SqlColumn<Long> orderId = orderItem.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.goods_name")
    public static final SqlColumn<String> goodsName = orderItem.goodsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.goods_quantity")
    public static final SqlColumn<Integer> goodsQuantity = orderItem.goodsQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.goods_price")
    public static final SqlColumn<Integer> goodsPrice = orderItem.goodsPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.create_at")
    public static final SqlColumn<Date> createAt = orderItem.createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source field: order_item.update_at")
    public static final SqlColumn<Date> updateAt = orderItem.updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.489+08:00", comments="Source Table: order_item")
    public static final class OrderItem extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> orderNo = column("order_no", JDBCType.VARCHAR);

        public final SqlColumn<Long> orderId = column("order_id", JDBCType.BIGINT);

        public final SqlColumn<String> goodsName = column("goods_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> goodsQuantity = column("goods_quantity", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodsPrice = column("goods_price", JDBCType.INTEGER);

        public final SqlColumn<Date> createAt = column("create_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateAt = column("update_at", JDBCType.TIMESTAMP);

        public OrderItem() {
            super("order_item");
        }
    }
}