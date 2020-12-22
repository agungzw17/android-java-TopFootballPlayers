package com.agungwibowo.topfootballplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_FOOTBALL_PLAYER = "extra_football_player";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView imageView = findViewById(R.id.img_item_photo);
        TextView name = findViewById(R.id.item_name);
        TextView country = findViewById(R.id.item_country);
        TextView club = findViewById(R.id.item_club);
        TextView rating = findViewById(R.id.item_rating);
        TextView description = findViewById(R.id.item_description);

        FootballPlayer footballPlayer = getIntent().getParcelableExtra(EXTRA_FOOTBALL_PLAYER);
        String ratingToString = Double.toString(footballPlayer.getRating());

        Glide.with(this).load(footballPlayer.getPhoto()).into(imageView);
        name.setText(footballPlayer.getName());
        country.setText(footballPlayer.getCountry());
        club.setText(footballPlayer.getClub());
        rating.setText(ratingToString);
        description.setText(footballPlayer.getDescription());
    }
}
