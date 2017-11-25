/*    */ package java.util;
/*    */ 
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
/*    */ public abstract interface List<E>
/*    */   extends Collection<E>
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
/*    */   public abstract boolean addAll(int paramInt, Collection<? extends E> paramCollection);
/*    */   
/*    */   public abstract boolean removeAll(Collection<?> paramCollection);
/*    */   
/*    */   public abstract boolean retainAll(Collection<?> paramCollection);
/*    */   
/* 43 */   public void replaceAll(UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }
/*    */   
/* 45 */   public void sort(Comparator<? super E> c) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void clear();
/*    */   public abstract boolean equals(Object paramObject);
/*    */   public abstract int hashCode();
/*    */   public abstract E get(int paramInt);
/*    */   public abstract E set(int paramInt, E paramE);
/*    */   public abstract void add(int paramInt, E paramE);
/*    */   public abstract E remove(int paramInt);
/*    */   public abstract int indexOf(Object paramObject);
/*    */   public abstract int lastIndexOf(Object paramObject);
/*    */   public abstract ListIterator<E> listIterator();
/*    */   public abstract ListIterator<E> listIterator(int paramInt);
/*    */   public abstract List<E> subList(int paramInt1, int paramInt2);
/* 58 */   public Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\List.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */