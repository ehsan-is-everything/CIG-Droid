/*     */ package android.media;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ 
/*     */ public final class AudioFormat
/*     */   implements android.os.Parcelable {
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_DEFAULT = 1;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_INVALID = 0;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_MONO = 2;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_STEREO = 3;
/*     */   public static final int CHANNEL_INVALID = 0;
/*     */   public static final int CHANNEL_IN_BACK = 32;
/*     */   public static final int CHANNEL_IN_BACK_PROCESSED = 512;
/*     */   public static final int CHANNEL_IN_DEFAULT = 1;
/*     */   public static final int CHANNEL_IN_FRONT = 16;
/*     */   public static final int CHANNEL_IN_FRONT_PROCESSED = 256;
/*     */   
/*     */   public static class Builder {
/*  23 */     public Builder() { throw new RuntimeException("Stub!"); }
/*  24 */     public Builder(AudioFormat af) { throw new RuntimeException("Stub!"); }
/*  25 */     public AudioFormat build() { throw new RuntimeException("Stub!"); }
/*  26 */     public Builder setEncoding(int encoding) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  27 */     public Builder setChannelMask(int channelMask) { throw new RuntimeException("Stub!"); }
/*  28 */     public Builder setChannelIndexMask(int channelIndexMask) { throw new RuntimeException("Stub!"); }
/*  29 */     public Builder setSampleRate(int sampleRate) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } }
/*     */   
/*  31 */   AudioFormat() { throw new RuntimeException("Stub!"); }
/*  32 */   public int getEncoding() { throw new RuntimeException("Stub!"); }
/*  33 */   public int getSampleRate() { throw new RuntimeException("Stub!"); }
/*  34 */   public int getChannelMask() { throw new RuntimeException("Stub!"); }
/*  35 */   public int getChannelIndexMask() { throw new RuntimeException("Stub!"); }
/*  36 */   public int getChannelCount() { throw new RuntimeException("Stub!"); }
/*  37 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  38 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*  40 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  41 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */   public static final int CHANNEL_IN_LEFT = 4;
/*     */   
/*     */   public static final int CHANNEL_IN_LEFT_PROCESSED = 64;
/*     */   
/*     */   public static final int CHANNEL_IN_MONO = 16;
/*     */   
/*     */   public static final int CHANNEL_IN_PRESSURE = 1024;
/*     */   
/*     */   public static final int CHANNEL_IN_RIGHT = 8;
/*     */   
/*     */   public static final int CHANNEL_IN_RIGHT_PROCESSED = 128;
/*     */   
/*     */   public static final int CHANNEL_IN_STEREO = 12;
/*     */   
/*     */   public static final int CHANNEL_IN_VOICE_DNLINK = 32768;
/*     */   
/*     */   public static final int CHANNEL_IN_VOICE_UPLINK = 16384;
/*     */   
/*     */   public static final int CHANNEL_IN_X_AXIS = 2048;
/*     */   
/*     */   public static final int CHANNEL_IN_Y_AXIS = 4096;
/*     */   
/*     */   public static final int CHANNEL_IN_Z_AXIS = 8192;
/*     */   
/*     */   public static final int CHANNEL_OUT_5POINT1 = 252;
/*     */   
/*     */   @Deprecated
/*     */   public static final int CHANNEL_OUT_7POINT1 = 1020;
/*     */   
/*     */   public static final int CHANNEL_OUT_7POINT1_SURROUND = 6396;
/*     */   
/*     */   public static final int CHANNEL_OUT_BACK_CENTER = 1024;
/*     */   
/*     */   public static final int CHANNEL_OUT_BACK_LEFT = 64;
/*     */   
/*     */   public static final int CHANNEL_OUT_BACK_RIGHT = 128;
/*     */   
/*     */   public static final int CHANNEL_OUT_DEFAULT = 1;
/*     */   
/*     */   public static final int CHANNEL_OUT_FRONT_CENTER = 16;
/*     */   
/*     */   public static final int CHANNEL_OUT_FRONT_LEFT = 4;
/*     */   
/*     */   public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = 256;
/*     */   
/*     */   public static final int CHANNEL_OUT_FRONT_RIGHT = 8;
/*     */   
/*     */   public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = 512;
/*     */   
/*     */   public static final int CHANNEL_OUT_LOW_FREQUENCY = 32;
/*     */   
/*     */   public static final int CHANNEL_OUT_MONO = 4;
/*     */   public static final int CHANNEL_OUT_QUAD = 204;
/*     */   public static final int CHANNEL_OUT_SIDE_LEFT = 2048;
/*     */   public static final int CHANNEL_OUT_SIDE_RIGHT = 4096;
/*     */   public static final int CHANNEL_OUT_STEREO = 12;
/*     */   public static final int CHANNEL_OUT_SURROUND = 1052;
/* 101 */   public static final android.os.Parcelable.Creator<AudioFormat> CREATOR = null;
/*     */   public static final int ENCODING_AC3 = 5;
/*     */   public static final int ENCODING_DEFAULT = 1;
/*     */   public static final int ENCODING_DOLBY_TRUEHD = 14;
/*     */   public static final int ENCODING_DTS = 7;
/*     */   public static final int ENCODING_DTS_HD = 8;
/*     */   public static final int ENCODING_E_AC3 = 6;
/*     */   public static final int ENCODING_IEC61937 = 13;
/*     */   public static final int ENCODING_INVALID = 0;
/*     */   public static final int ENCODING_PCM_16BIT = 2;
/*     */   public static final int ENCODING_PCM_8BIT = 3;
/*     */   public static final int ENCODING_PCM_FLOAT = 4;
/*     */   public static final int SAMPLE_RATE_UNSPECIFIED = 0;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\AudioFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */