/*    */ package java.util;
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
/*    */ public abstract class AbstractList<E>
/*    */   extends AbstractCollection<E>
/*    */   implements List<E>
/*    */ {
/*    */   protected transient int modCount;
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
/* 31 */   protected AbstractList() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/*    */   public abstract E get(int paramInt);
/* 34 */   public E set(int index, E element) { throw new RuntimeException("Stub!"); }
/* 35 */   public void add(int index, E element) { throw new RuntimeException("Stub!"); }
/* 36 */   public E remove(int index) { throw new RuntimeException("Stub!"); }
/* 37 */   public int indexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 38 */   public int lastIndexOf(Object o) { throw new RuntimeException("Stub!"); }
/* 39 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean addAll(int index, Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 41 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 42 */   public ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); }
/* 43 */   public ListIterator<E> listIterator(int index) { throw new RuntimeException("Stub!"); }
/* 44 */   public List<E> subList(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 46 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 47 */   protected void removeRange(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\AbstractList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */