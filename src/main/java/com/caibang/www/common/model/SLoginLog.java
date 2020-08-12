package com.caibang.www.common.model;

import java.util.Date;

public class SLoginLog {
    private Integer sId;

    private Integer sUserId;

    private String sUserName;

    private Boolean sLoginType;

    private String sLoginIp;

    private String sLoginAddress;

    private String sLoginBrower;

    private String sLoginLon;

    private String sLoginLat;

    private Date sLoginStartTime;

    private Date sLoginEndTime;

    private Date createAt;

    private Date updateAt;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getsUserId() {
        return sUserId;
    }

    public void setsUserId(Integer sUserId) {
        this.sUserId = sUserId;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public Boolean getsLoginType() {
        return sLoginType;
    }

    public void setsLoginType(Boolean sLoginType) {
        this.sLoginType = sLoginType;
    }

    public String getsLoginIp() {
        return sLoginIp;
    }

    public void setsLoginIp(String sLoginIp) {
        this.sLoginIp = sLoginIp;
    }

    public String getsLoginAddress() {
        return sLoginAddress;
    }

    public void setsLoginAddress(String sLoginAddress) {
        this.sLoginAddress = sLoginAddress;
    }

    public String getsLoginBrower() {
        return sLoginBrower;
    }

    public void setsLoginBrower(String sLoginBrower) {
        this.sLoginBrower = sLoginBrower;
    }

    public String getsLoginLon() {
        return sLoginLon;
    }

    public void setsLoginLon(String sLoginLon) {
        this.sLoginLon = sLoginLon;
    }

    public String getsLoginLat() {
        return sLoginLat;
    }

    public void setsLoginLat(String sLoginLat) {
        this.sLoginLat = sLoginLat;
    }

    public Date getsLoginStartTime() {
        return sLoginStartTime;
    }

    public void setsLoginStartTime(Date sLoginStartTime) {
        this.sLoginStartTime = sLoginStartTime;
    }

    public Date getsLoginEndTime() {
        return sLoginEndTime;
    }

    public void setsLoginEndTime(Date sLoginEndTime) {
        this.sLoginEndTime = sLoginEndTime;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}