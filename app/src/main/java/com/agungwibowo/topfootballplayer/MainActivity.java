package com.agungwibowo.topfootballplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFootballPlayer;
    private ArrayList<FootballPlayer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFootballPlayer = findViewById(R.id.rv_football_player);
        rvFootballPlayer.setHasFixedSize(true);

        list.addAll(FootballPlayerData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvFootballPlayer.setLayoutManager(new LinearLayoutManager(this));
        CardViewFootballPlayer cardViewFootballPlayer = new CardViewFootballPlayer(this);
        cardViewFootballPlayer.setListHomestay(list);
        rvFootballPlayer.setAdapter(cardViewFootballPlayer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
