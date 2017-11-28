package com.mwr.example.sieve;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

public class FileBackupProvider
  extends ContentProvider
{
  private static final int DATABASE = 2346456;
  public static final Uri FILE_DATABASE = Uri.parse("content://com.mwr.example.sieve.FileBackupProvider");
  private static final String TAG = "m_FileBackupProvider";
  private UriMatcher sUriMatcher = new UriMatcher(-1);
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    this.sUriMatcher.addURI("com.mwr.example.sieve.FileBackupProvider", "*", 2346456);
    return false;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    int i;
    if (paramString.equals("r")) {
      i = 268435456;
    }
    for (;;)
    {
      try
      {
        paramUri = ParcelFileDescriptor.open(new File(paramUri.getPath()), i);
        return paramUri;
      }
      catch (FileNotFoundException paramUri)
      {
        Log.e("m_FileBackupProvider", "ERROR: unable to open file: " + paramUri.getMessage());
      }
      if (paramString.equals("rw"))
      {
        i = 805306368;
      }
      else if (paramString.equals("rwt"))
      {
        i = 805306368;
      }
      else
      {
        Log.w("m_FileBackupProvider", "Unrecognised code to open file: " + paramString);
        return null;
      }
    }
    return null;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\FileBackupProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */