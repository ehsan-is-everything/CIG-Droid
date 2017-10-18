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
/*    */ public abstract class AbstractCollection<E>
/*    */   implements Collection<E>
/*    */ {
/* 30 */   protected AbstractCollection() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Iterator<E> iterator();
/*    */   public abstract int size();
/* 33 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 35 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean containsAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 44 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\AbstractCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */