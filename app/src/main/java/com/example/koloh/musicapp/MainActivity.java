package com.example.koloh.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // declare variables for each music category
        TextView classic = (TextView) findViewById ( R.id.classic );
        TextView country = (TextView) findViewById ( R.id.country );
        TextView african = (TextView) findViewById ( R.id.african );
        TextView family = (TextView) findViewById ( R.id.jazz );
        TextView rock = (TextView) findViewById ( R.id.rock );
        TextView pop = (TextView) findViewById ( R.id.pop );

// Set onClickListener on each TextView
        classic.setOnClickListener (this );
        country.setOnClickListener (this );
        african.setOnClickListener (this );
        family.setOnClickListener (this );
        rock.setOnClickListener (this );
        pop.setOnClickListener (this );


    }

    @Override
    public void onClick(View v) {
        switch (v.getId ()){
            case R.id.african:
                Intent africanIntent = new Intent ( MainActivity.this, AfricanActivity.class );
                startActivity ( africanIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;

            case R.id.classic:
                Intent classicIntent = new Intent ( MainActivity.this, ClassicActivity.class );
                startActivity ( classicIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;

            case R.id.country:
                Intent countryIntent = new Intent ( MainActivity.this, CountryActivity.class );
                startActivity ( countryIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;

            case R.id.jazz:
                Intent jazzIntent = new Intent ( MainActivity.this, JazzActivity.class );
                startActivity ( jazzIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;

            case R.id.rock:
                Intent rockIntent = new Intent ( MainActivity.this, RockActivity.class );
                startActivity ( rockIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;

            case R.id.pop:
                Intent popIntent = new Intent ( MainActivity.this, PopActivity.class );
                startActivity ( popIntent );
                Toast.makeText(getApplicationContext(), "You can use the back arrow to go back to Music Categories",Toast.LENGTH_SHORT).show();
                break;
        }



    }
}