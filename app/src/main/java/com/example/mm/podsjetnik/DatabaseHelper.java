package com.example.mm.podsjetnik;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DatabaseHelper {

    private static final String TAG = "DatabaseHelper";

    private static  final String DATABASE_NAME = "lijekovi.db";
    private static final String TABLE_NAME = "lijekovi";
    private static final String COL1 = "Sifra_lijeka";
    private static final String COL2 = "Naziv_lijeka";
    private static final String COL3 = "Cijena_lijeka";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME , null, 1);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME+" (Sifra_lijeka INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Naziv_lijeka TEXT, Cijena_lijeka TEXT)");

    }
    public boolean addData(String item){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, Naziv_lijeka);
        contentValues.put(COL3, CIjena_lijeka);
        Log.d(TAG, "addData: Dodavanje " + item + " u" + TABLE_NAME);

        long rezultat= db.insert(TABLE_NAME, null, contentValues);

        if(rezultat == -1){
            return false;
        } else {
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from "+TABLE_NAME,null);
        return res;

    }
}
