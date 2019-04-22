package entity;

import java.util.Date;

public class Riverlevel {
    private Integer id;

    private String rivername;

    private String stationname;

    private String protectlevel;

    private String alertlevel;

    private String todaylevel;

    private String leceldiff;

    private String flow;

    private String sluicelevel;

    private String sluicediff;

    private String sluiceopen;

    private String changjiangtop;

    private String changjiangtime;

    private String rivertop;

    private String rivertoptime;

    private Date inserttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRivername() {
        return rivername;
    }

    public void setRivername(String rivername) {
        this.rivername = rivername == null ? null : rivername.trim();
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

    public String getProtectlevel() {
        return protectlevel;
    }

    public void setProtectlevel(String protectlevel) {
        this.protectlevel = protectlevel == null ? null : protectlevel.trim();
    }

    public String getAlertlevel() {
        return alertlevel;
    }

    public void setAlertlevel(String alertlevel) {
        this.alertlevel = alertlevel == null ? null : alertlevel.trim();
    }

    public String getTodaylevel() {
        return todaylevel;
    }

    public void setTodaylevel(String todaylevel) {
        this.todaylevel = todaylevel == null ? null : todaylevel.trim();
    }

    public String getLeceldiff() {
        return leceldiff;
    }

    public void setLeceldiff(String leceldiff) {
        this.leceldiff = leceldiff == null ? null : leceldiff.trim();
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow == null ? null : flow.trim();
    }

    public String getSluicelevel() {
        return sluicelevel;
    }

    public void setSluicelevel(String sluicelevel) {
        this.sluicelevel = sluicelevel == null ? null : sluicelevel.trim();
    }

    public String getSluicediff() {
        return sluicediff;
    }

    public void setSluicediff(String sluicediff) {
        this.sluicediff = sluicediff == null ? null : sluicediff.trim();
    }

    public String getSluiceopen() {
        return sluiceopen;
    }

    public void setSluiceopen(String sluiceopen) {
        this.sluiceopen = sluiceopen == null ? null : sluiceopen.trim();
    }

    public String getChangjiangtop() {
        return changjiangtop;
    }

    public void setChangjiangtop(String changjiangtop) {
        this.changjiangtop = changjiangtop == null ? null : changjiangtop.trim();
    }

    public String getChangjiangtime() {
        return changjiangtime;
    }

    public void setChangjiangtime(String changjiangtime) {
        this.changjiangtime = changjiangtime == null ? null : changjiangtime.trim();
    }

    public String getRivertop() {
        return rivertop;
    }

    public void setRivertop(String rivertop) {
        this.rivertop = rivertop == null ? null : rivertop.trim();
    }

    public String getRivertoptime() {
        return rivertoptime;
    }

    public void setRivertoptime(String rivertoptime) {
        this.rivertoptime = rivertoptime == null ? null : rivertoptime.trim();
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}