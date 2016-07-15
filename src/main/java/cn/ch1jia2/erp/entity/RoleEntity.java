package cn.ch1jia2.erp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class RoleEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7425304725239042741L;
    private int id;
    private String role;
    @Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
