/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public class SimpleExpandableListAdapter
/*    */   extends BaseExpandableListAdapter
/*    */ {
/* 21 */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int groupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
/* 22 */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
/* 23 */   public SimpleExpandableListAdapter(Context context, List<? extends Map<String, ?>> groupData, int expandedGroupLayout, int collapsedGroupLayout, String[] groupFrom, int[] groupTo, List<? extends List<? extends Map<String, ?>>> childData, int childLayout, int lastChildLayout, String[] childFrom, int[] childTo) { throw new RuntimeException("Stub!"); }
/* 24 */   public Object getChild(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 25 */   public long getChildId(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 26 */   public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 27 */   public View newChildView(boolean isLastChild, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getChildrenCount(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 29 */   public Object getGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getGroupCount() { throw new RuntimeException("Stub!"); }
/* 31 */   public long getGroupId(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 32 */   public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 33 */   public View newGroupView(boolean isExpanded, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isChildSelectable(int groupPosition, int childPosition) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\SimpleExpandableListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */