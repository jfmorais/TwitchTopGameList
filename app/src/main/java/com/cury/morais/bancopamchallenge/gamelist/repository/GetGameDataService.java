package com.cury.morais.bancopamchallenge.gamelist.repository;

import com.cury.morais.bancopamchallenge.gamelist.repository.model.TopGames;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface GetGameDataService {

    @Headers({"Accept: application/vnd.twitchtv.v5+json"})
    @GET("games/top?limit=100&client_id=mz5yy4jgtkvvhuh8almyjzctsjgyyp")
    Call<TopGames> getTopGames();

    @GET("games/top/?client_id=mz5yy4jgtkvvhuh8almyjzctsjgyyp")
    Call<TopGames> getTopGamesData();


//    @GET("group/{id}/users")
//    Call<List<Notice>> groupList(@Path("id") int groupId);

//    @GET("group/{id}/users")
//    Call<List<Notice>> groupList(@Path("id") int groupId, @Query("sort") String sort);

//    @GET("group/{id}/noticelist")
//    Call<List<Notice>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);
//
//    @POST("notice/new")
//    Call<Notice> createNotice(@Body Notice notice);

//    @FormUrlEncoded
//    @POST("notice/edit")
//    Call<Notice> updateNotice(@Field("id") String id, @Field("title") String title);

//    @Multipart
//    @PUT("notice/photo")
//    Call<Notice> updateNotice(@Part("photo") RequestBody photo, @Part("description") RequestBody description);

}