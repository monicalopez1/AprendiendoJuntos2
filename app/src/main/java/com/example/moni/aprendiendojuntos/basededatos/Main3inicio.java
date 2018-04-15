package com.example.moni.aprendiendojuntos.basededatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by moni_ on 27/03/2018.
 */

public class Main3inicio extends SQLiteOpenHelper {


    private static final String base = "learning_together.sqlite";
    private static final int version_bd = 1;
    public Main3inicio(Context context) {

        super(context,base,null,version_bd);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


         sqLiteDatabase.execSQL(BaseDeDatos.table_usuario);
         sqLiteDatabase.execSQL(BaseDeDatos.table_ejercicios);
         sqLiteDatabase.execSQL(BaseDeDatos.table_lecturas);
         sqLiteDatabase.execSQL(BaseDeDatos.table_palabras);
         sqLiteDatabase.execSQL(BaseDeDatos.table_puntos);
         sqLiteDatabase.execSQL(BaseDeDatos.table_partida);



        insertarpalabras(sqLiteDatabase, "pirata");
        insertarpalabras(sqLiteDatabase, "loro");
        insertarpalabras(sqLiteDatabase, "isla");
        insertarpalabras(sqLiteDatabase, "laguna");
        insertarpalabras(sqLiteDatabase, "loro");
        insertarpalabras(sqLiteDatabase, "avestruz");
        insertarpalabras(sqLiteDatabase, "gata");
        insertarpalabras(sqLiteDatabase, "gato");
        insertarpalabras(sqLiteDatabase, "gallo");
        insertarpalabras(sqLiteDatabase, "perro");
        insertarpalabras(sqLiteDatabase, "blanca");
        insertarpalabras(sqLiteDatabase, "azul");
        insertarpalabras(sqLiteDatabase, "el bebe");
        insertarpalabras(sqLiteDatabase, "un niño");
        insertarpalabras(sqLiteDatabase, "el papa");
        insertarpalabras(sqLiteDatabase, "la casa");
        insertarpalabras(sqLiteDatabase, "tu mama");
        insertarpalabras(sqLiteDatabase, "nadie");

        insertarejercicios(sqLiteDatabase, "");

        insertarlecturas(sqLiteDatabase, "");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertarpalabras(SQLiteDatabase db, String palabras1){

        ContentValues palabras = new ContentValues();
        palabras.put(BaseDeDatos.column_palabras,palabras1);

        db.insert(BaseDeDatos.name_palabras,null,palabras);

    }

    public void insertarejercicios(SQLiteDatabase db, String ejercicios1){
        ContentValues ejercicios = new ContentValues();
        ejercicios.put(BaseDeDatos.column_ejercicios,ejercicios1);

        db.insert(BaseDeDatos.name_ejercicios,null,ejercicios);
    }

    public  void insertarlecturas(SQLiteDatabase db, String lecturas1){
        ContentValues lecturas = new ContentValues();
        lecturas.put(BaseDeDatos.column_lecturas,lecturas1 );

        db.insert(BaseDeDatos.table_lecturas,null,lecturas);
    }

    /*public void insertarpartidas(SQLiteDatabase db, String )
        ContentValues */

}
