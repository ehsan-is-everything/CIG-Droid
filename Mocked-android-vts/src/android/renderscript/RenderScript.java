/*    */ package android.renderscript;
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
/*    */ public class RenderScript
/*    */ {
/*    */   public static final int CREATE_FLAG_LOW_LATENCY = 2;
/*    */   public static final int CREATE_FLAG_LOW_POWER = 4;
/*    */   public static final int CREATE_FLAG_NONE = 0;
/*    */   
/*    */   public static enum ContextType
/*    */   {
/* 22 */     DEBUG, 
/* 23 */     NORMAL, 
/* 24 */     PROFILE;
/*    */     
/*    */     private ContextType() {}
/*    */   }
/*    */   
/* 29 */   public static class RSMessageHandler implements Runnable { public RSMessageHandler() { throw new RuntimeException("Stub!"); }
/* 30 */     public void run() { throw new RuntimeException("Stub!"); }
/* 31 */     protected int[] mData = null;
/*    */     protected int mID;
/*    */     protected int mLength; }
/*    */   
/*    */   public static class RSErrorHandler implements Runnable { protected String mErrorMessage;
/*    */     protected int mErrorNum;
/*    */     
/* 38 */     public RSErrorHandler() { throw new RuntimeException("Stub!"); }
/* 39 */     public void run() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static enum Priority
/*    */   {
/* 45 */     LOW, 
/* 46 */     NORMAL;
/*    */     private Priority() {} }
/* 48 */   RenderScript() { throw new RuntimeException("Stub!"); }
/* 49 */   public static long getMinorVersion() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setMessageHandler(RSMessageHandler msg) { throw new RuntimeException("Stub!"); }
/* 51 */   public RSMessageHandler getMessageHandler() { throw new RuntimeException("Stub!"); }
/* 52 */   public void sendMessage(int id, int[] data) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setErrorHandler(RSErrorHandler msg) { throw new RuntimeException("Stub!"); }
/* 54 */   public RSErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setPriority(Priority p) { throw new RuntimeException("Stub!"); }
/* 56 */   public final Context getApplicationContext() { throw new RuntimeException("Stub!"); }
/* 57 */   public static RenderScript create(Context ctx) { throw new RuntimeException("Stub!"); }
/* 58 */   public static RenderScript create(Context ctx, ContextType ct) { throw new RuntimeException("Stub!"); }
/* 59 */   public static RenderScript create(Context ctx, ContextType ct, int flags) { throw new RuntimeException("Stub!"); }
/* 60 */   public static void releaseAllContexts() { throw new RuntimeException("Stub!"); }
/* 61 */   public static RenderScript createMultiContext(Context ctx, ContextType ct, int flags, int API_number) { throw new RuntimeException("Stub!"); }
/* 62 */   public void contextDump() { throw new RuntimeException("Stub!"); }
/* 63 */   public void finish() { throw new RuntimeException("Stub!"); }
/* 64 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 65 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\RenderScript.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */