package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

     Button regresar;
     Button adivinanzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        regresar = (Button) findViewById(R.id.regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        adivinanzas = (Button)findViewById(R.id.adivinanzas);
        adivinanzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registrarse = new Intent(Main2Activity.this,PrimerEjercicio.class);
                startActivity(registrarse);

            }
        });

    }
}
