/*    */ package android.media.audiofx;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BassBoost
/*    */   extends AudioEffect
/*    */ {
/*    */   public static final int PARAM_STRENGTH = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int PARAM_STRENGTH_SUPPORTED = 0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static class Settings
/*    */   {
/*    */     public short strength;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 27 */     public Settings() { throw new RuntimeException("Stub!"); }
/* 28 */     public Settings(String settings) { throw new RuntimeException("Stub!"); }
/* 29 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/* 32 */   public BassBoost(int priority, int audioSession) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException, RuntimeException { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean getStrengthSupported() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setStrength(short strength) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 35 */   public short getRoundedStrength() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 36 */   public void setParameterListener(OnParameterChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 37 */   public Settings getProperties() throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/* 38 */   public void setProperties(Settings settings) throws IllegalStateException, IllegalArgumentException, UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnParameterChangeListener
/*    */   {
/*    */     public abstract void onParameterChange(BassBoost paramBassBoost, int paramInt1, int paramInt2, short paramShort);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\audiofx\BassBoost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */