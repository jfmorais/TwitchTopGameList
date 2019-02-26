package com.cury.morais.bancopamchallenge.gamelist.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import com.cury.morais.bancopamchallenge.R;
import com.cury.morais.bancopamchallenge.gamelist.GameListContract;
import com.cury.morais.bancopamchallenge.gamelist.interactor.GameListInteractor;
import com.cury.morais.bancopamchallenge.gamelist.presenter.GameListPresenter;
import com.cury.morais.bancopamchallenge.gamelist.repository.model.Game;
import com.cury.morais.bancopamchallenge.gamelist.view.adapter.GameAdapter;

import java.util.ArrayList;
import java.util.List;

public class GameListActivity extends AppCompatActivity implements GameListContract.View, View.OnClickListener {
    private static final String TAG = "GameListActivity";

    private GameListContract.Presenter mPresenter;
//    private RecyclerView gameList;
    private GridView gameList;
    GameAdapter gameAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list_layout);

        initView();
        setListeneners();
        mPresenter = new GameListPresenter(this, new GameListInteractor());
        mPresenter.requestDataFromServer();
    }

    @Override
    public void initView() {
//        gameList = findViewById(R.id.recycler_game_list);
//        gameList.setAdapter();
//        gameList.setLayoutManager(layoutManagerGameList);
//        gameList.setHasFixedSize(true);
        gameList = findViewById(R.id.grid_view_game_list);
        gameAdapter  = new GameAdapter(this);
        gameList.setAdapter(gameAdapter);
    }

    @Override
    public void setListeneners() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setDataToRecyclerView(List<Game> gameArrayList) {
        gameAdapter.setGames(gameArrayList);
    }

    @Override
    public void onResponseFailure(Throwable throwable) {

    }

    @Override
    public void onClick(View view) {

    }

}
