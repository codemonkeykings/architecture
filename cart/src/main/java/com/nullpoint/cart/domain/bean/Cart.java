package com.nullpoint.cart.domain.bean;

/**
 * 购物车实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 23:27
 */
public class Cart {

    /**
     * 主键ID.
     */
    private Long id;

    /**
     * 客户ID.
     */
    private Long customerId;

    /**
     * 商品ID.
     */
    private Long goodsId;

    /**
     * 购买数量.
     */
    private Integer buyNum;

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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }
}
