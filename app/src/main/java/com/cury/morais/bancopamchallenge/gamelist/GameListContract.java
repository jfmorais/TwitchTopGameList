package com.cury.morais.bancopamchallenge.gamelist;

import com.cury.morais.bancopamchallenge.gamelist.repository.model.Game;

import java.util.ArrayList;
import java.util.List;

public interface GameListContract {

    interface View{
        void initView();
        void setListeneners();
        void showProgress();
        void hideProgress();
        void setDataToRecyclerView(List<Game> gameArrayList);
        void onResponseFailure(Throwable throwable);
    }

    interface Presenter{
        void onDestroy();
        void onRefreshButtonClick();
        void requestDataFromServer();
    }

    /**
     * Intractors are classes built for fetching data from your database, web services, or any other data source.
     **/
    interface Interactor {

        interface OnFinishedListener {
//            void onFinished(ArrayList<Notice> noticeArrayList);
            void onFinished(List<Game> gameArrayList);
            void onFailure(Throwable t);
        }

        void getGameArrayList(OnFinishedListener onFinishedListener);
    }
}
