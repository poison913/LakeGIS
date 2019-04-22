package entity;

import java.util.Date;

public class Rain {
    private Integer id;

    private String name;

    private Double day;

    private String weather;

    private Double xun;

    private Double month;

    private Date inserttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public Double getXun() {
        return xun;
    }

    public void setXun(Double xun) {
        this.xun = xun;
    }

    public Double getMonth() {
        return month;
    }

    public void setMonth(Double month) {
        this.month = month;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}