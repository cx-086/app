package com.example.appviaje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.appviaje.dal.LugarDal;
import com.example.appviaje.dto.Lugar;
import com.example.appviaje.helpers.DatabaseHelper;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    private LugarDal lugarDal;
    private ListView listView;
    private ArrayAdapter<Lugar> adapter;
    private ArrayList<Lugar> listaLugares;
    private int codPosicion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Nuevo Restaurante");

        this.lugarDal = new LugarDal(getApplicationContext(), new Lugar());
        this.listaLugares = new LugarDal(getBaseContext()).seleccionar();

        this.listView = (ListView) findViewById(R.id.list_restaurant);

        this.adapter = new ArrayAdapter<Lugar>(getApplicationContext(), android.R.layout.simple_list_item_1, this.listaLugares);

        this.listView.setAdapter(adapter);

    }



}
