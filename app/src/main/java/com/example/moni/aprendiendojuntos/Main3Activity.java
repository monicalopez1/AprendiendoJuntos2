package com.example.moni.aprendiendojuntos;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.moni.aprendiendojuntos.basededatos.BaseDeDatos;

public class Main3Activity extends AppCompatActivity {




    private Button iniciar;
    private EditText et_usuario;
    private EditText et_password;
    private TextView nombre;
    private TextView password;

    private BaseDeDatos bd_main = new BaseDeDatos (this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       /* iniciar = (Button)findViewById(R.id.iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registrarse = new Intent(Main3Activity.this, PantallaPrincipalActivity.class);
                startActivity(registrarse);

            }
        });*/
    }

    public void inicar(){

       iniciar = (Button) findViewById(R.id.iniciar);
        et_usuario = (EditText) findViewById(R.id.et_usuario);
        et_password = (EditText) findViewById(R.id.et_password);
       iniciar.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view) {
               String email = et_usuario.getText().toString();
               String password = et_password.getText().toString();

           }



    }



}
}

