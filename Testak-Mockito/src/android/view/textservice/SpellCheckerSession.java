/*    */ package android.view.textservice;
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
/*    */ public class SpellCheckerSession
/*    */ {
/*    */   public static final String SERVICE_META_DATA = "android.view.textservice.scs";
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
/* 25 */   SpellCheckerSession() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isSessionDisconnected() { throw new RuntimeException("Stub!"); }
/* 27 */   public SpellCheckerInfo getSpellChecker() { throw new RuntimeException("Stub!"); }
/* 28 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 29 */   public void close() { throw new RuntimeException("Stub!"); }
/* 30 */   public void getSentenceSuggestions(TextInfo[] textInfos, int suggestionsLimit) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public void getSuggestions(TextInfo textInfo, int suggestionsLimit) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void getSuggestions(TextInfo[] textInfos, int suggestionsLimit, boolean sequentialWords) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface SpellCheckerSessionListener
/*    */   {
/*    */     public abstract void onGetSuggestions(SuggestionsInfo[] paramArrayOfSuggestionsInfo);
/*    */     
/*    */     public abstract void onGetSentenceSuggestions(SentenceSuggestionsInfo[] paramArrayOfSentenceSuggestionsInfo);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\textservice\SpellCheckerSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */