/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.view.View;
/*    */ 
/*    */ public class AlertDialog
/*    */   extends Dialog
/*    */   implements android.content.DialogInterface
/*    */ {
/*    */   @Deprecated
/*    */   public static final int THEME_DEVICE_DEFAULT_DARK = 4;
/*    */   @Deprecated
/*    */   public static final int THEME_DEVICE_DEFAULT_LIGHT = 5;
/*    */   @Deprecated
/*    */   public static final int THEME_HOLO_DARK = 2;
/*    */   @Deprecated
/*    */   public static final int THEME_HOLO_LIGHT = 3;
/*    */   @Deprecated
/*    */   public static final int THEME_TRADITIONAL = 1;
/*    */   
/*    */   public static class Builder
/*    */   {
/* 24 */     public Builder(Context context) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder(Context context, int themeResId) { throw new RuntimeException("Stub!"); }
/* 26 */     public Context getContext() { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setTitle(int titleId) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setCustomTitle(View customTitleView) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setMessage(int messageId) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setMessage(CharSequence message) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setIcon(int iconId) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setIconAttribute(int attrId) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder setPositiveButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setPositiveButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder setNegativeButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setNegativeButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 39 */     public Builder setNeutralButton(int textId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 40 */     public Builder setNeutralButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 41 */     public Builder setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); }
/* 42 */     public Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) { throw new RuntimeException("Stub!"); }
/* 43 */     public Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) { throw new RuntimeException("Stub!"); }
/* 44 */     public Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!"); }
/* 45 */     public Builder setItems(int itemsId, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 46 */     public Builder setItems(CharSequence[] items, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 47 */     public Builder setAdapter(android.widget.ListAdapter adapter, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 48 */     public Builder setCursor(android.database.Cursor cursor, DialogInterface.OnClickListener listener, String labelColumn) { throw new RuntimeException("Stub!"); }
/* 49 */     public Builder setMultiChoiceItems(int itemsId, boolean[] checkedItems, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
/* 50 */     public Builder setMultiChoiceItems(CharSequence[] items, boolean[] checkedItems, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
/* 51 */     public Builder setMultiChoiceItems(android.database.Cursor cursor, String isCheckedColumn, String labelColumn, android.content.DialogInterface.OnMultiChoiceClickListener listener) { throw new RuntimeException("Stub!"); }
/* 52 */     public Builder setSingleChoiceItems(int itemsId, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 53 */     public Builder setSingleChoiceItems(android.database.Cursor cursor, int checkedItem, String labelColumn, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 54 */     public Builder setSingleChoiceItems(CharSequence[] items, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 55 */     public Builder setSingleChoiceItems(android.widget.ListAdapter adapter, int checkedItem, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 56 */     public Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener listener) { throw new RuntimeException("Stub!"); }
/* 57 */     public Builder setView(int layoutResId) { throw new RuntimeException("Stub!"); }
/* 58 */     public Builder setView(View view) { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 60 */     public Builder setInverseBackgroundForced(boolean useInverseBackground) { throw new RuntimeException("Stub!"); }
/* 61 */     public AlertDialog create() { throw new RuntimeException("Stub!"); }
/* 62 */     public AlertDialog show() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 64 */   protected AlertDialog(Context context) { super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);throw new RuntimeException("Stub!"); }
/* 65 */   protected AlertDialog(Context context, boolean cancelable, android.content.DialogInterface.OnCancelListener cancelListener) { super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);throw new RuntimeException("Stub!"); }
/* 66 */   protected AlertDialog(Context context, int themeResId) { super((Context)null, false, (android.content.DialogInterface.OnCancelListener)null);throw new RuntimeException("Stub!"); }
/* 67 */   public android.widget.Button getButton(int whichButton) { throw new RuntimeException("Stub!"); }
/* 68 */   public android.widget.ListView getListView() { throw new RuntimeException("Stub!"); }
/* 69 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 70 */   public void setCustomTitle(View customTitleView) { throw new RuntimeException("Stub!"); }
/* 71 */   public void setMessage(CharSequence message) { throw new RuntimeException("Stub!"); }
/* 72 */   public void setView(View view) { throw new RuntimeException("Stub!"); }
/* 73 */   public void setView(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) { throw new RuntimeException("Stub!"); }
/* 74 */   public void setButton(int whichButton, CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
/* 75 */   public void setButton(int whichButton, CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 77 */   public void setButton(CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 79 */   public void setButton2(CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 81 */   public void setButton3(CharSequence text, android.os.Message msg) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 83 */   public void setButton(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 85 */   public void setButton2(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 87 */   public void setButton3(CharSequence text, DialogInterface.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 88 */   public void setIcon(int resId) { throw new RuntimeException("Stub!"); }
/* 89 */   public void setIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
/* 90 */   public void setIconAttribute(int attrId) { throw new RuntimeException("Stub!"); }
/* 91 */   public void setInverseBackgroundForced(boolean forceInverseBackground) { throw new RuntimeException("Stub!"); }
/* 92 */   protected void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 93 */   public boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\AlertDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */