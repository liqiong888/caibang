package com.caibang.www.common.model;

import java.util.Date;

public class MRoleGroup {
    private Integer mid;

    private String mgroupname;

    private String mgroupcode;

    private Integer mforwordid;

    private Integer mparentid;

    private Date mcreatdate;

    private Integer mcreatuserid;

    private Integer mstate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMgroupname() {
        return mgroupname;
    }

    public void setMgroupname(String mgroupname) {
        this.mgroupname = mgroupname;
    }

    public String getMgroupcode() {
        return mgroupcode;
    }

    public void setMgroupcode(String mgroupcode) {
        this.mgroupcode = mgroupcode;
    }

    public Integer getMforwordid() {
        return mforwordid;
    }

    public void setMforwordid(Integer mforwordid) {
        this.mforwordid = mforwordid;
    }

    public Integer getMparentid() {
        return mparentid;
    }

    public void setMparentid(Integer mparentid) {
        this.mparentid = mparentid;
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

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }
}