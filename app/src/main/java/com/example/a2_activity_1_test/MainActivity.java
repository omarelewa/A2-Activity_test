package com.example.a2_activity_1_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2_activity_1_test.R;
import com.example.a2_activity_1_test.CustomGenreList;

public class MainActivity extends AppCompatActivity {

    String[] genres = {"Adventure", "Drama", "Comedy", "Sci-fi"};
    private final Integer[] imageId = {
            R.drawable.adventure,
            R.drawable.drama,
            R.drawable.comedy,
            R.drawable.scifi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        // Setting the header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText("Select a Genre");

        // Adding the header
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(textView);

        // Populating list data
        CustomGenreList customGenreList = new CustomGenreList(this, genres, imageId);
        listView.setAdapter(customGenreList);

        //listView.setOnItemClickListener((adapterView, view, position, l) ->
        //      Toast.makeText(getApplicationContext(), "You Selected "+ genres[position-1], Toast.LENGTH_SHORT).show());
        listView.setOnItemClickListener((adapterView, view, position, l) ->
                startActivity(intent)
        );
    }
}