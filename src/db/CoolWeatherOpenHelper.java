package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(CREATE_PROVICE);//创建省表
		db.execSQL(CREATE_CITY);//创建城市表
		db.execSQL(CREATE_COUNTRY);//创建县表
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
     //建省表语句
	public static final String CREATE_PROVICE="create table Provice(" +
			"id integer primary key autoincrement," +
			"Province_name text" +
			"Province_code text)";
	//建城市表语句
	public static final String CREATE_CITY="create table city(" +
			"id integer primary key autoincrement," +
			"City_name text," +
			"City_code text," +
			"Province_id integer)";
	//建县表语句
	public static final String CREATE_COUNTRY="(" +
			"id integer primary key autoincreament," +
			"Country_name text" +
			"Country_code text" +
			"City_id integer)";

}
