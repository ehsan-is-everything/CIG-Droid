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
/*    */ public abstract interface DoubleUnaryOperator
/*    */ {
/*    */   public abstract double applyAsDouble(double paramDouble);
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
/* 30 */   public DoubleUnaryOperator compose(DoubleUnaryOperator before) { throw new RuntimeException("Stub!"); }
/* 31 */   public DoubleUnaryOperator andThen(DoubleUnaryOperator after) { throw new RuntimeException("Stub!"); }
/* 32 */   public static DoubleUnaryOperator identity() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\DoubleUnaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */