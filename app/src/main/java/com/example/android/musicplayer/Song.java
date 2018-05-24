package com.example.android.musicplayer;

/**
 * {@link Song} represents a list of songs
 */
public class Song {

    //Default list of songs
    private String mSong;

    //Names of artists
    private String mAuthor;

    private int drawableId;


    /**
     * Create a new Songs objects
     *
     * @param song is the name of songs
     * @param author   is the name of artist
     */
    public Song(String song, String author, int drawableId) {
        mSong = song;
        mAuthor = author;
        this.drawableId = drawableId;
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

    public int getDrawable(){
        return drawableId;
    }
}
