package com.example.android.zaminoblapodcast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Strings to send to NowPlaying Activity to show selected podcast
    public static final String playPodcast = "playPodcast";
    public static final String playDate = "playDate";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    //List of podcasts

        ArrayList<Podcast> listing = new ArrayList<Podcast>();
        listing.add(new Podcast("Planning for Retirement", "June 20, 2018"));
        listing.add(new Podcast("Improving Access to Healthcare", "July 20, 2018"));
        listing.add(new Podcast("Sexual Health and Wellbeing", "August 20, 2018"));
        listing.add(new Podcast("Lifelong Learning on a Budget", "September 20, 2018"));
        listing.add(new Podcast("Mental Health for Lesbian Elders", "October 20, 2018"));
        listing.add(new Podcast("Cohousing Options", "November 20, 2018"));
        listing.add(new Podcast("International Retirement of Black Lesbians", "December 20, 2018"));
        listing.add(new Podcast("Dating After 60", "January 20, 2019"));
        listing.add(new Podcast("Conscious Aging", "Frebruary 20, 2019"));
        listing.add(new Podcast("Death and Dying", "March 20, 2019"));

        //The data source for this is the list of Strings in the ArryList listing
        //podcast_list (id pods) provides the layout

        final PodcastAdapter adapter = new PodcastAdapter(this, listing);

        GridView gridView = findViewById(R.id.list);
        gridView.setAdapter(adapter);

        //send selected podcast item to the Now Playing activity when clicked
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Podcast item = (adapter.getItem(position));
                Intent selectedPodcast = new Intent(getApplicationContext(), NowPlayingActivity.class);
                selectedPodcast.putExtra(playPodcast, item.getmPodcastTopic());
                selectedPodcast.putExtra(playDate, item.getmDate());
                startActivity(selectedPodcast);
            }
        });
    }
}
