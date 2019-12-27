package com.example.appviaje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class InicioActivity extends AppCompatActivity {

    GridView gridView;


    String[] values = {
            "Restaurantes", "Hoteles", "Actividades", "Lugares"
    };

    int[] images = {
            R.drawable.restaurant, R.drawable.hotel_sign, R.drawable.beach, R.drawable.plane_ticket
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        gridView = (GridView)findViewById(R.id.gridMenu);
        final GridAdapter adapter = new GridAdapter(this, values, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(InicioActivity.this, ListRestaurantActivity.class);
                intent.putExtra("Item", adapter.getItem(i).toString());
                startActivity(intent);
            }
        });
    }
}
