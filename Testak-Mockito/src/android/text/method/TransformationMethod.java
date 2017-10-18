package android.text.method;

import android.graphics.Rect;
import android.view.View;

public abstract interface TransformationMethod
{
  public abstract CharSequence getTransformation(CharSequence paramCharSequence, View paramView);
  
  public abstract void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\method\TransformationMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */