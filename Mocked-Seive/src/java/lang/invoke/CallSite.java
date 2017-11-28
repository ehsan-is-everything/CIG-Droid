/*    */ package java.lang.invoke;
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
/*    */ public abstract class CallSite
/*    */ {
/* 29 */   CallSite() { throw new RuntimeException("Stub!"); }
/* 30 */   public MethodType type() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract MethodHandle getTarget();
/*    */   
/*    */   public abstract void setTarget(MethodHandle paramMethodHandle);
/*    */   
/*    */   public abstract MethodHandle dynamicInvoker();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\invoke\CallSite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */