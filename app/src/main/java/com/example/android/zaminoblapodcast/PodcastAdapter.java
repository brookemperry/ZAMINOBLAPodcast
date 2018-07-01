package com.example.android.zaminoblapodcast;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//I read https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd for additional help

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    //Constructor
    public PodcastAdapter(Activity context, ArrayList<Podcast> listing) {
        super(context, 0, listing);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.podcast_item, parent, false);
        }
        Podcast currentPodcast = getItem(position);

        TextView topicTextView = listItemView.findViewById(R.id.topic);
        topicTextView.setText(currentPodcast.getmPodcastTopic());

        TextView dateTextView = listItemView.findViewById(R.id.date);
        dateTextView.setText(currentPodcast.getmDate());

        return listItemView;


    }
}
