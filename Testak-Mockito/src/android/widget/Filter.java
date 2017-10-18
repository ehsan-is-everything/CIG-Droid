/*    */ package android.widget;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Filter
/*    */ {
/*    */   public static abstract interface FilterListener
/*    */   {
/*    */     public abstract void onFilterComplete(int paramInt);
/*    */   }
/*    */   
/*    */ 
/*    */   protected static class FilterResults
/*    */   {
/*    */     public int count;
/*    */     
/*    */     public Object values;
/*    */     
/*    */ 
/*    */     public FilterResults()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 30 */   public Filter() { throw new RuntimeException("Stub!"); }
/* 31 */   public final void filter(CharSequence constraint) { throw new RuntimeException("Stub!"); }
/* 32 */   public final void filter(CharSequence constraint, FilterListener listener) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract FilterResults performFiltering(CharSequence paramCharSequence);
/*    */   protected abstract void publishResults(CharSequence paramCharSequence, FilterResults paramFilterResults);
/* 35 */   public CharSequence convertResultToString(Object resultValue) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\Filter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */