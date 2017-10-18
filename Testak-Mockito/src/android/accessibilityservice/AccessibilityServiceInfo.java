/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public class AccessibilityServiceInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public AccessibilityServiceInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 23 */   public ResolveInfo getResolveInfo() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getSettingsActivityName() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 26 */   public boolean getCanRetrieveWindowContent() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getCapabilities() { throw new RuntimeException("Stub!"); }
/* 28 */   public CharSequence loadSummary(PackageManager packageManager) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public String getDescription() { throw new RuntimeException("Stub!"); }
/* 31 */   public String loadDescription(PackageManager packageManager) { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel parcel, int flagz) { throw new RuntimeException("Stub!"); }
/* 34 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */   public static String feedbackTypeToString(int feedbackType) { throw new RuntimeException("Stub!"); }
/* 38 */   public static String flagToString(int flag) { throw new RuntimeException("Stub!"); }
/* 39 */   public static String capabilityToString(int capability) { throw new RuntimeException("Stub!"); }
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
/* 71 */   public String[] packageNames = null; public long notificationTimeout; public int flags; public int feedbackType; public int eventTypes; public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = 64; public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4; public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = 512; public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32; @Deprecated
/* 72 */   public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8; public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = 256; public static final int FLAG_REPORT_VIEW_IDS = 16; public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2; public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = 128; public static final int FEEDBACK_VISUAL = 8; public static final int FEEDBACK_SPOKEN = 1; public static final int FEEDBACK_HAPTIC = 2; public static final int FEEDBACK_GENERIC = 16; public static final int FEEDBACK_BRAILLE = 32; public static final int FEEDBACK_AUDIBLE = 4; public static final int FEEDBACK_ALL_MASK = -1; public static final int DEFAULT = 1; public static final Parcelable.Creator<AccessibilityServiceInfo> CREATOR = null;
/*    */   public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
/*    */   public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
/*    */   public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = 64;
/*    */   public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
/*    */   @Deprecated
/*    */   public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
/*    */   public static final int CAPABILITY_CAN_PERFORM_GESTURES = 32;
/*    */   public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = 16;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\accessibilityservice\AccessibilityServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */