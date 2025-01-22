package com.example.api_artist.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private boolean status;
    private String created_by;
    private String created_ts;
    private String updated_by;
    private String Updated_ts;

    public Role(){}

    public Role(int id, String name, boolean status, String createdBy, String createdTs, String updatedBy, String updatedTs) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.created_by = createdBy;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
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
