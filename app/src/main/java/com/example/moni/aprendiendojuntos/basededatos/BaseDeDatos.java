package com.example.moni.aprendiendojuntos.basededatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.moni.aprendiendojuntos.Main3Activity;

/**
 * Created by moni_ on 27/03/2018.
 */

public class BaseDeDatos {

    private Main3inicio helper;

    private Main3inicio main;
    private SQLiteDatabase obd;

    /*creacion de las tablas*/
    /* usuario  */
    public static final String name_usuario = "usuario";

    /* partida */
    public static final String name_partida = "partida";

    /*ejercicios*/
    public static final String name_ejercicios = "ejercicios";

    /*lecturas*/
    public static  final String name_lecturas = "lecturas";

    /*palabras*/
    public static final String name_palabras = "palabras";

    /*puntos*/
    public static final String name_puntos = "puntos";


    /*creacion de las columnas*/
    /*usuario*/

    public static final String column_id_usuario = "idusuario";
    public static final String column_nombre = "nombre";
    public static final String column_apellido = "apellido";
    public static final String column_usuario = "usuario";
    public static final String column_password = "password";

  /*partida*/
    public static final String column_id_partida = "idpartida";


    /*ejercicios*/
    public static final String column_id_ejercicios = "idejercicios";
    public static  final String column_ejercicios = "ejercicios1";


    /*lecturas*/
    public static final String column_id_lecturas = "idlecturas";
    public static final String column_lecturas = "lecturas1";


    /*palabras*/

    public static final String column_id_palabras = "idpalabras";
    public static final String column_palabras = "palabras1";


    /*puntos*/
    public static final String column_id_puntos = "idpuntos";


    /*cracion de las tablas con sus respectivos datos.*/
    /*TABLAS*/


    public static final String table_lecturas = " create table " +name_lecturas + " ("
            +column_id_lecturas + " integer primary key autoincrement,"
            +column_lecturas + " varchar(100) not null);";



    public static final String table_palabras = " create table " +name_palabras + " ( "
            +column_id_palabras + " integer primary key autoincrement,"
            +column_palabras + " varchar(20) not null);";

    public static final String table_ejercicios = " create table " +name_ejercicios + " ("
            +column_id_ejercicios + " integer primary key autoincrement,"
            +column_ejercicios + " varchar(50) not null, "
            +column_id_lecturas + " integer,"
            +column_id_palabras + " integer,"
            +"foreign key (" + column_id_lecturas + ") references " +name_lecturas + "(idlecturas),"
            +"foreign key (" + column_id_palabras +") references " +name_palabras + "(idpalabras)" +")";



    public static final String table_partida = " create table " +name_partida + " ("
            +column_id_partida + " integer primary key autoincrement,"
            +column_id_ejercicios + " integer not null,"
            +"foreign key (" + column_id_ejercicios + ") references " +name_ejercicios + "(idejercicios)" +")";



    public static final String table_usuario = " create table " +name_usuario + " ("
            +column_id_usuario + " integer primary key autoincrement,"
            +column_nombre  + " varchar(20) not null,"
            +column_apellido + " varchar(20) not null,"
            +column_password + " varchar(20) not null,"
            +column_usuario + " varchar(20) not null,"
            +column_id_partida + " integer,"
            +"foreign key (" + column_id_partida + ") references " +name_partida + "(idpartida)" +")";


    public static final String table_puntos = " create table " +name_puntos + " ("
            +column_id_puntos + " integer primary key autoincrement,"
            +column_id_partida + " integer,"
            +column_id_usuario + " integer,"
            +"foreign key (" + column_id_partida + ") references " +name_partida + "(idpartida),"
            +"foreign key (" + column_id_usuario + ") references " +name_usuario + "(idusuario)" +")";

    public BaseDeDatos(Context context) {

        helper = new Main3inicio(context);

    }


    public SQLiteDatabase abrir_base (){
        obd = main.getWritableDatabase();

        return obd;
    }

    public void leer_base (){
        obd = main.getReadableDatabase();

    }

    public void insertar(String nombre, String apellido, String usuario, String password){

        obd.insert(usuario,null, valores(nombre, apellido, usuario, password));
    }

    public ContentValues valores(String nombre, String apellido, String usuario, String password){
        ContentValues datos = new ContentValues();
        datos.put(column_nombre, nombre );
        datos.put(column_apellido, apellido);
        datos.put(column_usuario, usuario);
        datos.put(column_password,password);
        return datos;
    }

}
