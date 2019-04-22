package entity;

import java.math.BigDecimal;

public class Pujianggonqin {
    private Integer gid;

    private Integer objectid;

    private Integer id;

    private BigDecimal buffDist;

    private Integer origFid;

    private BigDecimal shapeLeng;

    private BigDecimal shapeArea;

    private Object geom;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getBuffDist() {
        return buffDist;
    }

    public void setBuffDist(BigDecimal buffDist) {
        this.buffDist = buffDist;
    }

    public Integer getOrigFid() {
        return origFid;
    }

    public void setOrigFid(Integer origFid) {
        this.origFid = origFid;
    }

    public BigDecimal getShapeLeng() {
        return shapeLeng;
    }

    public void setShapeLeng(BigDecimal shapeLeng) {
        this.shapeLeng = shapeLeng;
    }

    public BigDecimal getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(BigDecimal shapeArea) {
        this.shapeArea = shapeArea;
    }

    public Object getGeom() {
        return geom;
    }

    public void setGeom(Object geom) {
        this.geom = geom;
    }
}