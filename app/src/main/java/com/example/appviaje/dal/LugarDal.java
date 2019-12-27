package com.example.appviaje.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.appviaje.dto.Lugar;
import com.example.appviaje.helpers.DatabaseHelper;

import java.util.ArrayList;

public class LugarDal {
    private DatabaseHelper databaseHelper;
    private Lugar lugar;

    public LugarDal(Context context) {
        this.databaseHelper = new DatabaseHelper(context);
        this.lugar = new Lugar();

        SQLiteDatabase db = databaseHelper.getWritableDatabase();

    }

    public LugarDal(Context context, Lugar lugar) {
        this.databaseHelper = new DatabaseHelper(context);
        this.lugar = lugar;
    }

    public boolean insertar(byte[] imagen, String nombre, String direccion) {
        this.lugar.setImagen(imagen);
        this.lugar.setNombre(nombre);
        this.lugar.setDireccion(direccion);
        return this.tryInsert();
    }

    public ArrayList<Lugar> seleccionar() {
        ArrayList<Lugar> lista = new ArrayList<>();
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        Cursor consulta = db.rawQuery("SELECT * FROM lugar", null);

        if (consulta.moveToFirst()) {
            do {
                byte[] imagen = consulta.getBlob(0);
                String nombre = consulta.getString(1);
                String direccion = consulta.getString(2);

                Lugar lugar = new Lugar();
                lista.add(lugar);

            } while (consulta.moveToNext());

        }

        return lista;
    }


    private boolean tryInsert() {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("imagen", this.lugar.getImagen());
        c.put("nombre", this.lugar.getNombre());
        c.put("direccion", this.lugar.getDireccion());

        try {
            db.insert("lugar", null, c);
        } catch (Exception e) {
            return false;
        }
            return true;
    }
     public Lugar getLugar(){
        return this.lugar;
    }

}
