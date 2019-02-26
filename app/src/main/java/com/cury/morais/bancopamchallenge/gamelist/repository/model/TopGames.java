package com.cury.morais.bancopamchallenge.gamelist.repository.model;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.List;

public class TopGames implements Serializable {


    @SerializedName("_total")
    public int total;

    @SerializedName("_links")
    public Links links;

    @SerializedName("top")
    public List<Game> games = null;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    //    public static final String TOPGAMES_TAG = "topgames";
//
//    @Json(name = "_total")
//    public final int total;
//    @Json(name = "top")
//    public final List<Game> games;
//    @Json(name = "_links")
//    public final Links links;
//
//    public TopGames() {
//        this(0, null, null);
//    }
//
//    public TopGames(int total, List<Game> games, Links links) {
//        this.total = total;
//        this.games = games;
//        this.links = links;
//    }
}
