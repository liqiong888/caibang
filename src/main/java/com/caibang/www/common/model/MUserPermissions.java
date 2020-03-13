package com.caibang.www.common.model;

import java.util.Date;

public class MUserPermissions {
    private Integer mid;

    private Integer muserid;

    private Integer mrolegroupid;

    private Date mcreatedate;

    private Integer mcreateuserid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getMuserid() {
        return muserid;
    }

    public void setMuserid(Integer muserid) {
        this.muserid = muserid;
    }

    public Integer getMrolegroupid() {
        return mrolegroupid;
    }

    public void setMrolegroupid(Integer mrolegroupid) {
        this.mrolegroupid = mrolegroupid;
    }

    public Date getMcreatedate() {
        return mcreatedate;
    }

    public void setMcreatedate(Date mcreatedate) {
        this.mcreatedate = mcreatedate;
    }

    public Integer getMcreateuserid() {
        return mcreateuserid;
    }

    public void setMcreateuserid(Integer mcreateuserid) {
        this.mcreateuserid = mcreateuserid;
    }
}