/*    */ package android.media;
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
/*    */ public final class MediaCas
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static class PluginDescriptor
/*    */   {
/* 23 */     PluginDescriptor() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getSystemId() { throw new RuntimeException("Stub!"); }
/* 25 */     public String getName() { throw new RuntimeException("Stub!"); }
/* 26 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public final class Session
/*    */     implements AutoCloseable {
/* 31 */     Session() { throw new RuntimeException("Stub!"); }
/* 32 */     public void setPrivateData(byte[] data) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 33 */     public void processEcm(byte[] data, int offset, int length) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 34 */     public void processEcm(byte[] data) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 35 */     public void close() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 41 */   public MediaCas(int CA_system_id)
/* 41 */     throws MediaCasException.UnsupportedCasException { throw new RuntimeException("Stub!"); }
/* 42 */   public static boolean isSystemIdSupported(int CA_system_id) { throw new RuntimeException("Stub!"); }
/* 43 */   public static PluginDescriptor[] enumeratePlugins() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setEventListener(EventListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setPrivateData(byte[] data) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 46 */   public Session openSession() throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 47 */   public void processEmm(byte[] data, int offset, int length) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 48 */   public void processEmm(byte[] data) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 49 */   public void sendEvent(int event, int arg, byte[] data) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 50 */   public void provision(String provisionString) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 51 */   public void refreshEntitlements(int refreshType, byte[] refreshData) throws MediaCasException { throw new RuntimeException("Stub!"); }
/* 52 */   public void close() { throw new RuntimeException("Stub!"); }
/* 53 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface EventListener
/*    */   {
/*    */     public abstract void onEvent(MediaCas paramMediaCas, int paramInt1, int paramInt2, byte[] paramArrayOfByte);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaCas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */