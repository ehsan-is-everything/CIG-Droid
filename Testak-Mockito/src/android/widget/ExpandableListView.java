/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
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
/*    */ public class ExpandableListView
/*    */   extends ListView
/*    */ {
/*    */   public static final int CHILD_INDICATOR_INHERIT = -1;
/*    */   public static final int PACKED_POSITION_TYPE_CHILD = 1;
/*    */   public static final int PACKED_POSITION_TYPE_GROUP = 0;
/*    */   public static final int PACKED_POSITION_TYPE_NULL = 2;
/*    */   public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
/*    */   
/*    */   public static class ExpandableListContextMenuInfo
/*    */     implements ContextMenu.ContextMenuInfo
/*    */   {
/*    */     public long id;
/*    */     public long packedPosition;
/*    */     public View targetView;
/*    */     
/*    */     public ExpandableListContextMenuInfo(View targetView, long packedPosition, long id)
/*    */     {
/* 40 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public ExpandableListView(Context context) {
/* 45 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 46 */   public ExpandableListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 47 */   public ExpandableListView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 48 */   public ExpandableListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 49 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 50 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setChildDivider(Drawable childDivider) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 53 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setAdapter(ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 56 */   public ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean performItemClick(View v, int position, long id) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean expandGroup(int groupPos) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean expandGroup(int groupPos, boolean animate) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean collapseGroup(int groupPos) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) { throw new RuntimeException("Stub!"); }
/* 64 */   public void setOnChildClickListener(OnChildClickListener onChildClickListener) { throw new RuntimeException("Stub!"); }
/* 65 */   public long getExpandableListPosition(int flatListPosition) { throw new RuntimeException("Stub!"); }
/* 66 */   public int getFlatListPosition(long packedPosition) { throw new RuntimeException("Stub!"); }
/* 67 */   public long getSelectedPosition() { throw new RuntimeException("Stub!"); }
/* 68 */   public long getSelectedId() { throw new RuntimeException("Stub!"); }
/* 69 */   public void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean isGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 72 */   public static int getPackedPositionType(long packedPosition) { throw new RuntimeException("Stub!"); }
/* 73 */   public static int getPackedPositionGroup(long packedPosition) { throw new RuntimeException("Stub!"); }
/* 74 */   public static int getPackedPositionChild(long packedPosition) { throw new RuntimeException("Stub!"); }
/* 75 */   public static long getPackedPositionForChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 76 */   public static long getPackedPositionForGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setChildIndicator(Drawable childIndicator) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setChildIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); }
/* 79 */   public void setChildIndicatorBoundsRelative(int start, int end) { throw new RuntimeException("Stub!"); }
/* 80 */   public void setGroupIndicator(Drawable groupIndicator) { throw new RuntimeException("Stub!"); }
/* 81 */   public void setIndicatorBounds(int left, int right) { throw new RuntimeException("Stub!"); }
/* 82 */   public void setIndicatorBoundsRelative(int start, int end) { throw new RuntimeException("Stub!"); }
/* 83 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 84 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 85 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnChildClickListener
/*    */   {
/*    */     public abstract boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGroupClickListener
/*    */   {
/*    */     public abstract boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, int paramInt, long paramLong);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGroupExpandListener
/*    */   {
/*    */     public abstract void onGroupExpand(int paramInt);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGroupCollapseListener
/*    */   {
/*    */     public abstract void onGroupCollapse(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\ExpandableListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */