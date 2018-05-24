package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        String song = getIntent().getStringExtra("author");
        String author = getIntent().getStringExtra("name");
        int drawableId = getIntent().getIntExtra("picture", 0);

        ((TextView)findViewById(R.id.song)).setText(song);
        ((TextView)findViewById(R.id.authors)).setText(author);
        findViewById(R.id.picture).setBackgroundDrawable(ContextCompat.getDrawable(NowPlaying.this, drawableId));

    }
}
