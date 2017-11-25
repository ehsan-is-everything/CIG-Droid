/*    */ package android.service.media;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.media.browse.MediaBrowser.MediaItem;
/*    */ import android.media.session.MediaSession.Token;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MediaBrowserService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
/*    */   
/*    */   public class Result<T>
/*    */   {
/* 23 */     Result() { throw new RuntimeException("Stub!"); }
/* 24 */     public void sendResult(T result) { throw new RuntimeException("Stub!"); }
/* 25 */     public void detach() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static final class BrowserRoot { public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
/*    */     
/* 29 */     public BrowserRoot(String rootId, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 30 */     public String getRootId() { throw new RuntimeException("Stub!"); }
/* 31 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
/*    */     public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED"; }
/*    */   
/* 36 */   public MediaBrowserService() { throw new RuntimeException("Stub!"); }
/* 37 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 38 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 39 */   public void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */   public abstract BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle);
/*    */   public abstract void onLoadChildren(String paramString, Result<List<MediaBrowser.MediaItem>> paramResult);
/* 42 */   public void onLoadChildren(String parentId, Result<List<MediaBrowser.MediaItem>> result, Bundle options) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onLoadItem(String itemId, Result<MediaBrowser.MediaItem> result) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setSessionToken(MediaSession.Token token) { throw new RuntimeException("Stub!"); }
/* 45 */   public MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
/* 46 */   public final Bundle getBrowserRootHints() { throw new RuntimeException("Stub!"); }
/* 47 */   public void notifyChildrenChanged(String parentId) { throw new RuntimeException("Stub!"); }
/* 48 */   public void notifyChildrenChanged(String parentId, Bundle options) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\media\MediaBrowserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */