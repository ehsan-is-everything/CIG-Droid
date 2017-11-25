package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity
  extends Activity
{
  public static final String PASS = "com.mwr.example.sieve.PASS";
  private EditText entryOne;
  private EditText entryTwo;
  private TextView prompt;
  Intent resultIntent;
  
  private void cancel()
  {
    this.resultIntent = new Intent(this, MainLoginActivity.class);
    setResult(0, this.resultIntent);
    finish();
  }
  
  public void onBackPressed()
  {
    cancel();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    if (Build.VERSION.SDK_INT >= 14) {
      getActionBar().setHomeButtonEnabled(true);
    }
    this.entryOne = ((EditText)findViewById(2131230763));
    this.entryTwo = ((EditText)findViewById(2131230765));
    this.prompt = ((TextView)findViewById(2131230766));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165192, paramMenu);
    return true;
  }
  
  public void submit(View paramView)
  {
    paramView = this.entryOne.getText().toString();
    String str = this.entryTwo.getText().toString();
    boolean bool = paramView.matches("[a-zA-Z0-9]+");
    if (paramView.length() >= 16)
    {
      if (bool)
      {
        if (paramView.equals(str))
        {
          this.resultIntent = new Intent(this, MainLoginActivity.class);
          this.resultIntent.putExtra("com.mwr.example.sieve.PASS", paramView);
          setResult(-1, this.resultIntent);
          finish();
          return;
        }
        this.prompt.setText(2131034160);
        return;
      }
      this.prompt.setText(2131034157);
      return;
    }
    this.prompt.setText(2131034159);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\WelcomeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */