/*    */ package java.lang;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.Spliterator;
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
/*    */ public abstract interface Iterable<T>
/*    */ {
/*    */   public abstract Iterator<T> iterator();
/*    */   
/* 29 */   public void forEach(Consumer<? super T> action) { throw new RuntimeException("Stub!"); }
/* 30 */   public Spliterator<T> spliterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Iterable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */