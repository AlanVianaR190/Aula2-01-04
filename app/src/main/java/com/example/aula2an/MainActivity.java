package com.example.aula2an;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirGorjeta(View view){
        Intent intent = new Intent(this, GorjetaActivity2.class);
        startActivity(intent);
    }

    public void abrirDataBase(View view) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void abrirDesenho(View view) {
        Intent intent = new Intent(this, DesenhoActivity.class);
        startActivity(intent);
    }

    public void abrirSensores(View view) {
        Intent intent = new Intent(this, SensorActivity2.class);
        startActivity(intent);
    }
}