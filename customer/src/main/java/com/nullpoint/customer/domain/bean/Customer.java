package com.nullpoint.customer.domain.bean;

import com.nullpoint.archite.service.bean.BaseEntity;

import java.util.Date;

/**
 * 客户表实体.
 *
 * @author ZhangGe
 * @version v1.0
 * @create 2017年06月17日 23:23
 */
public class Customer extends BaseEntity {

    /**
     * 主键ID.
     */
    private Long id;

    /**
     * 身份认证.
     */
    private String identify;

    /**
     * 密码.
     */
    private String password;

    /**
     * 昵称.
     */
    private String showName;

    /**
     * 真实姓名.
     */
    private String realName;

    /**
     * 注册时间.
     */
    private Date registerTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", identify='" + identify + '\'' +
                ", password='" + password + '\'' +
                ", showName='" + showName + '\'' +
                ", realName='" + realName + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }
}
