/*    */ package java.lang;
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
/*    */ public class InheritableThreadLocal<T>
/*    */   extends ThreadLocal<T>
/*    */ {
/* 30 */   public InheritableThreadLocal() { throw new RuntimeException("Stub!"); }
/* 31 */   protected T childValue(T parentValue) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\InheritableThreadLocal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */