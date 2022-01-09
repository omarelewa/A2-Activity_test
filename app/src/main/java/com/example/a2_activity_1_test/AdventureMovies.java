package com.example.a2_activity_1_test;


public class AdventureMovies {
    String[] movieNames = {
            "Big Buck Bunny",
            "Elephants Dream"
    };
    String[] movieDurations = {
            "11:00",
            "23:00"
    };
    String[] movieURIs = {
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny",
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"
    };

    public AdventureMovies() {

    }

    public String[] getMovieNames() {
        return movieNames;
    }

    public void setMovieNames(String[] movieNames) {
        this.movieNames = movieNames;
    }

    public String[] getMovieDurations() {
        return movieDurations;
    }

    public void setMovieDurations(String[] movieDurations) {
        this.movieDurations = movieDurations;
    }

    public String[] getMovieURIs() {
        return movieURIs;
    }

    public void setMovieURIs(String[] movieURIs) {
        this.movieURIs = movieURIs;
    }
}
