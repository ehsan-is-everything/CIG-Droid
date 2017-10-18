/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractCollection;
/*    */ import java.util.Collection;
/*    */ import java.util.Deque;
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
/*    */ public class ConcurrentLinkedDeque<E>
/*    */   extends AbstractCollection<E>
/*    */   implements Deque<E>, Serializable
/*    */ {
/* 41 */   public ConcurrentLinkedDeque() { throw new RuntimeException("Stub!"); }
/* 42 */   public ConcurrentLinkedDeque(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public void addFirst(E e) { throw new RuntimeException("Stub!"); }
/* 44 */   public void addLast(E e) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean offerFirst(E e) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean offerLast(E e) { throw new RuntimeException("Stub!"); }
/* 47 */   public E peekFirst() { throw new RuntimeException("Stub!"); }
/* 48 */   public E peekLast() { throw new RuntimeException("Stub!"); }
/* 49 */   public E getFirst() { throw new RuntimeException("Stub!"); }
/* 50 */   public E getLast() { throw new RuntimeException("Stub!"); }
/* 51 */   public E pollFirst() { throw new RuntimeException("Stub!"); }
/* 52 */   public E pollLast() { throw new RuntimeException("Stub!"); }
/* 53 */   public E removeFirst() { throw new RuntimeException("Stub!"); }
/* 54 */   public E removeLast() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 57 */   public E poll() { throw new RuntimeException("Stub!"); }
/* 58 */   public E peek() { throw new RuntimeException("Stub!"); }
/* 59 */   public E remove() { throw new RuntimeException("Stub!"); }
/* 60 */   public E pop() { throw new RuntimeException("Stub!"); }
/* 61 */   public E element() { throw new RuntimeException("Stub!"); }
/* 62 */   public void push(E e) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean removeFirstOccurrence(Object o) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean removeLastOccurrence(Object o) { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 67 */   public int size() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 70 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 71 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 72 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 74 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 75 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 76 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!"); }
/* 77 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\ConcurrentLinkedDeque.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */