package com.example.api_artist.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "user_Role")
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String role_id;
    private String assigned_by;
    private String created_ts;
    private String updated_by;
    private String Updated_ts;

    public User_Role(){}

    public User_Role(int id, String roleId, String assignedBy, String createdTs, String updatedBy, String updatedTs) {
        this.id = id;
        this.role_id = roleId;
        this.assigned_by = assignedBy;
        this.created_ts = createdTs;
        this.updated_by = updatedBy;
        this.Updated_ts = updatedTs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAssigned_by() {
        return assigned_by;
    }

    public void setAssigned_by(String assigned_by) {
        this.assigned_by = assigned_by;
    }

    public String getCreated_ts() {
        return created_ts;
    }

    public void setCreated_ts(String created_ts) {
        this.created_ts = created_ts;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getUpdated_ts() {
        return Updated_ts;
    }

    public void setUpdated_ts(String updated_ts) {
        Updated_ts = updated_ts;
    }
}
