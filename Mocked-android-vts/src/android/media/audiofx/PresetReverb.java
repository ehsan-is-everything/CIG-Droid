/*    */ package android.media.audiofx;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PresetReverb
/*    */   extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_PRESET = 0;
/*    */   
/*    */ 
/*    */   public static final short PRESET_LARGEHALL = 5;
/*    */   
/*    */   public static final short PRESET_LARGEROOM = 3;
/*    */   
/*    */   public static final short PRESET_MEDIUMHALL = 4;
/*    */   
/*    */   public static final short PRESET_MEDIUMROOM = 2;
/*    */   
/*    */   public static final short PRESET_NONE = 0;
/*    */   public static final short PRESET_PLATE = 6;
/*    */   public static final short PRESET_SMALLROOM = 1;
/*    */   
/*    */   public static class Settings
/*    */   {
/*    */     public short preset;
/*    */     
/* 27 */     public Settings() { throw new RuntimeException("Stub!"); }
/* 28 */     public Settings(String settings) { throw new RuntimeException("Stub!"); }
/* 29 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/* 32 */   public PresetReverb(int priority, int audioSession) throws IllegalArgumentException, UnsupportedOperationException, RuntimeException { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPreset(short preset) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 34 */   public short getPreset() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 35 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 37 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnParameterChangeListener
/*    */   {
/*    */     public abstract void onParameterChange(PresetReverb paramPresetReverb, int paramInt1, int paramInt2, short paramShort);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\audiofx\PresetReverb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */