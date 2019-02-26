package com.cury.morais.bancopamchallenge.gamelist.repository.model;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;

import java.io.Serializable;

public class Game implements Serializable {

    @SerializedName("viewers")
    public int viewers;

    @SerializedName("channels")
    public int channels;

    @SerializedName("game")
    public GameDetail gameDetail;

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public GameDetail getGameDetail() {
        return gameDetail;
    }

    public void setGameDetail(GameDetail gameDetail) {
        this.gameDetail = gameDetail;
    }

//    public static final String GAME_TAG = "game";
//    public final int viewers;
//    public final int channels;
//
//    @Json(name = "game")
//    public final GameDetail gameData;
//
//    public Game() {
//        this(0, 0, null);
//    }
//
//    public Game(int viewers, int channels, GameDetail gameData) {
//        this.viewers = viewers;
//        this.channels = channels;
//        this.gameData = gameData;
//    }
}
