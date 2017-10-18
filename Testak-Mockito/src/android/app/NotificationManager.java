/*    */ package android.app;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class NotificationManager {
/*    */   public static final String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
/*    */   public static final String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
/*    */   public static final String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
/*    */   public static final int IMPORTANCE_DEFAULT = 3;
/*    */   public static final int IMPORTANCE_HIGH = 4;
/*    */   public static final int IMPORTANCE_LOW = 2;
/*    */   public static final int IMPORTANCE_MAX = 5;
/*    */   public static final int IMPORTANCE_MIN = 1;
/*    */   public static final int IMPORTANCE_NONE = 0;
/*    */   public static final int IMPORTANCE_UNSPECIFIED = -1000;
/*    */   public static final int INTERRUPTION_FILTER_ALARMS = 4;
/*    */   public static final int INTERRUPTION_FILTER_ALL = 1;
/*    */   public static final int INTERRUPTION_FILTER_NONE = 3;
/*    */   public static final int INTERRUPTION_FILTER_PRIORITY = 2;
/*    */   public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
/*    */   
/*    */   public static class Policy implements android.os.Parcelable {
/* 23 */     public Policy(int priorityCategories, int priorityCallSenders, int priorityMessageSenders) { throw new RuntimeException("Stub!"); }
/* 24 */     public Policy(int priorityCategories, int priorityCallSenders, int priorityMessageSenders, int suppressedVisualEffects) { throw new RuntimeException("Stub!"); }
/* 25 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 29 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */     public static String suppressedEffectsToString(int effects) { throw new RuntimeException("Stub!"); }
/* 31 */     public static String priorityCategoriesToString(int priorityCategories) { throw new RuntimeException("Stub!"); }
/* 32 */     public static String prioritySendersToString(int prioritySenders) { throw new RuntimeException("Stub!"); }
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
/* 48 */     public static final android.os.Parcelable.Creator<Policy> CREATOR = null;
/*    */     public static final int PRIORITY_CATEGORY_CALLS = 8; public static final int PRIORITY_CATEGORY_EVENTS = 2; public static final int PRIORITY_CATEGORY_MESSAGES = 4; public static final int PRIORITY_CATEGORY_REMINDERS = 1; public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16; public static final int PRIORITY_SENDERS_ANY = 0; public static final int PRIORITY_SENDERS_CONTACTS = 1; public static final int PRIORITY_SENDERS_STARRED = 2; public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1; public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2; public final int priorityCallSenders; public final int priorityCategories; public final int priorityMessageSenders; public final int suppressedVisualEffects; }
/* 50 */   NotificationManager() { throw new RuntimeException("Stub!"); }
/* 51 */   public void notify(int id, Notification notification) { throw new RuntimeException("Stub!"); }
/* 52 */   public void notify(String tag, int id, Notification notification) { throw new RuntimeException("Stub!"); }
/* 53 */   public void cancel(int id) { throw new RuntimeException("Stub!"); }
/* 54 */   public void cancel(String tag, int id) { throw new RuntimeException("Stub!"); }
/* 55 */   public void cancelAll() { throw new RuntimeException("Stub!"); }
/* 56 */   public void createNotificationChannelGroup(NotificationChannelGroup group) { throw new RuntimeException("Stub!"); }
/* 57 */   public void createNotificationChannelGroups(List<NotificationChannelGroup> groups) { throw new RuntimeException("Stub!"); }
/* 58 */   public void createNotificationChannel(NotificationChannel channel) { throw new RuntimeException("Stub!"); }
/* 59 */   public void createNotificationChannels(List<NotificationChannel> channels) { throw new RuntimeException("Stub!"); }
/* 60 */   public NotificationChannel getNotificationChannel(String channelId) { throw new RuntimeException("Stub!"); }
/* 61 */   public List<NotificationChannel> getNotificationChannels() { throw new RuntimeException("Stub!"); }
/* 62 */   public void deleteNotificationChannel(String channelId) { throw new RuntimeException("Stub!"); }
/* 63 */   public List<NotificationChannelGroup> getNotificationChannelGroups() { throw new RuntimeException("Stub!"); }
/* 64 */   public void deleteNotificationChannelGroup(String groupId) { throw new RuntimeException("Stub!"); }
/* 65 */   public java.util.Map<String, AutomaticZenRule> getAutomaticZenRules() { throw new RuntimeException("Stub!"); }
/* 66 */   public AutomaticZenRule getAutomaticZenRule(String id) { throw new RuntimeException("Stub!"); }
/* 67 */   public String addAutomaticZenRule(AutomaticZenRule automaticZenRule) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean updateAutomaticZenRule(String id, AutomaticZenRule automaticZenRule) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean removeAutomaticZenRule(String id) { throw new RuntimeException("Stub!"); }
/* 70 */   public int getImportance() { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean areNotificationsEnabled() { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean isNotificationPolicyAccessGranted() { throw new RuntimeException("Stub!"); }
/* 73 */   public Policy getNotificationPolicy() { throw new RuntimeException("Stub!"); }
/* 74 */   public void setNotificationPolicy(Policy policy) { throw new RuntimeException("Stub!"); }
/* 75 */   public android.service.notification.StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); }
/* 76 */   public final int getCurrentInterruptionFilter() { throw new RuntimeException("Stub!"); }
/* 77 */   public final void setInterruptionFilter(int interruptionFilter) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\NotificationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */