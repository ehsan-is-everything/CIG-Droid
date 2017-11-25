/*    */ package android.media;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class VolumeProvider
/*    */ {
/*    */   public static final int VOLUME_CONTROL_ABSOLUTE = 2;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int VOLUME_CONTROL_FIXED = 0;
/*    */   
/*    */ 
/*    */   public static final int VOLUME_CONTROL_RELATIVE = 1;
/*    */   
/*    */ 
/*    */ 
/* 19 */   public VolumeProvider(int volumeControl, int maxVolume, int currentVolume) { throw new RuntimeException("Stub!"); }
/* 20 */   public final int getVolumeControl() { throw new RuntimeException("Stub!"); }
/* 21 */   public final int getMaxVolume() { throw new RuntimeException("Stub!"); }
/* 22 */   public final int getCurrentVolume() { throw new RuntimeException("Stub!"); }
/* 23 */   public final void setCurrentVolume(int currentVolume) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onSetVolumeTo(int volume) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onAdjustVolume(int direction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\VolumeProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */