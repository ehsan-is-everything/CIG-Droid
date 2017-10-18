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
/*    */ public final class AudioAttributes
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CONTENT_TYPE_MOVIE = 3;
/*    */   public static final int CONTENT_TYPE_MUSIC = 2;
/*    */   public static final int CONTENT_TYPE_SONIFICATION = 4;
/*    */   public static final int CONTENT_TYPE_SPEECH = 1;
/*    */   public static final int CONTENT_TYPE_UNKNOWN = 0;
/*    */   
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/*    */     
/* 25 */     public Builder(AudioAttributes aa) { throw new RuntimeException("Stub!"); }
/*    */     
/* 27 */     public AudioAttributes build() { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setUsage(int usage) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setContentType(int contentType) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setLegacyStreamType(int streamType) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   AudioAttributes() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getContentType() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getUsage() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/* 37 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 38 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getVolumeControlStream() { throw new RuntimeException("Stub!"); }
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
/* 69 */   public static final Parcelable.Creator<AudioAttributes> CREATOR = null;
/*    */   public static final int FLAG_AUDIBILITY_ENFORCED = 1;
/*    */   public static final int FLAG_HW_AV_SYNC = 16;
/*    */   @Deprecated
/*    */   public static final int FLAG_LOW_LATENCY = 256;
/*    */   public static final int USAGE_ALARM = 4;
/*    */   public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
/*    */   public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
/*    */   public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
/*    */   public static final int USAGE_ASSISTANT = 16;
/*    */   public static final int USAGE_GAME = 14;
/*    */   public static final int USAGE_MEDIA = 1;
/*    */   public static final int USAGE_NOTIFICATION = 5;
/*    */   public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
/*    */   public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
/*    */   public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
/*    */   public static final int USAGE_NOTIFICATION_EVENT = 10;
/*    */   public static final int USAGE_NOTIFICATION_RINGTONE = 6;
/*    */   public static final int USAGE_UNKNOWN = 0;
/*    */   public static final int USAGE_VOICE_COMMUNICATION = 2;
/*    */   public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\AudioAttributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */