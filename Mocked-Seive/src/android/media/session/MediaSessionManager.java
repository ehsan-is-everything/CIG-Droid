/*    */ package android.media.session;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.os.Handler;
/*    */ import java.util.List;
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
/*    */ public final class MediaSessionManager
/*    */ {
/* 24 */   MediaSessionManager() { throw new RuntimeException("Stub!"); }
/* 25 */   public List<MediaController> getActiveSessions(ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
/* 26 */   public void addOnActiveSessionsChangedListener(OnActiveSessionsChangedListener sessionListener, ComponentName notificationListener) { throw new RuntimeException("Stub!"); }
/* 27 */   public void addOnActiveSessionsChangedListener(OnActiveSessionsChangedListener sessionListener, ComponentName notificationListener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 28 */   public void removeOnActiveSessionsChangedListener(OnActiveSessionsChangedListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnActiveSessionsChangedListener
/*    */   {
/*    */     public abstract void onActiveSessionsChanged(List<MediaController> paramList);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\session\MediaSessionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */