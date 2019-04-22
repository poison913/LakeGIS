package entity;

import java.util.Date;

public class Waterlevel {
    private Integer id;

    private String xianname;

    private String lakename;

    private String todaylevel;

    private String leveldiff;

    private String storage;

    private String yihong;

    private String xiehong;

    private String guangai;

    private String shushui;

    private String fadiandong;

    private String flow;

    private String controllevel;

    private String topper;

    private String toppertime;

    private Date inserttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXianname() {
        return xianname;
    }

    public void setXianname(String xianname) {
        this.xianname = xianname == null ? null : xianname.trim();
    }

    public String getLakename() {
        return lakename;
    }

    public void setLakename(String lakename) {
        this.lakename = lakename == null ? null : lakename.trim();
    }

    public String getTodaylevel() {
        return todaylevel;
    }

    public void setTodaylevel(String todaylevel) {
        this.todaylevel = todaylevel == null ? null : todaylevel.trim();
    }

    public String getLeveldiff() {
        return leveldiff;
    }

    public void setLeveldiff(String leveldiff) {
        this.leveldiff = leveldiff == null ? null : leveldiff.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getYihong() {
        return yihong;
    }

    public void setYihong(String yihong) {
        this.yihong = yihong == null ? null : yihong.trim();
    }

    public String getXiehong() {
        return xiehong;
    }

    public void setXiehong(String xiehong) {
        this.xiehong = xiehong == null ? null : xiehong.trim();
    }

    public String getGuangai() {
        return guangai;
    }

    public void setGuangai(String guangai) {
        this.guangai = guangai == null ? null : guangai.trim();
    }

    public String getShushui() {
        return shushui;
    }

    public void setShushui(String shushui) {
        this.shushui = shushui == null ? null : shushui.trim();
    }

    public String getFadiandong() {
        return fadiandong;
    }

    public void setFadiandong(String fadiandong) {
        this.fadiandong = fadiandong == null ? null : fadiandong.trim();
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow == null ? null : flow.trim();
    }

    public String getControllevel() {
        return controllevel;
    }

    public void setControllevel(String controllevel) {
        this.controllevel = controllevel == null ? null : controllevel.trim();
    }

    public String getTopper() {
        return topper;
    }

    public void setTopper(String topper) {
        this.topper = topper == null ? null : topper.trim();
    }

    public String getToppertime() {
        return toppertime;
    }

    public void setToppertime(String toppertime) {
        this.toppertime = toppertime == null ? null : toppertime.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}