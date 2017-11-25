/*    */ package android.media.audiofx;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Equalizer
/*    */   extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_BAND_FREQ_RANGE = 4;
/*    */   
/*    */ 
/*    */   public static final int PARAM_BAND_LEVEL = 2;
/*    */   
/*    */   public static final int PARAM_CENTER_FREQ = 3;
/*    */   
/*    */   public static final int PARAM_CURRENT_PRESET = 6;
/*    */   
/*    */   public static final int PARAM_GET_BAND = 5;
/*    */   
/*    */   public static final int PARAM_GET_NUM_OF_PRESETS = 7;
/*    */   public static final int PARAM_GET_PRESET_NAME = 8;
/*    */   public static final int PARAM_LEVEL_RANGE = 1;
/*    */   public static final int PARAM_NUM_BANDS = 0;
/*    */   public static final int PARAM_STRING_SIZE_MAX = 32;
/*    */   
/*    */   public static class Settings
/*    */   {
/* 27 */     public Settings() { throw new RuntimeException("Stub!"); }
/* 28 */     public Settings(String settings) { throw new RuntimeException("Stub!"); }
/* 29 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */     public short[] bandLevels = null;
/*    */     public short curPreset;
/*    */     public short numBands; }
/*    */   
/* 34 */   public Equalizer(int priority, int audioSession) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException, RuntimeException { throw new RuntimeException("Stub!"); }
/* 35 */   public short getNumberOfBands() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 36 */   public short[] getBandLevelRange() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 37 */   public void setBandLevel(short band, short level) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 38 */   public short getBandLevel(short band) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 39 */   public int getCenterFreq(short band) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 40 */   public int[] getBandFreqRange(short band) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 41 */   public short getBand(int frequency) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 42 */   public short getCurrentPreset() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 43 */   public void usePreset(short preset) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 44 */   public short getNumberOfPresets() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 45 */   public String getPresetName(short preset) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 47 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 48 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnParameterChangeListener
/*    */   {
/*    */     public abstract void onParameterChange(Equalizer paramEqualizer, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\audiofx\Equalizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */