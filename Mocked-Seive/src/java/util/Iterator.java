/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.Consumer;
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
/*    */ public abstract interface Iterator<E>
/*    */ {
/*    */   public abstract boolean hasNext();
/*    */   
/*    */   public abstract E next();
/*    */   
/* 31 */   public void remove() { throw new RuntimeException("Stub!"); }
/* 32 */   public void forEachRemaining(Consumer<? super E> action) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Iterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */