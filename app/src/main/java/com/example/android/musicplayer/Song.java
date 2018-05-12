package com.example.android.musicplayer;

/**
 * {@link Song} represents a list of songs
 */
public class Song {

    //Default list of songs
    private String mSong;

    //Names of artists
    private String mAuthor;


    /**
     * Create a new Songs objects
     *
     * @param song is the name of songs
     * @param author   is the name of artist
     */
    public Song(String song, String author) {
        mSong = song;
        mAuthor = author;
    }

    /**
     * Get the name of song
     */
    public String getSong() {
        return mSong;
    }

    /**
     * Get the name of artist
     */
    public String getAuthor() {
        return mAuthor;
    }
}
