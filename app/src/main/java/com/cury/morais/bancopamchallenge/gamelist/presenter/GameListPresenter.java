package com.cury.morais.bancopamchallenge.gamelist.presenter;

import com.cury.morais.bancopamchallenge.gamelist.GameListContract;
import com.cury.morais.bancopamchallenge.gamelist.repository.GameService;
import com.cury.morais.bancopamchallenge.gamelist.repository.model.Game;

import java.util.List;

public class GameListPresenter implements GameListContract.Presenter, GameListContract.Interactor.OnFinishedListener {
    private GameListContract.View mView;
    private GameListContract.Interactor mInteractor;
    private GameService mGameService;

    public GameListPresenter(GameListContract.View view, GameListContract.Interactor interactor) {
        mView = view;
        mInteractor = interactor;
//        retrieveGames();
////        mView.setPresenter(this);
//        mGameService = GameService.getInstance(this);
    }

//    public void retrieveGames() {
//        if (mView != null) {
////            mView.showRefreshing();
////            if (isCacheEmpty(topGamesCache)) {
////                view.showLoadingFirst();
////            }
//            loadGames();
//        }
//    }

    public void loadGames(){
        mGameService.getTopGameList();
    }


    @Override
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void onRefreshButtonClick() {
        if(mView != null){
            mView.showProgress();
        }
        mInteractor.getGameArrayList(this);
    }

    @Override
    public void requestDataFromServer() {
        mInteractor.getGameArrayList(this);
    }

    @Override
    public void onFinished(List<Game> gameArrayList) {
        if(mView != null){
            mView.setDataToRecyclerView(gameArrayList);
            mView.hideProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if(mView != null){
            mView.onResponseFailure(t);
            mView.hideProgress();
        }
    }
}
