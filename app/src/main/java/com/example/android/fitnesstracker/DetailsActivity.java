package com.example.android.fitnesstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        android.widget.TextView exerciseTitle = (android.widget.TextView)findViewById(R.id.exerciseTitle);
        android.widget.ImageView exerciseImage = (android.widget.ImageView)findViewById(R.id.exerciseImage);

    }
}
