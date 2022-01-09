package com.example.a2_activity_1_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String[] movies = {"Omar", "Ahmed", "Khaled", "Mohamed"};
    String[] durations = {"1", "2", "3", "4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Setting the header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(R.string.movie_select);

        // Adding the header
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(textView);

        // Populating list data
        CustomMovieList customMovieList = new CustomMovieList(this, movies, durations);
        listView.setAdapter(customMovieList);

        listView.setOnItemClickListener((adapterView, view, position, l) ->
                Toast.makeText(getApplicationContext(), "You Selected " + movies[position - 1], Toast.LENGTH_SHORT).show()
        );
    }
}