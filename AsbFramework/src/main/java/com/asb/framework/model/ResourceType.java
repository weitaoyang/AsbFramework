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
 * @date: 2015-04-01 15:30
 * @desc: 资源分类表
 */
@Entity
@Table(name = "share_resource_type")
@DynamicInsert(true)
@DynamicUpdate(true)
public class ResourceType extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -5686919366676977446L;

    /*分类名称*/
    private String name;
    /*分类描述*/
    private String description;
    /*父分类*/
    private ResourceType parentType;

    @Column(name = "name", length = 100, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(targetEntity = ResourceType.class)
    @JoinColumn(name = "parentTypeId", columnDefinition = "long default 0")
    public ResourceType getParentType() {
        return parentType;
    }

    public void setParentType(ResourceType parentType) {
        this.parentType = parentType;
    }
}
