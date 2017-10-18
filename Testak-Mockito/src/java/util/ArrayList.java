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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ArrayList<E>
/*    */   extends AbstractList<E>
/*    */   implements List<E>, RandomAccess, Cloneable, Serializable
/*    */ {
/* 32 */   public ArrayList(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 33 */   public ArrayList() { throw new RuntimeException("Stub!"); }
/* 34 */   public ArrayList(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 35 */   public void trimToSize() { throw new RuntimeException("Stub!"); }
/* 36 */   public void ensureCapacity(int minCapacity) { throw new RuntimeException("Stub!"); }
/* 37 */   public int size() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 40 */   public int indexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 41 */   public int lastIndexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 42 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 43 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 45 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 46 */   public E get(int index) { throw new RuntimeException("Stub!"); }
/* 47 */   public E set(int index, E element) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 49 */   public void add(int index, E element) { throw new RuntimeException("Stub!"); }
/* 50 */   public E remove(int index) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 52 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean addAll(int index, Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 55 */   protected void removeRange(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 58 */   public ListIterator<E> listIterator(int index) { throw new RuntimeException("Stub!"); }
/* 59 */   public ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); }
/* 60 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 61 */   public List<E> subList(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 62 */   public void forEach(Consumer<? super E> action) { throw new RuntimeException("Stub!"); }
/* 63 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean removeIf(Predicate<? super E> filter) { throw new RuntimeException("Stub!"); }
/*    */   
/* 66 */   public void replaceAll(UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }
/*    */   
/* 68 */   public void sort(Comparator<? super E> c) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\ArrayList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */