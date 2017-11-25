/*    */ package java.util.concurrent.atomic;
/*    */ 
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
/*    */ 
/*    */ public abstract class AtomicLongFieldUpdater<T>
/*    */ {
/* 39 */   protected AtomicLongFieldUpdater() { throw new RuntimeException("Stub!"); }
/* 40 */   public static <U> AtomicLongFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean compareAndSet(T paramT, long paramLong1, long paramLong2);
/*    */   public abstract boolean weakCompareAndSet(T paramT, long paramLong1, long paramLong2);
/*    */   public abstract void set(T paramT, long paramLong);
/*    */   public abstract void lazySet(T paramT, long paramLong);
/*    */   public abstract long get(T paramT);
/* 46 */   public long getAndSet(T obj, long newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public long getAndIncrement(T obj) { throw new RuntimeException("Stub!"); }
/* 48 */   public long getAndDecrement(T obj) { throw new RuntimeException("Stub!"); }
/* 49 */   public long getAndAdd(T obj, long delta) { throw new RuntimeException("Stub!"); }
/* 50 */   public long incrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
/* 51 */   public long decrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
/* 52 */   public long addAndGet(T obj, long delta) { throw new RuntimeException("Stub!"); }
/* 53 */   public final long getAndUpdate(T obj, LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 54 */   public final long updateAndGet(T obj, LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 55 */   public final long getAndAccumulate(T obj, long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final long accumulateAndGet(T obj, long x, LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\AtomicLongFieldUpdater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */