package entity;

import java.util.Date;

public class Ssflows {
    private Integer id;

    private String station;

    private String year;

    private String times;

    private Double flow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times == null ? null : times.trim();
    }

    public Double getFlow() {
        return flow;
    }

    public void setFlow(Double flow) {
        this.flow = flow;
    }
}