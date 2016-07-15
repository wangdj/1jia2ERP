package cn.ch1jia2.erp.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangdj on 2016/7/4.
 */
@Entity
@Table(name = "ms_cityinfo")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityid")
    private int cityid;

    @Column
    private String cityname;

    @Column
    private int ishot;

    public int getIshot() {
        return ishot;
    }

    public void setIshot(int isHot) {
        this.ishot = isHot;
    }


    @Id
    @GeneratedValue
    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
    @Size(min=6)
    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @OneToMany(targetEntity=SuburbEntity.class,cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="parentid")
   // @Transient
    public Set<SuburbEntity> getSuberbs() {
        return suburbs;
    }

    public void setSuberbs(Set<SuburbEntity> suberbs) {
        this.suburbs = suberbs;
    }

    private Set<SuburbEntity> suburbs =new HashSet<SuburbEntity>();

    /**
     * 为当前城市追加一个郊区
     * @param entity
     */
    public void addSuburb(SuburbEntity entity){
//        entity.setCity(this);
        this.suburbs.add(entity);
    }

}
