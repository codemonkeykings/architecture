package com.nullpoint.goods.domain.bean;

/**
 * 商品实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 23:31
 */
public class Goods {

    /**
     * 主键ID.
     */
    private Long id;

    /**
     * 商品名称.
     */
    private String name;

    /**
     * 图片路径.
     */
    private String imgPath;

    /**
     * 商品描述.
     */
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
