/*    */ package android.view.accessibility;
/*    */ 
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
/*    */ public final class AccessibilityEvent
/*    */   extends AccessibilityRecord
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
/*    */   public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
/*    */   public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
/*    */   public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
/*    */   
/* 22 */   AccessibilityEvent() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getRecordCount() { throw new RuntimeException("Stub!"); }
/* 24 */   public void appendRecord(AccessibilityRecord record) { throw new RuntimeException("Stub!"); }
/* 25 */   public AccessibilityRecord getRecord(int index) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getEventType() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getContentChangeTypes() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setContentChangeTypes(int changeTypes) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setEventType(int eventType) { throw new RuntimeException("Stub!"); }
/* 30 */   public long getEventTime() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setEventTime(long eventTime) { throw new RuntimeException("Stub!"); }
/* 32 */   public CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPackageName(CharSequence packageName) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setMovementGranularity(int granularity) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getMovementGranularity() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setAction(int action) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getAction() { throw new RuntimeException("Stub!"); }
/* 38 */   public static AccessibilityEvent obtain(int eventType) { throw new RuntimeException("Stub!"); }
/* 39 */   public static AccessibilityEvent obtain(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 40 */   public static AccessibilityEvent obtain() { throw new RuntimeException("Stub!"); }
/* 41 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 42 */   public void initFromParcel(Parcel parcel) { throw new RuntimeException("Stub!"); }
/* 43 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 44 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 46 */   public static String eventTypeToString(int eventType) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/* 81 */   public static final Parcelable.Creator<AccessibilityEvent> CREATOR = null;
/*    */   public static final int INVALID_POSITION = -1;
/*    */   @Deprecated
/*    */   public static final int MAX_TEXT_LENGTH = 500;
/*    */   public static final int TYPES_ALL_MASK = -1;
/*    */   public static final int TYPE_ANNOUNCEMENT = 16384;
/*    */   public static final int TYPE_ASSIST_READING_CONTEXT = 16777216;
/*    */   public static final int TYPE_GESTURE_DETECTION_END = 524288;
/*    */   public static final int TYPE_GESTURE_DETECTION_START = 262144;
/*    */   public static final int TYPE_NOTIFICATION_STATE_CHANGED = 64;
/*    */   public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 1024;
/*    */   public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 512;
/*    */   public static final int TYPE_TOUCH_INTERACTION_END = 2097152;
/*    */   public static final int TYPE_TOUCH_INTERACTION_START = 1048576;
/*    */   public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 32768;
/*    */   public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 65536;
/*    */   public static final int TYPE_VIEW_CLICKED = 1;
/*    */   public static final int TYPE_VIEW_CONTEXT_CLICKED = 8388608;
/*    */   public static final int TYPE_VIEW_FOCUSED = 8;
/*    */   public static final int TYPE_VIEW_HOVER_ENTER = 128;
/*    */   public static final int TYPE_VIEW_HOVER_EXIT = 256;
/*    */   public static final int TYPE_VIEW_LONG_CLICKED = 2;
/*    */   public static final int TYPE_VIEW_SCROLLED = 4096;
/*    */   public static final int TYPE_VIEW_SELECTED = 4;
/*    */   public static final int TYPE_VIEW_TEXT_CHANGED = 16;
/*    */   public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 8192;
/*    */   public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 131072;
/*    */   public static final int TYPE_WINDOWS_CHANGED = 4194304;
/*    */   public static final int TYPE_WINDOW_CONTENT_CHANGED = 2048;
/*    */   public static final int TYPE_WINDOW_STATE_CHANGED = 32;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\accessibility\AccessibilityEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */