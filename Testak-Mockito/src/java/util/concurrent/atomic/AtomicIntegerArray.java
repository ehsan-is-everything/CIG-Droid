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
/*    */ public class AtomicIntegerArray
/*    */   implements Serializable
/*    */ {
/* 40 */   public AtomicIntegerArray(int length) { throw new RuntimeException("Stub!"); }
/* 41 */   public AtomicIntegerArray(int[] array) { throw new RuntimeException("Stub!"); }
/* 42 */   public final int length() { throw new RuntimeException("Stub!"); }
/* 43 */   public final int get(int i) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void set(int i, int newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void lazySet(int i, int newValue) { throw new RuntimeException("Stub!"); }
/* 46 */   public final int getAndSet(int i, int newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public final boolean compareAndSet(int i, int expect, int update) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean weakCompareAndSet(int i, int expect, int update) { throw new RuntimeException("Stub!"); }
/* 49 */   public final int getAndIncrement(int i) { throw new RuntimeException("Stub!"); }
/* 50 */   public final int getAndDecrement(int i) { throw new RuntimeException("Stub!"); }
/* 51 */   public final int getAndAdd(int i, int delta) { throw new RuntimeException("Stub!"); }
/* 52 */   public final int incrementAndGet(int i) { throw new RuntimeException("Stub!"); }
/* 53 */   public final int decrementAndGet(int i) { throw new RuntimeException("Stub!"); }
/* 54 */   public final int addAndGet(int i, int delta) { throw new RuntimeException("Stub!"); }
/* 55 */   public final int getAndUpdate(int i, IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final int updateAndGet(int i, IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 57 */   public final int getAndAccumulate(int i, int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 58 */   public final int accumulateAndGet(int i, int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\atomic\AtomicIntegerArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */