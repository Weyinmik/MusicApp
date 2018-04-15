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
        ArrayList<Song> classic = new ArrayList<Song> (  );

        //classic.add();
        /*Song s = new Song ("Start Me Up", "The Rolling Stones");
        classic.add(s);*/

        // Better way of creating new song object
        //classic.add("Start Me Up");
        classic.add(new Song("Start Me Up", "The Rolling Stones"));


        classic.add (new Song("Sweet Home Alabama", " Lynyrd Skynyrd, Blackberry Smoke"));

        //LISTVIEW ADAPTER
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter songAdapter =
                new SongAdapter(this, classic);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.classicList);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(songAdapter);
    }
}
