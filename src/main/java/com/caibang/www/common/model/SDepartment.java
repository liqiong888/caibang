package com.caibang.www.common.model;

import java.util.Date;

public class SDepartment {
    private Integer sId;

    private String sDeptNum;

    private String sDeptName;

    private Integer sDeptMemberSum;

    private String sDeptSlogin;

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

    public String getsDeptNum() {
        return sDeptNum;
    }

    public void setsDeptNum(String sDeptNum) {
        this.sDeptNum = sDeptNum;
    }

    public String getsDeptName() {
        return sDeptName;
    }

    public void setsDeptName(String sDeptName) {
        this.sDeptName = sDeptName;
    }

    public Integer getsDeptMemberSum() {
        return sDeptMemberSum;
    }

    public void setsDeptMemberSum(Integer sDeptMemberSum) {
        this.sDeptMemberSum = sDeptMemberSum;
    }

    public String getsDeptSlogin() {
        return sDeptSlogin;
    }

    public void setsDeptSlogin(String sDeptSlogin) {
        this.sDeptSlogin = sDeptSlogin;
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