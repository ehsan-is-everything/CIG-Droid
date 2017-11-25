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
/*    */ public class VolatileCallSite
/*    */   extends CallSite
/*    */ {
/* 30 */   public VolatileCallSite(MethodType type) { throw new RuntimeException("Stub!"); }
/* 31 */   public VolatileCallSite(MethodHandle target) { throw new RuntimeException("Stub!"); }
/* 32 */   public final MethodHandle getTarget() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTarget(MethodHandle newTarget) { throw new RuntimeException("Stub!"); }
/* 34 */   public final MethodHandle dynamicInvoker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\invoke\VolatileCallSite.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */