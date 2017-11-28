/*    */ package java.net;
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
/*    */ public abstract interface CookiePolicy
/*    */ {
/* 30 */   public static final CookiePolicy ACCEPT_ALL = null;
/* 31 */   public static final CookiePolicy ACCEPT_NONE = null;
/* 32 */   public static final CookiePolicy ACCEPT_ORIGINAL_SERVER = null;
/*    */   
/*    */   public abstract boolean shouldAccept(URI paramURI, HttpCookie paramHttpCookie);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\CookiePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */