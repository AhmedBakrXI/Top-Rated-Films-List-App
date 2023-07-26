package com.example.listdemo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieModel {
    private ArrayList<Movie> results;
    @SerializedName("total_pages")
    private String totalPages;

    public MovieModel() {
    }

    public MovieModel(ArrayList<Movie> results, String totalPages) {
        this.results = results;
        this.totalPages = totalPages;
    }

    public ArrayList<Movie> getResults() {
        return results;
    }

    public void setResults(ArrayList<Movie> results) {
        this.results = results;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }
}
