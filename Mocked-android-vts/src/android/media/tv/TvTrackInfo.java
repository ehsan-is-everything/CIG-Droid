/*    */ package android.media.tv;
/*    */ 
/*    */ import android.os.Bundle;
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
/*    */ public final class TvTrackInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(int type, String id) { throw new RuntimeException("Stub!"); }
/* 24 */     public final Builder setLanguage(String language) { throw new RuntimeException("Stub!"); }
/* 25 */     public final Builder setDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/* 26 */     public final Builder setAudioChannelCount(int audioChannelCount) { throw new RuntimeException("Stub!"); }
/* 27 */     public final Builder setAudioSampleRate(int audioSampleRate) { throw new RuntimeException("Stub!"); }
/* 28 */     public final Builder setVideoWidth(int videoWidth) { throw new RuntimeException("Stub!"); }
/* 29 */     public final Builder setVideoHeight(int videoHeight) { throw new RuntimeException("Stub!"); }
/* 30 */     public final Builder setVideoFrameRate(float videoFrameRate) { throw new RuntimeException("Stub!"); }
/* 31 */     public final Builder setVideoPixelAspectRatio(float videoPixelAspectRatio) { throw new RuntimeException("Stub!"); }
/* 32 */     public final Builder setVideoActiveFormatDescription(byte videoActiveFormatDescription) { throw new RuntimeException("Stub!"); }
/* 33 */     public final Builder setExtra(Bundle extra) { throw new RuntimeException("Stub!"); }
/* 34 */     public TvTrackInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   TvTrackInfo() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getType() { throw new RuntimeException("Stub!"); }
/* 38 */   public final String getId() { throw new RuntimeException("Stub!"); }
/* 39 */   public final String getLanguage() { throw new RuntimeException("Stub!"); }
/* 40 */   public final CharSequence getDescription() { throw new RuntimeException("Stub!"); }
/* 41 */   public final int getAudioChannelCount() { throw new RuntimeException("Stub!"); }
/* 42 */   public final int getAudioSampleRate() { throw new RuntimeException("Stub!"); }
/* 43 */   public final int getVideoWidth() { throw new RuntimeException("Stub!"); }
/* 44 */   public final int getVideoHeight() { throw new RuntimeException("Stub!"); }
/* 45 */   public final float getVideoFrameRate() { throw new RuntimeException("Stub!"); }
/* 46 */   public final float getVideoPixelAspectRatio() { throw new RuntimeException("Stub!"); }
/* 47 */   public final byte getVideoActiveFormatDescription() { throw new RuntimeException("Stub!"); }
/* 48 */   public final Bundle getExtra() { throw new RuntimeException("Stub!"); }
/* 49 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 50 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 52 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 57 */   public static final Parcelable.Creator<TvTrackInfo> CREATOR = null;
/*    */   public static final int TYPE_AUDIO = 0;
/*    */   public static final int TYPE_SUBTITLE = 2;
/*    */   public static final int TYPE_VIDEO = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\tv\TvTrackInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */