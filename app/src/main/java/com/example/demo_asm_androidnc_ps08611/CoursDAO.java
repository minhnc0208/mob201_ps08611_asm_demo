package com.example.demo_asm_androidnc_ps08611;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CoursDAO {
    public static final String TABLE_NAME = "Cours";
    private SQLiteDatabase db, db1;
    private DatabaseHelper databaseHelper;
    public static final String TAG = "CoursDAO";

    public static final String SQL_COURS = "" +
            "CREATE TABLE Cours(name text primary key)";

    public CoursDAO(Context context) {
        databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getWritableDatabase();
        db1 = databaseHelper.getReadableDatabase();
    }

    public boolean insertCours(Cours cours) {
        ContentValues values = new ContentValues();
        values.put("name", cours.getName());
        long result = db.insert(TABLE_NAME, null, values);
        try {
            if (result < 0) {
                return false;
            }
        } catch (Exception ex) {
            Log.e(TAG, ex.toString());
            return false;
        }
        return true;

    }

    public List<Cours> selectCours() {
        List<Cours> coursList = new ArrayList<>();
        String select = " SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db1.rawQuery(select, null);
        if (cursor.moveToFirst()) {
            do {
                Cours cours = new Cours();
                cours.setName(cursor.getString(0));
                coursList.add(cours);

            } while (cursor.moveToNext());
            cursor.close();

        }

        return coursList;
    }
}