/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.os.Bundle;
/*    */ import android.widget.DatePicker;
/*    */ import android.widget.DatePicker.OnDateChangedListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DatePickerDialog
/*    */   extends AlertDialog
/*    */   implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener
/*    */ {
/*    */   public DatePickerDialog(Context context)
/*    */   {
/* 26 */     super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public DatePickerDialog(Context context, int themeResId) { super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public DatePickerDialog(Context context, OnDateSetListener listener, int year, int month, int dayOfMonth) { super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public DatePickerDialog(Context context, int themeResId, OnDateSetListener listener, int year, int monthOfYear, int dayOfMonth) { super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public void onDateChanged(DatePicker view, int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setOnDateSetListener(OnDateSetListener listener) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
/* 33 */   public DatePicker getDatePicker() { throw new RuntimeException("Stub!"); }
/* 34 */   public void updateDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 35 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 36 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDateSetListener
/*    */   {
/*    */     public abstract void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\DatePickerDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */