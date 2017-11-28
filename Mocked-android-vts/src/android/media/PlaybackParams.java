/*    */ package android.media;
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
/*    */ public final class PlaybackParams
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int AUDIO_FALLBACK_MODE_DEFAULT = 0;
/*    */   public static final int AUDIO_FALLBACK_MODE_FAIL = 2;
/*    */   public static final int AUDIO_FALLBACK_MODE_MUTE = 1;
/*    */   
/* 21 */   public PlaybackParams() { throw new RuntimeException("Stub!"); }
/* 22 */   public PlaybackParams allowDefaults() { throw new RuntimeException("Stub!"); }
/* 23 */   public PlaybackParams setAudioFallbackMode(int audioFallbackMode) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getAudioFallbackMode() { throw new RuntimeException("Stub!"); }
/* 25 */   public PlaybackParams setPitch(float pitch) { throw new RuntimeException("Stub!"); }
/* 26 */   public float getPitch() { throw new RuntimeException("Stub!"); }
/* 27 */   public PlaybackParams setSpeed(float speed) { throw new RuntimeException("Stub!"); }
/* 28 */   public float getSpeed() { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final Parcelable.Creator<PlaybackParams> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\PlaybackParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */