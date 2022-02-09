package example.hellosecurity.model;

import java.util.Date;
import javax.annotation.Generated;

public class Order {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.status")
    private Byte status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.create_at")
    private Date createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.465+08:00", comments="Source field: order.update_at")
    private Date updateAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.status")
    public Byte getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.464+08:00", comments="Source field: order.status")
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.465+08:00", comments="Source field: order.create_at")
    public Date getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.465+08:00", comments="Source field: order.create_at")
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.465+08:00", comments="Source field: order.update_at")
    public Date getUpdateAt() {
        return updateAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.465+08:00", comments="Source field: order.update_at")
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}