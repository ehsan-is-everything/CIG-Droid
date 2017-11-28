package com.mwr.example.sieve;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public class DBContentProvider
  extends ContentProvider
{
  public static final int KEY = 200;
  public static final Uri KEYS_URI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Keys");
  public static final int KEY_ID = 230;
  public static final int KEY_PASSWORD = 210;
  public static final int KEY_PIN = 220;
  public static final int PASSWORDS = 100;
  public static final int PASSWORDS_EMAIL = 140;
  public static final int PASSWORDS_ID = 110;
  public static final int PASSWORDS_PASSWORD = 150;
  public static final int PASSWORDS_SERVICE = 120;
  public static final Uri PASSWORDS_URI = Uri.parse("content://com.mwr.example.sieve.DBContentProvider/Passwords");
  public static final int PASSWORDS_USERNAME = 130;
  PWDBHelper pwdb;
  private UriMatcher sUriMatcher = new UriMatcher(-1);
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    int j = this.sUriMatcher.match(paramUri);
    int i = -1;
    if (j == 100) {
      i = this.pwdb.getWritableDatabase().delete("Passwords", paramString, paramArrayOfString);
    }
    while (j != 200) {
      return i;
    }
    return this.pwdb.getWritableDatabase().delete("Key", paramString, paramArrayOfString);
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    int i = this.sUriMatcher.match(paramUri);
    long l = -1L;
    if (i == 100) {
      l = this.pwdb.getWritableDatabase().insert("Passwords", null, paramContentValues);
    }
    for (;;)
    {
      return ContentUris.withAppendedId(paramUri, l);
      if (i == 200) {
        l = this.pwdb.getWritableDatabase().insert("Key", null, paramContentValues);
      }
    }
  }
  
  public boolean onCreate()
  {
    this.pwdb = new PWDBHelper(getContext());
    this.sUriMatcher.addURI("com.mwr.example.sieve.DBContentProvider", "Passwords", 100);
    this.sUriMatcher.addURI("com.mwr.example.sieve.DBContentProvider", "Keys", 200);
    return false;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    int i = this.sUriMatcher.match(paramUri);
    paramUri = new SQLiteQueryBuilder();
    if ((i >= 100) && (i < 200)) {
      paramUri.setTables("Passwords");
    }
    for (;;)
    {
      return paramUri.query(this.pwdb.getReadableDatabase(), paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
      if (i >= 200) {
        paramUri.setTables("Key");
      }
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    int j = this.sUriMatcher.match(paramUri);
    int i = -1;
    if (j == 100) {
      i = this.pwdb.getWritableDatabase().update("Passwords", paramContentValues, paramString, paramArrayOfString);
    }
    while (j != 200) {
      return i;
    }
    return this.pwdb.getWritableDatabase().update("Key", paramContentValues, paramString, paramArrayOfString);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\DBContentProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */