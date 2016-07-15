package cn.ch1jia2.erp.entity;

//import javax.persistence.*;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by wangdj on 2016/7/7.
 */
@Entity
@Table(name = "t_store_combo")
public class StoreComboEntity {
    public String getComboID() {
        return comboID;
    }

    public void setComboID(String comboID) {
        this.comboID = comboID;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public BigDecimal getComboPrice() {
        return comboPrice;
    }

    public void setComboPrice(BigDecimal comboPrice) {
        this.comboPrice = comboPrice;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    public String getGetComboDesc() {
        return getComboDesc;
    }

    public void setGetComboDesc(String getComboDesc) {
        this.getComboDesc = getComboDesc;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "combo_id")
    private String comboID;

    @Column(name = "combo_name")
    private String comboName;

    @Column(name = "combo_price")
    private BigDecimal comboPrice;

    @Column(name = "original_price")
    private BigDecimal originalPrice;

    @Column(name = "effective_day")
    private Integer effectiveDays;

    @Column(name = "combo_desc")
    private String getComboDesc;

    @Column(name = "combo_status")
    private char status;

    @Column(name = "store_id")
    private String storeid;

}
