package com.example.koloh.musicapp;

/**
 * {@link Song} represents a list of song that the user wants to listen.
 * It contains song title and artist name for that song.
 */
public class Song {

    /** Default song list title */
    private String mSongTitle;

    /** Song artist name */
    private String mSongArtist;

    /**
     * Create a new Song object.
     *
     * @param songTitle is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param songArtist is the word in the Miwok language
     */
    public Song(String songTitle, String songArtist) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getSongArtist() {
        return mSongArtist;
    }

}