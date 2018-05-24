package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.ListView;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("The Love You're Given", "Jack Garratt", R.drawable.jack_garratt));
        songs.add(new Song("Valentine", "Linus Young", R.drawable.linus));
        songs.add(new Song("Hey There Delilah", "Plain White T's", R.drawable.plain_white));
        songs.add(new Song("The One Moment", "OK GO", R.drawable.okgo));
        songs.add(new Song("The wonder Of You", "Conor O'Brien", R.drawable.conor));
        songs.add(new Song("My Least Favorite Life", "Lera Lynn", R.drawable.lera_lynn));
        songs.add(new Song("Make It Rain", "Ed Sheeran", R.drawable.ed_sheeran));
        songs.add(new Song("Famous Last Words", "My Chemical Romance", R.drawable.mcr));
        songs.add(new Song("The Hearse", "Matt Maeson", R.drawable.matt_maeson));
        songs.add(new Song("Wake Up", "Yoav", R.drawable.yoav));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

    public void playButton(String song, String author, int drawable){
        Intent intent = new Intent(Library.this, NowPlaying.class);
        Bundle bundle = new Bundle();
        bundle.putString("author", author);
        bundle.putString("song", song);
        bundle.putInt("picture", drawable);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}

