package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainLoginActivity
  extends Activity
  implements AuthServiceConnector.ResponseListener
{
  private static final int IS_AUTHENTICATED = 4521387;
  public static final int MAIN_PIN = 2;
  public static final int MAIN_SETTINGS = 3;
  public static final int MAIN_WELCOME = 1;
  private static final int NOT_AUTHENTICATED = 654987;
  private static final int NOT_INITALISED = 923472;
  public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
  public static final String PIN = "com.mwr.example.sieve.PIN";
  private static final String TAG = "m_MainLogin";
  EditText entry;
  Button login_button;
  TextView prompt;
  private AuthServiceConnector serviceConnection;
  private int state = 923472;
  private Intent workingIntent = null;
  private String workingPassword = null;
  
  private void initaliseActivity()
  {
    setContentView(2130903042);
    this.entry = ((EditText)findViewById(2131230737));
    this.login_button = ((Button)findViewById(2131230736));
    this.prompt = ((TextView)findViewById(2131230739));
  }
  
  private void loginFailed()
  {
    this.prompt.setText(2131034176);
    this.login_button.setEnabled(true);
  }
  
  private void loginSuccessful()
  {
    this.login_button.setEnabled(true);
    Intent localIntent = new Intent(this, PWList.class);
    localIntent.putExtra("com.mwr.example.sieve.KEY", this.workingPassword);
    localIntent.setFlags(67108864);
    this.state = 4521387;
    startActivity(localIntent);
  }
  
  private void openSettings()
  {
    startActivityForResult(new Intent(this, SettingsActivity.class), 3);
  }
  
  private void setPin()
  {
    Intent localIntent = new Intent(this, PINActivity.class);
    localIntent.putExtra("com.mwr.example.sieve.REQUEST", 432987);
    startActivityForResult(localIntent, 2);
  }
  
  private void unbind()
  {
    unbindService(this.serviceConnection);
  }
  
  private void welcomeUser()
  {
    startActivityForResult(new Intent(this, WelcomeActivity.class), 1);
  }
  
  public void checkKeyResult(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      loginSuccessful();
      return;
    }
    loginFailed();
  }
  
  public void checkPinResult(boolean paramBoolean) {}
  
  public void connected()
  {
    this.serviceConnection.checkFirstLaunch();
  }
  
  public void firstLaunchResult(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 33: 
      welcomeUser();
      return;
    case 32: 
      setPin();
      return;
    }
    initaliseActivity();
  }
  
  public void login(View paramView)
  {
    this.workingPassword = this.entry.getText().toString();
    Log.d("m_MainLogin", "String enetered: " + this.workingPassword);
    this.serviceConnection.checkKey(this.workingPassword);
    this.login_button.setEnabled(false);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        return;
      } while (paramInt2 != -1);
      this.workingIntent = paramIntent;
      return;
    } while (paramInt2 != -1);
    this.workingIntent = paramIntent;
  }
  
  public void onBackPressed()
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.addCategory("android.intent.category.HOME");
    startActivity(localIntent);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.serviceConnection = new AuthServiceConnector(this);
    this.state = 654987;
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165187, paramMenu);
    return true;
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
    }
    openSettings();
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
    bindService(new Intent(this, AuthService.class), this.serviceConnection, 1);
    switch (this.state)
    {
    default: 
    case 654987: 
    case 923472: 
      do
      {
        return;
      } while (this.workingIntent == null);
      if (this.workingIntent.getStringExtra("com.mwr.example.sieve.PASS") != null) {
        this.serviceConnection.setKey(this.workingIntent.getStringExtra("com.mwr.example.sieve.PASS"));
      }
      for (;;)
      {
        this.workingIntent = null;
        return;
        if (this.workingIntent.getStringExtra("com.mwr.example.sieve.PIN") != null) {
          this.serviceConnection.setPin(this.workingIntent.getStringExtra("com.mwr.example.sieve.PIN"));
        }
      }
    }
    startActivity(new Intent(this, ShortLoginActivity.class).putExtra("com.mwr.example.sieve.PASSWORD", this.workingPassword));
  }
  
  protected void onStart()
  {
    super.onStart();
    startService(new Intent(this, AuthService.class));
  }
  
  public void sendFailed()
  {
    new AlertDialog.Builder(this).setMessage(2131034120).setTitle("Error").setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).create().show();
  }
  
  public void setKeyResult(boolean paramBoolean)
  {
    if (!paramBoolean) {
      sendFailed();
    }
  }
  
  public void setPinResult(boolean paramBoolean)
  {
    if (!paramBoolean) {
      sendFailed();
    }
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\MainLoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */