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
/*    */ public class LinkedBlockingDeque<E>
/*    */   extends AbstractQueue<E>
/*    */   implements BlockingDeque<E>, Serializable
/*    */ {
/* 41 */   public LinkedBlockingDeque() { throw new RuntimeException("Stub!"); }
/* 42 */   public LinkedBlockingDeque(int capacity) { throw new RuntimeException("Stub!"); }
/* 43 */   public LinkedBlockingDeque(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 44 */   public void addFirst(E e) { throw new RuntimeException("Stub!"); }
/* 45 */   public void addLast(E e) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean offerFirst(E e) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean offerLast(E e) { throw new RuntimeException("Stub!"); }
/* 48 */   public void putFirst(E e) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 49 */   public void putLast(E e) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean offerFirst(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean offerLast(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 52 */   public E removeFirst() { throw new RuntimeException("Stub!"); }
/* 53 */   public E removeLast() { throw new RuntimeException("Stub!"); }
/* 54 */   public E pollFirst() { throw new RuntimeException("Stub!"); }
/* 55 */   public E pollLast() { throw new RuntimeException("Stub!"); }
/* 56 */   public E takeFirst() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 57 */   public E takeLast() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 58 */   public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 59 */   public E pollLast(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 60 */   public E getFirst() { throw new RuntimeException("Stub!"); }
/* 61 */   public E getLast() { throw new RuntimeException("Stub!"); }
/* 62 */   public E peekFirst() { throw new RuntimeException("Stub!"); }
/* 63 */   public E peekLast() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean removeFirstOccurrence(Object o) { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean removeLastOccurrence(Object o) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 68 */   public void put(E e) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 70 */   public E remove() { throw new RuntimeException("Stub!"); }
/* 71 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 72 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 73 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 74 */   public E element() { throw new RuntimeException("Stub!"); }
/* 75 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 76 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); }
/* 77 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); }
/* 78 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); }
/* 79 */   public void push(E e) { throw new RuntimeException("Stub!"); }
/* 80 */   public E pop() { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 82 */   public int size() { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/*    */   
/* 85 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 87 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 88 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 89 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 90 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 91 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!"); }
/* 92 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\LinkedBlockingDeque.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */