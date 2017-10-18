/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.util.function.BinaryOperator;
/*    */ import java.util.function.UnaryOperator;
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
/*    */ public abstract class AtomicReferenceFieldUpdater<T, V>
/*    */ {
/* 39 */   protected AtomicReferenceFieldUpdater() { throw new RuntimeException("Stub!"); }
/* 40 */   public static <U, W> AtomicReferenceFieldUpdater<U, W> newUpdater(Class<U> tclass, Class<W> vclass, String fieldName) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean compareAndSet(T paramT, V paramV1, V paramV2);
/*    */   public abstract boolean weakCompareAndSet(T paramT, V paramV1, V paramV2);
/*    */   public abstract void set(T paramT, V paramV);
/*    */   public abstract void lazySet(T paramT, V paramV);
/*    */   public abstract V get(T paramT);
/* 46 */   public V getAndSet(T obj, V newValue) { throw new RuntimeException("Stub!"); }
/* 47 */   public final V getAndUpdate(T obj, UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
/* 48 */   public final V updateAndGet(T obj, UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
/* 49 */   public final V getAndAccumulate(T obj, V x, BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 50 */   public final V accumulateAndGet(T obj, V x, BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\atomic\AtomicReferenceFieldUpdater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */