package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddEntryActivity
  extends Activity
{
  public static final String ENTRY = "com.mwr.example.sieve.ENTRY";
  public static final String REQUEST = "com.mwr.example.sieve.REQUEST";
  public static final int REQUEST_ADD = 4365;
  public static final int REQUEST_EDIT = 2346;
  private static final String TAG = "m_AddEntry";
  AlertDialog.Builder ausDelete;
  private EditText editEmail;
  private EditText editPassword;
  private EditText editPasswordAgain;
  private EditText editService;
  private EditText editUsername;
  private TextView prompt;
  private int requestCode = 0;
  Intent resultIntent;
  
  private void cancel()
  {
    this.resultIntent = new Intent(this, PWList.class);
    setResult(0, this.resultIntent);
    finish();
  }
  
  private void fillData(PasswordEntry paramPasswordEntry)
  {
    this.editService.setText(paramPasswordEntry.service);
    this.editUsername.setText(paramPasswordEntry.username);
    this.editEmail.setText(paramPasswordEntry.email);
    this.editPassword.setText(paramPasswordEntry.password);
    this.editPasswordAgain.setText(paramPasswordEntry.password);
  }
  
  private void returnForDelete()
  {
    this.resultIntent = new Intent(this, PWList.class);
    setResult(-1, this.resultIntent);
    finish();
  }
  
  private void returnToActivity()
  {
    String str1 = this.editService.getText().toString();
    String str2 = this.editUsername.getText().toString();
    String str3 = this.editEmail.getText().toString();
    String str4 = this.editPassword.getText().toString();
    String str5 = this.editPasswordAgain.getText().toString();
    if ((str4 == null) || (str4.equals("")))
    {
      this.prompt.setText(2131034176);
      return;
    }
    if (!str4.equals(str5))
    {
      this.prompt.setText(2131034160);
      return;
    }
    if (str4.length() < 4)
    {
      this.prompt.setText(2131034176);
      return;
    }
    this.resultIntent.putExtra("com.mwr.example.sieve.ENTRY", new PasswordEntry(str1, str2, str3, str4));
    setResult(-1, this.resultIntent);
    finish();
  }
  
  public void cancel(View paramView)
  {
    cancel();
  }
  
  public void onBackPressed()
  {
    cancel();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    this.editService = ((EditText)findViewById(2131230721));
    this.editUsername = ((EditText)findViewById(2131230722));
    this.editEmail = ((EditText)findViewById(2131230724));
    this.editPassword = ((EditText)findViewById(2131230727));
    this.editPasswordAgain = ((EditText)findViewById(2131230726));
    this.prompt = ((TextView)findViewById(2131230732));
    this.ausDelete = new AlertDialog.Builder(this);
    this.ausDelete.setMessage(2131034128).setTitle("Confirm");
    this.ausDelete.setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AddEntryActivity.this.returnForDelete();
      }
    });
    this.ausDelete.setNegativeButton("No", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
    this.ausDelete.create();
    this.resultIntent = getIntent();
    if (this.resultIntent == null) {
      Log.e("m_AddEntry", "requestIntent = null");
    }
    this.requestCode = this.resultIntent.getIntExtra("com.mwr.example.sieve.REQUEST", 0);
    switch (this.requestCode)
    {
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 14) {
        getActionBar().setHomeButtonEnabled(true);
      }
      return;
      fillData((PasswordEntry)this.resultIntent.getParcelableExtra("com.mwr.example.sieve.ENTRY"));
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    switch (this.requestCode)
    {
    }
    for (;;)
    {
      getMenuInflater().inflate(2131165184, paramMenu);
      return true;
      getMenuInflater().inflate(2131165185, paramMenu);
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    case 16908332: 
      cancel();
      return true;
    }
    this.ausDelete.show();
    return true;
  }
  
  public void save(View paramView)
  {
    returnToActivity();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\AddEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */