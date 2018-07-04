package com.example.android.zaminoblapodcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.zaminoblapodcast.MainActivity.playDate;
import static com.example.android.zaminoblapodcast.MainActivity.playPodcast;

public class NowPlayingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        String currentPodcast = "";
        String currentDate = "";

        Intent intent = getIntent();
        if (null != intent) {
            currentPodcast = intent.getStringExtra(playPodcast);
            currentDate = intent.getStringExtra(playDate);
        }

        //Puts the podcast information the user selected in MainActivity into the screen
        TextView currentPodcastView = findViewById(R.id.playingPodcast);
        currentPodcastView.setText(currentPodcast);

        TextView currentDateView = findViewById(R.id.playingDate);
        currentDateView.setText(currentDate);

        //TODO change play icon to pause when clicked

        final ImageView status = findViewById(R.id.play);
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setImageResource(R.drawable.ic_pause_black_24dp);

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        });

    }
}
