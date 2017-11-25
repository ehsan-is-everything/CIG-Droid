/*    */ package android.app;
/*    */ 
/*    */ import android.media.AudioAttributes;
/*    */ import android.net.Uri;
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
/*    */ public final class NotificationChannel
/*    */   implements Parcelable
/*    */ {
/* 20 */   public NotificationChannel(String id, CharSequence name, int importance) { throw new RuntimeException("Stub!"); }
/* 21 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setName(CharSequence name) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setDescription(String description) { throw new RuntimeException("Stub!"); }
/* 24 */   public void setGroup(String groupId) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setShowBadge(boolean showBadge) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setSound(Uri sound, AudioAttributes audioAttributes) { throw new RuntimeException("Stub!"); }
/* 27 */   public void enableLights(boolean lights) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setLightColor(int argb) { throw new RuntimeException("Stub!"); }
/* 29 */   public void enableVibration(boolean vibration) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setVibrationPattern(long[] vibrationPattern) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setImportance(int importance) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setBypassDnd(boolean bypassDnd) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setLockscreenVisibility(int lockscreenVisibility) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 35 */   public CharSequence getName() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getDescription() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getImportance() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean canBypassDnd() { throw new RuntimeException("Stub!"); }
/* 39 */   public Uri getSound() { throw new RuntimeException("Stub!"); }
/* 40 */   public AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean shouldShowLights() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getLightColor() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean shouldVibrate() { throw new RuntimeException("Stub!"); }
/* 44 */   public long[] getVibrationPattern() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getLockscreenVisibility() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean canShowBadge() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getGroup() { throw new RuntimeException("Stub!"); }
/* 48 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 50 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 54 */   public static final Parcelable.Creator<NotificationChannel> CREATOR = null;
/*    */   public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\NotificationChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */