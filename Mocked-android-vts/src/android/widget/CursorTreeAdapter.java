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
/*    */ 
/*    */ 
/*    */ public abstract class CursorTreeAdapter
/*    */   extends BaseExpandableListAdapter
/*    */   implements Filterable
/*    */ {
/* 22 */   public CursorTreeAdapter(Cursor cursor, Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public CursorTreeAdapter(Cursor cursor, Context context, boolean autoRequery) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract Cursor getChildrenCursor(Cursor paramCursor);
/* 25 */   public void setGroupCursor(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setChildrenCursor(int groupPosition, Cursor childrenCursor) { throw new RuntimeException("Stub!"); }
/* 27 */   public Cursor getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 28 */   public long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 30 */   public Cursor getGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getGroupCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 33 */   public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract View newGroupView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*    */   protected abstract void bindGroupView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/* 36 */   public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract View newChildView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*    */   protected abstract void bindChildView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/* 39 */   public boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); }
/* 41 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 42 */   public void notifyDataSetChanged(boolean releaseCursors) { throw new RuntimeException("Stub!"); }
/* 43 */   public void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
/* 44 */   public void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 45 */   public String convertToString(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 46 */   public Cursor runQueryOnBackgroundThread(CharSequence constraint) { throw new RuntimeException("Stub!"); }
/* 47 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 48 */   public FilterQueryProvider getFilterQueryProvider() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) { throw new RuntimeException("Stub!"); }
/* 50 */   public void changeCursor(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 51 */   public Cursor getCursor() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\CursorTreeAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */