package com.example.appviaje;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RVAdapter adapter;

    int[] arr = {
            R.drawable.arica_parinacota, R.drawable.tarapaca, R.drawable.antofagasta, R.drawable.atacama, R.drawable.coquimbo, R.drawable.valparaiso, R.drawable.ohiggins, R.drawable.maule, R.drawable.biobio, R.drawable.araucania, R.drawable.lagos, R.drawable.rios, R.drawable.aysen, R.drawable.magallanes, R.drawable.metropolitana
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);
        recyclerView = findViewById(R.id.grRegion);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RVAdapter(arr);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }
}
