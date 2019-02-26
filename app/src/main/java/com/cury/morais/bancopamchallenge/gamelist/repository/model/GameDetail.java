package com.cury.morais.bancopamchallenge.gamelist.repository.model;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;
import com.squareup.moshi.Json;

import java.io.Serializable;

/**
 * Created by carlospontual on 02/04/16.
 */
public class GameDetail implements Serializable {

    @SerializedName("name")
    public String name;

    @SerializedName("_id")
    public int id;
    @SerializedName("giantbomb_id")
    public int giantbombId;
    @SerializedName("box")
    public Box boxImages;
    @SerializedName("logo")
    public Logo logoImages;

    @SerializedName("_links")
    @Nullable
    public Links links;

    @SerializedName("localized_name")
    public String localizedName;
    @SerializedName("locale")
    public String locale;
    @SerializedName("popularity")
    public int popularity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiantbombId() {
        return giantbombId;
    }

    public void setGiantbombId(int giantbombId) {
        this.giantbombId = giantbombId;
    }

    public Box getBoxImages() {
        return boxImages;
    }

    public void setBoxImages(Box boxImages) {
        this.boxImages = boxImages;
    }

    public Logo getLogoImages() {
        return logoImages;
    }

    public void setLogoImages(Logo logoImages) {
        this.logoImages = logoImages;
    }

    @Nullable
    public Links getLinks() {
        return links;
    }

    @Nullable
    public void setLinks(Links links) {
        this.links = links;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    //    public final String name;
//    @Json(name = "_id")
//    public final int id;
//    @Json(name = "giantbomb_id")
//    public final int giantbombId;
//    @Json(name = "box")
//    public final Images boxImages;
//    @Json(name = "logo")
//    public final Images logoImages;
//    @Json(name = "_links")
//    public final Links links;
//    @Json(name = "popularity")
//    public final int popularity;
//    @Json(name = "localized_name")
//    public final String localizedName;
//    @Json(name = "locale")
//    public final String locale;
//
//    public GameDetail() {
//        this(null, 0, 0, null, null, null, 0, null, null);
//    }
//
//    public GameDetail(String name, int id, int giantbombId, Images boxImages, Images logoImages, Links links, int popularity, String locale, String localizedName) {
//        this.name = name;
//        this.id = id;
//        this.giantbombId = giantbombId;
//        this.boxImages = boxImages;
//        this.logoImages = logoImages;
//        this.links = links;
//        this.popularity = popularity;
//        this.locale = locale;
//        this.localizedName = localizedName;
//    }
//
//    public static class Images implements Serializable {
//        public final String large, medium, small, template;
//
//        public Images() {
//            this(null, null, null, null);
//        }
//
//        public Images(String large, String medium, String small, String template) {
//            this.large = large;
//            this.medium = medium;
//            this.small = small;
//            this.template = template;
//        }
//    }


    @Override
    public String toString() {
        return "GameDetail{" +
                "name='" + name + '\'' +
                '}';
    }
}
