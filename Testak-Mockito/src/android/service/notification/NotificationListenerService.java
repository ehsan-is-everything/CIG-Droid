/*    */ package android.service.notification;
/*    */ 
/*    */ import android.os.UserHandle;
/*    */ 
/*    */ public abstract class NotificationListenerService extends android.app.Service {
/*    */   public static final int HINT_HOST_DISABLE_CALL_EFFECTS = 4;
/*    */   public static final int HINT_HOST_DISABLE_EFFECTS = 1;
/*    */   public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = 2;
/*    */   public static final int INTERRUPTION_FILTER_ALARMS = 4;
/*    */   public static final int INTERRUPTION_FILTER_ALL = 1;
/*    */   public static final int INTERRUPTION_FILTER_NONE = 3;
/*    */   public static final int INTERRUPTION_FILTER_PRIORITY = 2;
/*    */   public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
/*    */   public static final int NOTIFICATION_CHANNEL_OR_GROUP_ADDED = 1;
/*    */   public static final int NOTIFICATION_CHANNEL_OR_GROUP_DELETED = 3;
/*    */   public static final int NOTIFICATION_CHANNEL_OR_GROUP_UPDATED = 2;
/*    */   public static final int REASON_APP_CANCEL = 8;
/*    */   public static final int REASON_APP_CANCEL_ALL = 9;
/*    */   public static final int REASON_CANCEL = 2;
/*    */   public static final int REASON_CANCEL_ALL = 3;
/*    */   public static final int REASON_CHANNEL_BANNED = 17;
/*    */   
/* 23 */   public static class Ranking { public Ranking() { throw new RuntimeException("Stub!"); }
/* 24 */     public String getKey() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getRank() { throw new RuntimeException("Stub!"); }
/* 26 */     public boolean isAmbient() { throw new RuntimeException("Stub!"); }
/* 27 */     public int getSuppressedVisualEffects() { throw new RuntimeException("Stub!"); }
/* 28 */     public boolean matchesInterruptionFilter() { throw new RuntimeException("Stub!"); }
/* 29 */     public int getImportance() { throw new RuntimeException("Stub!"); }
/* 30 */     public CharSequence getImportanceExplanation() { throw new RuntimeException("Stub!"); }
/* 31 */     public String getOverrideGroupKey() { throw new RuntimeException("Stub!"); }
/* 32 */     public android.app.NotificationChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 33 */     public boolean canShowBadge() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static final int REASON_CLICK = 1;
/*    */   public static final int REASON_ERROR = 4;
/*    */   
/* 38 */   public static class RankingMap implements android.os.Parcelable { RankingMap() { throw new RuntimeException("Stub!"); }
/* 39 */     public String[] getOrderedKeys() { throw new RuntimeException("Stub!"); }
/* 40 */     public boolean getRanking(String key, NotificationListenerService.Ranking outRanking) { throw new RuntimeException("Stub!"); }
/* 41 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 42 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 44 */     public static final android.os.Parcelable.Creator<RankingMap> CREATOR = null; }
/*    */   
/* 46 */   public NotificationListenerService() { throw new RuntimeException("Stub!"); }
/* 47 */   protected void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
/* 48 */   public void onNotificationPosted(StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onNotificationPosted(StatusBarNotification sbn, RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
/* 50 */   public void onNotificationRemoved(StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
/* 51 */   public void onNotificationRemoved(StatusBarNotification sbn, RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
/* 52 */   public void onNotificationRemoved(StatusBarNotification sbn, RankingMap rankingMap, int reason) { throw new RuntimeException("Stub!"); }
/* 53 */   public void onListenerConnected() { throw new RuntimeException("Stub!"); }
/* 54 */   public void onListenerDisconnected() { throw new RuntimeException("Stub!"); }
/* 55 */   public void onNotificationRankingUpdate(RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
/* 56 */   public void onListenerHintsChanged(int hints) { throw new RuntimeException("Stub!"); }
/* 57 */   public void onNotificationChannelModified(String pkg, UserHandle user, android.app.NotificationChannel channel, int modificationType) { throw new RuntimeException("Stub!"); }
/* 58 */   public void onNotificationChannelGroupModified(String pkg, UserHandle user, android.app.NotificationChannelGroup group, int modificationType) { throw new RuntimeException("Stub!"); }
/* 59 */   public void onInterruptionFilterChanged(int interruptionFilter) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public final void cancelNotification(String pkg, String tag, int id) { throw new RuntimeException("Stub!"); }
/* 62 */   public final void cancelNotification(String key) { throw new RuntimeException("Stub!"); }
/* 63 */   public final void cancelAllNotifications() { throw new RuntimeException("Stub!"); }
/* 64 */   public final void cancelNotifications(String[] keys) { throw new RuntimeException("Stub!"); }
/* 65 */   public final void snoozeNotification(String key, long durationMs) { throw new RuntimeException("Stub!"); }
/* 66 */   public final void setNotificationsShown(String[] keys) { throw new RuntimeException("Stub!"); }
/* 67 */   public final void updateNotificationChannel(String pkg, UserHandle user, android.app.NotificationChannel channel) { throw new RuntimeException("Stub!"); }
/* 68 */   public final java.util.List<android.app.NotificationChannel> getNotificationChannels(String pkg, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 69 */   public final java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(String pkg, UserHandle user) { throw new RuntimeException("Stub!"); }
/* 70 */   public StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); }
/* 71 */   public final StatusBarNotification[] getSnoozedNotifications() { throw new RuntimeException("Stub!"); }
/* 72 */   public StatusBarNotification[] getActiveNotifications(String[] keys) { throw new RuntimeException("Stub!"); }
/* 73 */   public final int getCurrentListenerHints() { throw new RuntimeException("Stub!"); }
/* 74 */   public final int getCurrentInterruptionFilter() { throw new RuntimeException("Stub!"); }
/* 75 */   public final void requestListenerHints(int hints) { throw new RuntimeException("Stub!"); }
/* 76 */   public final void requestInterruptionFilter(int interruptionFilter) { throw new RuntimeException("Stub!"); }
/* 77 */   public RankingMap getCurrentRanking() { throw new RuntimeException("Stub!"); }
/* 78 */   public android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/* 79 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 80 */   public static void requestRebind(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
/* 81 */   public final void requestUnbind() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int REASON_GROUP_OPTIMIZATION = 13;
/*    */   public static final int REASON_GROUP_SUMMARY_CANCELED = 12;
/*    */   public static final int REASON_LISTENER_CANCEL = 10;
/*    */   public static final int REASON_LISTENER_CANCEL_ALL = 11;
/*    */   public static final int REASON_PACKAGE_BANNED = 7;
/*    */   public static final int REASON_PACKAGE_CHANGED = 5;
/*    */   public static final int REASON_PACKAGE_SUSPENDED = 14;
/*    */   public static final int REASON_PROFILE_TURNED_OFF = 15;
/*    */   public static final int REASON_SNOOZED = 18;
/*    */   public static final int REASON_TIMEOUT = 19;
/*    */   public static final int REASON_UNAUTOBUNDLED = 16;
/*    */   public static final int REASON_USER_STOPPED = 6;
/*    */   public static final String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
/*    */   public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
/*    */   public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\notification\NotificationListenerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */