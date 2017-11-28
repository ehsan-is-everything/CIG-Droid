/*    */ package java.util.function;
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
/*    */ @FunctionalInterface
/*    */ public abstract interface LongPredicate
/*    */ {
/*    */   public abstract boolean test(long paramLong);
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
/* 30 */   public LongPredicate and(LongPredicate other) { throw new RuntimeException("Stub!"); }
/* 31 */   public LongPredicate negate() { throw new RuntimeException("Stub!"); }
/* 32 */   public LongPredicate or(LongPredicate other) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\function\LongPredicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */