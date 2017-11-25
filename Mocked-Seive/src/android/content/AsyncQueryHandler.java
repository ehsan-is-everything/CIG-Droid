/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Handler;
/*    */ import android.os.Looper;
/*    */ import android.os.Message;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AsyncQueryHandler
/*    */   extends Handler
/*    */ {
/*    */   protected static final class WorkerArgs
/*    */   {
/*    */     public Object cookie;
/*    */     public Handler handler;
/*    */     public String orderBy;
/*    */     
/*    */     protected WorkerArgs()
/*    */     {
/* 23 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/*    */ 
/* 27 */     public String[] projection = null;
/*    */     public Object result;
/*    */     public String selection;
/* 30 */     public String[] selectionArgs = null;
/*    */     public Uri uri;
/*    */     public ContentValues values;
/*    */   }
/*    */   
/*    */   protected class WorkerHandler
/*    */     extends Handler {
/* 37 */     public WorkerHandler(Looper looper) { throw new RuntimeException("Stub!"); }
/* 38 */     public void handleMessage(Message msg) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 40 */   public AsyncQueryHandler(ContentResolver cr) { throw new RuntimeException("Stub!"); }
/* 41 */   protected Handler createHandler(Looper looper) { throw new RuntimeException("Stub!"); }
/* 42 */   public void startQuery(int token, Object cookie, Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) { throw new RuntimeException("Stub!"); }
/* 43 */   public final void cancelOperation(int token) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void startInsert(int token, Object cookie, Uri uri, ContentValues initialValues) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void startUpdate(int token, Object cookie, Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 46 */   public final void startDelete(int token, Object cookie, Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 47 */   protected void onQueryComplete(int token, Object cookie, Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 48 */   protected void onInsertComplete(int token, Object cookie, Uri uri) { throw new RuntimeException("Stub!"); }
/* 49 */   protected void onUpdateComplete(int token, Object cookie, int result) { throw new RuntimeException("Stub!"); }
/* 50 */   protected void onDeleteComplete(int token, Object cookie, int result) { throw new RuntimeException("Stub!"); }
/* 51 */   public void handleMessage(Message msg) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\AsyncQueryHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */