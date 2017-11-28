/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
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
/*    */ public class ArrayBlockingQueue<E>
/*    */   extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>, Serializable
/*    */ {
/* 41 */   public ArrayBlockingQueue(int capacity) { throw new RuntimeException("Stub!"); }
/* 42 */   public ArrayBlockingQueue(int capacity, boolean fair) { throw new RuntimeException("Stub!"); }
/* 43 */   public ArrayBlockingQueue(int capacity, boolean fair, Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 46 */   public void put(E e) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 48 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 49 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 50 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 51 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 52 */   public int size() { throw new RuntimeException("Stub!"); }
/* 53 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 56 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 58 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 61 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); }
/* 62 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
/* 63 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 64 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ArrayBlockingQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */