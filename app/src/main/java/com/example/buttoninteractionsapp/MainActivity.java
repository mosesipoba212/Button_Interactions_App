package com.example.buttoninteractionsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mainLayout;
    private ImageView animalImageView;

    private int[] animalImages = {
            R.drawable.cat_image,
            R.drawable.dog_image,
            R.drawable.lion_image,
            R.drawable.bird_image
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
        animalImageView = findViewById(R.id.animalImageView);

        // FORCE WHITE BACKGROUND ON START
        mainLayout.setBackgroundColor(Color.WHITE);

        // Set initial image (cat)
        animalImageView.setImageResource(animalImages[0]);

        // Remove any color filters from image
        animalImageView.clearColorFilter();

        // TEST: Set image background to match layout
        animalImageView.setBackgroundColor(Color.TRANSPARENT);

        setupColorButtons();
        setupAnimalButtons();
        setupResetButton();
    }

    private void setupColorButtons() {
        // RED - Changes ENTIRE SCREEN background
        findViewById(R.id.btnRed).setOnClickListener(v -> {
            mainLayout.setBackgroundColor(Color.RED);
            Toast.makeText(this, "Background: RED", Toast.LENGTH_SHORT).show();
        });

        // BLUE - Changes ENTIRE SCREEN background
        findViewById(R.id.btnBlue).setOnClickListener(v -> {
            mainLayout.setBackgroundColor(Color.BLUE);
            Toast.makeText(this, "Background: BLUE", Toast.LENGTH_SHORT).show();
        });

        // GREEN - Changes ENTIRE SCREEN background
        findViewById(R.id.btnGreen).setOnClickListener(v -> {
            mainLayout.setBackgroundColor(Color.GREEN);
            Toast.makeText(this, "Background: GREEN", Toast.LENGTH_SHORT).show();
        });

        // YELLOW - Changes ENTIRE SCREEN background
        findViewById(R.id.btnYellow).setOnClickListener(v -> {
            mainLayout.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "Background: YELLOW", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupAnimalButtons() {
        // CAT - Changes only the IMAGE (not background)
        findViewById(R.id.btnCat).setOnClickListener(v -> {
            animalImageView.setImageResource(animalImages[0]);
            animalImageView.clearColorFilter(); // Remove any color tint
            Toast.makeText(this, "Image: CAT", Toast.LENGTH_SHORT).show();
        });

        // DOG - Changes only the IMAGE (not background)
        findViewById(R.id.btnDog).setOnClickListener(v -> {
            animalImageView.setImageResource(animalImages[1]);
            animalImageView.clearColorFilter(); // Remove any color tint
            Toast.makeText(this, "Image: DOG", Toast.LENGTH_SHORT).show();
        });

        // LION - Changes only the IMAGE (not background)
        findViewById(R.id.btnLion).setOnClickListener(v -> {
            animalImageView.setImageResource(animalImages[2]);
            animalImageView.clearColorFilter(); // Remove any color tint
            Toast.makeText(this, "Image: LION", Toast.LENGTH_SHORT).show();
        });

        // BIRD - Changes only the IMAGE (not background)
        findViewById(R.id.btnBird).setOnClickListener(v -> {
            animalImageView.setImageResource(animalImages[3]);
            animalImageView.clearColorFilter(); // Remove any color tint
            Toast.makeText(this, "Image: BIRD", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupResetButton() {
        findViewById(R.id.btnReset).setOnClickListener(v -> {
            // Reset background to WHITE
            mainLayout.setBackgroundColor(Color.WHITE);

            // Reset image to CAT
            animalImageView.setImageResource(animalImages[0]);
            animalImageView.clearColorFilter();

            Toast.makeText(this, "RESET: White background, Cat image", Toast.LENGTH_SHORT).show();
        });
    }
}