/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources.Theme;
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
/*    */ public abstract class ResourceCursorAdapter
/*    */   extends CursorAdapter
/*    */ {
/*    */   @Deprecated
/*    */   public ResourceCursorAdapter(Context context, int layout, Cursor c)
/*    */   {
/* 22 */     super((Context)null, (Cursor)null, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public ResourceCursorAdapter(Context context, int layout, Cursor c, boolean autoRequery) { super((Context)null, (Cursor)null, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public ResourceCursorAdapter(Context context, int layout, Cursor c, int flags) { super((Context)null, (Cursor)null, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public void setDropDownViewTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 26 */   public View newView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 27 */   public View newDropDownView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setViewResource(int layout) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setDropDownViewResource(int dropDownLayout) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ResourceCursorAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */