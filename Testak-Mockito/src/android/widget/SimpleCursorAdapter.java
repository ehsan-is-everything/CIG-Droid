/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SimpleCursorAdapter
/*    */   extends ResourceCursorAdapter
/*    */ {
/*    */   @Deprecated
/*    */   public SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to)
/*    */   {
/* 30 */     super((Context)null, 0, (Cursor)null, 0);throw new RuntimeException("Stub!"); }
/* 31 */   public SimpleCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags) { super((Context)null, 0, (Cursor)null, 0);throw new RuntimeException("Stub!"); }
/* 32 */   public void bindView(View view, Context context, Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 33 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getStringConversionColumn() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setStringConversionColumn(int stringConversionColumn) { throw new RuntimeException("Stub!"); }
/* 39 */   public CursorToStringConverter getCursorToStringConverter() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) { throw new RuntimeException("Stub!"); }
/* 41 */   public CharSequence convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 42 */   public Cursor swapCursor(Cursor c) { throw new RuntimeException("Stub!"); }
/* 43 */   public void changeCursorAndColumns(Cursor c, String[] from, int[] to) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface CursorToStringConverter
/*    */   {
/*    */     public abstract CharSequence convertToString(Cursor paramCursor);
/*    */   }
/*    */   
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Cursor paramCursor, int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\SimpleCursorAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */