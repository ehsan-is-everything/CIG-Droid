package android.database;

import android.database.sqlite.SQLiteDatabase;

public abstract interface DatabaseErrorHandler
{
  public abstract void onCorruption(SQLiteDatabase paramSQLiteDatabase);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\DatabaseErrorHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */