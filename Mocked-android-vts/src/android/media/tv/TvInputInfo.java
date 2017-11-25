/*    */ package android.media.tv;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.graphics.drawable.Drawable;
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
/*    */ public final class TvInputInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(Context context, ComponentName component) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setTunerCount(int tunerCount) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setCanRecord(boolean canRecord) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 27 */     public TvInputInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   TvInputInfo() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 31 */   public String getParentId() { throw new RuntimeException("Stub!"); }
/* 32 */   public ServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 33 */   public Intent createSetupIntent() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   public Intent createSettingsIntent() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getTunerCount() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean canRecord() { throw new RuntimeException("Stub!"); }
/* 39 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isPassthroughInput() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isHidden(Context context) { throw new RuntimeException("Stub!"); }
/* 42 */   public CharSequence loadLabel(Context context) { throw new RuntimeException("Stub!"); }
/* 43 */   public CharSequence loadCustomLabel(Context context) { throw new RuntimeException("Stub!"); }
/* 44 */   public Drawable loadIcon(Context context) { throw new RuntimeException("Stub!"); }
/* 45 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 46 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 48 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 49 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
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
/* 62 */   public static final Parcelable.Creator<TvInputInfo> CREATOR = null;
/*    */   public static final String EXTRA_INPUT_ID = "android.media.tv.extra.INPUT_ID";
/*    */   public static final int TYPE_COMPONENT = 1004;
/*    */   public static final int TYPE_COMPOSITE = 1001;
/*    */   public static final int TYPE_DISPLAY_PORT = 1008;
/*    */   public static final int TYPE_DVI = 1006;
/*    */   public static final int TYPE_HDMI = 1007;
/*    */   public static final int TYPE_OTHER = 1000;
/*    */   public static final int TYPE_SCART = 1003;
/*    */   public static final int TYPE_SVIDEO = 1002;
/*    */   public static final int TYPE_TUNER = 0;
/*    */   public static final int TYPE_VGA = 1005;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\tv\TvInputInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */