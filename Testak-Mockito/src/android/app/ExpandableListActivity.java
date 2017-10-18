/*    */ package android.app;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.view.ContextMenu;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.View;
/*    */ import android.view.View.OnCreateContextMenuListener;
/*    */ import android.widget.ExpandableListAdapter;
/*    */ import android.widget.ExpandableListView;
/*    */ import android.widget.ExpandableListView.OnChildClickListener;
/*    */ import android.widget.ExpandableListView.OnGroupCollapseListener;
/*    */ import android.widget.ExpandableListView.OnGroupExpandListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExpandableListActivity
/*    */   extends Activity
/*    */   implements View.OnCreateContextMenuListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener
/*    */ {
/* 22 */   public ExpandableListActivity() { throw new RuntimeException("Stub!"); }
/* 23 */   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onGroupCollapse(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onGroupExpand(int groupPosition) { throw new RuntimeException("Stub!"); }
/* 27 */   protected void onRestoreInstanceState(Bundle state) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setListAdapter(ExpandableListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 30 */   public ExpandableListView getExpandableListView() { throw new RuntimeException("Stub!"); }
/* 31 */   public ExpandableListAdapter getExpandableListAdapter() { throw new RuntimeException("Stub!"); }
/* 32 */   public long getSelectedId() { throw new RuntimeException("Stub!"); }
/* 33 */   public long getSelectedPosition() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean setSelectedChild(int groupPosition, int childPosition, boolean shouldExpandGroup) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setSelectedGroup(int groupPosition) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\ExpandableListActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */