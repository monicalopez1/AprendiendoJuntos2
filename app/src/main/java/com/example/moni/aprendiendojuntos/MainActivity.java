package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.moni.aprendiendojuntos.basededatos.BaseDeDatos;
import com.example.moni.aprendiendojuntos.basededatos.Main3inicio;

public class MainActivity extends AppCompatActivity {


    Button registrarse; /*Como se llamarán los botones*/
    Button iniciarsesion;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Main3inicio main3inicio = new Main3inicio(this);
        SQLiteDatabase  bd = main3inicio.getWritableDatabase();

        registrarse = (Button)findViewById(R.id.id_registrar);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registrarse = new Intent(MainActivity.this, Registrarse.class);
                startActivity(registrarse);

            }
        }); /* Despues de mostrar la pantalla de bienvenida, aparecerá la pantalla para seleccionar
         ya sea iniciar sesion o registrarse, con el codigo de arriba y de abajo podrá seleccionar cualquiera de los dos
         y les mostrará sus respectivas interfaces*/

        iniciarsesion = (Button) findViewById(R.id.id_iniciar);
        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iniciarsesion = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(iniciarsesion); /*en estas dos lineas de codigo, serán para mandar una activity a la otra y que al
                 momento de dar click se muestre la interfaz*/


            }
        });
    }
}
