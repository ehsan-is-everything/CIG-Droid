/*    */ package java.lang;
/*    */ 
/*    */ import java.util.function.Supplier;
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
/*    */ public class ThreadLocal<T>
/*    */ {
/* 29 */   public ThreadLocal() { throw new RuntimeException("Stub!"); }
/* 30 */   protected T initialValue() { throw new RuntimeException("Stub!"); }
/* 31 */   public static <S> ThreadLocal<S> withInitial(Supplier<? extends S> supplier) { throw new RuntimeException("Stub!"); }
/* 32 */   public T get() { throw new RuntimeException("Stub!"); }
/* 33 */   public void set(T value) { throw new RuntimeException("Stub!"); }
/* 34 */   public void remove() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\ThreadLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */