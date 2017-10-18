/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
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
/*    */ public class CursorLoader
/*    */   extends AsyncTaskLoader<Cursor>
/*    */ {
/*    */   public CursorLoader(Context context)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public CursorLoader(Context context, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public Cursor loadInBackground() { throw new RuntimeException("Stub!"); }
/* 24 */   public void cancelLoadInBackground() { throw new RuntimeException("Stub!"); }
/* 25 */   public void deliverResult(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 26 */   protected void onStartLoading() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void onStopLoading() { throw new RuntimeException("Stub!"); }
/* 28 */   public void onCanceled(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 29 */   protected void onReset() { throw new RuntimeException("Stub!"); }
/* 30 */   public Uri getUri() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setUri(Uri uri) { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getProjection() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setProjection(String[] projection) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getSelection() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setSelection(String selection) { throw new RuntimeException("Stub!"); }
/* 36 */   public String[] getSelectionArgs() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSelectionArgs(String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 38 */   public String getSortOrder() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSortOrder(String sortOrder) { throw new RuntimeException("Stub!"); }
/* 40 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\CursorLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */