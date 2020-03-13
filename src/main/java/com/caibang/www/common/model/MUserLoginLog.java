package com.caibang.www.common.model;

import java.util.Date;

public class MUserLoginLog {
    private Integer mid;

    private Integer muserid;

    private String mloginip;

    private Date mlogindate;

    private String mequipment;

    private String pappid;

    private Integer mlogintype;

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

    public String getMloginip() {
        return mloginip;
    }

    public void setMloginip(String mloginip) {
        this.mloginip = mloginip;
    }

    public Date getMlogindate() {
        return mlogindate;
    }

    public void setMlogindate(Date mlogindate) {
        this.mlogindate = mlogindate;
    }

    public String getMequipment() {
        return mequipment;
    }

    public void setMequipment(String mequipment) {
        this.mequipment = mequipment;
    }

    public String getPappid() {
        return pappid;
    }

    public void setPappid(String pappid) {
        this.pappid = pappid;
    }

    public Integer getMlogintype() {
        return mlogintype;
    }

    public void setMlogintype(Integer mlogintype) {
        this.mlogintype = mlogintype;
    }
}