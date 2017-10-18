/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.Spliterator;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Predicate;
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
/*    */ public class CopyOnWriteArraySet<E>
/*    */   extends AbstractSet<E>
/*    */   implements Serializable
/*    */ {
/* 41 */   public CopyOnWriteArraySet() { throw new RuntimeException("Stub!"); }
/* 42 */   public CopyOnWriteArraySet(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 43 */   public int size() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/* 46 */   public Object[] toArray() { throw new RuntimeException("Stub!"); }
/* 47 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/* 48 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean add(E e) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean containsAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean addAll(Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/* 55 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean removeIf(Predicate<? super E> filter) { throw new RuntimeException("Stub!"); }
/* 58 */   public void forEach(Consumer<? super E> action) { throw new RuntimeException("Stub!"); }
/* 59 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\CopyOnWriteArraySet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */