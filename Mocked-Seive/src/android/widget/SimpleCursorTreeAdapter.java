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
/*    */ public abstract class SimpleCursorTreeAdapter
/*    */   extends ResourceCursorTreeAdapter
/*    */ {
/*    */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String[] groupFrom, int[] groupTo, int childLayout, int lastChildLayout, String[] childFrom, int[] childTo)
/*    */   {
/* 25 */     super((Context)null, (Cursor)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, String[] groupFrom, int[] groupTo, int childLayout, String[] childFrom, int[] childTo) { super((Context)null, (Cursor)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public SimpleCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, String[] groupFrom, int[] groupTo, int childLayout, String[] childFrom, int[] childTo) { super((Context)null, (Cursor)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
/* 30 */   protected void bindChildView(View view, Context context, Cursor cursor, boolean isLastChild) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void bindGroupView(View view, Context context, Cursor cursor, boolean isExpanded) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Cursor paramCursor, int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\SimpleCursorTreeAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */