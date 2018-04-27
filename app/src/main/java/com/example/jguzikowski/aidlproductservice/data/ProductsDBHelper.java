package com.example.jguzikowski.aidlproductservice.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jguzikowski.aidlproductservice.Product;

/**
 * Created by j.guzikowski on 9/20/17.
 */

public class ProductsDBHelper extends SQLiteOpenHelper {

    // The name of the database
    private static final String DATABASE_NAME = "tasksDb.db";

    // If you change the database schema, you must increment the database version
    private static final int VERSION = 3;


    // Constructor
    public ProductsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }


    /**
     * Called when the tasks database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create tasks table (careful to follow SQL formatting rules)

        final String CREATE_TABLE = "CREATE TABLE "  + ProductContract.ProductsEntry.TABLE_NAME + " (" +
                ProductContract.ProductsEntry._ID                + " INTEGER PRIMARY KEY, " +
                ProductContract.ProductsEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                ProductContract.ProductsEntry.COLUMN_PRICE  + " TEXT NOT NULL, " +
                ProductContract.ProductsEntry.COLUMN_COUNTRY+ " TEXT NOT NULL, " +
                ProductContract.ProductsEntry.COLUMN_DELIVERY  + " TEXT NOT NULL);";


        db.execSQL(CREATE_TABLE);
    }


    /**
     * This method discards the old table of data and calls onCreate to recreate a new one.
     * This only occurs when the version number for this database (DATABASE_VERSION) is incremented.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ProductContract.ProductsEntry.TABLE_NAME);
        onCreate(db);
    }
}
