package com.example.a2_activity_1_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String[] movies = {"Omar", "Ahmed", "Khaled", "Mohamed"};
    String[] durations = {"1", "2", "3", "4"};
    private Context context;
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String newVideoPath = "https://www.youtube.com/watch?v=dPHucTXzQ3Q";
//
//        Intent intent = new Intent(Intent.ACTON_VIEW, Uri.parse(newVideoPath));

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        // Setting the header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(message + " Movies");

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