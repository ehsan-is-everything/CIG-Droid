/*    */ package android.app.usage;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.os.RemoteException;
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
/*    */ public class NetworkStatsManager
/*    */ {
/*    */   public static abstract class UsageCallback
/*    */   {
/* 22 */     public UsageCallback() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onThresholdReached(int paramInt, String paramString); }
/* 25 */   NetworkStatsManager() { throw new RuntimeException("Stub!"); }
/* 26 */   public NetworkStats.Bucket querySummaryForDevice(int networkType, String subscriberId, long startTime, long endTime) throws SecurityException, RemoteException { throw new RuntimeException("Stub!"); }
/* 27 */   public NetworkStats.Bucket querySummaryForUser(int networkType, String subscriberId, long startTime, long endTime) throws SecurityException, RemoteException { throw new RuntimeException("Stub!"); }
/* 28 */   public NetworkStats querySummary(int networkType, String subscriberId, long startTime, long endTime) throws SecurityException, RemoteException { throw new RuntimeException("Stub!"); }
/* 29 */   public NetworkStats queryDetailsForUid(int networkType, String subscriberId, long startTime, long endTime, int uid) throws SecurityException, RemoteException { throw new RuntimeException("Stub!"); }
/* 30 */   public NetworkStats queryDetailsForUidTag(int networkType, String subscriberId, long startTime, long endTime, int uid, int tag) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 31 */   public NetworkStats queryDetails(int networkType, String subscriberId, long startTime, long endTime) throws SecurityException, RemoteException { throw new RuntimeException("Stub!"); }
/* 32 */   public void registerUsageCallback(int networkType, String subscriberId, long thresholdBytes, UsageCallback callback) { throw new RuntimeException("Stub!"); }
/* 33 */   public void registerUsageCallback(int networkType, String subscriberId, long thresholdBytes, UsageCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 34 */   public void unregisterUsageCallback(UsageCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\usage\NetworkStatsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */