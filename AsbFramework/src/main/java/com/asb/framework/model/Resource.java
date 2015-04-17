package com.asb.framework.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * BaseFramework
 *
 * @author: 郝晓雷
 * @date: 2015-04-02 08:53
 * @desc: 资源表
 */
@Entity
@Table(name = "share_resource")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Resource extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 4181956700900133465L;

    /*资源名称*/
    private String name;
    /*URL地址*/
    private String url;
    /*显示序号*/
    private Integer orderNo;
    /*资源描述*/
    private String description;
    /*资源所属分类*/
    private ResourceType resourceType;

    @Column(name = "name", length = 100, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "url", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "orderNo", length = 3)
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(targetEntity = ResourceType.class)
    @JoinColumn(name = "resourceTypeId", columnDefinition = "long default 0")
    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }
}
