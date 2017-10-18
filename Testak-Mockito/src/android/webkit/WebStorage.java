/*    */ package android.webkit;
/*    */ 
/*    */ import java.util.Map;
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
/*    */ public class WebStorage
/*    */ {
/*    */   public static class Origin
/*    */   {
/* 27 */     Origin() { throw new RuntimeException("Stub!"); }
/* 28 */     public String getOrigin() { throw new RuntimeException("Stub!"); }
/* 29 */     public long getQuota() { throw new RuntimeException("Stub!"); }
/* 30 */     public long getUsage() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   WebStorage() { throw new RuntimeException("Stub!"); }
/* 33 */   public void getOrigins(ValueCallback<Map> callback) { throw new RuntimeException("Stub!"); }
/* 34 */   public void getUsageForOrigin(String origin, ValueCallback<Long> callback) { throw new RuntimeException("Stub!"); }
/* 35 */   public void getQuotaForOrigin(String origin, ValueCallback<Long> callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void setQuotaForOrigin(String origin, long quota) { throw new RuntimeException("Stub!"); }
/* 38 */   public void deleteOrigin(String origin) { throw new RuntimeException("Stub!"); }
/* 39 */   public void deleteAllData() { throw new RuntimeException("Stub!"); }
/* 40 */   public static WebStorage getInstance() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface QuotaUpdater
/*    */   {
/*    */     public abstract void updateQuota(long paramLong);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\webkit\WebStorage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */