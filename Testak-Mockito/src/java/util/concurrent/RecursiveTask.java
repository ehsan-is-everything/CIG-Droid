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
/*    */ public abstract class RecursiveTask<V>
/*    */   extends ForkJoinTask<V>
/*    */ {
/* 40 */   public RecursiveTask() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract V compute();
/* 42 */   public final V getRawResult() { throw new RuntimeException("Stub!"); }
/* 43 */   protected final void setRawResult(V value) { throw new RuntimeException("Stub!"); }
/* 44 */   protected final boolean exec() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\RecursiveTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */