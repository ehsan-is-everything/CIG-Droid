/*    */ package android.media.audiofx;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Virtualizer
/*    */   extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_STRENGTH = 1;
/*    */   
/*    */ 
/*    */   public static final int PARAM_STRENGTH_SUPPORTED = 0;
/*    */   
/*    */   public static final int VIRTUALIZATION_MODE_AUTO = 1;
/*    */   
/*    */   public static final int VIRTUALIZATION_MODE_BINAURAL = 2;
/*    */   
/*    */   public static final int VIRTUALIZATION_MODE_OFF = 0;
/*    */   
/*    */   public static final int VIRTUALIZATION_MODE_TRANSAURAL = 3;
/*    */   
/*    */ 
/*    */   public static class Settings
/*    */   {
/*    */     public short strength;
/*    */     
/*    */ 
/* 27 */     public Settings() { throw new RuntimeException("Stub!"); }
/* 28 */     public Settings(String settings) { throw new RuntimeException("Stub!"); }
/* 29 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/* 32 */   public Virtualizer(int priority, int audioSession) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException, RuntimeException { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean getStrengthSupported() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setStrength(short strength) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 35 */   public short getRoundedStrength() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean canVirtualize(int inputChannelMask, int virtualizationMode) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean getSpeakerAngles(int inputChannelMask, int virtualizationMode, int[] angles) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean forceVirtualizationMode(int virtualizationMode) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 39 */   public int getVirtualizationMode() throws IllegalStateException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 40 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 41 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 42 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnParameterChangeListener
/*    */   {
/*    */     public abstract void onParameterChange(Virtualizer paramVirtualizer, int paramInt1, int paramInt2, short paramShort);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\audiofx\Virtualizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */