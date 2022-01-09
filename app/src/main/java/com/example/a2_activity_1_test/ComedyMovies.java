package com.example.a2_activity_1_test;

public class ComedyMovies {
    String[] movieNames = {
            "For Bigger Blazes",
            "For Bigger Escape"
    };
    String[] movieDurations = {
            "11:00",
            "23:00"
    };
    String[] movieURIs = {
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"
    };

    public ComedyMovies() {

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
