package com.example.appviaje.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.appviaje.dto.Usuario;
import com.example.appviaje.helpers.DatabaseHelper;

public class UsuarioDal {
    private DatabaseHelper dbhelper;
    private Usuario usuario;

    public UsuarioDal(Context context){
        this.dbhelper = new DatabaseHelper(context);
        this.usuario = new Usuario();

        SQLiteDatabase db = dbhelper.getWritableDatabase();
    }

    public boolean registrar(String email, String password){
        this.usuario.setEmail(email);
        this.usuario.setPassword(password);

        return this.tryInsert();
    }

    private boolean tryInsert(){
        SQLiteDatabase db = dbhelper.getWritableDatabase();

        ContentValues c = new ContentValues();
        c.put("email", this.usuario.getEmail());
        c.put("password", this.usuario.getPassword());

        try{
            db.insert("usuario", null, c);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
