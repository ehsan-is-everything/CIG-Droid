/*    */ package android.icu.util;
/*    */ 
/*    */ public abstract interface RangeValueIterator
/*    */ {
/*    */   public abstract boolean next(Element paramElement);
/*    */   
/*    */   public abstract void reset();
/*    */   
/*    */   public static class Element
/*    */   {
/*    */     public int limit;
/*    */     public int start;
/*    */     public int value;
/*    */     
/*    */     public Element() {
/* 16 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\util\RangeValueIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */