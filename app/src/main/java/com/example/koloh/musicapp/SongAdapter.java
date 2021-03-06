package com.example.koloh.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param songs   A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super ( context, 0, songs );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise the view is inflated
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }


        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem ( position );

        //IMAGE VIEW

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById ( R.id.list_item_icon );
        // Get the image resource ID from the current Song object and
        // set the image to iconView
        iconView.setImageResource ( currentSong.getImageResourceId () );

        // Find the TextView in the list_item.xml layout with the ID songtitle_text_view
        TextView titleTextView = (TextView) listItemView.findViewById ( R.id.songtitle_text_view );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        titleTextView.setText ( currentSong.getSongTitle () );

        // Find the TextView in the list_item.xml layout with the ID songartist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById ( R.id.songartist_text_view );
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText ( currentSong.getSongArtist () );


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;


    }

}