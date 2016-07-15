package cn.ch1jia2.erp.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
@Entity(name = "t_goods_info")
public class GoodsInfoEntity {
    @Id
    @GeneratedValue
    @Column(name = "goods_info_id")
    private int id;

    @Column(name = "goods_info_name")
    private String name;


    @OneToMany
    private List<GoodsListEntity> goodsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsListEntity> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListEntity> goodsList) {
        this.goodsList = goodsList;
    }
}
