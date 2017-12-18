package com.spring.bird.anycut;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Resources;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c.a;
import java.io.InputStream;

public class CreateShortcutActivity
  extends ListActivity
  implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener
{
  private Intent a;
  
  private Intent a(Intent paramIntent, int paramInt, String paramString1, String paramString2)
  {
    Uri localUri = paramIntent.getData();
    Cursor localCursor = getContentResolver().query(localUri, null, null, null, null);
    try
    {
      localCursor.moveToFirst();
      String str1 = localCursor.getString(localCursor.getColumnIndex("_id"));
      String str2 = localCursor.getString(localCursor.getColumnIndex("display_name"));
      String str3 = a(localCursor);
      if (localCursor != null) {
        localCursor.close();
      }
      Intent localIntent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent.putExtra("android.intent.extra.shortcut.ICON", a(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, Long.parseLong(str1)), 2, paramInt, null));
      localIntent.putExtra("android.intent.extra.shortcut.INTENT", new Intent(paramString2, Uri.fromParts(paramString1, str3, null)));
      localIntent.putExtra("android.intent.extra.shortcut.NAME", str2);
      return localIntent;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  private Bitmap a(Resources paramResources, int paramInt)
  {
    Drawable localDrawable = paramResources.getDrawable(paramInt);
    if ((localDrawable instanceof BitmapDrawable)) {
      return ((BitmapDrawable)localDrawable).getBitmap();
    }
    return null;
  }
  
  private Bitmap a(Uri paramUri, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    Resources localResources = getResources();
    ContentResolver localContentResolver = getContentResolver();
    String str;
    try
    {
      InputStream localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, paramUri);
      if (localInputStream != null)
      {
        Bitmap localBitmap3 = BitmapFactory.decodeStream(localInputStream);
        paramBitmap = localBitmap3;
      }
      localBitmap1 = paramBitmap;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i;
        Bitmap localBitmap2;
        Canvas localCanvas;
        Paint localPaint1;
        localException.printStackTrace();
        Bitmap localBitmap1 = paramBitmap;
      }
    }
    if (localBitmap1 == null)
    {
      localBitmap1 = a(localResources, paramInt2);
      if (localBitmap1 == null) {}
    }
    else
    {
      i = (int)localResources.getDimension(17104896);
      localBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
      localCanvas = new Canvas(localBitmap2);
      localPaint1 = new Paint();
      localPaint1.setDither(true);
      localPaint1.setFilterBitmap(true);
      localCanvas.drawBitmap(localBitmap1, new Rect(0, 0, localBitmap1.getWidth(), localBitmap1.getHeight()), new Rect(0, 0, i, i), localPaint1);
      str = null;
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      if (str != null)
      {
        Paint localPaint2 = new Paint(257);
        localPaint2.setTextSize(20.0F);
        localPaint2.setTypeface(Typeface.DEFAULT_BOLD);
        localPaint2.setColor(localResources.getColor(2131427403));
        localPaint2.setShadowLayer(3.0F, 1.0F, 1.0F, localResources.getColor(2131427404));
        localCanvas.drawText(str, 2.0F, 16.0F, localPaint2);
      }
      return localBitmap2;
      return null;
      str = "H";
      continue;
      str = "M";
      continue;
      str = "W";
      continue;
      str = "P";
      continue;
      str = "O";
    }
  }
  
  private String a(Cursor paramCursor)
  {
    if (paramCursor.getInt(paramCursor.getColumnIndex("has_phone_number")) > 0)
    {
      String str = paramCursor.getString(paramCursor.getColumnIndex("_id"));
      Cursor localCursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = " + str, null, null);
      if (localCursor.moveToFirst())
      {
        Object localObject2;
        for (Object localObject1 = ""; !localCursor.isAfterLast(); localObject1 = localObject2)
        {
          int i = localCursor.getColumnIndex("data1");
          int j = localCursor.getInt(localCursor.getColumnIndex("data2"));
          localObject2 = localCursor.getString(i);
          switch (j)
          {
          default: 
            localObject2 = localObject1;
          }
          localCursor.moveToNext();
        }
        if (!localCursor.isClosed()) {
          localCursor.close();
        }
        return (String)localObject1;
      }
    }
    return "";
  }
  
  private void a()
  {
    new AlertDialog.Builder(this).setTitle(2131034186).setMessage(2131034173).setIcon(2130837579).setPositiveButton(2131034176, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Toast.makeText(CreateShortcutActivity.this, 2131034177, 0).show();
      }
    }).setNegativeButton(2131034174, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Toast.makeText(CreateShortcutActivity.this, 2131034175, 1).show();
      }
    }).show();
  }
  
  private void a(Intent paramIntent)
  {
    this.a = paramIntent;
    showDialog(1);
  }
  
  private boolean a(String paramString)
  {
    return true;
  }
  
  private void b(String paramString)
  {
    getSharedPreferences("showed", 0).edit().putBoolean(paramString, true).commit();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      return;
    case 1: 
      a(a(paramIntent, 2130837624, "tel", "android.intent.action.CALL"));
      return;
    case 2: 
      a(a(paramIntent, 2130837625, "smsto", "android.intent.action.SENDTO"));
      return;
    }
    a(paramIntent);
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    removeDialog(1);
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      setResult(-1, ((a)paramDialogInterface).a());
      finish();
    }
    removeDialog(1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903068);
    setListAdapter(ArrayAdapter.createFromResource(this, 2131296256, 17367043));
    ((AdView)findViewById(2131492961)).a(new c.a().a());
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return super.onCreateDialog(paramInt);
    }
    return new a(this, this, this);
  }
  
  protected void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      if (a("tel"))
      {
        Intent localIntent4 = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        localIntent4.putExtra("com.android.contacts.extra.TITLE_EXTRA", getText(2131034167));
        startActivityForResult(localIntent4, 1);
        return;
      }
      b("tel");
      a();
      return;
    case 1: 
      if (a("sms"))
      {
        Intent localIntent3 = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
        localIntent3.putExtra("com.android.contacts.extra.TITLE_EXTRA", getText(2131034185));
        startActivityForResult(localIntent3, 2);
        return;
      }
      b("sms");
      a();
      return;
    case 2: 
      if (a("func"))
      {
        Intent localIntent2 = new Intent();
        localIntent2.setClass(this, ActivityPickerActivity.class);
        startActivityForResult(localIntent2, 3);
        return;
      }
      b("func");
      a();
      return;
    }
    Intent localIntent1 = new Intent();
    localIntent1.setClass(this, CustomShortcutCreatorActivity.class);
    startActivityForResult(localIntent1, 4);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    }
    do
    {
      return;
    } while (this.a == null);
    ((a)paramDialog).a(this.a);
    this.a = null;
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\spring\bird\anycut\CreateShortcutActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */