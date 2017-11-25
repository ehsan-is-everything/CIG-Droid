/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.LongBinaryOperator;
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
/*    */ public class LongAccumulator
/*    */   extends Striped64
/*    */   implements Serializable
/*    */ {
/* 41 */   public LongAccumulator(LongBinaryOperator accumulatorFunction, long identity) { throw new RuntimeException("Stub!"); }
/* 42 */   public void accumulate(long x) { throw new RuntimeException("Stub!"); }
/* 43 */   public long get() { throw new RuntimeException("Stub!"); }
/* 44 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 45 */   public long getThenReset() { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 48 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 49 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/* 50 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\LongAccumulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */