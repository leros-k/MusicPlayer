package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.musicplayer.R;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    Context mContext;
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View listItemView, @NonNull ViewGroup parent) {

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.song);
        nameTextView.setText(currentSong.getSong());

        TextView authorTextView = (TextView)listItemView.findViewById(R.id.authors);
        authorTextView.setText(currentSong.getAuthor());

        Button button = (Button) listItemView.findViewById(R.id.play);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, NowPlaying.class);
                mContext.startActivity(intent);
            }
        });

        return listItemView;
    }
}
