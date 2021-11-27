package com.example.trial4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodlistAdapter extends RecyclerView.Adapter<FoodlistAdapter.ViewHolder>{

    Foodlist[] foodlist;
    Context context;

    public FoodlistAdapter(Foodlist[]foodlist, MainActivity activity){
        this.foodlist = foodlist;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.food_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Foodlist foodlistLIST = foodlist[position];
        holder.tvnamaMakanan.setText(foodlistLIST.getNamaMakanan());
        holder.tvangkaRating.setText(foodlistLIST.getAngkaRating());
        holder.ivgambarMakanan.setImageResource(foodlistLIST.getGambarMakanan());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, foodlistLIST.getNamaMakanan(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodlist.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivgambarMakanan;
        TextView tvnamaMakanan, tvangkaRating;


        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivgambarMakanan = itemView.findViewById(R.id.foodImage);
            tvnamaMakanan = itemView.findViewById(R.id.foodName);
            tvangkaRating = itemView.findViewById(R.id.ratingNumber);
        }

    }
}
