/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.os.Handler;
/*    */ import java.util.Map;
/*    */ import java.util.Observable;
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
/*    */ public class ContentQueryMap
/*    */   extends Observable
/*    */ {
/* 21 */   public ContentQueryMap(Cursor cursor, String columnNameOfKey, boolean keepUpdated, Handler handlerForUpdateNotifications) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setKeepUpdated(boolean keepUpdated) { throw new RuntimeException("Stub!"); }
/* 23 */   public synchronized ContentValues getValues(String rowName) { throw new RuntimeException("Stub!"); }
/* 24 */   public void requery() { throw new RuntimeException("Stub!"); }
/* 25 */   public synchronized Map<String, ContentValues> getRows() { throw new RuntimeException("Stub!"); }
/* 26 */   public synchronized void close() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ContentQueryMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */