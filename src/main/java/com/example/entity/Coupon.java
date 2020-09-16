package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Coupon)实体类
 *
 * @author makejava
 * @since 2020-09-16 11:42:48
 */
public class Coupon implements Serializable {
    private static final long serialVersionUID = -47084290844013010L;
    
    private Long couponId;
    
    private Long groupId;
    
    private String code;
    
    private Object status;
    
    private Date gmtUsed;
    
    private String note;
    
    private Date gmtCreate;
    
    private Date gmtModified;


    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getGmtUsed() {
        return gmtUsed;
    }

    public void setGmtUsed(Date gmtUsed) {
        this.gmtUsed = gmtUsed;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}