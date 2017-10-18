/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Stream;
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
/*    */ public abstract interface Collection<E>
/*    */   extends Iterable<E>
/*    */ {
/*    */   public abstract int size();
/*    */   
/*    */   public abstract boolean isEmpty();
/*    */   
/*    */   public abstract boolean contains(Object paramObject);
/*    */   
/*    */   public abstract Iterator<E> iterator();
/*    */   
/*    */   public abstract Object[] toArray();
/*    */   
/*    */   public abstract <T> T[] toArray(T[] paramArrayOfT);
/*    */   
/*    */   public abstract boolean add(E paramE);
/*    */   
/*    */   public abstract boolean remove(Object paramObject);
/*    */   
/*    */   public abstract boolean containsAll(Collection<?> paramCollection);
/*    */   
/*    */   public abstract boolean addAll(Collection<? extends E> paramCollection);
/*    */   
/*    */   public abstract boolean removeAll(Collection<?> paramCollection);
/*    */   
/* 41 */   public boolean removeIf(Predicate<? super E> filter) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean retainAll(Collection<?> paramCollection);
/*    */   public abstract void clear();
/*    */   public abstract boolean equals(Object paramObject);
/*    */   public abstract int hashCode();
/* 46 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/* 47 */   public Stream<E> stream() { throw new RuntimeException("Stub!"); }
/* 48 */   public Stream<E> parallelStream() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Collection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */