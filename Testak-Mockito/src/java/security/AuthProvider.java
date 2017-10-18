/*    */ package java.security;
/*    */ 
/*    */ import javax.security.auth.Subject;
/*    */ import javax.security.auth.callback.CallbackHandler;
/*    */ import javax.security.auth.login.LoginException;
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
/*    */ public abstract class AuthProvider
/*    */   extends Provider
/*    */ {
/*    */   protected AuthProvider(String name, double version, String info)
/*    */   {
/* 30 */     super((String)null, 0.0D, (String)null);throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void login(Subject paramSubject, CallbackHandler paramCallbackHandler)
/*    */     throws LoginException;
/*    */   
/*    */   public abstract void logout()
/*    */     throws LoginException;
/*    */   
/*    */   public abstract void setCallbackHandler(CallbackHandler paramCallbackHandler);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\AuthProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */