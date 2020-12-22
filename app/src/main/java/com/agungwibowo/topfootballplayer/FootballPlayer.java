package com.agungwibowo.topfootballplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class FootballPlayer implements Parcelable {
    private String name, description, club, country;
    private double rating;
    private int photo, numberTopPlayer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getNumberTopPlayer() {
        return numberTopPlayer;
    }

    public void setNumberTopPlayer(int numberTopPlayer) {
        this.numberTopPlayer = numberTopPlayer;
    }

    public FootballPlayer() {
    }

    protected FootballPlayer(Parcel in) {
        name = in.readString();
        description = in.readString();
        club = in.readString();
        country = in.readString();
        rating = in.readDouble();
        photo = in.readInt();
        numberTopPlayer = in.readInt();
    }

    public static final Creator<FootballPlayer> CREATOR = new Creator<FootballPlayer>() {
        @Override
        public FootballPlayer createFromParcel(Parcel in) {
            return new FootballPlayer(in);
        }

        @Override
        public FootballPlayer[] newArray(int size) {
            return new FootballPlayer[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(club);
        dest.writeString(country);
        dest.writeDouble(rating);
        dest.writeInt(photo);
        dest.writeInt(numberTopPlayer);
    }
}
