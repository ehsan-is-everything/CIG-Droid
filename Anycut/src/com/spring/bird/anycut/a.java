package com.spring.bird.anycut;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Resources;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class a extends AlertDialog implements DialogInterface.OnClickListener,TextWatcher
{
  private boolean a = false;
  private Intent b;
  private ImageView c;
  private EditText d;
  private DialogInterface.OnClickListener e;
  private DialogInterface.OnCancelListener f;
  
  public a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    super(paramContext);
    this.e = paramOnClickListener;
    this.f = paramOnCancelListener;
    View localView = getLayoutInflater().inflate(2130903080, null, false);
    setTitle(2131034182);
    setButton(paramContext.getText(17039370), this);
    setButton2(paramContext.getText(17039360), this.e);
    setOnCancelListener(this.f);
    setCancelable(true);
    setView(localView);
    this.c = ((ImageView)localView.findViewById(2131492975));
    this.d = ((EditText)localView.findViewById(2131492976));
  }
  
  private void setView(View localView) {
	// TODO Auto-generated method stub
	
}

private void setCancelable(boolean g) {
	// TODO Auto-generated method stub
	
}

private void setOnCancelListener(OnCancelListener f2) {
	// TODO Auto-generated method stub
	
}

private void setButton2(Object text, OnClickListener e2) {
	// TODO Auto-generated method stub
	
}

private void setButton(Object text, a a2) {
	// TODO Auto-generated method stub
	
}

private void setTitle(int i) {
	// TODO Auto-generated method stub
	
}

private void b(Intent paramIntent)
  {
    Bitmap localBitmap = (Bitmap)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON");
    if (localBitmap != null) {
      this.c.setImageBitmap(localBitmap);
    }
    for (;;)
    {
      this.d.addTextChangedListener(this);
      this.d.setText(paramIntent.getStringExtra("android.intent.extra.shortcut.NAME"));
      paramIntent.addFlags(67108864);
      return;
      Intent.ShortcutIconResource localShortcutIconResource = (Intent.ShortcutIconResource)paramIntent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
      if (localShortcutIconResource != null)
      {
        int i = getContext().getResources().getIdentifier(localShortcutIconResource.resourceName, null, localShortcutIconResource.packageName);
        this.c.setImageResource(i);
      }
      else
      {
        this.c.setVisibility(4);
      }
    }
  }
  
public Intent a()
  {
    this.b.putExtra("android.intent.extra.shortcut.NAME", this.d.getText().toString());
    return this.b;
  }
  
  public void a(Intent paramIntent)
  {
    this.b = paramIntent;
    if (this.a) {
      b(paramIntent);
    }
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.length() == 0)
    {
      this.d.setError(getContext().getText(2131034169));
      return;
    }
    this.d.setError(null);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      String str = this.d.getText().toString();
      if (TextUtils.isEmpty(str))
      {
        this.d.setError(getContext().getText(2131034169));
        return;
      }
      this.b.putExtra("android.intent.extra.shortcut.NAME", str);
    }
    this.e.onClick(paramDialogInterface, paramInt);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      this.b = ((Intent)paramBundle.getParcelable("intent"));
    }
    this.a = true;
    if (this.b != null) {
      b(this.b);
    }
  }
  
  public Bundle onSaveInstanceState()
  {
    Bundle localBundle = super.onSaveInstanceState();
    localBundle.putParcelable("intent", a());
    return localBundle;
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\spring\bird\anycut\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */