package cn.ch1jia2.erp.entity;

import javax.persistence.*;

/**
 * Created by yangzhenyu on 2016/6/24.
 * 汽车品牌
 */
@Entity(name = "master_car_brand")
public class CarBrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="brandid")
    private long id;
    @Column
    private String name;
    @Column
    private String country;
    @Column
    private String remark;

    public CarBrandEntity(){}

    public CarBrandEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}