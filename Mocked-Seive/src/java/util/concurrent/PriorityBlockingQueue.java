/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
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
/*    */ 
/*    */ public class PriorityBlockingQueue<E>
/*    */   extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>, Serializable
/*    */ {
/* 42 */   public PriorityBlockingQueue() { throw new RuntimeException("Stub!"); }
/* 43 */   public PriorityBlockingQueue(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 44 */   public PriorityBlockingQueue(int initialCapacity, Comparator<? super E> comparator) { throw new RuntimeException("Stub!"); }
/* 45 */   public PriorityBlockingQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 48 */   public void put(E e) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean offer(E e, long timeout, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 50 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 51 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 52 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 53 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 54 */   public Comparator<? super E> comparator() { throw new RuntimeException("Stub!"); }
/* 55 */   public int size() { throw new RuntimeException("Stub!"); }
/* 56 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); }
/* 61 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
/* 62 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 63 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/* 64 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 65 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 66 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\PriorityBlockingQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */