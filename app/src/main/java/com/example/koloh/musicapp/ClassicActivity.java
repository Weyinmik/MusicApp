package com.example.koloh.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_classic );

        // Creating an array of Songs called songs.
        ArrayList<Song> songs = new ArrayList<Song> ();

        // Better way of creating new song object
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Start Me Up", "The Rolling Stones" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Sweet Home Alabama", " Lynyrd Skynyrd, Blackberry Smoke" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Stuck in the Middle with You", "Stealers Wheel" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Sweet Emotion", "Aerosmith" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Glory Days", "Bruce Springsteen" ) );

        //LISTVIEW ADAPTER
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter songAdapter = new SongAdapter ( this, songs );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById ( R.id.songList );

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(songAdapter);
    }
}
