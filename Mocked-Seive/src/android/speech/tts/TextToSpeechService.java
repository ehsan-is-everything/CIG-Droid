/*    */ package android.speech.tts;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class TextToSpeechService
/*    */   extends Service
/*    */ {
/* 20 */   public TextToSpeechService() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract int onIsLanguageAvailable(String paramString1, String paramString2, String paramString3);
/*    */   protected abstract String[] onGetLanguage();
/*    */   protected abstract int onLoadLanguage(String paramString1, String paramString2, String paramString3);
/*    */   protected abstract void onStop();
/*    */   protected abstract void onSynthesizeText(SynthesisRequest paramSynthesisRequest, SynthesisCallback paramSynthesisCallback);
/* 28 */   protected Set<String> onGetFeaturesForLanguage(String lang, String country, String variant) { throw new RuntimeException("Stub!"); }
/* 29 */   public List<Voice> onGetVoices() { throw new RuntimeException("Stub!"); }
/* 30 */   public String onGetDefaultVoiceNameFor(String lang, String country, String variant) { throw new RuntimeException("Stub!"); }
/* 31 */   public int onLoadVoice(String voiceName) { throw new RuntimeException("Stub!"); }
/* 32 */   public int onIsValidVoiceName(String voiceName) { throw new RuntimeException("Stub!"); }
/* 33 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\speech\tts\TextToSpeechService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */