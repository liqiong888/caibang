package com.caibang.www.common.model;

import java.util.Date;

public class MPermissions {
    private Integer mid;

    private String mpermissionsname;

    private Integer mpermissionstype;

    private String mpermissionscode;

    private String murl;

    private String mpermissionsicon;

    private Date mcreatdate;

    private Integer mcreatuserid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMpermissionsname() {
        return mpermissionsname;
    }

    public void setMpermissionsname(String mpermissionsname) {
        this.mpermissionsname = mpermissionsname;
    }

    public Integer getMpermissionstype() {
        return mpermissionstype;
    }

    public void setMpermissionstype(Integer mpermissionstype) {
        this.mpermissionstype = mpermissionstype;
    }

    public String getMpermissionscode() {
        return mpermissionscode;
    }

    public void setMpermissionscode(String mpermissionscode) {
        this.mpermissionscode = mpermissionscode;
    }

    public String getMurl() {
        return murl;
    }

    public void setMurl(String murl) {
        this.murl = murl;
    }

    public String getMpermissionsicon() {
        return mpermissionsicon;
    }

    public void setMpermissionsicon(String mpermissionsicon) {
        this.mpermissionsicon = mpermissionsicon;
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