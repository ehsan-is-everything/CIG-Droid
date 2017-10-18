/*    */ package java.util.concurrent;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RecursiveAction
/*    */   extends ForkJoinTask<Void>
/*    */ {
/* 40 */   public RecursiveAction() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void compute();
/* 42 */   public final Void getRawResult() { throw new RuntimeException("Stub!"); }
/* 43 */   protected final void setRawResult(Void mustBeNull) { throw new RuntimeException("Stub!"); }
/* 44 */   protected final boolean exec() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\RecursiveAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */