package com.example.a11feb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class OrderDBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "myorders";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_ORDER = "orders";
    public static final String COLUMN_ID = "orderId";
    public static final String COLUMN_MEAL = "meal_name";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_QUANTITY = "quantity";
    public static final String COLUMN_TIP = "tip";
    public static final String COLUMN_TAX = "tax";
    public static final String COLUMN_COST = "cost";

    private static final String TABLE_CREATE = "CREATE TABLE " + TABLE_ORDER + "(" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_MEAL + " varchar(200) NOT NULL, " +
            COLUMN_PRICE + " integer NOT NULL, " +
            COLUMN_QUANTITY + " integer NOT NULL, " +
            COLUMN_TIP + " double NOT NULL, " +
            COLUMN_TAX + " double NOT NULL, " +
            COLUMN_COST + " double NOT NULL" +
            ");";


    public OrderDBHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ORDER);
        db.execSQL(TABLE_CREATE);
        onCreate(db);
    }

    boolean addOrder(String mealName, int price, int quantity, double tip, double tax, double cost) {

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_MEAL,mealName);
        cv.put(COLUMN_PRICE,String.valueOf(price));
        cv.put(COLUMN_QUANTITY,String.valueOf(quantity));
        cv.put(COLUMN_TIP,String.valueOf(tip));
        cv.put(COLUMN_TAX,String.valueOf(tax));
        cv.put(COLUMN_COST,String.valueOf(cost));


        return sqLiteDatabase.insert(TABLE_ORDER, null, cv) != -1;
    }

    Cursor getAllOrders() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_ORDER, null);
    }


}
