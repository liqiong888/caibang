package com.caibang.www.common.model;

import java.util.Date;

public class MUser {
    private Integer mid;

    private String mloginname;

    private String mphone;

    private String mpassword;

    private String mname;

    private String mcard;

    private Date mcreatdate;

    private String mopenid;

    private String mheadimg;

    private Integer mgender;

    private Date mbirthday;

    private Integer mstate;

    private Integer mcid;

    private Integer mdepid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMloginname() {
        return mloginname;
    }

    public void setMloginname(String mloginname) {
        this.mloginname = mloginname == null ? null : mloginname.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword == null ? null : mpassword.trim();
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMcard() {
        return mcard;
    }

    public void setMcard(String mcard) {
        this.mcard = mcard == null ? null : mcard.trim();
    }

    public Date getMcreatdate() {
        return mcreatdate;
    }

    public void setMcreatdate(Date mcreatdate) {
        this.mcreatdate = mcreatdate;
    }

    public String getMopenid() {
        return mopenid;
    }

    public void setMopenid(String mopenid) {
        this.mopenid = mopenid == null ? null : mopenid.trim();
    }

    public String getMheadimg() {
        return mheadimg;
    }

    public void setMheadimg(String mheadimg) {
        this.mheadimg = mheadimg == null ? null : mheadimg.trim();
    }

    public Integer getMgender() {
        return mgender;
    }

    public void setMgender(Integer mgender) {
        this.mgender = mgender;
    }

    public Date getMbirthday() {
        return mbirthday;
    }

    public void setMbirthday(Date mbirthday) {
        this.mbirthday = mbirthday;
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

    public Integer getMdepid() {
        return mdepid;
    }

    public void setMdepid(Integer mdepid) {
        this.mdepid = mdepid;
    }
}