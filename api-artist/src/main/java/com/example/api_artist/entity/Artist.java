package com.example.api_artist.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int user_id;
    private String artist_name;
    private String bio;
    private String profile_image;
    private boolean status;
    private String created_by;
    private String updated_by;
    private String created_ts;
    private String updated_ts;

    public Artist(){}

    public Artist(int id, int userId, String artistName, String bio, String profileImage, boolean status, String createdBy, String updatedBy, String createdTs, String updatedTs) {
        this.id = id;
        this.user_id = userId;
        this.artist_name = artistName;
        this.bio = bio;
        this.profile_image = profileImage;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
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
