package com.caibang.org.resource.master.model;

import java.util.Date;

public class MUserPasswordLog {
    private Integer mid;

    private Integer muserid;

    private String mupold;

    private String mupnew;

    private Date mupdate;

    private String mupip;

    private Integer mequipment;

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

    public String getMupold() {
        return mupold;
    }

    public void setMupold(String mupold) {
        this.mupold = mupold;
    }

    public String getMupnew() {
        return mupnew;
    }

    public void setMupnew(String mupnew) {
        this.mupnew = mupnew;
    }

    public Date getMupdate() {
        return mupdate;
    }

    public void setMupdate(Date mupdate) {
        this.mupdate = mupdate;
    }

    public String getMupip() {
        return mupip;
    }

    public void setMupip(String mupip) {
        this.mupip = mupip;
    }

    public Integer getMequipment() {
        return mequipment;
    }

    public void setMequipment(Integer mequipment) {
        this.mequipment = mequipment;
    }
}