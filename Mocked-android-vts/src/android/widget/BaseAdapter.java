/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
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
/*    */ 
/*    */ public abstract class BaseAdapter
/*    */   implements ListAdapter, SpinnerAdapter
/*    */ {
/* 21 */   public BaseAdapter() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); }
/* 23 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 24 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 25 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 26 */   public void notifyDataSetInvalidated() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isEnabled(int position) { throw new RuntimeException("Stub!"); }
/* 29 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getItemViewType(int position) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getViewTypeCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\BaseAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */