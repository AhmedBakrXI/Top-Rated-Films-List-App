package com.example.listdemo;

import com.google.gson.annotations.SerializedName;

public class Movie {
    private int id;
    private String title;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("vote_average")
    private String voteAverage;
    @SerializedName("vote_count")
    private String voteCount;

    public Movie() {
    }

    public Movie(String title, String releaseDate, String voteAverage) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
    }

    public Movie(int id, String title, String originalLanguage, String posterPath, String releaseDate, String voteAverage, String voteCount) {
        this.id = id;
        this.title = title;
        this.originalLanguage = originalLanguage;
        this.posterPath = posterPath;
        this.releaseDate = releaseDate;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }
}
