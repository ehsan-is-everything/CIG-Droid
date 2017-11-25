/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
/*    */ import android.app.Dialog;
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ public abstract class DialogPreference
/*    */   extends Preference
/*    */   implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, PreferenceManager.OnActivityDestroyListener
/*    */ {
/*    */   public DialogPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 22 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public DialogPreference(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public DialogPreference(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 25 */   public DialogPreference(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 26 */   public void setDialogTitle(CharSequence dialogTitle) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setDialogTitle(int dialogTitleResId) { throw new RuntimeException("Stub!"); }
/* 28 */   public CharSequence getDialogTitle() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setDialogMessage(CharSequence dialogMessage) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setDialogMessage(int dialogMessageResId) { throw new RuntimeException("Stub!"); }
/* 31 */   public CharSequence getDialogMessage() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setDialogIcon(Drawable dialogIcon) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setDialogIcon(int dialogIconRes) { throw new RuntimeException("Stub!"); }
/* 34 */   public Drawable getDialogIcon() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setPositiveButtonText(CharSequence positiveButtonText) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setPositiveButtonText(int positiveButtonTextResId) { throw new RuntimeException("Stub!"); }
/* 37 */   public CharSequence getPositiveButtonText() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setNegativeButtonText(CharSequence negativeButtonText) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setNegativeButtonText(int negativeButtonTextResId) { throw new RuntimeException("Stub!"); }
/* 40 */   public CharSequence getNegativeButtonText() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setDialogLayoutResource(int dialogLayoutResId) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getDialogLayoutResource() { throw new RuntimeException("Stub!"); }
/* 43 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); }
/* 44 */   protected void onClick() { throw new RuntimeException("Stub!"); }
/* 45 */   protected void showDialog(Bundle state) { throw new RuntimeException("Stub!"); }
/* 46 */   protected View onCreateDialogView() { throw new RuntimeException("Stub!"); }
/* 47 */   protected void onBindDialogView(View view) { throw new RuntimeException("Stub!"); }
/* 48 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); }
/* 50 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); }
/* 51 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); }
/* 52 */   public void onActivityDestroy() { throw new RuntimeException("Stub!"); }
/* 53 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 54 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\DialogPreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */