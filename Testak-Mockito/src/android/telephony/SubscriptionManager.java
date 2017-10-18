/*    */ package android.telephony;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubscriptionManager
/*    */ {
/*    */   public static final String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
/*    */   public static final String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
/*    */   public static final int DATA_ROAMING_DISABLE = 0;
/*    */   public static final int DATA_ROAMING_ENABLE = 1;
/*    */   public static final String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
/*    */   public static final int INVALID_SUBSCRIPTION_ID = -1;
/*    */   
/*    */   public static class OnSubscriptionsChangedListener
/*    */   {
/* 22 */     public OnSubscriptionsChangedListener() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onSubscriptionsChanged() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 25 */   SubscriptionManager() { throw new RuntimeException("Stub!"); }
/* 26 */   public static SubscriptionManager from(Context context) { throw new RuntimeException("Stub!"); }
/* 27 */   public void addOnSubscriptionsChangedListener(OnSubscriptionsChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 28 */   public void removeOnSubscriptionsChangedListener(OnSubscriptionsChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 29 */   public SubscriptionInfo getActiveSubscriptionInfo(int subId) { throw new RuntimeException("Stub!"); }
/* 30 */   public SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIndex) { throw new RuntimeException("Stub!"); }
/* 31 */   public List<SubscriptionInfo> getActiveSubscriptionInfoList() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getActiveSubscriptionInfoCount() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getActiveSubscriptionInfoCountMax() { throw new RuntimeException("Stub!"); }
/* 34 */   public static int getDefaultSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 35 */   public static int getDefaultVoiceSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 36 */   public static int getDefaultSmsSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 37 */   public static int getDefaultDataSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isNetworkRoaming(int subId) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\SubscriptionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */