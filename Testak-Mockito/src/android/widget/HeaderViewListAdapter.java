/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.ArrayList;
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
/*    */ public class HeaderViewListAdapter
/*    */   implements WrapperListAdapter, Filterable
/*    */ {
/* 21 */   public HeaderViewListAdapter(ArrayList<ListView.FixedViewInfo> headerViewInfos, ArrayList<ListView.FixedViewInfo> footerViewInfos, ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 22 */   public int getHeadersCount() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getFootersCount() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean removeHeader(View v) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean removeFooter(View v) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean areAllItemsEnabled() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isEnabled(int position) { throw new RuntimeException("Stub!"); }
/* 30 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); }
/* 31 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean hasStableIds() { throw new RuntimeException("Stub!"); }
/* 33 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getItemViewType(int position) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getViewTypeCount() { throw new RuntimeException("Stub!"); }
/* 36 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 37 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 38 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 39 */   public ListAdapter getWrappedAdapter() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\HeaderViewListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */