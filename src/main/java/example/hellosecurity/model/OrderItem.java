package example.hellosecurity.model;

import java.util.Date;
import javax.annotation.Generated;

public class OrderItem {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.485+08:00", comments="Source field: order_item.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.485+08:00", comments="Source field: order_item.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.order_id")
    private Long orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_name")
    private String goodsName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_quantity")
    private Integer goodsQuantity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_price")
    private Integer goodsPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.update_at")
    private Date updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.485+08:00", comments="Source field: order_item.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.485+08:00", comments="Source field: order_item.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.485+08:00", comments="Source field: order_item.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.order_id")
    public Long getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.order_id")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_name")
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_quantity")
    public Integer getGoodsQuantity() {
        return goodsQuantity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_quantity")
    public void setGoodsQuantity(Integer goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_price")
    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.goods_price")
    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.update_at")
    public Date getUpdateAt() {
        return updateAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.486+08:00", comments="Source field: order_item.update_at")
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}