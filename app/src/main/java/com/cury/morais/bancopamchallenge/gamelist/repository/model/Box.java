package com.cury.morais.bancopamchallenge.gamelist.repository.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Box  implements Serializable {

    @SerializedName("large")
    public String large;
    @SerializedName("medium")
    public String medium;
    @SerializedName("small")
    public String small;
    @SerializedName("template")
    public String template;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    //    public Logo() {
//        this(null, null, null, null);
//    }
//
//    public Logo(String large, String medium, String small, String template) {
//        this.large = large;
//        this.medium = medium;
//        this.small = small;
//        this.template = template;
//    }

}
