package com.example.trial4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Foodlist[] foodlist = new Foodlist[]{
                new Foodlist("Nama Makanan 1", "4", R.drawable.background2),
                new Foodlist("Nama Makanan 2", "5", R.drawable.background1),
                new Foodlist("Nama Makanan 3", "5", R.drawable.background2),
                new Foodlist("Nama Makanan 4", "3", R.drawable.background1),
        };

        FoodlistAdapter foodlistAdapter = new FoodlistAdapter(foodlist, MainActivity.this);
        recyclerView.setAdapter(foodlistAdapter);



    }
}