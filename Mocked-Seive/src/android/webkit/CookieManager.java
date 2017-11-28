/*    */ package android.webkit;
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
/*    */ public abstract class CookieManager
/*    */ {
/* 20 */   public CookieManager() { throw new RuntimeException("Stub!"); }
/* 21 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 22 */   public static CookieManager getInstance() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setAcceptCookie(boolean paramBoolean);
/*    */   public abstract boolean acceptCookie();
/*    */   public abstract void setAcceptThirdPartyCookies(WebView paramWebView, boolean paramBoolean);
/*    */   public abstract boolean acceptThirdPartyCookies(WebView paramWebView);
/*    */   public abstract void setCookie(String paramString1, String paramString2);
/*    */   public abstract void setCookie(String paramString1, String paramString2, ValueCallback<Boolean> paramValueCallback);
/*    */   public abstract String getCookie(String paramString);
/*    */   @Deprecated
/*    */   public abstract void removeSessionCookie();
/*    */   public abstract void removeSessionCookies(ValueCallback<Boolean> paramValueCallback);
/*    */   @Deprecated
/*    */   public abstract void removeAllCookie();
/*    */   public abstract void removeAllCookies(ValueCallback<Boolean> paramValueCallback);
/*    */   public abstract boolean hasCookies();
/*    */   @Deprecated
/*    */   public abstract void removeExpiredCookie();
/*    */   public abstract void flush();
/* 40 */   public static boolean allowFileSchemeCookies() { throw new RuntimeException("Stub!"); }
/* 41 */   public static void setAcceptFileSchemeCookies(boolean accept) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\CookieManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */