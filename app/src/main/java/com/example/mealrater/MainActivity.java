package com.example.mealrater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    private EditText dishNameEditText, restaurantNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dishNameEditText = findViewById(R.id.dishNameEditText);
        restaurantNameEditText = findViewById(R.id.restaurantNameEditText);

        Button rateButton = findViewById(R.id.rateButton);
        rateButton.setOnClickListener(v -> openRatingActivity());
    }

    private void openRatingActivity() {
        String dishName = dishNameEditText.getText().toString();
        String restaurantName = restaurantNameEditText.getText().toString();

        Intent intent = new Intent(this, RatingActivity.class);
        intent.putExtra("dishName", dishName);
        intent.putExtra("restaurantName", restaurantName);
        startActivity(intent);
    }
}
