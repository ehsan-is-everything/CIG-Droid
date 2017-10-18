/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
/*    */ 
/*    */ public abstract interface Adapter {
/*    */   public static final int IGNORE_ITEM_VIEW_TYPE = -1;
/*    */   public static final int NO_SELECTION = Integer.MIN_VALUE;
/*    */   
/*    */   public abstract void registerDataSetObserver(DataSetObserver paramDataSetObserver);
/*    */   
/*    */   public abstract void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);
/*    */   
/*    */   public abstract int getCount();
/*    */   
/*    */   public abstract Object getItem(int paramInt);
/*    */   
/*    */   public abstract long getItemId(int paramInt);
/*    */   
/*    */   public abstract boolean hasStableIds();
/*    */   
/*    */   public abstract android.view.View getView(int paramInt, android.view.View paramView, android.view.ViewGroup paramViewGroup);
/*    */   
/*    */   public abstract int getItemViewType(int paramInt);
/*    */   
/*    */   public abstract int getViewTypeCount();
/*    */   
/*    */   public abstract boolean isEmpty();
/*    */   
/*    */   public CharSequence[] getAutofillOptions() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */