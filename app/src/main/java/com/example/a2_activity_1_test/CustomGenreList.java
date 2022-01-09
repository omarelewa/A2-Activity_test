package com.example.a2_activity_1_test;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a2_activity_1_test.R;

public class CustomGenreList extends ArrayAdapter {
    private final String[] genreNames;
    private final Integer[] imageId;
    private final Activity context;

    public CustomGenreList(Activity context, String[] genreNames, Integer[] imageId){
        super(context, R.layout.activity_main_element_row, genreNames);
        this.context = context;
        this.genreNames = genreNames;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null) {
            row = inflater.inflate(R.layout.activity_main_element_row, null, true);
        }
        TextView textViewGenre = row.findViewById(R.id.textViewGenre);
        ImageView imageViewGenre = row.findViewById(R.id.imageViewFavicon);

        textViewGenre.setText(genreNames[position]);
        imageViewGenre.setImageResource(imageId[position]);

        return row;
    }
}
