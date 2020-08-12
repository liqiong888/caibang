package com.caibang.www.common.model;

import java.util.Date;

public class SRoleMenu {
    private Integer sId;

    private Integer sRoleId;

    private Integer sMenuId;

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

    public Integer getsRoleId() {
        return sRoleId;
    }

    public void setsRoleId(Integer sRoleId) {
        this.sRoleId = sRoleId;
    }

    public Integer getsMenuId() {
        return sMenuId;
    }

    public void setsMenuId(Integer sMenuId) {
        this.sMenuId = sMenuId;
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