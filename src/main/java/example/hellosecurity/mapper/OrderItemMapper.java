package example.hellosecurity.mapper;

import static example.hellosecurity.mapper.OrderItemDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.hellosecurity.model.OrderItem;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface OrderItemMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderNo, orderId, goodsName, goodsQuantity, goodsPrice, createAt, updateAt);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<OrderItem> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderItemResult")
    Optional<OrderItem> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderItemResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.BIGINT),
        @Result(column="goods_name", property="goodsName", jdbcType=JdbcType.VARCHAR),
        @Result(column="goods_quantity", property="goodsQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="goods_price", property="goodsPrice", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderItem> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    default int insert(OrderItem record) {
        return MyBatis3Utils.insert(this::insert, record, orderItem, c ->
            c.map(orderNo).toProperty("orderNo")
            .map(orderId).toProperty("orderId")
            .map(goodsName).toProperty("goodsName")
            .map(goodsQuantity).toProperty("goodsQuantity")
            .map(goodsPrice).toProperty("goodsPrice")
            .map(createAt).toProperty("createAt")
            .map(updateAt).toProperty("updateAt")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.49+08:00", comments="Source Table: order_item")
    default int insertSelective(OrderItem record) {
        return MyBatis3Utils.insert(this::insert, record, orderItem, c ->
            c.map(orderNo).toPropertyWhenPresent("orderNo", record::getOrderNo)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(goodsName).toPropertyWhenPresent("goodsName", record::getGoodsName)
            .map(goodsQuantity).toPropertyWhenPresent("goodsQuantity", record::getGoodsQuantity)
            .map(goodsPrice).toPropertyWhenPresent("goodsPrice", record::getGoodsPrice)
            .map(createAt).toPropertyWhenPresent("createAt", record::getCreateAt)
            .map(updateAt).toPropertyWhenPresent("updateAt", record::getUpdateAt)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default Optional<OrderItem> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default List<OrderItem> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default List<OrderItem> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default Optional<OrderItem> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderItem, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderNo).equalTo(record::getOrderNo)
                .set(orderId).equalTo(record::getOrderId)
                .set(goodsName).equalTo(record::getGoodsName)
                .set(goodsQuantity).equalTo(record::getGoodsQuantity)
                .set(goodsPrice).equalTo(record::getGoodsPrice)
                .set(createAt).equalTo(record::getCreateAt)
                .set(updateAt).equalTo(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderItem record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(orderNo).equalToWhenPresent(record::getOrderNo)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(goodsName).equalToWhenPresent(record::getGoodsName)
                .set(goodsQuantity).equalToWhenPresent(record::getGoodsQuantity)
                .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
                .set(createAt).equalToWhenPresent(record::getCreateAt)
                .set(updateAt).equalToWhenPresent(record::getUpdateAt);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default int updateByPrimaryKey(OrderItem record) {
        return update(c ->
            c.set(orderNo).equalTo(record::getOrderNo)
            .set(orderId).equalTo(record::getOrderId)
            .set(goodsName).equalTo(record::getGoodsName)
            .set(goodsQuantity).equalTo(record::getGoodsQuantity)
            .set(goodsPrice).equalTo(record::getGoodsPrice)
            .set(createAt).equalTo(record::getCreateAt)
            .set(updateAt).equalTo(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.491+08:00", comments="Source Table: order_item")
    default int updateByPrimaryKeySelective(OrderItem record) {
        return update(c ->
            c.set(orderNo).equalToWhenPresent(record::getOrderNo)
            .set(orderId).equalToWhenPresent(record::getOrderId)
            .set(goodsName).equalToWhenPresent(record::getGoodsName)
            .set(goodsQuantity).equalToWhenPresent(record::getGoodsQuantity)
            .set(goodsPrice).equalToWhenPresent(record::getGoodsPrice)
            .set(createAt).equalToWhenPresent(record::getCreateAt)
            .set(updateAt).equalToWhenPresent(record::getUpdateAt)
            .where(id, isEqualTo(record::getId))
        );
    }
}