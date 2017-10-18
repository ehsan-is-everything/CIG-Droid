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
/*    */ public abstract class CursorAdapter
/*    */   extends BaseAdapter
/*    */   implements Filterable, ThemedSpinnerAdapter
/*    */ {
/*    */   @Deprecated
/*    */   public static final int FLAG_AUTO_REQUERY = 1;
/*    */   public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
/*    */   
/*    */   @Deprecated
/* 23 */   public CursorAdapter(Context context, Cursor c) { throw new RuntimeException("Stub!"); }
/* 24 */   public CursorAdapter(Context context, Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
/* 25 */   public CursorAdapter(Context context, Cursor c, int flags) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 27 */   protected void init(Context context, Cursor c, boolean autoRequery) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setDropDownViewTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 29 */   public Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
/* 30 */   public Cursor getCursor() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); }
/* 33 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); }
/* 35 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 36 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*    */   public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
/* 38 */   public View newDropDownView(Context context, Cursor cursor, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void bindView(View paramView, Context paramContext, Cursor paramCursor);
/* 40 */   public void changeCursor(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 41 */   public Cursor swapCursor(Cursor newCursor) { throw new RuntimeException("Stub!"); }
/* 42 */   public CharSequence convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 43 */   public Cursor runQueryOnBackgroundThread(CharSequence constraint) { throw new RuntimeException("Stub!"); }
/* 44 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 45 */   public FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); }
/* 47 */   protected void onContentChanged() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\CursorAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */