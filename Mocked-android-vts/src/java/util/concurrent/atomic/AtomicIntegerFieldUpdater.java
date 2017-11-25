/*    */ package java.util.concurrent.atomic;
/*    */ 
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
/*    */ 
/*    */ public abstract class AtomicIntegerFieldUpdater<T>
/*    */ {
/* 39 */   protected AtomicIntegerFieldUpdater() { throw new RuntimeException("Stub!"); }
/* 40 */   public static <U> AtomicIntegerFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean compareAndSet(T paramT, int paramInt1, int paramInt2);
/*    */   public abstract boolean weakCompareAndSet(T paramT, int paramInt1, int paramInt2);
/*    */   public abstract void set(T paramT, int paramInt);
/*    */   public abstract void lazySet(T paramT, int paramInt);
/*    */   public abstract int get(T paramT);
/* 46 */   public int getAndSet(T obj, int newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getAndIncrement(T obj) { throw new RuntimeException("Stub!"); }
/* 48 */   public int getAndDecrement(T obj) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getAndAdd(T obj, int delta) { throw new RuntimeException("Stub!"); }
/* 50 */   public int incrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
/* 51 */   public int decrementAndGet(T obj) { throw new RuntimeException("Stub!"); }
/* 52 */   public int addAndGet(T obj, int delta) { throw new RuntimeException("Stub!"); }
/* 53 */   public final int getAndUpdate(T obj, IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 54 */   public final int updateAndGet(T obj, IntUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }
/* 55 */   public final int getAndAccumulate(T obj, int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public final int accumulateAndGet(T obj, int x, IntBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\AtomicIntegerFieldUpdater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */