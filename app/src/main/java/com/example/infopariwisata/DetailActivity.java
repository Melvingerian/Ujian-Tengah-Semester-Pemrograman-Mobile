package com.example.infopariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        TourismPlace place = (TourismPlace) intent.getSerializableExtra("tourism_place");


        if (place != null) {
            String toastMessage = "Welcome to " + place.getName();
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }

        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailName = findViewById(R.id.detail_name);
        TextView detailLocation = findViewById(R.id.detail_location);
        TextView detailDescription = findViewById(R.id.detail_description);
        Button backButton = findViewById(R.id.button_back);

        if (place != null) {
            detailImage.setImageResource(place.getImageResourceId());
            detailName.setText(place.getName());
            detailLocation.setText(place.getLocation());
            detailDescription.setText(place.getDescription());
        }

        backButton.setOnClickListener(v -> {
            Intent backIntent = new Intent(DetailActivity.this, com.example.infopariwisata.MainActivity.class);
            startActivity(backIntent);
        });
    }
}
