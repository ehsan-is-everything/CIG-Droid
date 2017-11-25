/*    */ package android.content;
/*    */ 
/*    */ import android.database.ContentObserver;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class Loader<D>
/*    */ {
/*    */   public static abstract interface OnLoadCanceledListener<D>
/*    */   {
/*    */     public abstract void onLoadCanceled(Loader<D> paramLoader);
/*    */   }
/*    */   
/*    */   public static abstract interface OnLoadCompleteListener<D>
/*    */   {
/*    */     public abstract void onLoadComplete(Loader<D> paramLoader, D paramD);
/*    */   }
/*    */   
/*    */   public final class ForceLoadContentObserver extends ContentObserver
/*    */   {
/*    */     public ForceLoadContentObserver()
/*    */     {
/* 23 */       super();throw new RuntimeException("Stub!"); }
/* 24 */     public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); }
/* 25 */     public void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public Loader(Context context) { throw new RuntimeException("Stub!"); }
/* 36 */   public void deliverResult(D data) { throw new RuntimeException("Stub!"); }
/* 37 */   public void deliverCancellation() { throw new RuntimeException("Stub!"); }
/* 38 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 40 */   public void registerListener(int id, OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); }
/* 41 */   public void unregisterListener(OnLoadCompleteListener<D> listener) { throw new RuntimeException("Stub!"); }
/* 42 */   public void registerOnLoadCanceledListener(OnLoadCanceledListener<D> listener) { throw new RuntimeException("Stub!"); }
/* 43 */   public void unregisterOnLoadCanceledListener(OnLoadCanceledListener<D> listener) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isStarted() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isAbandoned() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isReset() { throw new RuntimeException("Stub!"); }
/* 47 */   public final void startLoading() { throw new RuntimeException("Stub!"); }
/* 48 */   protected void onStartLoading() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean cancelLoad() { throw new RuntimeException("Stub!"); }
/* 50 */   protected boolean onCancelLoad() { throw new RuntimeException("Stub!"); }
/* 51 */   public void forceLoad() { throw new RuntimeException("Stub!"); }
/* 52 */   protected void onForceLoad() { throw new RuntimeException("Stub!"); }
/* 53 */   public void stopLoading() { throw new RuntimeException("Stub!"); }
/* 54 */   protected void onStopLoading() { throw new RuntimeException("Stub!"); }
/* 55 */   public void abandon() { throw new RuntimeException("Stub!"); }
/* 56 */   protected void onAbandon() { throw new RuntimeException("Stub!"); }
/* 57 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 58 */   protected void onReset() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean takeContentChanged() { throw new RuntimeException("Stub!"); }
/* 60 */   public void commitContentChanged() { throw new RuntimeException("Stub!"); }
/* 61 */   public void rollbackContentChanged() { throw new RuntimeException("Stub!"); }
/* 62 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/* 63 */   public String dataToString(D data) { throw new RuntimeException("Stub!"); }
/* 64 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 65 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\Loader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */