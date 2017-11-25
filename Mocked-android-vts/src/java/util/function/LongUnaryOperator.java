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
/*    */ public abstract interface LongUnaryOperator
/*    */ {
/*    */   public abstract long applyAsLong(long paramLong);
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
/* 30 */   public LongUnaryOperator compose(LongUnaryOperator before) { throw new RuntimeException("Stub!"); }
/* 31 */   public LongUnaryOperator andThen(LongUnaryOperator after) { throw new RuntimeException("Stub!"); }
/* 32 */   public static LongUnaryOperator identity() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\function\LongUnaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */