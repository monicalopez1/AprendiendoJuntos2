package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button regresar;
    Button textTristan;
    Button tito;
    Button mifamilia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        /*En esta parte, será para regresar a la anterior interfaz sin salirse de la app*/

        regresar = (Button) findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
        /* En esta parte vamos a ingresar a la primera interfaz de lectura*/

        textTristan = (Button)findViewById(R.id.textTristan);
        textTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lecturas = new Intent(Main4Activity.this, PrimerLectura.class);
                startActivity(lecturas);

            }
        });

        tito = (Button)findViewById(R.id.elmonotito);
        tito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tito = new Intent(Main4Activity.this, SegundaLectura.class);
                startActivity(tito);

            }
        });

        mifamilia = (Button)findViewById(R.id.mifamilia);
        mifamilia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mifamilia = new Intent(Main4Activity.this, TercerLectura.class);
                startActivity(mifamilia);

            }
        });


    }
    }