package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedList;

public class SettingsActivity
  extends Activity
  implements CryptoServiceConnector.ResponseListener, NetBackupHandler.ResultListener
{
  private static final String BACKUP_FILENAME = "Backup";
  private static final int BACKUP_TO_NET = 64523;
  private static final int BACKUP_TO_SD = 2435;
  public static final int FILE = 293;
  private static final String NO = "Cancel";
  private static final int NOT_RUNNING = 834556;
  public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
  public static final int PIN_REQUEST = 456;
  private static final String TAG = "m_Settings";
  private static final String YES = "Yes";
  private static final int writeable = 1;
  private String PIN;
  AlertDialog.Builder backupNet;
  AlertDialog.Builder backupSD;
  private AlertDialog.Builder connectionError;
  AlertDialog.Builder deleteALL;
  AlertDialog.Builder errorCantChangePin;
  AlertDialog.Builder errorCantRead;
  AlertDialog.Builder errorDBEmpty;
  private LinkedList<PasswordEntry> ll;
  private String mainPassword;
  private NetBackupHandler netBackup;
  AlertDialog.Builder netRestore;
  private StringBuffer out;
  AlertDialog.Builder restore;
  private int runningState = 834556;
  private CryptoServiceConnector serviceConnection = new CryptoServiceConnector(this);
  
  private void backupToNet()
  {
    if (this.runningState == 834556)
    {
      this.runningState = 64523;
      getBackup();
    }
  }
  
  private void backupToSD()
  {
    if ((this.runningState == 834556) && (checkSDState(1)))
    {
      this.runningState = 2435;
      getBackup();
    }
  }
  
  private boolean changePIN(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("pin", paramString);
    paramString = this.PIN;
    return getContentResolver().update(DBContentProvider.KEYS_URI, localContentValues, "pin = ?", new String[] { paramString }) > 0;
  }
  
  private boolean checkSDState(int paramInt)
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  private void deleteAll()
  {
    getContentResolver().delete(DBContentProvider.PASSWORDS_URI, null, null);
    Toast.makeText(getApplicationContext(), "Database deleted", 0).show();
  }
  
  private void finaliseBackupToSD()
  {
    Object localObject = new Timestamp(new Date().getTime()).toString().replace(':', '-');
    localObject = "Backup (" + (String)localObject + ").xml";
    localObject = new File(getExternalFilesDir(null), (String)localObject);
    try
    {
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = new FileOutputStream((File)localObject);
      ((OutputStream)localObject).write(this.out.toString().getBytes());
      ((OutputStream)localObject).close();
      Toast.makeText(getApplicationContext(), "Database exported", 0).show();
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("m_Settings", "ERROR: Unable to write to file");
      Log.e("m_Settings", localIOException.getMessage());
    }
  }
  
  private void finaliseEntry(String paramString)
  {
    PasswordEntry localPasswordEntry = (PasswordEntry)this.ll.poll();
    localPasswordEntry.password = paramString;
    this.out.append(DBParser.processElement(localPasswordEntry));
    if (this.ll.isEmpty()) {
      finaliseOutput();
    }
  }
  
  private void finaliseInsert(byte[] paramArrayOfByte)
  {
    PasswordEntry localPasswordEntry = (PasswordEntry)this.ll.poll();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("service", localPasswordEntry.service);
    localContentValues.put("username", localPasswordEntry.username);
    localContentValues.put("password", paramArrayOfByte);
    localContentValues.put("email", localPasswordEntry.email);
    getContentResolver().insert(DBContentProvider.PASSWORDS_URI, localContentValues);
    if (this.ll.isEmpty()) {
      finaliseRestore();
    }
  }
  
  private void finaliseOutput()
  {
    this.out.append("</Passwords>");
    switch (this.runningState)
    {
    }
    for (;;)
    {
      this.runningState = 834556;
      return;
    }
  }
  
  private void finaliseRestore()
  {
    Toast.makeText(getApplicationContext(), "Database Restored", 0).show();
    startActivity(new Intent(this, MainLoginActivity.class));
  }
  
  private void getBackup()
  {
    this.ll = new LinkedList();
    this.out = new StringBuffer("<Passwords");
    Cursor localCursor = new CursorLoader(this, DBContentProvider.PASSWORDS_URI, null, null, null, null).loadInBackground();
    Object localObject = new CursorLoader(this, DBContentProvider.KEYS_URI, null, null, null, null).loadInBackground();
    ((Cursor)localObject).moveToFirst();
    String str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("Password"));
    localObject = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("pin"));
    this.out.append(" Key=\"" + str1 + "\" Pin=\"" + (String)localObject + "\">");
    if (localCursor.getCount() > 0)
    {
      localCursor.moveToFirst();
      int i = 0;
      for (;;)
      {
        if (i >= localCursor.getCount()) {
          return;
        }
        localObject = localCursor.getString(localCursor.getColumnIndex("service"));
        String str2 = localCursor.getString(localCursor.getColumnIndex("username"));
        String str3 = localCursor.getString(localCursor.getColumnIndex("service"));
        byte[] arrayOfByte = localCursor.getBlob(localCursor.getColumnIndex("password"));
        this.ll.offer(new PasswordEntry((String)localObject, str2, str3, null));
        this.serviceConnection.sendForDecryption(str1.substring(0, 16), arrayOfByte, 0);
        localCursor.moveToNext();
        i += 1;
      }
    }
    Toast.makeText(getApplicationContext(), "Database exported", 0).show();
  }
  
  private void getRestore(InputStream paramInputStream)
    throws Exception
  {
    paramInputStream = new BufferedInputStream(paramInputStream);
    paramInputStream.mark(99999999);
    this.mainPassword = DBParser.getKey(paramInputStream);
    paramInputStream.reset();
    this.PIN = DBParser.getPIN(paramInputStream);
    paramInputStream.reset();
    this.ll = ((LinkedList)DBParser.readFile(paramInputStream));
    getContentResolver().delete(DBContentProvider.KEYS_URI, null, null);
    getContentResolver().delete(DBContentProvider.PASSWORDS_URI, null, null);
    paramInputStream = new ContentValues();
    paramInputStream.put("Password", this.mainPassword);
    paramInputStream.put("pin", this.PIN);
    getContentResolver().insert(DBContentProvider.KEYS_URI, paramInputStream);
    int i = 0;
    for (;;)
    {
      if (i >= this.ll.size()) {
        return;
      }
      this.serviceConnection.sendForEncryption(this.mainPassword.substring(0, 16), ((PasswordEntry)this.ll.get(i)).password, 0);
      i += 1;
    }
  }
  
  private void restoreFromFile(String paramString)
  {
    try
    {
      getRestore(getContentResolver().openInputStream(Uri.withAppendedPath(FileBackupProvider.FILE_DATABASE, paramString.substring(1))));
      return;
    }
    catch (Exception paramString1)
    {
      this.errorCantRead.show();
    }
  }
  
  private void restoreFromNet()
  {
    this.netBackup.performNetRestore();
  }
  
  private void restoreFromSD()
  {
    startActivityForResult(new Intent(this, FileSelectActivity.class), 293);
  }
  
  private void restoreFromString(String paramString)
  {
    try
    {
      getRestore(new ByteArrayInputStream(paramString.getBytes()));
      return;
    }
    catch (Exception paramString1)
    {
      Log.e("m_Settings", "ERROR: Unable to read / process data from server: " + paramString1.getMessage());
      this.errorCantRead.show();
    }
  }
  
  private void unbind()
  {
    unbindService(this.serviceConnection);
  }
  
  public void backupToNet(View paramView)
  {
    this.backupNet.show();
  }
  
  public void backupToSD(View paramView)
  {
    this.backupSD.show();
  }
  
  public void changePIN(View paramView)
  {
    paramView = new CursorLoader(this, DBContentProvider.KEYS_URI, null, null, null, null).loadInBackground();
    paramView.moveToFirst();
    this.PIN = paramView.getString(paramView.getColumnIndex("pin"));
    paramView = new Intent(this, PINActivity.class);
    paramView.putExtra("com.mwr.example.sieve.PIN", this.PIN);
    paramView.putExtra("com.mwr.example.sieve.REQUEST", 92635);
    startActivityForResult(paramView, 456);
  }
  
  public void connected() {}
  
  public void decryptionReturned(String paramString, int paramInt)
  {
    finaliseEntry(paramString);
  }
  
  public void deleteAll(View paramView)
  {
    this.deleteALL.show();
  }
  
  public void encryptionReturned(byte[] paramArrayOfByte, int paramInt)
  {
    finaliseInsert(paramArrayOfByte);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 293) {
      if (paramInt2 == -1) {
        restoreFromFile(paramIntent.getStringExtra("com.mwr.example.sieve.FILE"));
      }
    }
    while ((paramInt1 != 456) || (paramInt2 != -1) || (changePIN(paramIntent.getStringExtra("com.mwr.example.sieve.PIN")))) {
      return;
    }
    this.errorCantChangePin.show();
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    this.netBackup = new NetBackupHandler("10.0.2.2", "8001", this);
    this.backupSD = new AlertDialog.Builder(this);
    this.backupSD.setMessage(2131034131).setTitle("Confirm");
    this.backupSD.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsActivity.this.backupToSD();
      }
    });
    this.backupSD.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.backupSD.create();
    this.deleteALL = new AlertDialog.Builder(this);
    this.deleteALL.setMessage(2131034129).setTitle("Confirm");
    this.deleteALL.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsActivity.this.deleteAll();
      }
    });
    this.deleteALL.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.deleteALL.create();
    this.restore = new AlertDialog.Builder(this);
    this.restore.setMessage(2131034130).setTitle("Restore");
    this.restore.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsActivity.this.restoreFromSD();
      }
    });
    this.restore.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.restore.create();
    this.netRestore = new AlertDialog.Builder(this);
    this.netRestore.setMessage(2131034132).setTitle("Restore");
    this.netRestore.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsActivity.this.restoreFromNet();
      }
    });
    this.netRestore.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.netRestore.create();
    this.backupNet = new AlertDialog.Builder(this);
    this.backupNet.setMessage(2131034133).setTitle("Backup");
    this.backupNet.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        SettingsActivity.this.backupToNet();
      }
    });
    this.backupNet.setNegativeButton("Cancel", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.backupNet.create();
    this.errorDBEmpty = new AlertDialog.Builder(this);
    this.errorDBEmpty.setMessage(2131034135).setTitle("Error");
    this.errorDBEmpty.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.errorDBEmpty.create();
    this.errorCantRead = new AlertDialog.Builder(this);
    this.errorCantRead.setMessage(2131034136).setTitle("Error");
    this.errorCantRead.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.errorCantRead.create();
    this.errorCantChangePin = new AlertDialog.Builder(this);
    this.errorCantChangePin.setMessage(2131034134).setTitle("Error");
    this.errorCantChangePin.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.errorCantChangePin.create();
    this.connectionError = new AlertDialog.Builder(this);
    this.connectionError.setMessage(2131034120).setTitle("Error");
    this.connectionError.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.connectionError.create();
    if (Build.VERSION.SDK_INT >= 14) {
      getActionBar().setHomeButtonEnabled(true);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165190, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    onBackPressed();
    return true;
  }
  
  public void onPause()
  {
    super.onPause();
    unbind();
  }
  
  public void onResume()
  {
    super.onResume();
    bindService(new Intent(this, CryptoService.class), this.serviceConnection, 1);
  }
  
  public void onTaskFinish(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 459835: 
      Toast.makeText(getApplicationContext(), "Database exported", 0).show();
      return;
    case 745745: 
      restoreFromString(paramString);
      return;
    }
    Log.e("m_Settings", "Error during backup.");
  }
  
  public void restoreFromNet(View paramView)
  {
    this.netRestore.show();
  }
  
  public void restoreFromSD(View paramView)
  {
    this.restore.show();
  }
  
  public void sendFailed()
  {
    this.connectionError.show();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\SettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */