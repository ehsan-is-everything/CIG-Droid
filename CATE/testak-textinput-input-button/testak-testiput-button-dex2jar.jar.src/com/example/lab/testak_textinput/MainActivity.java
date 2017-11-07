package com.example.lab.testak_textinput;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    setSupportActionBar((Toolbar)findViewById(2131492973));
    final String str = ((EditText)findViewById(2131492976)).getText().toString();
    ((FloatingActionButton)findViewById(2131492974)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Snackbar.make(paramAnonymousView, "Replace with your own action", 0).setAction("Action", null).show();
      }
    });
    ((Button)findViewById(2131492977)).setOnClickListener(new View.OnClickListener()
    {
      static
      {
        if (!MainActivity.class.desiredAssertionStatus()) {}
        for (boolean bool = true;; bool = false)
        {
          $assertionsDisabled = bool;
          return;
        }
      }
      
      public void onClick(View paramAnonymousView)
      {
        if ((str.charAt(0) == 'a') && (!$assertionsDisabled)) {
          throw new AssertionError();
        }
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131558400, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131493001) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              C:\Users\Lab\Desktop\testak-testiput-button-dex2jar.jar!\com\example\lab\testak_textinput\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */