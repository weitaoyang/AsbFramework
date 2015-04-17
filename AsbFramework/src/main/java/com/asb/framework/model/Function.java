package com.asb.framework.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * BaseFramework
 *
 * @author: 郝晓雷
 * @date: 2015-03-20 13:30
 * @desc: 功能表
 */
@Entity
@Table(name = "share_function")
@DynamicInsert(true)
@DynamicUpdate(true)
public class Function extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3161032652512640827L;

    private String name;
    private String ename;
    private String description;


    @Column(name = "name", length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "ename", length = 30)
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
