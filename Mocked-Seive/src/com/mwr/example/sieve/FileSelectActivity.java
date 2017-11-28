package com.mwr.example.sieve;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSelectActivity
  extends Activity
  implements AdapterView.OnItemClickListener
{
  public static final String FILE = "com.mwr.example.sieve.FILE";
  private static final String root = "/";
  private TextView currentPath;
  private List<String> item = null;
  private List<String> path = null;
  private ListView pathList;
  private Intent resultIntent;
  private String startingPath;
  
  private void cancel()
  {
    this.resultIntent = new Intent(this, SettingsActivity.class);
    setResult(0, this.resultIntent);
    finish();
  }
  
  private void processDir(String paramString)
  {
    this.currentPath.setText(paramString);
    this.item = new ArrayList();
    this.path = new ArrayList();
    File localFile = new File(paramString);
    File[] arrayOfFile = localFile.listFiles();
    if (!paramString.equals("/"))
    {
      this.item.add("/");
      this.path.add("/");
      this.item.add("../");
      this.path.add(localFile.getParent());
    }
    int i = 0;
    if (i >= arrayOfFile.length)
    {
      paramString = new ArrayAdapter(this, 17367043, this.item);
      this.pathList.setAdapter(paramString);
      this.pathList.setOnItemClickListener(this);
      return;
    }
    paramString = arrayOfFile[i];
    this.path.add(paramString.getPath());
    if (paramString.isDirectory()) {
      this.item.add(paramString.getName() + "/");
    }
    for (;;)
    {
      i += 1;
      break;
      this.item.add(paramString.getName());
    }
  }
  
  private void returnFile(String paramString)
  {
    this.resultIntent = new Intent(this, SettingsActivity.class);
    this.resultIntent.putExtra("com.mwr.example.sieve.FILE", paramString);
    setResult(-1, this.resultIntent);
    finish();
  }
  
  public void onBackPressed()
  {
    cancel();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    getActionBar().setDisplayHomeAsUpEnabled(true);
    this.startingPath = getExternalFilesDir(null).getPath();
    this.currentPath = ((TextView)findViewById(2131230734));
    this.pathList = ((ListView)findViewById(2131230735));
    if (Build.VERSION.SDK_INT >= 14) {
      getActionBar().setHomeButtonEnabled(true);
    }
    processDir(this.startingPath);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165186, paramMenu);
    return true;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new File((String)this.path.get(paramInt));
    if (paramAdapterView.isDirectory()) {
      if (paramAdapterView.canRead()) {
        processDir((String)this.path.get(paramInt));
      }
    }
    while ((!paramAdapterView.toString().endsWith(".xml")) && (!paramAdapterView.toString().endsWith(".XML")))
    {
      return;
      new AlertDialog.Builder(this).setIcon(2130837504).setTitle("[" + paramAdapterView.getName() + "] folder can't be read!").setPositiveButton("OK", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
      }).show();
      return;
    }
    returnFile(paramAdapterView.getAbsolutePath().toString());
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    cancel();
    return true;
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\FileSelectActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */