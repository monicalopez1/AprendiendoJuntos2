package com.example.moni.aprendiendojuntos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.moni.aprendiendojuntos.basededatos.BaseDeDatos;

public class Registrarse extends AppCompatActivity {

    EditText et_nombre, et_app, usuario, contrasena;
    Button guardar;

    BaseDeDatos registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

            et_nombre = (EditText) findViewById(R.id.editText_nom);
            et_app = (EditText) findViewById(R.id.editText_app);
            usuario = (EditText) findViewById(R.id.editText_usuario);
            contrasena = (EditText) findViewById(R.id.editText_contra);
            guardar = (Button) findViewById(R.id.button_guardar);

            guardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    insertar_usuarios();
                }
            });


    }

    public void insertar_usuarios(){
        registro.insertar(et_nombre.getText().toString(),et_app.getText().toString(),usuario.getText().toString(),contrasena.getText().toString());
    }


}
