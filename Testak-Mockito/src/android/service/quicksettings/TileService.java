/*    */ package android.service.quicksettings;
/*    */ 
/*    */ import android.app.Dialog;
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TileService
/*    */   extends Service
/*    */ {
/*    */   public static final String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
/*    */   public static final String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
/*    */   public static final String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
/*    */   
/* 20 */   public TileService() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onTileAdded() { throw new RuntimeException("Stub!"); }
/* 23 */   public void onTileRemoved() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onStartListening() { throw new RuntimeException("Stub!"); }
/* 25 */   public void onStopListening() { throw new RuntimeException("Stub!"); }
/* 26 */   public void onClick() { throw new RuntimeException("Stub!"); }
/* 27 */   public final void showDialog(Dialog dialog) { throw new RuntimeException("Stub!"); }
/* 28 */   public final void unlockAndRun(Runnable runnable) { throw new RuntimeException("Stub!"); }
/* 29 */   public final boolean isSecure() { throw new RuntimeException("Stub!"); }
/* 30 */   public final boolean isLocked() { throw new RuntimeException("Stub!"); }
/* 31 */   public final void startActivityAndCollapse(Intent intent) { throw new RuntimeException("Stub!"); }
/* 32 */   public final Tile getQsTile() { throw new RuntimeException("Stub!"); }
/* 33 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 34 */   public static final void requestListeningState(Context context, ComponentName component) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\quicksettings\TileService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */