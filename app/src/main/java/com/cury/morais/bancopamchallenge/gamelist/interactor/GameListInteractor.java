package com.cury.morais.bancopamchallenge.gamelist.interactor;

import android.util.Log;

import com.cury.morais.bancopamchallenge.gamelist.repository.GetGameDataService;
import com.cury.morais.bancopamchallenge.gamelist.GameListContract;
import com.cury.morais.bancopamchallenge.gamelist.repository.RetrofitInstance;
import com.cury.morais.bancopamchallenge.gamelist.repository.model.TopGames;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameListInteractor implements GameListContract.Interactor {
    private Call<TopGames> currentCall;

    @Override
    public void getGameArrayList(final OnFinishedListener onFinishedListener) {

        /** Create handle for the RetrofitInstance interface*/
        GetGameDataService service = RetrofitInstance.getRetrofitInstance().create(GetGameDataService.class);

        /** Call the method with parameter in the interface to get the notice data*/
//        Call<TopGames> call = service.getTopGamesData();
        Call<TopGames> call = service.getTopGames();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<TopGames>() {
            @Override
            public void onResponse(Call<TopGames> call, Response<TopGames> response) {
//                Log.i("CURY_LISTA", response.body().toString());
//                onFinishedListener.onFinished(response.body().games);

                if (response.isSuccessful()) {
                    Log.i("xxx", response.body().games.get(0).getGameDetail().toString());
                    onFinishedListener.onFinished(response.body().games);
                } else {
//                    callBack.onError(response.code(), response.errorBody().toString());
                    Log.i("xxx code ",String.valueOf(response.code()));
                    Log.i("xxx errorbody ",response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<TopGames> call, Throwable t) {
                Log.i("xxx code ", t.getMessage());
                onFinishedListener.onFailure(t);
            }
        });


    }
}
