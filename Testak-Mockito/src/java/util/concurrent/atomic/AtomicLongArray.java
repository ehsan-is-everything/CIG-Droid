/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.LongBinaryOperator;
/*    */ import java.util.function.LongUnaryOperator;
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
/*    */ public class AtomicLongArray
/*    */   implements Serializable
/*    */ {
/* 40 */   public AtomicLongArray(int length) { throw new RuntimeException("Stub!"); }
/* 41 */   public AtomicLongArray(long[] array) { throw new RuntimeException("Stub!"); }
/* 42 */   public final int length() { throw new RuntimeException("Stub!"); }
/* 43 */   public final long get(int i) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void set(int i, long newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void lazySet(int i, long newValue) { throw new RuntimeException("Stub!"); }
/* 46 */   public final long getAndSet(int i, long newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public final boolean compareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean weakCompareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }
/* 49 */   public final long getAndIncrement(int i) { throw new RuntimeException("Stub!"); }
/* 50 */   public final long getAndDecrement(int i) { throw new RuntimeException("Stub!"); }
/* 51 */   public final long getAndAdd(int i, long delta) { throw new RuntimeException("Stub!"); }
/* 52 */   public final long incrementAndGet(int i) { throw new RuntimeException("Stub!"); }
/* 53 */   public final long decrementAndGet(int i) { throw new RuntimeException("Stub!"); }
/* 54 */   public long addAndGet(int i, long delta) { throw new RuntimeException("Stub!"); }
/* 55 */   public final long getAndUpdate(int i, LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final long updateAndGet(int i, LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 57 */   public final long getAndAccumulate(int i, long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 58 */   public final long accumulateAndGet(int i, long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\atomic\AtomicLongArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */