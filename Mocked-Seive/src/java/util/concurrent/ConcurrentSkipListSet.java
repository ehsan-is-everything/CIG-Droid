/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
/*    */ import java.util.NavigableSet;
/*    */ import java.util.SortedSet;
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
/*    */ public class ConcurrentSkipListSet<E>
/*    */   extends AbstractSet<E>
/*    */   implements NavigableSet<E>, Cloneable, Serializable
/*    */ {
/* 41 */   public ConcurrentSkipListSet() { throw new RuntimeException("Stub!"); }
/* 42 */   public ConcurrentSkipListSet(Comparator<? super E> comparator) { throw new RuntimeException("Stub!"); }
/* 43 */   public ConcurrentSkipListSet(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 44 */   public ConcurrentSkipListSet(SortedSet<E> s) { throw new RuntimeException("Stub!"); }
/* 45 */   public ConcurrentSkipListSet<E> clone() { throw new RuntimeException("Stub!"); }
/* 46 */   public int size() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 51 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 52 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 53 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 56 */   public E lower(E e) { throw new RuntimeException("Stub!"); }
/* 57 */   public E floor(E e) { throw new RuntimeException("Stub!"); }
/* 58 */   public E ceiling(E e) { throw new RuntimeException("Stub!"); }
/* 59 */   public E higher(E e) { throw new RuntimeException("Stub!"); }
/* 60 */   public E pollFirst() { throw new RuntimeException("Stub!"); }
/* 61 */   public E pollLast() { throw new RuntimeException("Stub!"); }
/* 62 */   public Comparator<? super E> comparator() { throw new RuntimeException("Stub!"); }
/* 63 */   public E first() { throw new RuntimeException("Stub!"); }
/* 64 */   public E last() { throw new RuntimeException("Stub!"); }
/* 65 */   public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) { throw new RuntimeException("Stub!"); }
/* 66 */   public NavigableSet<E> headSet(E toElement, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 67 */   public NavigableSet<E> tailSet(E fromElement, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 68 */   public NavigableSet<E> subSet(E fromElement, E toElement) { throw new RuntimeException("Stub!"); }
/* 69 */   public NavigableSet<E> headSet(E toElement) { throw new RuntimeException("Stub!"); }
/* 70 */   public NavigableSet<E> tailSet(E fromElement) { throw new RuntimeException("Stub!"); }
/* 71 */   public NavigableSet<E> descendingSet() { throw new RuntimeException("Stub!"); }
/* 72 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ConcurrentSkipListSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */