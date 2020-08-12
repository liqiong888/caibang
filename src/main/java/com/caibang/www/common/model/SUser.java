package com.caibang.www.common.model;

import java.util.Date;

public class SUser extends SUserKey {
    private String sPassword;

    private String sName;

    private String sCard;

    private String sOpenid;

    private String sHeadImg;

    private String sGender;

    private Date sBirthday;

    private Integer sStatus;

    private Integer sCid;

    private Integer sDepid;

    private Integer sUserType;

    private Date createAt;

    private Date updateAt;

    private Date deleteAt;

    private Integer operatorId;

    private String operatorName;

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCard() {
        return sCard;
    }

    public void setsCard(String sCard) {
        this.sCard = sCard;
    }

    public String getsOpenid() {
        return sOpenid;
    }

    public void setsOpenid(String sOpenid) {
        this.sOpenid = sOpenid;
    }

    public String getsHeadImg() {
        return sHeadImg;
    }

    public void setsHeadImg(String sHeadImg) {
        this.sHeadImg = sHeadImg;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public Integer getsStatus() {
        return sStatus;
    }

    public void setsStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

    public Integer getsCid() {
        return sCid;
    }

    public void setsCid(Integer sCid) {
        this.sCid = sCid;
    }

    public Integer getsDepid() {
        return sDepid;
    }

    public void setsDepid(Integer sDepid) {
        this.sDepid = sDepid;
    }

    public Integer getsUserType() {
        return sUserType;
    }

    public void setsUserType(Integer sUserType) {
        this.sUserType = sUserType;
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

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}