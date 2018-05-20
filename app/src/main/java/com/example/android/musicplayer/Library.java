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
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("The Love You're Given", "Jack Garratt"));
        songs.add(new Song("Valentine", "Linus Young"));
        songs.add(new Song("Hey There Delilah", "Plain White T's"));
        songs.add(new Song("The One Moment", "OK GO"));
        songs.add(new Song("The wonder Of You", "Conor O'Brien"));
        songs.add(new Song("My Least Favorite Life", "Lera Lynn"));
        songs.add(new Song("Make It Rain", "Ed Sheeran"));
        songs.add(new Song("Famous Last Words", "My Chemical Romance"));
        songs.add(new Song("The Hearse", "Matt Maeson"));
        songs.add(new Song("Wake Up", "Yoav"));

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) listView.getItemAtPosition(position);
            }
            public void playButton(View v) {
                Intent intent = new Intent(Library.this, NowPlaying.class);
                startActivity(intent);
            }
        });

    }


}

