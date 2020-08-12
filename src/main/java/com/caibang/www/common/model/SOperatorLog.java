package com.caibang.www.common.model;

import java.util.Date;

public class SOperatorLog {
    private Integer sId;

    private Integer sUserId;

    private String sUserName;

    private Boolean sOperatorType;

    private String sOperatorUrl;

    private Date createAt;

    private byte[] sOperatorContent;

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

    public Boolean getsOperatorType() {
        return sOperatorType;
    }

    public void setsOperatorType(Boolean sOperatorType) {
        this.sOperatorType = sOperatorType;
    }

    public String getsOperatorUrl() {
        return sOperatorUrl;
    }

    public void setsOperatorUrl(String sOperatorUrl) {
        this.sOperatorUrl = sOperatorUrl;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public byte[] getsOperatorContent() {
        return sOperatorContent;
    }

    public void setsOperatorContent(byte[] sOperatorContent) {
        this.sOperatorContent = sOperatorContent;
    }
}