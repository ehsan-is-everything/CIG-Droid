package com.mwr.example.sieve;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShortLoginActivity
  extends Activity
  implements AuthServiceConnector.ResponseListener
{
  public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
  public static final String PIN = "com.mwr.example.sieve.PIN";
  public static final String TAG = "m_ShortLogin";
  private AlertDialog.Builder connectionError;
  private String mainKey = null;
  private TextView prompt;
  private EditText pwEntry;
  private AuthServiceConnector serviceConnection;
  private Button submitButton;
  private String workingPIN = null;
  
  private void unbind()
  {
    unbindService(this.serviceConnection);
  }
  
  public void checkKeyResult(boolean paramBoolean)
  {
    Log.wtf("m_ShortLogin", "called checkKeyResult?");
  }
  
  public void checkPinResult(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      loginSuccessful();
      return;
    }
    loginFailed();
  }
  
  public void connected()
  {
    this.submitButton.setEnabled(true);
  }
  
  public void firstLaunchResult(int paramInt)
  {
    Log.wtf("m_ShortLogin", "called firstLaunchResult?");
  }
  
  public void loginFailed()
  {
    this.prompt.setText(2131034176);
    this.submitButton.setEnabled(true);
  }
  
  public void loginSuccessful()
  {
    this.submitButton.setEnabled(true);
    Intent localIntent = new Intent(this, PWList.class);
    localIntent.putExtra("com.mwr.example.sieve.KEY", this.mainKey);
    startActivity(localIntent);
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
    setContentView(2130903046);
    this.serviceConnection = new AuthServiceConnector(this);
    this.mainKey = getIntent().getStringExtra("com.mwr.example.sieve.PASSWORD");
    this.pwEntry = ((EditText)findViewById(2131230759));
    this.prompt = ((TextView)findViewById(2131230761));
    this.submitButton = ((Button)findViewById(2131230760));
    this.connectionError = new AlertDialog.Builder(this);
    this.connectionError.setMessage(2131034120).setTitle("Error");
    this.connectionError.setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.connectionError.create();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165191, paramMenu);
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
  }
  
  public void sendFailed()
  {
    this.connectionError.show();
  }
  
  public void setKeyResult(boolean paramBoolean)
  {
    Log.wtf("m_ShortLogin", "called setKeyResult?");
  }
  
  public void setPinResult(boolean paramBoolean)
  {
    Log.wtf("m_ShortLogin", "called setPinResult?");
  }
  
  public void submit(View paramView)
  {
    this.workingPIN = this.pwEntry.getText().toString();
    Log.d("m_ShortLogin", "user has entered a pin: " + this.workingPIN);
    this.serviceConnection.checkPin(this.workingPIN);
    this.submitButton.setEnabled(false);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\ShortLoginActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */