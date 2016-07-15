package cn.ch1jia2.erp.entity;

import javax.persistence.*;

/**
 * Created by wangdj on 2016/7/5.
 */
@Entity
@Table(name="ms_suburbinfo")
public class SuburbEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    /**
     * 郊区ID
     */
    private int suburbid;

    /**
     * 郊区名字
     */
    @Column
    private String name;

    @Column
    private int parentid;

    /**
     * 所属城市
     */
//    @Transient
//    private CityEntity city;




    /**
     * 构造函数
     */
    public SuburbEntity(){}

    /**
     * 取得郊区ID
     * @return
     */
    public int getSuburbid() {
        return suburbid;
    }

    /**
     * 设置郊区ID
     * @param suburbid
     */
    public void setSuburbid(int suburbid) {
        this.suburbid = suburbid;
    }

    /**
     * 取得郊区名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置郊区名称
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    //@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH }, optional = true)
    //@JoinColumn(name="parentid")
    /**
     * 取得所属城市
     */
//    public CityEntity getCity() {
//        return city;
//    }

    /**
     * 设置所属城市
     * @param city
     */
//    public void setCity(CityEntity city) {
//        this.city = city;
//    }



    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

}
