package jobboy.po;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Integer recurId;

    private Date orderTime;

    private String orderPayWay;

    private String orderStatus;

    public Order(Integer orderId, Integer userId, Integer recurId, Date orderTime, String orderPayWay, String orderStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.recurId = recurId;
        this.orderTime = orderTime;
        this.orderPayWay = orderPayWay;
        this.orderStatus = orderStatus;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecurId() {
        return recurId;
    }

    public void setRecurId(Integer recurId) {
        this.recurId = recurId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderPayWay() {
        return orderPayWay;
    }

    public void setOrderPayWay(String orderPayWay) {
        this.orderPayWay = orderPayWay == null ? null : orderPayWay.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}