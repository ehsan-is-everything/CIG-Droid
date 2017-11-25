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
/*    */ public class AtomicLong
/*    */   extends Number
/*    */   implements Serializable
/*    */ {
/* 41 */   public AtomicLong(long initialValue) { throw new RuntimeException("Stub!"); }
/* 42 */   public AtomicLong() { throw new RuntimeException("Stub!"); }
/* 43 */   public final long get() { throw new RuntimeException("Stub!"); }
/* 44 */   public final void set(long newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void lazySet(long newValue) { throw new RuntimeException("Stub!"); }
/* 46 */   public final long getAndSet(long newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public final boolean compareAndSet(long expect, long update) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean weakCompareAndSet(long expect, long update) { throw new RuntimeException("Stub!"); }
/* 49 */   public final long getAndIncrement() { throw new RuntimeException("Stub!"); }
/* 50 */   public final long getAndDecrement() { throw new RuntimeException("Stub!"); }
/* 51 */   public final long getAndAdd(long delta) { throw new RuntimeException("Stub!"); }
/* 52 */   public final long incrementAndGet() { throw new RuntimeException("Stub!"); }
/* 53 */   public final long decrementAndGet() { throw new RuntimeException("Stub!"); }
/* 54 */   public final long addAndGet(long delta) { throw new RuntimeException("Stub!"); }
/* 55 */   public final long getAndUpdate(LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final long updateAndGet(LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 57 */   public final long getAndAccumulate(long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 58 */   public final long accumulateAndGet(long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 61 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 62 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/* 63 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\AtomicLong.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */