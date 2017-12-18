package com.spring.bird.anycut;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class CustomShortcutCreatorActivity
  extends Activity
  implements View.OnClickListener
{
  private Intent a()
  {
    Intent localIntent = new Intent();
    localIntent.setAction(((EditText)findViewById(2131492954)).getText().toString());
    String str1 = ((EditText)findViewById(2131492955)).getText().toString();
    String str2 = ((EditText)findViewById(2131492956)).getText().toString();
    boolean bool1 = TextUtils.isEmpty(str1);
    boolean bool2 = TextUtils.isEmpty(str2);
    if ((!bool1) && (bool2)) {
      localIntent.setData(Uri.parse(str1));
    }
    for (;;)
    {
      return new Intent().putExtra("android.intent.extra.shortcut.INTENT", localIntent);
      if ((!bool2) && (bool1)) {
        localIntent.setType(str2);
      } else if ((!bool2) && (!bool1)) {
        localIntent.setDataAndType(Uri.parse(str1), str2);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131492957: 
      setResult(-1, a());
      finish();
      return;
    }
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903066);
    findViewById(2131492957).setOnClickListener(this);
    findViewById(2131492958).setOnClickListener(this);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\spring\bird\anycut\CustomShortcutCreatorActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */