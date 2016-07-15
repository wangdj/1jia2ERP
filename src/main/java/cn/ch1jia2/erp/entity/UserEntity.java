package cn.ch1jia2.erp.entity;

import javax.management.relation.Role;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 172643386440351811L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private RoleEntity role;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Size(min=6)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne
    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }






}
