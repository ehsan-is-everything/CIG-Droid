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
/*    */ public abstract interface IntUnaryOperator
/*    */ {
/*    */   public abstract int applyAsInt(int paramInt);
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
/* 30 */   public IntUnaryOperator compose(IntUnaryOperator before) { throw new RuntimeException("Stub!"); }
/* 31 */   public IntUnaryOperator andThen(IntUnaryOperator after) { throw new RuntimeException("Stub!"); }
/* 32 */   public static IntUnaryOperator identity() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\function\IntUnaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */