package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView album = (TextView) findViewById(R.id.Albums);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumintent = new Intent(MainActivity.this, albums.class);
                startActivity(albumintent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistintent = new Intent(MainActivity.this, artist.class);
                startActivity(artistintent);
            }
        });

        TextView genre = (TextView) findViewById(R.id.genre);

        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreintent = new Intent(MainActivity.this, genre.class);
                startActivity(genreintent);
            }
        });

        TextView year = (TextView) findViewById(R.id.year);

        year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yearintent = new Intent(MainActivity.this, year.class);
                startActivity(yearintent);
            }
        });


    }

}
