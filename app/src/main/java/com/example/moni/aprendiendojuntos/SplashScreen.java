package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.moni.aprendiendojuntos.basededatos.BaseDeDatos;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                                      }
                                  }, 3000 );
        /*Primera interfaz de bienvenida, en la parte de arriba muestra
        el codigo para que después de la primer interfaz muestre la segunda */
    }
}
