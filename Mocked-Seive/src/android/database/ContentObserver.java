/*    */ package android.database;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Handler;
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
/*    */ public abstract class ContentObserver
/*    */ {
/* 20 */   public ContentObserver(Handler handler) { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onChange(boolean selfChange, Uri uri) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public final void dispatchChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
/* 26 */   public final void dispatchChange(boolean selfChange, Uri uri) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\ContentObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */