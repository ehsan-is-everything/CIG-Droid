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
/*    */ public class LinkedTransferQueue<E>
/*    */   extends AbstractQueue<E>
/*    */   implements TransferQueue<E>, Serializable
/*    */ {
/* 41 */   public LinkedTransferQueue() { throw new RuntimeException("Stub!"); }
/* 42 */   public LinkedTransferQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 44 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 46 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 47 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/* 48 */   public void put(E e) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean offer(E e, long timeout, TimeUnit unit) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean tryTransfer(E e) { throw new RuntimeException("Stub!"); }
/* 53 */   public void transfer(E e) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean tryTransfer(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 55 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 56 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 57 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 58 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); }
/* 59 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
/* 60 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 61 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean hasWaitingConsumer() { throw new RuntimeException("Stub!"); }
/* 64 */   public int size() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getWaitingConsumerCount() { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 68 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\LinkedTransferQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */