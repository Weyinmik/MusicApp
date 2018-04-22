package com.example.koloh.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.song_list );

        // Create a back Action arrow to go back to main Activity
        getSupportActionBar ().setTitle ("Pop Song List and Artist");
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );

        // Creating an array of Songs called songs.
        ArrayList<Song> songs = new ArrayList<Song> ();

        // Better way of creating new song object
        //classic.add("Start Me Up");
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "The Middle", "Zedd, Maren Morris & Grey" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Meant To Be", " Bebe Rexha & Florida Georgia Line" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Never Be The Same", "Camila Cabello" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Finesse", " Bruno Mars & Cardi B" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Him & I", "G-Eazy & Halsey" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Pray For Me", "The Weeknd & Kendrick Lamar" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "God's Plan", "Drake" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "New Rules", "Dua Lipa" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Perfect", "Ed Sheeran" ) );
        songs.add ( new Song ( R.drawable.ic_audiotrack_black_24dp, "Wait", "Maroon 5" ) );


        /*LISTVIEW ADAPTER
        Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        The adapter knows how to create layouts for each item in the list, using
        the simple_list_item_1.xml layout resource defined in the Android framework.
        This list item layout contains a single {@link TextView}, which the adapter will set to display a single song.*/
        SongAdapter songAdapter = new SongAdapter ( this, songs );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById ( R.id.songList );

        /* Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        {@link ListView} will display list items for each word in the list of words.
         Do this by calling the setAdapter method on the {@link ListView} object and pass in
         1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.*/
        listView.setAdapter ( songAdapter );
    }
}