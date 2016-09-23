package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year);

        Button Now_playing = (Button) findViewById(R.id.Now_Playing);

        Now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplaying = new Intent(year.this, now_playing.class);
                startActivity(nowplaying);
            }
        });
    }
}