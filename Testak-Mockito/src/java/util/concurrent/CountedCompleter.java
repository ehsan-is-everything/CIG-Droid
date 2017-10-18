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
/*    */ public abstract class CountedCompleter<T>
/*    */   extends ForkJoinTask<T>
/*    */ {
/* 40 */   protected CountedCompleter(CountedCompleter<?> completer, int initialPendingCount) { throw new RuntimeException("Stub!"); }
/* 41 */   protected CountedCompleter(CountedCompleter<?> completer) { throw new RuntimeException("Stub!"); }
/* 42 */   protected CountedCompleter() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void compute();
/* 44 */   public void onCompletion(CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean onExceptionalCompletion(Throwable ex, CountedCompleter<?> caller) { throw new RuntimeException("Stub!"); }
/* 46 */   public final CountedCompleter<?> getCompleter() { throw new RuntimeException("Stub!"); }
/* 47 */   public final int getPendingCount() { throw new RuntimeException("Stub!"); }
/* 48 */   public final void setPendingCount(int count) { throw new RuntimeException("Stub!"); }
/* 49 */   public final void addToPendingCount(int delta) { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean compareAndSetPendingCount(int expected, int count) { throw new RuntimeException("Stub!"); }
/* 51 */   public final int decrementPendingCountUnlessZero() { throw new RuntimeException("Stub!"); }
/* 52 */   public final CountedCompleter<?> getRoot() { throw new RuntimeException("Stub!"); }
/* 53 */   public final void tryComplete() { throw new RuntimeException("Stub!"); }
/* 54 */   public final void propagateCompletion() { throw new RuntimeException("Stub!"); }
/* 55 */   public void complete(T rawResult) { throw new RuntimeException("Stub!"); }
/* 56 */   public final CountedCompleter<?> firstComplete() { throw new RuntimeException("Stub!"); }
/* 57 */   public final CountedCompleter<?> nextComplete() { throw new RuntimeException("Stub!"); }
/* 58 */   public final void quietlyCompleteRoot() { throw new RuntimeException("Stub!"); }
/* 59 */   public final void helpComplete(int maxTasks) { throw new RuntimeException("Stub!"); }
/* 60 */   protected final boolean exec() { throw new RuntimeException("Stub!"); }
/* 61 */   public T getRawResult() { throw new RuntimeException("Stub!"); }
/* 62 */   protected void setRawResult(T t) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\CountedCompleter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */