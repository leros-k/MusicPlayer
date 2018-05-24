package com.example.android.musicplayer;

import android.app.Activity;
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
import android.widget.TextView;

import com.example.android.musicplayer.R;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = (TextView)convertView.findViewById(R.id.song);
        nameTextView.setText(currentSong.getSong());

        TextView authorTextView = (TextView)convertView.findViewById(R.id.authors);
        authorTextView.setText(currentSong.getAuthor());

        convertView.findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Library)getContext()).playButton(getItem(position).getAuthor(), getItem(position).getSong(), getItem(position).getDrawable());
            }
        });

        convertView.findViewById(R.id.image).setBackgroundDrawable(ContextCompat.getDrawable(getContext(), getItem(position).getDrawable()));

        return convertView;
    }
}
