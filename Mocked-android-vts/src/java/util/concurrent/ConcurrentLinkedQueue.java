/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.Queue;
/*    */ import java.util.Spliterator;
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
/*    */ public class ConcurrentLinkedQueue<E>
/*    */   extends AbstractQueue<E>
/*    */   implements Queue<E>, Serializable
/*    */ {
/* 41 */   public ConcurrentLinkedQueue() { throw new RuntimeException("Stub!"); }
/* 42 */   public ConcurrentLinkedQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 45 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 46 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 48 */   public int size() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 52 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 53 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 55 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 56 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 57 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ConcurrentLinkedQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */