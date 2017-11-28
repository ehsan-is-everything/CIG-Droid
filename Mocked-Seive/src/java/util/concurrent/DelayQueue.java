/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
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
/*    */ public class DelayQueue<E extends Delayed>
/*    */   extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>
/*    */ {
/* 41 */   public DelayQueue() { throw new RuntimeException("Stub!"); }
/* 42 */   public DelayQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 45 */   public void put(E e) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean offer(E e, long timeout, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 47 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 48 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 49 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 50 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 51 */   public int size() { throw new RuntimeException("Stub!"); }
/* 52 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); }
/* 53 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
/* 54 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 55 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); }
/* 56 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/* 57 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 59 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\DelayQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */