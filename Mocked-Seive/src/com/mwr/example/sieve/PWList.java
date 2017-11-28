package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PWList
  extends Activity
  implements AdapterView.OnItemClickListener, CryptoServiceConnector.ResponseListener, AdapterView.OnItemLongClickListener
{
  public static final int FOR_ACCESS = 653;
  public static final int FOR_EDIT = 468;
  public static final int FOR_INSERT = 735;
  public static final String KEY = "com.mwr.example.sieve.KEY";
  private static final int PWLIST_ADD = 1;
  private static final int PWLIST_EDIT = 2;
  private static final int PWLIST_SETTINGS = 3;
  public static final String REQUEST_TYPE = "com.mwr.example.sieve.REQUEST_TYPE";
  public static final String STRING = "com.mwr.example.sieve.STRING";
  private static final String TAG = "m_PWList";
  private String MainPassword;
  private SimpleCursorAdapter adapter = null;
  AlertDialog.Builder builder;
  AlertDialog canCon;
  AlertDialog cannotCon;
  private AlertDialog.Builder connectionError;
  private TextView prompt;
  private ListView pwList;
  private CryptoServiceConnector serviceConnection;
  private PasswordEntry workingEntry;
  private int workingRow = -1;
  
  private void addEntry()
  {
    Intent localIntent = new Intent(this, AddEntryActivity.class);
    localIntent.putExtra("com.mwr.example.sieve.REQUEST", 4365);
    localIntent.putExtra("com.mwr.example.sieve.REQUEST_TYPE", 735);
    startActivityForResult(localIntent, 1);
  }
  
  private void deleteEntry(int paramInt)
  {
    getContentResolver().delete(DBContentProvider.PASSWORDS_URI, "_id = ?", new String[] { String.valueOf(paramInt) });
    Toast.makeText(getApplicationContext(), "Entry deleted", 0).show();
    populateList();
  }
  
  private boolean finaliseEntry(byte[] paramArrayOfByte, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      Log.e("m_PWList", "unrecognised MSG_TYPE for finalisedEntry: " + paramInt);
      return false;
    case 735: 
      return finaliseInsert(paramArrayOfByte);
    }
    return finaliseUpdate(paramArrayOfByte);
  }
  
  private boolean finaliseInsert(byte[] paramArrayOfByte)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("service", this.workingEntry.service);
    localContentValues.put("username", this.workingEntry.username);
    localContentValues.put("password", paramArrayOfByte);
    localContentValues.put("email", this.workingEntry.email);
    return getContentResolver().insert(DBContentProvider.PASSWORDS_URI, localContentValues) != null;
  }
  
  private boolean finaliseUpdate(byte[] paramArrayOfByte)
  {
    int i = this.workingRow;
    if (getContentResolver().delete(DBContentProvider.PASSWORDS_URI, "_id = ?", new String[] { String.valueOf(i) }) == 1) {
      return finaliseInsert(paramArrayOfByte);
    }
    Log.e("m_PWList", "failed to delete entry from database");
    return false;
  }
  
  private void openSettings()
  {
    startActivityForResult(new Intent(this, SettingsActivity.class), 3);
  }
  
  private void populateList()
  {
    Cursor localCursor = new CursorLoader(this, DBContentProvider.PASSWORDS_URI, null, null, null, "service").loadInBackground();
    this.adapter.changeCursor(localCursor);
    if (localCursor.getCount() > 0)
    {
      this.prompt.setVisibility(4);
      return;
    }
    this.prompt.setVisibility(0);
  }
  
  private void unbind()
  {
    unbindService(this.serviceConnection);
  }
  
  public void connected()
  {
    populateList();
  }
  
  public void decryptionReturned(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 653: 
      ((ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Password", paramString));
      Toast.makeText(getApplicationContext(), "Password Copied to clipboard", 0).show();
      return;
    }
    this.workingEntry.password = paramString;
    paramString = new Intent(this, AddEntryActivity.class);
    paramString.putExtra("com.mwr.example.sieve.ENTRY", this.workingEntry);
    paramString.putExtra("com.mwr.example.sieve.REQUEST", 2346);
    paramString.putExtra("com.mwr.example.sieve.REQUEST_TYPE", 468);
    startActivityForResult(paramString, 2);
  }
  
  public void encryptionReturned(byte[] paramArrayOfByte, int paramInt)
  {
    if (finaliseEntry(paramArrayOfByte, paramInt))
    {
      populateList();
      if (paramInt == 735) {
        Toast.makeText(getApplicationContext(), "Entry Added", 0).show();
      }
      while (paramInt != 468) {
        return;
      }
      Toast.makeText(getApplicationContext(), "Entry Updated", 0).show();
      return;
    }
    Log.e("m_PWList", "entry to db failed!");
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
      } while (paramInt2 != -1);
      paramIntent = (PasswordEntry)paramIntent.getParcelableExtra("com.mwr.example.sieve.ENTRY");
      if (paramIntent == null)
      {
        deleteEntry(this.workingRow);
        return;
      }
      this.workingEntry = paramIntent;
      if (paramInt1 == 1)
      {
        this.serviceConnection.sendForEncryption(this.MainPassword, this.workingEntry.password, 735);
        return;
      }
    } while (paramInt1 != 2);
    this.serviceConnection.sendForEncryption(this.MainPassword, this.workingEntry.password, 468);
  }
  
  public void onBackPressed()
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.addCategory("android.intent.category.HOME");
    localIntent.setFlags(67108864);
    startActivity(localIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    this.MainPassword = getIntent().getStringExtra("com.mwr.example.sieve.KEY");
    this.serviceConnection = new CryptoServiceConnector(this);
    this.adapter = new SimpleCursorAdapter(this, 17367044, null, new String[] { "service", "username" }, new int[] { 16908308, 16908309 }, 2);
    this.pwList = ((ListView)findViewById(2131230750));
    this.pwList.setAdapter(this.adapter);
    this.pwList.setOnItemClickListener(this);
    this.pwList.setOnItemLongClickListener(this);
    this.prompt = ((TextView)findViewById(2131230751));
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
    getMenuInflater().inflate(2131165189, paramMenu);
    return true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.adapter.getCursor();
    paramAdapterView.moveToPosition(paramInt);
    this.serviceConnection.sendForDecryption(this.MainPassword, paramAdapterView.getBlob(paramAdapterView.getColumnIndex("password")), 653);
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.adapter.getCursor();
    paramAdapterView.moveToPosition(paramInt);
    this.workingRow = paramAdapterView.getInt(paramAdapterView.getColumnIndex("_id"));
    this.workingEntry = new PasswordEntry(paramAdapterView.getString(paramAdapterView.getColumnIndex("service")), paramAdapterView.getString(paramAdapterView.getColumnIndex("username")), paramAdapterView.getString(paramAdapterView.getColumnIndex("email")), null);
    this.serviceConnection.sendForDecryption(this.MainPassword, paramAdapterView.getBlob(paramAdapterView.getColumnIndex("password")), 468);
    return false;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    case 16908332: 
      onBackPressed();
      return true;
    case 2131230771: 
      openSettings();
      return true;
    }
    addEntry();
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
  
  public void sendFailed()
  {
    this.connectionError.show();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\PWList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */