/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import java.text.NumberFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class ProgressDialog
/*    */   extends AlertDialog
/*    */ {
/*    */   public static final int STYLE_HORIZONTAL = 1;
/*    */   public static final int STYLE_SPINNER = 0;
/*    */   
/*    */   public ProgressDialog(Context context)
/*    */   {
/* 22 */     super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public ProgressDialog(Context context, int theme) { super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public static ProgressDialog show(Context context, CharSequence title, CharSequence message) { throw new RuntimeException("Stub!"); }
/* 25 */   public static ProgressDialog show(Context context, CharSequence title, CharSequence message, boolean indeterminate) { throw new RuntimeException("Stub!"); }
/* 26 */   public static ProgressDialog show(Context context, CharSequence title, CharSequence message, boolean indeterminate, boolean cancelable) { throw new RuntimeException("Stub!"); }
/* 27 */   public static ProgressDialog show(Context context, CharSequence title, CharSequence message, boolean indeterminate, boolean cancelable, DialogInterface.OnCancelListener cancelListener) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 30 */   protected void onStop() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setProgress(int value) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getProgress() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getSecondaryProgress() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getMax() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setMax(int max) { throw new RuntimeException("Stub!"); }
/* 37 */   public void incrementProgressBy(int diff) { throw new RuntimeException("Stub!"); }
/* 38 */   public void incrementSecondaryProgressBy(int diff) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setProgressDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setIndeterminateDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isIndeterminate() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setMessage(CharSequence message) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setProgressStyle(int style) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setProgressNumberFormat(String format) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setProgressPercentFormat(NumberFormat format) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\ProgressDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */