package com.example.android.zaminoblapodcast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_list);

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

        PodcastAdapter adapter = new PodcastAdapter(this,listing);

        ListView listView = findViewById(R.id.pods);
        listView.setAdapter(adapter);

    }
}
