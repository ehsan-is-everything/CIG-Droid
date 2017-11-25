/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class AtomicReference<V>
/*    */   implements Serializable
/*    */ {
/* 40 */   public AtomicReference(V initialValue) { throw new RuntimeException("Stub!"); }
/* 41 */   public AtomicReference() { throw new RuntimeException("Stub!"); }
/* 42 */   public final V get() { throw new RuntimeException("Stub!"); }
/* 43 */   public final void set(V newValue) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void lazySet(V newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final boolean compareAndSet(V expect, V update) { throw new RuntimeException("Stub!"); }
/* 46 */   public final boolean weakCompareAndSet(V expect, V update) { throw new RuntimeException("Stub!"); }
/*    */   
/* 48 */   public final V getAndSet(V newValue) { throw new RuntimeException("Stub!"); }
/* 49 */   public final V getAndUpdate(UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
/* 50 */   public final V updateAndGet(UnaryOperator<V> updateFunction) { throw new RuntimeException("Stub!"); }
/* 51 */   public final V getAndAccumulate(V x, BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 52 */   public final V accumulateAndGet(V x, BinaryOperator<V> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 53 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\AtomicReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */