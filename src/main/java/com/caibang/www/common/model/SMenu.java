package com.caibang.www.common.model;

import java.util.Date;

public class SMenu {
    private Integer sId;

    private Integer sMenuType;

    private String sMenuCode;

    private String sMenuName;

    private String sMenuUrl;

    private String sMenuIcon;

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

    public Integer getsMenuType() {
        return sMenuType;
    }

    public void setsMenuType(Integer sMenuType) {
        this.sMenuType = sMenuType;
    }

    public String getsMenuCode() {
        return sMenuCode;
    }

    public void setsMenuCode(String sMenuCode) {
        this.sMenuCode = sMenuCode;
    }

    public String getsMenuName() {
        return sMenuName;
    }

    public void setsMenuName(String sMenuName) {
        this.sMenuName = sMenuName;
    }

    public String getsMenuUrl() {
        return sMenuUrl;
    }

    public void setsMenuUrl(String sMenuUrl) {
        this.sMenuUrl = sMenuUrl;
    }

    public String getsMenuIcon() {
        return sMenuIcon;
    }

    public void setsMenuIcon(String sMenuIcon) {
        this.sMenuIcon = sMenuIcon;
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