/*    */ package android.app.usage;
/*    */ 
/*    */ 
/*    */ public final class NetworkStats
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static class Bucket
/*    */   {
/*    */     public static final int METERED_ALL = -1;
/*    */     public static final int METERED_NO = 1;
/*    */     public static final int METERED_YES = 2;
/*    */     public static final int ROAMING_ALL = -1;
/*    */     public static final int ROAMING_NO = 1;
/*    */     public static final int ROAMING_YES = 2;
/*    */     public static final int STATE_ALL = -1;
/*    */     public static final int STATE_DEFAULT = 1;
/*    */     public static final int STATE_FOREGROUND = 2;
/*    */     public static final int TAG_NONE = 0;
/*    */     public static final int UID_ALL = -1;
/*    */     public static final int UID_REMOVED = -4;
/*    */     public static final int UID_TETHERING = -5;
/*    */     
/* 23 */     public Bucket() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getUid() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getTag() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getState() { throw new RuntimeException("Stub!"); }
/* 27 */     public int getMetered() { throw new RuntimeException("Stub!"); }
/* 28 */     public int getRoaming() { throw new RuntimeException("Stub!"); }
/* 29 */     public long getStartTimeStamp() { throw new RuntimeException("Stub!"); }
/* 30 */     public long getEndTimeStamp() { throw new RuntimeException("Stub!"); }
/* 31 */     public long getRxBytes() { throw new RuntimeException("Stub!"); }
/* 32 */     public long getTxBytes() { throw new RuntimeException("Stub!"); }
/* 33 */     public long getRxPackets() { throw new RuntimeException("Stub!"); }
/* 34 */     public long getTxPackets() { throw new RuntimeException("Stub!"); }
/*    */   }
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
/* 49 */   NetworkStats() { throw new RuntimeException("Stub!"); }
/* 50 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean getNextBucket(Bucket bucketOut) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean hasNextBucket() { throw new RuntimeException("Stub!"); }
/* 53 */   public void close() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\usage\NetworkStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */