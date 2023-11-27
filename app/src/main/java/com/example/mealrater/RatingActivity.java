package com.example.mealrater;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        Intent intent = getIntent();
        String dishName = intent.getStringExtra("dishName");
        String restaurantName = intent.getStringExtra("restaurantName");

        TextView dishTextView = findViewById(R.id.dishTextView);  // Check this ID
        TextView restaurantTextView = findViewById(R.id.restaurantTextView);  // Check this ID
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        dishTextView.setText(getString(R.string.dish_label, dishName));
        restaurantTextView.setText(getString(R.string.restaurant_label, restaurantName));

        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) -> {
            TextView ratingTextView = findViewById(R.id.ratingTextView);
            ratingTextView.setText(getString(R.string.rating_label, String.valueOf(rating)));
        });
    }
}
