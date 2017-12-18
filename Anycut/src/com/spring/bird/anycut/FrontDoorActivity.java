package com.spring.bird.anycut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c.a;

public class FrontDoorActivity
  extends Activity
  implements View.OnClickListener
{
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    }
    paramIntent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
    paramIntent.setFlags(0);
    sendBroadcast(paramIntent);
    Toast.makeText(this, 2131034180, 0).show();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    startActivityForResult(new Intent(this, CreateShortcutActivity.class), 1);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903067);
    View localView = findViewById(2131492959);
    if (localView != null) {
      localView.setOnClickListener(this);
    }
    ((AdView)findViewById(2131492960)).a(new c.a().a());
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


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\spring\bird\anycut\FrontDoorActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */