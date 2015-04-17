package com.asb.framework.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by haoxiaolei on 2015-02-09 9:57
 *
 * @desc 实体基础属性
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 179819178872925535L;

    /*系统主键*/
    private Long id;
    /*租户Id*/
    private String tenantId;
    /*创建人*/
    private String createUser;
    /*创建时间*/
    private Date createTime;
    /*修改人*/
    private String updateUser;
    /*更新时间*/
    private Date updateTime;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "tenantId", length = 15)
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Column(name = "createUser", length = 30)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "updateUser", length = 30)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateTime")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
