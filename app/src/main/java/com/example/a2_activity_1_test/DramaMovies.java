package com.example.a2_activity_1_test;

public class DramaMovies {
    String[] movieNames = {
            "For Bigger Fun",
            "For Bigger Joyrides"
    };
    String[] movieDurations = {
            "11:00",
            "23:00"
    };
    String[] movieURIs = {
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4",
            "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerJoyrides.mp4"
    };

    public DramaMovies() {

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
