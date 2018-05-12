package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Authors extends AppCompatActivity{
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authors);

        ArrayList<Artist> artists = new ArrayList<Artist>();

        artists.add(new Artist("Jack Garratt", R.drawable.jack_garratt));
        artists.add(new Artist("Linus Young", R.drawable.linus));
        artists.add(new Artist("Plain White T's", R.drawable.plain_white));
        artists.add(new Artist("OK GO", R.drawable.okgo));
        artists.add(new Artist( "Conor O'Brien", R.drawable.conor));
        artists.add(new Artist("Lera Lynn", R.drawable.lera_lynn));
        artists.add(new Artist("Ed Sheeran", R.drawable.ed_sheeran));
        artists.add(new Artist("My Chemical Romance", R.drawable.mcr));
        artists.add(new Artist("Matt Maeson", R.drawable.matt_maeson));
        artists.add(new Artist("Yoav", R.drawable.yoav));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
