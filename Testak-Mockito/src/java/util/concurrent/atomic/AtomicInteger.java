/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.IntBinaryOperator;
/*    */ import java.util.function.IntUnaryOperator;
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
/*    */ public class AtomicInteger
/*    */   extends Number
/*    */   implements Serializable
/*    */ {
/* 41 */   public AtomicInteger(int initialValue) { throw new RuntimeException("Stub!"); }
/* 42 */   public AtomicInteger() { throw new RuntimeException("Stub!"); }
/* 43 */   public final int get() { throw new RuntimeException("Stub!"); }
/* 44 */   public final void set(int newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void lazySet(int newValue) { throw new RuntimeException("Stub!"); }
/* 46 */   public final int getAndSet(int newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public final boolean compareAndSet(int expect, int update) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean weakCompareAndSet(int expect, int update) { throw new RuntimeException("Stub!"); }
/* 49 */   public final int getAndIncrement() { throw new RuntimeException("Stub!"); }
/* 50 */   public final int getAndDecrement() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int getAndAdd(int delta) { throw new RuntimeException("Stub!"); }
/* 52 */   public final int incrementAndGet() { throw new RuntimeException("Stub!"); }
/* 53 */   public final int decrementAndGet() { throw new RuntimeException("Stub!"); }
/* 54 */   public final int addAndGet(int delta) { throw new RuntimeException("Stub!"); }
/* 55 */   public final int getAndUpdate(IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final int updateAndGet(IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 57 */   public final int getAndAccumulate(int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 58 */   public final int accumulateAndGet(int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 61 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 62 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/* 63 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\atomic\AtomicInteger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */