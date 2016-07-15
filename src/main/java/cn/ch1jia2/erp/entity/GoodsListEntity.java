package cn.ch1jia2.erp.entity;

import javax.persistence.*;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
@Entity(name = "t_goods_list")
public class GoodsListEntity {
    @Id
    @GeneratedValue
    @Column(name = "goods_list_id")
    private String id;

    @Column(name = "goods_list_name")
    private String name;

    @Column(name = "goods_list_color")
    private String color;

    @Column(name = "goods_list_type")
    private String type;

    @Column(name = "goods_list_description")
    private String description;

    private String goodsInfoId;

    public GoodsListEntity(){

    }

    public GoodsListEntity(String goodsInfoId) {
        this.goodsInfoId = goodsInfoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}