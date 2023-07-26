package com.example.listdemo;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;



public class RecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private static final String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/w185";

    public ArrayList<Movie> movies;


    public RecyclerAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }


    @NotNull
    @NonNull
    @Override
    public  MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.title.setText(movie.getTitle());
        holder.release.setText(movie.getReleaseDate());
        Picasso.with(holder.img.getContext()).load(IMAGE_BASE_URL + movie.getPosterPath()).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return movies == null?0: movies.size();
    }

    @NonNull


    public void setData(ArrayList<Movie> movies2){
        if(movies != null){
            movies.clear();
            movies.addAll(movies2);
            notifyDataSetChanged();
        }
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    TextView title;
    TextView release;
    ImageView img;


    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        intUI(itemView);
    }

    private void intUI(View itemView){
        title = itemView.findViewById(R.id.header);
        release = itemView.findViewById(R.id.description);
        img = itemView.findViewById(R.id.imageView);

    }


}




