package com.example.listdemo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieServices {
    @GET("top_rated?api_key=3c3d662f3dfecdd191da7642c1b1e2af")
    Call<MovieModel> getMovieModel();
    @GET("top_?api_key=3c3d662f3dfecdd191da7642c1b1e2af")
    Call<String> get();
}
