package cn.ch1jia2.erp.entity;

import javax.persistence.*;

/**
 * Created by wangdj on 2016/7/7.
 */
@Entity
@Table(name = "ms_storeinfo")
public class StoreInfoEntity {

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String storeid;

    private String name;

    private String longitude;

    private String latitude;

    @Transient
    private int distance;
}
