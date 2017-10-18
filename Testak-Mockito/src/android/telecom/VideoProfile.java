/*    */ package android.telecom;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class VideoProfile
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class CameraCapabilities
/*    */     implements Parcelable
/*    */   {
/* 24 */     public CameraCapabilities(int width, int height) { throw new RuntimeException("Stub!"); }
/* 25 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */     public int getWidth() { throw new RuntimeException("Stub!"); }
/* 28 */     public int getHeight() { throw new RuntimeException("Stub!"); }
/*    */     
/* 30 */     public static final Parcelable.Creator<CameraCapabilities> CREATOR = null; }
/*    */   
/* 32 */   public VideoProfile(int videoState) { throw new RuntimeException("Stub!"); }
/* 33 */   public VideoProfile(int videoState, int quality) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getVideoState() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getQuality() { throw new RuntimeException("Stub!"); }
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 37 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 38 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 39 */   public static String videoStateToString(int videoState) { throw new RuntimeException("Stub!"); }
/* 40 */   public static boolean isAudioOnly(int videoState) { throw new RuntimeException("Stub!"); }
/* 41 */   public static boolean isVideo(int videoState) { throw new RuntimeException("Stub!"); }
/* 42 */   public static boolean isTransmissionEnabled(int videoState) { throw new RuntimeException("Stub!"); }
/* 43 */   public static boolean isReceptionEnabled(int videoState) { throw new RuntimeException("Stub!"); }
/* 44 */   public static boolean isBidirectional(int videoState) { throw new RuntimeException("Stub!"); }
/* 45 */   public static boolean isPaused(int videoState) { throw new RuntimeException("Stub!"); }
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
/* 56 */   public static final Parcelable.Creator<VideoProfile> CREATOR = null;
/*    */   public static final int QUALITY_DEFAULT = 4;
/*    */   public static final int QUALITY_HIGH = 1;
/*    */   public static final int QUALITY_LOW = 3;
/*    */   public static final int QUALITY_MEDIUM = 2;
/*    */   public static final int STATE_AUDIO_ONLY = 0;
/*    */   public static final int STATE_BIDIRECTIONAL = 3;
/*    */   public static final int STATE_PAUSED = 4;
/*    */   public static final int STATE_RX_ENABLED = 2;
/*    */   public static final int STATE_TX_ENABLED = 1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\VideoProfile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */