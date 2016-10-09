package net.jakare.appcoles.model;

/**
 * Created by anahisalgado on 01/09/16.
 */
public class Picture {

    private String picture;
    private String title;
    private String time;
    private String like_number;
    private String detalle;

    public Picture(String picture, String title, String time, String like_number, String detalle) {
        this.picture = picture;
        this.title = title;
        this.time = time;
        this.like_number = like_number;
        this.detalle = detalle;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike_number() {
        return like_number;
    }

    public void setLike_number(String like_number) {
        this.like_number = like_number;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String like_number) {
        this.detalle = like_number;
    }


}
