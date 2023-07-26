package com.example.listdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    ListView listView;
    Button btn_connected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        listView = findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1","29-1-2001","10.0"));
        movies.add(new Movie("Movie 2","29-1-2001","10.0"));
        recyclerAdapter = new RecyclerAdapter(movies);
        recyclerView.setAdapter(recyclerAdapter);
    }

    public void updateData(ArrayList<Movie> movies2){
        recyclerAdapter.setData(movies2);
    }

    public void click(View view){
        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/movie/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MovieServices service = retrofit.create(MovieServices.class);
        Call<MovieModel> call = service.getMovieModel();
        call.enqueue(new Callback<MovieModel>() {
            @Override
            public void onResponse(Call<MovieModel> call, Response<MovieModel> response) {
                if(response.isSuccessful()){
                    updateData(response.body().getResults());
                }
            }

            @Override
            public void onFailure(Call<MovieModel> call, Throwable t) {

            }
        });
    }
}