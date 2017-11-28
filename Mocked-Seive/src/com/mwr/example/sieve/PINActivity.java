package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PINActivity
  extends Activity
{
  public static final String PIN = "com.mwr.example.sieve.PIN";
  public static final String REQUEST = "com.mwr.example.sieve.REQUEST";
  public static final int REQUEST_ADD = 432987;
  public static final int REQUEST_EDIT = 92635;
  private String currentPIN = null;
  private EditText entryOne;
  private EditText entryThree;
  private EditText entryTwo;
  private TextView prompt;
  private int requestCode;
  Intent resultIntent;
  
  private void cancel()
  {
    this.resultIntent = new Intent(this, MainLoginActivity.class);
    setResult(0, this.resultIntent);
    finish();
  }
  
  private void submitEdit()
  {
    String str1 = this.entryOne.getText().toString();
    String str2 = this.entryTwo.getText().toString();
    String str3 = this.entryThree.getText().toString();
    boolean bool = Pattern.compile("[^0-9]").matcher(str1).find();
    if (str3.equals(this.currentPIN))
    {
      if (str1.length() == 4)
      {
        if (!bool)
        {
          if (str1.equals(str2))
          {
            this.resultIntent = new Intent(this, MainLoginActivity.class);
            this.resultIntent.putExtra("com.mwr.example.sieve.PIN", str1);
            setResult(-1, this.resultIntent);
            finish();
            return;
          }
          this.prompt.setText(2131034155);
          return;
        }
        this.prompt.setText(2131034153);
        return;
      }
      this.prompt.setText(2131034154);
      return;
    }
    this.prompt.setText(2131034156);
  }
  
  private void submitEntry()
  {
    String str1 = this.entryOne.getText().toString();
    String str2 = this.entryTwo.getText().toString();
    boolean bool = Pattern.compile("[^0-9]").matcher(str1).find();
    if (str1.length() == 4)
    {
      if (!bool)
      {
        if (str1.equals(str2))
        {
          this.resultIntent = new Intent(this, MainLoginActivity.class);
          this.resultIntent.putExtra("com.mwr.example.sieve.PIN", str1);
          setResult(-1, this.resultIntent);
          finish();
          return;
        }
        this.prompt.setText(2131034155);
        return;
      }
      this.prompt.setText(2131034153);
      return;
    }
    this.prompt.setText(2131034154);
  }
  
  public void onBackPressed()
  {
    cancel();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903043);
    this.entryOne = ((EditText)findViewById(2131230741));
    this.entryTwo = ((EditText)findViewById(2131230742));
    this.entryThree = ((EditText)findViewById(2131230748));
    this.prompt = ((TextView)findViewById(2131230747));
    paramBundle = getIntent();
    this.requestCode = paramBundle.getIntExtra("com.mwr.example.sieve.REQUEST", 0);
    switch (this.requestCode)
    {
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 14) {
        getActionBar().setHomeButtonEnabled(true);
      }
      return;
      this.currentPIN = paramBundle.getStringExtra("com.mwr.example.sieve.PIN");
      continue;
      ((TextView)findViewById(2131230749)).setVisibility(4);
      ((EditText)findViewById(2131230748)).setVisibility(4);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165188, paramMenu);
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
  
  public void submit(View paramView)
  {
    switch (this.requestCode)
    {
    default: 
      return;
    case 92635: 
      submitEdit();
      return;
    }
    submitEntry();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\PINActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */