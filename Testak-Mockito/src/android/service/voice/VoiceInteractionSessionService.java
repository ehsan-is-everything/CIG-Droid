/*    */ package android.service.voice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class VoiceInteractionSessionService
/*    */   extends Service
/*    */ {
/* 21 */   public VoiceInteractionSessionService() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/*    */   public abstract VoiceInteractionSession onNewSession(Bundle paramBundle);
/* 24 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\voice\VoiceInteractionSessionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */