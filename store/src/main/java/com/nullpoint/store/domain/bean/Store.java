package com.nullpoint.store.domain.bean;

/**
 * 存库实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 23:37
 */
public class Store {

    /**
     * 主键ID.
     */
    private Long id;

    /**
     * 商品ID.
     */
    private Long goodsId;

    /**
     * 库存.
     */
    private int storeNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public int getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }
}
