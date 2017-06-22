package com.nullpoint.archite.service.bean;

/**
 * 基础实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月22日 20:27
 */
public class BaseEntity implements java.io.Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
