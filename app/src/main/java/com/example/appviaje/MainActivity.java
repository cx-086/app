package com.example.appviaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editEmail;
    private EditText editPassword;
    private Button btnIngresar;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editEmail = (EditText) findViewById(R.id.editEmail);
        this.editPassword = (EditText) findViewById(R.id.editPassword);
        this.btnIngresar = (Button) findViewById(R.id.btnIngresar);
        this.btnRegistrar = (Button) findViewById(R.id.btnRegistro);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
