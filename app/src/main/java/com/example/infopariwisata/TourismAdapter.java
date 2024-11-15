package com.example.infopariwisata;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class TourismAdapter extends RecyclerView.Adapter<TourismAdapter.ViewHolder> {
    private List<TourismPlace> tourismPlaces;
    private Context context;

    public TourismAdapter(List<TourismPlace> tourismPlaces, Context context) {
        this.tourismPlaces = tourismPlaces;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tourism, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TourismPlace place = tourismPlaces.get(position);
        holder.tourismName.setText(place.getName());
        holder.tourismLocation.setText(place.getLocation());
        holder.thumbnail.setImageResource(place.getImageResourceId());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, com.example.infopariwisata.DetailActivity.class);
            intent.putExtra("tourism_place", place);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return tourismPlaces.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView tourismName, tourismLocation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            tourismName = itemView.findViewById(R.id.tourismName);
            tourismLocation = itemView.findViewById(R.id.tourismLocation);
        }
    }
}
