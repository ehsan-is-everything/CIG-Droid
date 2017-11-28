/*    */ package android.media.tv;
/*    */ 
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ public final class TvInputManager
/*    */ {
/*    */   public static final String ACTION_BLOCKED_RATINGS_CHANGED = "android.media.tv.action.BLOCKED_RATINGS_CHANGED";
/*    */   public static final String ACTION_PARENTAL_CONTROLS_ENABLED_CHANGED = "android.media.tv.action.PARENTAL_CONTROLS_ENABLED_CHANGED";
/*    */   public static final String ACTION_QUERY_CONTENT_RATING_SYSTEMS = "android.media.tv.action.QUERY_CONTENT_RATING_SYSTEMS";
/*    */   public static final String ACTION_SETUP_INPUTS = "android.media.tv.action.SETUP_INPUTS";
/*    */   public static final String ACTION_VIEW_RECORDING_SCHEDULES = "android.media.tv.action.VIEW_RECORDING_SCHEDULES";
/*    */   public static final int INPUT_STATE_CONNECTED = 0;
/*    */   public static final int INPUT_STATE_CONNECTED_STANDBY = 1;
/*    */   public static final int INPUT_STATE_DISCONNECTED = 2;
/*    */   public static final String META_DATA_CONTENT_RATING_SYSTEMS = "android.media.tv.metadata.CONTENT_RATING_SYSTEMS";
/*    */   public static final int RECORDING_ERROR_INSUFFICIENT_SPACE = 1;
/*    */   public static final int RECORDING_ERROR_RESOURCE_BUSY = 2;
/*    */   
/*    */   public static abstract class TvInputCallback
/*    */   {
/* 22 */     public TvInputCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onInputStateChanged(String inputId, int state) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onInputAdded(String inputId) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onInputRemoved(String inputId) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onInputUpdated(String inputId) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onTvInputInfoUpdated(TvInputInfo inputInfo) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   TvInputManager() { throw new RuntimeException("Stub!"); }
/* 30 */   public java.util.List<TvInputInfo> getTvInputList() { throw new RuntimeException("Stub!"); }
/* 31 */   public TvInputInfo getTvInputInfo(String inputId) { throw new RuntimeException("Stub!"); }
/* 32 */   public void updateTvInputInfo(TvInputInfo inputInfo) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getInputState(String inputId) { throw new RuntimeException("Stub!"); }
/* 34 */   public void registerCallback(TvInputCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 35 */   public void unregisterCallback(TvInputCallback callback) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isParentalControlsEnabled() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isRatingBlocked(TvContentRating rating) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int RECORDING_ERROR_UNKNOWN = 0;
/*    */   public static final long TIME_SHIFT_INVALID_TIME = Long.MIN_VALUE;
/*    */   public static final int TIME_SHIFT_STATUS_AVAILABLE = 3;
/*    */   public static final int TIME_SHIFT_STATUS_UNAVAILABLE = 2;
/*    */   public static final int TIME_SHIFT_STATUS_UNKNOWN = 0;
/*    */   public static final int TIME_SHIFT_STATUS_UNSUPPORTED = 1;
/*    */   public static final int VIDEO_UNAVAILABLE_REASON_AUDIO_ONLY = 4;
/*    */   public static final int VIDEO_UNAVAILABLE_REASON_BUFFERING = 3;
/*    */   public static final int VIDEO_UNAVAILABLE_REASON_TUNING = 1;
/*    */   public static final int VIDEO_UNAVAILABLE_REASON_UNKNOWN = 0;
/*    */   public static final int VIDEO_UNAVAILABLE_REASON_WEAK_SIGNAL = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\tv\TvInputManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */