/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Predicate;
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
/*    */ public class Vector<E>
/*    */   extends AbstractList<E>
/*    */   implements List<E>, RandomAccess, Cloneable, Serializable
/*    */ {
/*    */   protected int capacityIncrement;
/*    */   protected int elementCount;
/*    */   
/* 31 */   public Vector(int initialCapacity, int capacityIncrement) { throw new RuntimeException("Stub!"); }
/* 32 */   public Vector(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 33 */   public Vector() { throw new RuntimeException("Stub!"); }
/* 34 */   public Vector(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized void copyInto(Object[] anArray) { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized void trimToSize() { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized void ensureCapacity(int minCapacity) { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void setSize(int newSize) { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized int capacity() { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized int size() { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 42 */   public Enumeration<E> elements() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 44 */   public int indexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 45 */   public synchronized int indexOf(Object o, int index) { throw new RuntimeException("Stub!"); }
/* 46 */   public synchronized int lastIndexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 47 */   public synchronized int lastIndexOf(Object o, int index) { throw new RuntimeException("Stub!"); }
/* 48 */   public synchronized E elementAt(int index) { throw new RuntimeException("Stub!"); }
/* 49 */   public synchronized E firstElement() { throw new RuntimeException("Stub!"); }
/* 50 */   public synchronized E lastElement() { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized void setElementAt(E obj, int index) { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized void removeElementAt(int index) { throw new RuntimeException("Stub!"); }
/* 53 */   public synchronized void insertElementAt(E obj, int index) { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized void addElement(E obj) { throw new RuntimeException("Stub!"); }
/* 55 */   public synchronized boolean removeElement(Object obj) { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized void removeAllElements() { throw new RuntimeException("Stub!"); }
/* 57 */   public synchronized Object clone() { throw new RuntimeException("Stub!"); }
/* 58 */   public synchronized Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 60 */   public synchronized <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 61 */   public synchronized E get(int index) { throw new RuntimeException("Stub!"); }
/* 62 */   public synchronized E set(int index, E element) { throw new RuntimeException("Stub!"); }
/* 63 */   public synchronized boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 65 */   public void add(int index, E element) { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized E remove(int index) { throw new RuntimeException("Stub!"); }
/* 67 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 68 */   public synchronized boolean containsAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 69 */   public synchronized boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 70 */   public synchronized boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 71 */   public synchronized boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 72 */   public synchronized boolean addAll(int index, Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 73 */   public synchronized boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 74 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); }
/* 75 */   public synchronized String toString() { throw new RuntimeException("Stub!"); }
/* 76 */   public synchronized List<E> subList(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 77 */   protected synchronized void removeRange(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 78 */   public synchronized ListIterator<E> listIterator(int index) { throw new RuntimeException("Stub!"); }
/* 79 */   public synchronized ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); }
/* 80 */   public synchronized Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 81 */   public synchronized void forEach(Consumer<? super E> action) { throw new RuntimeException("Stub!"); }
/*    */   
/* 83 */   public synchronized boolean removeIf(Predicate<? super E> filter) { throw new RuntimeException("Stub!"); }
/*    */   
/* 85 */   public synchronized void replaceAll(UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }
/*    */   
/* 87 */   public synchronized void sort(Comparator<? super E> c) { throw new RuntimeException("Stub!"); }
/* 88 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 91 */   protected Object[] elementData = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Vector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */