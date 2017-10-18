/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
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
/*    */ public abstract class BaseExpandableListAdapter
/*    */   implements ExpandableListAdapter, HeterogeneousExpandableList
/*    */ {
/* 21 */   public BaseExpandableListAdapter() { throw new RuntimeException("Stub!"); }
/* 22 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 23 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 24 */   public void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
/* 25 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onGroupCollapsed(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onGroupExpanded(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 29 */   public long getCombinedChildId(long groupId, long childId) { throw new RuntimeException("Stub!"); }
/* 30 */   public long getCombinedGroupId(long groupId) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getChildType(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getChildTypeCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getGroupType(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getGroupTypeCount() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\BaseExpandableListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */