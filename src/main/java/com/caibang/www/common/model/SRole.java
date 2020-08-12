package com.caibang.www.common.model;

import java.util.Date;

public class SRole {
    private Integer sId;

    private String sRoleCode;

    private String sRoleName;

    private Integer sRoleParentId;

    private Integer sCid;

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

    public String getsRoleCode() {
        return sRoleCode;
    }

    public void setsRoleCode(String sRoleCode) {
        this.sRoleCode = sRoleCode;
    }

    public String getsRoleName() {
        return sRoleName;
    }

    public void setsRoleName(String sRoleName) {
        this.sRoleName = sRoleName;
    }

    public Integer getsRoleParentId() {
        return sRoleParentId;
    }

    public void setsRoleParentId(Integer sRoleParentId) {
        this.sRoleParentId = sRoleParentId;
    }

    public Integer getsCid() {
        return sCid;
    }

    public void setsCid(Integer sCid) {
        this.sCid = sCid;
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