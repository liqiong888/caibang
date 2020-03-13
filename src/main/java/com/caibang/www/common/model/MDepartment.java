package com.caibang.www.common.model;

import java.util.Date;

public class MDepartment {
    private Integer mid;

    private String mdepname;

    private Integer mheaduserid;

    private String mduties;

    private Integer mstate;

    private Integer mcid;

    private Integer mcreatuserid;

    private Date mcreatdate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMdepname() {
        return mdepname;
    }

    public void setMdepname(String mdepname) {
        this.mdepname = mdepname;
    }

    public Integer getMheaduserid() {
        return mheaduserid;
    }

    public void setMheaduserid(Integer mheaduserid) {
        this.mheaduserid = mheaduserid;
    }

    public String getMduties() {
        return mduties;
    }

    public void setMduties(String mduties) {
        this.mduties = mduties;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    public Integer getMcid() {
        return mcid;
    }

    public void setMcid(Integer mcid) {
        this.mcid = mcid;
    }

    public Integer getMcreatuserid() {
        return mcreatuserid;
    }

    public void setMcreatuserid(Integer mcreatuserid) {
        this.mcreatuserid = mcreatuserid;
    }

    public Date getMcreatdate() {
        return mcreatdate;
    }

    public void setMcreatdate(Date mcreatdate) {
        this.mcreatdate = mcreatdate;
    }
}