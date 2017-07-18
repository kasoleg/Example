package com.kasyanov.vk.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.kasyanov.vk.mvp.model.response.Advert;
import com.kasyanov.vk.mvp.model.response.Photo;
import com.kasyanov.vk.mvp.model.response.Prices;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class Storage extends SQLiteOpenHelper {
    private static final String TAG = Storage.class.getSimpleName();

    @Inject
    public Storage(Context context) {
        super(context, "adverts_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
        } catch (SQLException e) {
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    public void addAdvert(Advert advert) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(BRAND, advert.getBrand());
        values.put(MODEL, advert.getModel());
        values.put(GENERATION, advert.getGeneration());
        values.put(PRICE, advert.getPrices().getRUR());
        values.put(YEAR, advert.getYear());
        values.put(MILEAGE, advert.getMileage());
        List<Photo> photos = advert.getPhotos();
        if (!photos.isEmpty()) {
            String imageUrl = null;
            Photo photo = photos.get(0);
            if (photo.getXxl() != null) {
                imageUrl = photo.getXxl();
            } else if (photo.getXl() != null) {
                imageUrl = photo.getXl();
            } else if (photo.getL() != null) {
                imageUrl = photo.getL();
            } else if (photo.getM() != null) {
                imageUrl = photo.getM();
            } else if (photo.getS() != null) {
                imageUrl = photo.getS();
            } else if (photo.getXs() != null) {
                imageUrl = photo.getXs();
            }
            values.put(IMAGE, imageUrl);
        }

        try {
            db.insert(TABLE_NAME, null, values);
        } catch (SQLException e) {
            Log.d(TAG, e.getMessage());
        }

        db.close();
    }

    public List<Advert> getSavedAdverts() {
        List<Advert> advertList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(SELECT_QUERY, null);
        if (cursor != null) {
            if (cursor.getCount() > 0) {
                if (cursor.moveToFirst()) {
                    do {
                        Advert advert = new Advert();
                        advert.setId(cursor.getString(cursor.getColumnIndex(ID)));
                        advert.setBrand(cursor.getString(cursor.getColumnIndex(BRAND)));
                        advert.setModel(cursor.getString(cursor.getColumnIndex(MODEL)));
                        advert.setGeneration(cursor.getString(cursor.getColumnIndex(GENERATION)));
                        Prices prices = new Prices();
                        prices.setRUR(cursor.getInt(cursor.getColumnIndex(PRICE)));
                        advert.setPrices(prices);
                        advert.setMileage(cursor.getString(cursor.getColumnIndex(MILEAGE)));
                        List<Photo> photos = new ArrayList<>();
                        Photo photo = new Photo();
                        photo.setXxl(cursor.getString(cursor.getColumnIndex(IMAGE)));
                        photos.add(photo);
                        advert.setPhotos(photos);
                        advertList.add(advert);
                    } while (cursor.moveToNext());
                }
            }
        }
        return advertList;
    }

    private static final String ID = "id";
    private static final String BRAND = "brand";
    private static final String MODEL = "model";
    private static final String GENERATION = "generation";
    private static final String PRICE = "price";
    private static final String YEAR = "year";
    private static final String MILEAGE = "mileage";
    private static final String IMAGE = "image";
    private static final String TABLE_NAME = "adverts";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    private static final String SELECT_QUERY = "SELECT * FROM " + TABLE_NAME;

    public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
            ID + " integer primary key not null," +
            BRAND + " text not null," +
            MODEL + " text not null," +
            GENERATION + " text not null," +
            PRICE + " integer not null," +
            YEAR + " text not null," +
            MILEAGE + " text not null," +
            IMAGE + " text)";

    public void saveAdverts(List<Advert> adverts) {
        for (Advert advert : adverts) {
            addAdvert(advert);
        }
    }
}
