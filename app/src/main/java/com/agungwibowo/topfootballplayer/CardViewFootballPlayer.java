package com.agungwibowo.topfootballplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewFootballPlayer extends RecyclerView.Adapter<CardViewFootballPlayer.CardViewViewHolder> {
    private Context context;
    private ArrayList<FootballPlayer> listFootballPlayer;

    public CardViewFootballPlayer(Context context) {
        this.context = context;
    }

    public ArrayList<FootballPlayer> getListFootballPlayer() {
        return listFootballPlayer;
    }

    public void setListHomestay(ArrayList<FootballPlayer> listFootballPlayer) {
        this.listFootballPlayer = listFootballPlayer;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_football_player,parent,  false);
        return new CardViewViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CardViewFootballPlayer.CardViewViewHolder holder, final int position) {
        holder.number.setText(Integer.toString(getListFootballPlayer().get(position).getNumberTopPlayer()));
        holder.tvName.setText(getListFootballPlayer().get(position).getName());
        Glide.with(context).load(getListFootballPlayer().get(position).getPhoto()).into(holder.imgPhoto);

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                detailActivity.putExtra(DetailActivity.EXTRA_FOOTBALL_PLAYER, listFootballPlayer.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListFootballPlayer().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView number;
        Button btnDetail;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
