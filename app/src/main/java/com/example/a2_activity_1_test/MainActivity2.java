package com.example.a2_activity_1_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

//    String[] movies = {
//            "Omar",
//            "Ahmed",
//            "Khaled",
//            "Mohamed"
//    };
//
//    String[] durations = {
//            "1",
//            "2",
//            "3",
//            "4"
//    };

    private String[] URIs;

    private Context context;
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String newVideoPath = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4";

//        Intent intent2 = new Intent(Intent.ACTION_VIEW,
//                Uri.parse(newVideoPath));
//        intent2.setDataAndType(Uri.parse(newVideoPath), "video/*");

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        Log.v(getString(R.string.log),
                message);

        // Setting the header
        TextView textView = new TextView(this);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(message + getString(R.string.activity_main_2_title));

        // Adding the header
        ListView listView = (ListView) findViewById(R.id.list);
        listView.addHeaderView(textView);

        CustomMovieList customMovieList;

        switch (message){
            case "Adventure":
                AdventureMovies adventureMovies = new AdventureMovies();
                customMovieList = new CustomMovieList(this,
                        adventureMovies.movieNames,
                        adventureMovies.movieDurations,
                        adventureMovies.movieURIs
                );
                URIs = adventureMovies.movieURIs;
                listView.setAdapter(customMovieList);
                break;
            case "Drama":
                DramaMovies dramaMovies = new DramaMovies();
                customMovieList = new CustomMovieList(this,
                        dramaMovies.movieNames,
                        dramaMovies.movieDurations,
                        dramaMovies.movieURIs
                );
                URIs = dramaMovies.movieURIs;
                listView.setAdapter(customMovieList);
                break;
            case "Comedy":
                ComedyMovies comedyMovies = new ComedyMovies();
                customMovieList = new CustomMovieList(this,
                        comedyMovies.movieNames,
                        comedyMovies.movieDurations,
                        comedyMovies.movieURIs
                );
                URIs = comedyMovies.movieURIs;
                listView.setAdapter(customMovieList);
                break;
            case "Sci-fi":
                ScifiMovies scifiMovies = new ScifiMovies();
                customMovieList = new CustomMovieList(this,
                        scifiMovies.movieNames,
                        scifiMovies.movieDurations,
                        scifiMovies.movieURIs
                );
                URIs = scifiMovies.movieURIs;
                listView.setAdapter(customMovieList);
                break;
        }

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            Intent intent2 = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(URIs[position-1])
            );
            intent2.setDataAndType(Uri.parse(URIs[position-1]), "video/*");
            startActivity(intent2);
        });
    }
}