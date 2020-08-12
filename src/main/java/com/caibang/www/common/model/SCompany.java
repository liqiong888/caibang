package com.caibang.www.common.model;

import java.util.Date;

public class SCompany {
    private Integer sId;

    private String sCompanyName;

    private String sCompanyAddress;

    private String sCompanyWeb;

    private Date createAt;

    private Date updateAt;

    private Date deleteAt;

    private Integer operatorId;

    private String operatorName;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsCompanyName() {
        return sCompanyName;
    }

    public void setsCompanyName(String sCompanyName) {
        this.sCompanyName = sCompanyName;
    }

    public String getsCompanyAddress() {
        return sCompanyAddress;
    }

    public void setsCompanyAddress(String sCompanyAddress) {
        this.sCompanyAddress = sCompanyAddress;
    }

    public String getsCompanyWeb() {
        return sCompanyWeb;
    }

    public void setsCompanyWeb(String sCompanyWeb) {
        this.sCompanyWeb = sCompanyWeb;
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