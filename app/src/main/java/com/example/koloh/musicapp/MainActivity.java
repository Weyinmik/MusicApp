package com.example.koloh.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // Find the View that shows the classic music category
        TextView classic = (TextView) findViewById ( R.id.classic );

// Set a click listener on that View
        classic.setOnClickListener ( new View.OnClickListener () {
            // The code in this method will be executed when the classic music View is clicked on.
            @Override
            public void onClick(View view) {
                Intent classicIntent = new Intent ( MainActivity.this, ClassicActivity.class );
                startActivity ( classicIntent );
            }
        } );

        // Find the View that shows the country music category
        TextView country = (TextView) findViewById ( R.id.country );

        // Set a click listener on the country music View
        country.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent ( MainActivity.this, CountryActivity.class );
                startActivity ( countryIntent );
            }
        } );

        // Find the View that shows the african music category
        TextView african = (TextView) findViewById ( R.id.african );

        // Set a click View that shows the african music Category
        african.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent africanIntent = new Intent ( MainActivity.this, AfricanActivity.class );
                startActivity ( africanIntent );
            }
        } );

        // Find the view that shows the jazz music category
        TextView family = (TextView) findViewById ( R.id.jazz );

        // Set a click View that shows the jazz music category
        family.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent jazzIntent = new Intent ( MainActivity.this, JazzActivity.class );
                startActivity ( jazzIntent );
            }
        } );

        // Find the view that shows the rock music category
        TextView rock = (TextView) findViewById ( R.id.rock );

        // Set a click View that shows the rock music category
        rock.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent ( MainActivity.this, RockActivity.class );
                startActivity ( rockIntent );
            }
        } );

        // Find the view that shows the pop music category
        TextView pop = (TextView) findViewById ( R.id.pop );

        // Set a click View that shows the pop music category
        pop.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent popIntent = new Intent ( MainActivity.this, PopActivity.class );
                startActivity ( popIntent );
            }
        } );


    }
}