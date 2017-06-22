package com.nullpoint.orders.domain.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 *订单实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 23:33
 */
public class Orders {

    /**
     * 主键ID.
     */
    private Long id;

    /**
     * 客户ID.
     */
    private Long customerId;

    /**
     * 订单时间.
     */
    private Date orderTime;

    /**
     * 订单总额.
     */
    private BigDecimal totalMoney;

    /**
     * 订单优惠总额.
     */
    private BigDecimal saveMoney;

    /**
     * 订单状态.
     */
    private short state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(BigDecimal saveMoney) {
        this.saveMoney = saveMoney;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }
}
