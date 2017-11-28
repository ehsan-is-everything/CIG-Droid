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
/*    */ public abstract class AbstractSequentialList<E>
/*    */   extends AbstractList<E>
/*    */ {
/* 30 */   protected AbstractSequentialList() { throw new RuntimeException("Stub!"); }
/* 31 */   public E get(int index) { throw new RuntimeException("Stub!"); }
/* 32 */   public E set(int index, E element) { throw new RuntimeException("Stub!"); }
/* 33 */   public void add(int index, E element) { throw new RuntimeException("Stub!"); }
/* 34 */   public E remove(int index) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean addAll(int index, Collection<? extends E> c) { throw new RuntimeException("Stub!"); }
/* 36 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ListIterator<E> listIterator(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\AbstractSequentialList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */