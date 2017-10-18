/*    */ package android.app.usage;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class UsageStatsManager
/*    */ {
/*    */   public static final int INTERVAL_BEST = 4;
/*    */   public static final int INTERVAL_DAILY = 0;
/*    */   public static final int INTERVAL_MONTHLY = 2;
/*    */   public static final int INTERVAL_WEEKLY = 1;
/*    */   public static final int INTERVAL_YEARLY = 3;
/*    */   
/* 20 */   UsageStatsManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public List<UsageStats> queryUsageStats(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
/* 22 */   public List<ConfigurationStats> queryConfigurations(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
/* 23 */   public UsageEvents queryEvents(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
/* 24 */   public Map<String, UsageStats> queryAndAggregateUsageStats(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isAppInactive(String packageName) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\usage\UsageStatsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */