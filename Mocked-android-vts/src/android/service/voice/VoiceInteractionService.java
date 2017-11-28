/*    */ package android.service.voice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class VoiceInteractionService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.voice.VoiceInteractionService";
/*    */   public static final String SERVICE_META_DATA = "android.voice_interaction";
/*    */   
/* 21 */   public VoiceInteractionService() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onLaunchVoiceAssistFromKeyguard() { throw new RuntimeException("Stub!"); }
/* 23 */   public static boolean isActiveService(Context context, ComponentName service) { throw new RuntimeException("Stub!"); }
/* 24 */   public void setDisabledShowContext(int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getDisabledShowContext() { throw new RuntimeException("Stub!"); }
/* 26 */   public void showSession(Bundle args, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 28 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onReady() { throw new RuntimeException("Stub!"); }
/* 30 */   public void onShutdown() { throw new RuntimeException("Stub!"); }
/* 31 */   public final AlwaysOnHotwordDetector createAlwaysOnHotwordDetector(String keyphrase, Locale locale, AlwaysOnHotwordDetector.Callback callback) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void dump(FileDescriptor fd, PrintWriter pw, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\voice\VoiceInteractionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */