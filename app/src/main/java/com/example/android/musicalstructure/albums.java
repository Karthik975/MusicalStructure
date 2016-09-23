package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);

        Button Now_playing = (Button) findViewById(R.id.Now_Playing);

        Now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplaying = new Intent(albums.this, now_playing.class);
                startActivity(nowplaying);
            }
        });
    }
}
