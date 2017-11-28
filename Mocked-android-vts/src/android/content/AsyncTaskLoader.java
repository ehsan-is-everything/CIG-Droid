/*    */ package android.content;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
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
/*    */ public abstract class AsyncTaskLoader<D>
/*    */   extends Loader<D>
/*    */ {
/*    */   public AsyncTaskLoader(Context context)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public void setUpdateThrottle(long delayMS) { throw new RuntimeException("Stub!"); }
/* 23 */   protected void onForceLoad() { throw new RuntimeException("Stub!"); }
/* 24 */   protected boolean onCancelLoad() { throw new RuntimeException("Stub!"); }
/* 25 */   public void onCanceled(D data) { throw new RuntimeException("Stub!"); }
/*    */   public abstract D loadInBackground();
/* 27 */   protected D onLoadInBackground() { throw new RuntimeException("Stub!"); }
/* 28 */   public void cancelLoadInBackground() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isLoadInBackgroundCanceled() { throw new RuntimeException("Stub!"); }
/* 30 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\AsyncTaskLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */