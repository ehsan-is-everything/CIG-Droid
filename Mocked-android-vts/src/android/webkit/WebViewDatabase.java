/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Context;
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
/*    */ public abstract class WebViewDatabase
/*    */ {
/* 20 */   public WebViewDatabase() { throw new RuntimeException("Stub!"); }
/* 21 */   public static WebViewDatabase getInstance(Context context) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public abstract boolean hasUsernamePassword();
/*    */   
/*    */   @Deprecated
/*    */   public abstract void clearUsernamePassword();
/*    */   
/*    */   public abstract boolean hasHttpAuthUsernamePassword();
/*    */   
/*    */   public abstract void clearHttpAuthUsernamePassword();
/*    */   
/*    */   public abstract void setHttpAuthUsernamePassword(String paramString1, String paramString2, String paramString3, String paramString4);
/*    */   
/*    */   public abstract String[] getHttpAuthUsernamePassword(String paramString1, String paramString2);
/*    */   
/*    */   @Deprecated
/*    */   public abstract boolean hasFormData();
/*    */   
/*    */   @Deprecated
/*    */   public abstract void clearFormData();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebViewDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */