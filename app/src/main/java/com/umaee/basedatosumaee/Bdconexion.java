package com.umaee.basedatosumaee;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Bdconexion extends SQLiteOpenHelper {
    private static final String DB_NAME = "bdumaee.sqlite";
    private static final int DB_VERSION = 1;

    public Bdconexion(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Bdadmin.CREATE_ALUMNOS);
        db.execSQL(Bdadmin.CREATE_MATERIAS);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
