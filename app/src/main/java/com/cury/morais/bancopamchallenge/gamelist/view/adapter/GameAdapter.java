package com.cury.morais.bancopamchallenge.gamelist.view.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cury.morais.bancopamchallenge.R;
import com.cury.morais.bancopamchallenge.gamelist.repository.model.Game;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GameAdapter extends BaseAdapter {

    private final Context mContext;
    private List<Game> games = new ArrayList<>();

    // 1
    public GameAdapter(Context context/*, Game[] games*/) {
        this.mContext = context;
//        this.games = games;
    }

    public void setGames(List games){
        this.games = games;
        notifyDataSetChanged();
    }

    // 2
    @Override
    public int getCount() {
        return games.size();
    }

    // 3
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 4
    @Override
    public Object getItem(int position) {
        return null;
    }

    // 5
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Game game = games.get(position);

        // 2
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.item_game, null);
        }

        // 3
        final ImageView gameImage = (ImageView)convertView.findViewById(R.id.image_view_game_image);
        final TextView gameName = (TextView)convertView.findViewById(R.id.text_view_game_name);

        // 4
//        gameImage.setImageResource(book.getImageResource());
//        gameName.setText(mContext.getString(book.getName()));

//        gameImage.setImageDrawable(mContext.getDrawable(R.drawable.ic_launcher_foreground));
        gameImage.setImageDrawable(loadImageFromWebOperations(game.getGameDetail().getLogoImages().small));
        gameName.setText("Title: "+ game.getGameDetail().getName());

        return convertView;
    }

    private Drawable loadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            Log.i("CURY", );
            return d;
        } catch (Exception e) {
            return null;
        }
    }

}
