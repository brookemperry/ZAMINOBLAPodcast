package com.example.android.zaminoblapodcast;

public class Podcast {

    /**
     * This stores the Podcast topic
     */
    private String mPodcastTopic;

    /**This stores the Podcast Date*/
    private String mDate;

    /**Constructor to create a new Podcast object
     *
     * @param PodcastTopic
     * @param date
     */
    public Podcast(String PodcastTopic, String date) {
        this.mPodcastTopic = PodcastTopic;
        this.mDate = date;
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
