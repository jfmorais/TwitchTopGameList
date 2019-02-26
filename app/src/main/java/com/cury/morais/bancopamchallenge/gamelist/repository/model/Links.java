package com.cury.morais.bancopamchallenge.gamelist.repository.model;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;

import java.io.Serializable;

public class Links implements Serializable {

    @SerializedName("self")
    public String self;

    @SerializedName("next")
    public String next;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }


//    public final String self, next;
//
//    public Links() {
//        this(null, null);
//    }
//
//    public Links(String self, String next) {
//        this.self = self;
//        this.next = next;
//    }
}