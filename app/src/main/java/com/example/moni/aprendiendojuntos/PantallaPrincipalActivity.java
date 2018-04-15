package com.example.moni.aprendiendojuntos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class PantallaPrincipalActivity extends AppCompatActivity {

    Button lecturas;
    Button ejercicios;
    Button salir; /*se pone el nombre que va a llevar el boton */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);

        ejercicios = (Button)findViewById(R.id.buttonejercicios);
        ejercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ejercicios = new Intent(PantallaPrincipalActivity.this, Main2Activity.class);
                startActivity(ejercicios);

            }
        }); /*En la primera linea, pondremos el nombre que se le asignó al botón junto con la id del boton
        para despues cuando se de click le mande a la siguiente interfaz y un start activity para que inicie la actividad*/

        ejercicios = (Button)findViewById(R.id.buttonlecturas);
        ejercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lecturas = new Intent(PantallaPrincipalActivity.this,Main4Activity .class);
                startActivity(lecturas);

            }
        });

        Button salir= (Button) findViewById(R.id.buttonatras);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        /*En las dos lineas de codigo, es para que al momento de dar click en el boton salir, salga de la cuenta y mande directo
         a la interfaz de iniciar sesion*/

    }
}
