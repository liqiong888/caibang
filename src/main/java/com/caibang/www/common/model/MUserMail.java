package com.caibang.www.common.model;

import java.util.Date;

public class MUserMail {
    private Integer mid;

    private Integer muserid;

    private String mmail;

    private Date mcreatdate;

    private Integer mcreatuserid;

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

    public String getMmail() {
        return mmail;
    }

    public void setMmail(String mmail) {
        this.mmail = mmail;
    }

    public Date getMcreatdate() {
        return mcreatdate;
    }

    public void setMcreatdate(Date mcreatdate) {
        this.mcreatdate = mcreatdate;
    }

    public Integer getMcreatuserid() {
        return mcreatuserid;
    }

    public void setMcreatuserid(Integer mcreatuserid) {
        this.mcreatuserid = mcreatuserid;
    }
}