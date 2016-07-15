package cn.ch1jia2.erp.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by wangdj on 2016/7/6.
 */
@Entity
@Table(name = "ms_customerinfo")
public class CustomerEntity {
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int customerid;

    private String name;

    private String phone;

    private String password;

    private String email;

    private int gender;

    private String address;

    public List<CarEntity> getCars() {
        return cars;
    }

    public void setCars(List<CarEntity> cars) {
        this.cars = cars;
    }

    @OneToMany(targetEntity=CarEntity.class,cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="ownerid")
    private List<CarEntity> cars;
}
