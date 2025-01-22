package com.example.api_artist.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int artist_id;
    private String title;
    private boolean status;
    private String created_by;
    private String updated_by;
    private String created_ts;
    private String updated_ts;

    public Product() {}

    public Product(int id, int artistId, String title, boolean status, String createdBy, String updatedBy, String createdTs, String updatedTs) {
        this.id = id;
        this.artist_id = artistId;
        this.title = title;
        this.status = status;
        this.created_by = createdBy;
        this.updated_by = updatedBy;
        this.created_ts = createdTs;
        this.updated_ts = updatedTs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    public String getCreated_ts() {
        return created_ts;
    }

    public void setCreated_ts(String created_ts) {
        this.created_ts = created_ts;
    }

    public String getUpdated_ts() {
        return updated_ts;
    }

    public void setUpdated_ts(String updated_ts) {
        this.updated_ts = updated_ts;
    }
}
