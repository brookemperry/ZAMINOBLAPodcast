package com.example.android.zaminoblapodcast;

public class Podcast {

    /**Podcast topic*/
    private String mPodcastTopic;

    /**Podcast Date*/
    private String mDate;

    /**Create a new Podcast object
     *
     * @param podcastTopic
     * @param date
     */
    public Podcast(String podcastTopic, String date){
        mPodcastTopic = podcastTopic;
        mDate = date;
    }

   /**Get the podcast topic*/
    public String getmPodcastTopic() {
        return mPodcastTopic;
    }

    /**Get the podcast date*/
    public String getmDate() {
        return mDate;
    }
}
