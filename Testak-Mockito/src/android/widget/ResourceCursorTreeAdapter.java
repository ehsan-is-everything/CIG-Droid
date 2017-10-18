/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.Cursor;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ResourceCursorTreeAdapter
/*    */   extends CursorTreeAdapter
/*    */ {
/*    */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout, int lastChildLayout)
/*    */   {
/* 21 */     super((Cursor)null, (Context)null, false);throw new RuntimeException("Stub!"); }
/* 22 */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int collapsedGroupLayout, int expandedGroupLayout, int childLayout) { super((Cursor)null, (Context)null, false);throw new RuntimeException("Stub!"); }
/* 23 */   public ResourceCursorTreeAdapter(Context context, Cursor cursor, int groupLayout, int childLayout) { super((Cursor)null, (Context)null, false);throw new RuntimeException("Stub!"); }
/* 24 */   public View newChildView(Context context, Cursor cursor, boolean isLastChild, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 25 */   public View newGroupView(Context context, Cursor cursor, boolean isExpanded, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\ResourceCursorTreeAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */