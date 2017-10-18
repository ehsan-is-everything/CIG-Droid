/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.DoubleBinaryOperator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DoubleAccumulator
/*    */   extends Striped64
/*    */   implements Serializable
/*    */ {
/* 41 */   public DoubleAccumulator(DoubleBinaryOperator accumulatorFunction, double identity) { throw new RuntimeException("Stub!"); }
/* 42 */   public void accumulate(double x) { throw new RuntimeException("Stub!"); }
/* 43 */   public double get() { throw new RuntimeException("Stub!"); }
/* 44 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 45 */   public double getThenReset() { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/* 48 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 49 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 50 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\atomic\DoubleAccumulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */