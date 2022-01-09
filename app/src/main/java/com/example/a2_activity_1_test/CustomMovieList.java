package com.example.a2_activity_1_test;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomMovieList extends ArrayAdapter {
    private final String[] movieNames;
    private final String[] movieDuration;
//    private final Integer[] imageId;
    private final Activity context;

    public CustomMovieList(Activity context, String[] movieNames, String[] movieDuration){
        super(context, R.layout.activity_main_element_row_2, movieNames);
        this.context = context;
        this.movieNames = movieNames;
        this.movieDuration = movieDuration;
//        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null) {
            row = inflater.inflate(R.layout.activity_main_element_row_2, null, true);
        }
        TextView textViewMovieName = row.findViewById(R.id.textViewMovieName);
        TextView textViewMovieDuration = row.findViewById(R.id.textViewMovieDuration);
//        ImageView imageViewGenre = row.findViewById(R.id.imageViewFavicon);

        textViewMovieName.setText(movieNames[position]);
        textViewMovieDuration.setText(movieDuration[position]);

        return row;
    }
}
