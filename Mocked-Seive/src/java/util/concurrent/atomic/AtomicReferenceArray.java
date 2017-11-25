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
/*    */ public class AtomicReferenceArray<E>
/*    */   implements Serializable
/*    */ {
/* 40 */   public AtomicReferenceArray(int length) { throw new RuntimeException("Stub!"); }
/* 41 */   public AtomicReferenceArray(E[] array) { throw new RuntimeException("Stub!"); }
/* 42 */   public final int length() { throw new RuntimeException("Stub!"); }
/* 43 */   public final E get(int i) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void set(int i, E newValue) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void lazySet(int i, E newValue) { throw new RuntimeException("Stub!"); }
/*    */   
/* 47 */   public final E getAndSet(int i, E newValue) { throw new RuntimeException("Stub!"); }
/* 48 */   public final boolean compareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean weakCompareAndSet(int i, E expect, E update) { throw new RuntimeException("Stub!"); }
/* 50 */   public final E getAndUpdate(int i, UnaryOperator<E> updateFunction) { throw new RuntimeException("Stub!"); }
/* 51 */   public final E updateAndGet(int i, UnaryOperator<E> updateFunction) { throw new RuntimeException("Stub!"); }
/* 52 */   public final E getAndAccumulate(int i, E x, BinaryOperator<E> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 53 */   public final E accumulateAndGet(int i, E x, BinaryOperator<E> accumulatorFunction) { throw new RuntimeException("Stub!"); }
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\atomic\AtomicReferenceArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */