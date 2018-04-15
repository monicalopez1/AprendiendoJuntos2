package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimerLectura extends AppCompatActivity {

    Button button_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_lectura);


        button_siguiente = (Button)findViewById(R.id.button_siguiente);
        button_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent button_siguiente = new Intent(PrimerLectura.this, SegundaParteprimerLetura.class);
                startActivity(button_siguiente);

            }
        }); /*Con esto pasaremos a la siguiente interfaz que va desde la activity primera lectura hasta la segunda parte de la
         primer lectura*/
}
}