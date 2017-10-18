/*    */ package android.renderscript;
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
/*    */ public class Sampler
/*    */   extends BaseObj
/*    */ {
/*    */   public static enum Value
/*    */   {
/* 23 */     CLAMP, 
/* 24 */     LINEAR, 
/* 25 */     LINEAR_MIP_LINEAR, 
/* 26 */     LINEAR_MIP_NEAREST, 
/* 27 */     MIRRORED_REPEAT, 
/* 28 */     NEAREST, 
/* 29 */     WRAP;
/*    */     
/*    */     private Value() {} }
/*    */   
/* 33 */   public static class Builder { public Builder(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 34 */     public void setMinification(Sampler.Value v) { throw new RuntimeException("Stub!"); }
/* 35 */     public void setMagnification(Sampler.Value v) { throw new RuntimeException("Stub!"); }
/* 36 */     public void setWrapS(Sampler.Value v) { throw new RuntimeException("Stub!"); }
/* 37 */     public void setWrapT(Sampler.Value v) { throw new RuntimeException("Stub!"); }
/* 38 */     public void setAnisotropy(float v) { throw new RuntimeException("Stub!"); }
/* 39 */     public Sampler create() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 41 */   Sampler() { throw new RuntimeException("Stub!"); }
/* 42 */   public Value getMinification() { throw new RuntimeException("Stub!"); }
/* 43 */   public Value getMagnification() { throw new RuntimeException("Stub!"); }
/* 44 */   public Value getWrapS() { throw new RuntimeException("Stub!"); }
/* 45 */   public Value getWrapT() { throw new RuntimeException("Stub!"); }
/* 46 */   public float getAnisotropy() { throw new RuntimeException("Stub!"); }
/* 47 */   public static Sampler CLAMP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 48 */   public static Sampler CLAMP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 49 */   public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 50 */   public static Sampler WRAP_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 51 */   public static Sampler WRAP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 52 */   public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 53 */   public static Sampler MIRRORED_REPEAT_NEAREST(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 54 */   public static Sampler MIRRORED_REPEAT_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 55 */   public static Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\renderscript\Sampler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */