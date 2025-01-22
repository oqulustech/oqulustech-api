package com.example.api_artist.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_name;
    private String last_name;
    private String first_name;
    private String email;
    private String password;
    private boolean status;
    private String created_by;
    private String created_ts;
    private String updated_by;
    private String updated_ts;

    public User(){}

    public User(int id, String userName, String lastName, String firstName, String email, String password, boolean status, String createdBy, String createdTs, String updatedBy, String updatedTs) {
        this.id = id;
        this.user_name = userName;
        this.last_name = lastName;
        this.first_name = firstName;
        this.email = email;
        this.password = password;
        this.status = status;
        this.created_by = createdBy;
        this.created_ts = createdTs;
        this.updated_by = updatedBy;
        this.updated_ts = updatedTs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return updated_ts;
    }

    public void setUpdated_ts(String updated_ts) {
        this.updated_ts = updated_ts;
    }
}
