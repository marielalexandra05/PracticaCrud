package com.mariela.leon.proyectosqlite.modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TiendaSQL extends SQLiteOpenHelper {
    private static final String BASE = "leonsqlite.db";
    Context micontexto;

    public TiendaSQL(@Nullable Context context) {
        super(context, BASE, null, 3);
        micontexto=context;
        File rutaArchivo = context.getDatabasePath(BASE);//Ruta de la base de datos
        coparBase(rutaArchivo);

    }

    private void coparBase(File archivo){
        try {
            InputStream inputStream = micontexto.getAssets().open(BASE);
            OutputStream outputStream = new FileOutputStream(archivo);
            byte[] buffer = new byte[1024];
            int largo;
            while ((largo= inputStream.read(buffer))>0){
                outputStream.write(buffer,0, largo);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        };
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
