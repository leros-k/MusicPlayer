package com.example.android.musicplayer;

public class Artist {

    //name of artist
    private String mArtist;

    //drawable resource ID
    private int mImage;

    /*
     * Create a new Artist object.
     * @param artist is name of artist
     * @param image is drawable reference ID
     */
    public Artist(String artist, int image){
        mArtist = artist;
        mImage = image;
    }

    /*
     * Get the name of artist
     */
    public String getArtist(){
        return mArtist;
    }

    /**
     * Get the image recource ID
     */
    public int getImage(){
        return mImage;
    }
}
