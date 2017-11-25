/*    */ package android.webkit;
/*    */ 
/*    */ import android.os.Handler;
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
/*    */ public abstract class WebMessagePort
/*    */ {
/*    */   public static abstract class WebMessageCallback
/*    */   {
/* 22 */     public WebMessageCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onMessage(WebMessagePort port, WebMessage message) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 25 */   WebMessagePort() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void postMessage(WebMessage paramWebMessage);
/*    */   
/*    */   public abstract void close();
/*    */   
/*    */   public abstract void setWebMessageCallback(WebMessageCallback paramWebMessageCallback);
/*    */   
/*    */   public abstract void setWebMessageCallback(WebMessageCallback paramWebMessageCallback, Handler paramHandler);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebMessagePort.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */