/*    */ package android.animation;
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
/*    */ public abstract class Keyframe
/*    */   implements Cloneable
/*    */ {
/* 21 */   public Keyframe() { throw new RuntimeException("Stub!"); }
/* 22 */   public static Keyframe ofInt(float fraction, int value) { throw new RuntimeException("Stub!"); }
/* 23 */   public static Keyframe ofInt(float fraction) { throw new RuntimeException("Stub!"); }
/* 24 */   public static Keyframe ofFloat(float fraction, float value) { throw new RuntimeException("Stub!"); }
/* 25 */   public static Keyframe ofFloat(float fraction) { throw new RuntimeException("Stub!"); }
/* 26 */   public static Keyframe ofObject(float fraction, Object value) { throw new RuntimeException("Stub!"); }
/* 27 */   public static Keyframe ofObject(float fraction) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean hasValue() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Object getValue();
/*    */   public abstract void setValue(Object paramObject);
/* 31 */   public float getFraction() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setFraction(float fraction) { throw new RuntimeException("Stub!"); }
/* 33 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 35 */   public Class getType() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Keyframe clone();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\animation\Keyframe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */