package com.mwr.example.sieve;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PWDBHelper
  extends SQLiteOpenHelper
{
  public static final String DATABASE_NAME = "database.db";
  public static final int DATABASE_VERSION = 1;
  
  public PWDBHelper(Context paramContext)
  {
    super(paramContext, "database.db", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE Passwords (_id INTEGER PRIMARY KEY,service TEXT,username TEXT,password BLOB,email )");
    paramSQLiteDatabase.execSQL("CREATE TABLE Key (Password TEXT PRIMARY KEY,pin TEXT )");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\PWDBHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */