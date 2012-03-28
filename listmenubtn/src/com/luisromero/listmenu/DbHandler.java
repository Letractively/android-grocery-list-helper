package com.luisromero.listmenu;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHandler extends SQLiteOpenHelper{
	/*
	 *  Setup to handle SQLite db - on Android Device.
	 * 
	 * */
	public static final String TABLE_NAME_ITEMS = "items";
	public static final String TABLE_NAME_LOCATION="location";
	public static final String TABLE_NAME_LOCATIONSTOCK="stock";
	
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_PRODUCT = "product";
	
	public static final String COLUMN_QUANTITY = "quantity";
	private static final String DATABASE_NAME = "groceryTodoApp.db";
	private static final int DATABASE_VERSION = 1;

	private static final String CREATE_ITEMS_TABLE = "create table "
				+ TABLE_NAME_ITEMS + "( " + COLUMN_ID
				+ " integer primary key autoincrement, " + COLUMN_PRODUCT
				+ " text not null, " + COLUMN_QUANTITY + "integer);";
	
	private static final String CREATE_LOCATION_TABLE = "create table location " + "( " + 
			COLUMN_ID + " integer primary key autoincrement, " + "name"
			+ " text not null, " + "coordinates " + " text not null );";
	
	private static final String CREATE_STOCK_TABLE = "create table "
			+ TABLE_NAME_LOCATIONSTOCK + "( " + COLUMN_PRODUCT
			+ " text not null, " + COLUMN_QUANTITY + "long, " + "inStock boolean);";
	
	public DbHandler(Context context, String name, CursorFactory factory,
			int version) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//database.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		/*Log.w(MySQLiteHelper.class.getName(),
				"Upgrading database from version " + oldVersion + " to "
						+ newVersion + ", which will destroy all old data");
		*/
		//db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		//onCreate(db);
	}
}
