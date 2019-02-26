package com.cury.morais.bancopamchallenge.gamelist.repository;

import com.cury.morais.bancopamchallenge.gamelist.GameListContract;

public class GameService implements GameDataSource{
    private static GameService INSTANCE = null;
    private final GameListContract.Presenter mPresenter;
    private GameDataSource mGamesRemoteDataSource;
    private GameDataSource mGamesLocalDataSource;

    public static GameService getInstance(GameListContract.Presenter presenter) {
        if (INSTANCE == null) {
            INSTANCE = new GameService(presenter);
        }
        return INSTANCE;
    }

    public GameService (GameListContract.Presenter presenter){
        mPresenter = presenter;
    }

    public void getTopGameList() {

    }

    public interface GamesApi {

    }

}
