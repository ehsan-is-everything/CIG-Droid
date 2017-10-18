/*    */ package android.service.textservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.textservice.SentenceSuggestionsInfo;
/*    */ import android.view.textservice.SuggestionsInfo;
/*    */ import android.view.textservice.TextInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SpellCheckerService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.textservice.SpellCheckerService";
/*    */   
/*    */   public static abstract class Session
/*    */   {
/* 23 */     public Session() { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onCreate();
/*    */     public abstract SuggestionsInfo onGetSuggestions(TextInfo paramTextInfo, int paramInt);
/* 26 */     public SuggestionsInfo[] onGetSuggestionsMultiple(TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) { throw new RuntimeException("Stub!"); }
/* 27 */     public SentenceSuggestionsInfo[] onGetSentenceSuggestionsMultiple(TextInfo[] textInfos, int suggestionsLimit) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onCancel() { throw new RuntimeException("Stub!"); }
/* 29 */     public void onClose() { throw new RuntimeException("Stub!"); }
/* 30 */     public String getLocale() { throw new RuntimeException("Stub!"); }
/* 31 */     public Bundle getBundle() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   public SpellCheckerService() { throw new RuntimeException("Stub!"); }
/* 34 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Session createSession();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\textservice\SpellCheckerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */