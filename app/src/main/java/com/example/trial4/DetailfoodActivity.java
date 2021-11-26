package com.example.trial4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailfoodActivity extends AppCompatActivity {

    private ImageView ivbackBtn, ivfoodImg, ivfavoriteBtn;
    private TextView tvfoodName, tvRating, tvAuthor, tvdeskripsiCtr;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailfood);

        ivbackBtn = findViewById(R.id.backButton);
        ivfoodImg = findViewById(R.id.foodImage);
        ivfavoriteBtn = findViewById(R.id.favoriteButton);
        tvfoodName = findViewById(R.id.foodName);
        tvRating = findViewById(R.id.ratingNumber);
        tvAuthor = findViewById(R.id.author);
        tvdeskripsiCtr = findViewById(R.id.deskripsiContainer);
        ratingBar = findViewById(R.id.ratingBar);


    }
}