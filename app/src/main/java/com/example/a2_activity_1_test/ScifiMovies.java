package com.example.a2_activity_1_test;

public class ScifiMovies {
    String[] movieNames = {
            "For Bigger Meltdowns",
            "Sintel"
    };
    String[] movieDurations = {
            "29:00",
            "1:50.50"
    };
    String[] movieURIs = {
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerMeltdowns.mp4",
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
    };

    public ScifiMovies() {

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
