package entity;

public class Inning {
    private Integer id;

    private String dlbm;

    private String dlmc;

    private String qsxz;

    private String qsdwdm;

    private String zldwmc;

    private String zhen;

    private String zhenname;

    private String areaha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDlbm() {
        return dlbm;
    }

    public void setDlbm(String dlbm) {
        this.dlbm = dlbm == null ? null : dlbm.trim();
    }

    public String getDlmc() {
        return dlmc;
    }

    public void setDlmc(String dlmc) {
        this.dlmc = dlmc == null ? null : dlmc.trim();
    }

    public String getQsxz() {
        return qsxz;
    }

    public void setQsxz(String qsxz) {
        this.qsxz = qsxz == null ? null : qsxz.trim();
    }

    public String getQsdwdm() {
        return qsdwdm;
    }

    public void setQsdwdm(String qsdwdm) {
        this.qsdwdm = qsdwdm == null ? null : qsdwdm.trim();
    }

    public String getZldwmc() {
        return zldwmc;
    }

    public void setZldwmc(String zldwmc) {
        this.zldwmc = zldwmc == null ? null : zldwmc.trim();
    }

    public String getZhen() {
        return zhen;
    }

    public void setZhen(String zhen) {
        this.zhen = zhen == null ? null : zhen.trim();
    }

    public String getZhenname() {
        return zhenname;
    }

    public void setZhenname(String zhenname) {
        this.zhenname = zhenname == null ? null : zhenname.trim();
    }

    public String getAreaha() {
        return areaha;
    }

    public void setAreaha(String areaha) {
        this.areaha = areaha == null ? null : areaha.trim();
    }
}