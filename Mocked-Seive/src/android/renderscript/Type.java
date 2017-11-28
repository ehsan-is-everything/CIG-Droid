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
/*    */ public class Type
/*    */   extends BaseObj
/*    */ {
/*    */   public static enum CubemapFace
/*    */   {
/* 23 */     NEGATIVE_X, 
/* 24 */     NEGATIVE_Y, 
/* 25 */     NEGATIVE_Z, 
/* 26 */     POSITIVE_X, 
/* 27 */     POSITIVE_Y, 
/* 28 */     POSITIVE_Z, 
/* 29 */     POSITVE_X, 
/* 30 */     POSITVE_Y, 
/* 31 */     POSITVE_Z;
/*    */     
/*    */     private CubemapFace() {} }
/*    */   
/* 35 */   public static class Builder { public Builder(RenderScript rs, Element e) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setX(int value) { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder setY(int value) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setZ(int value) { throw new RuntimeException("Stub!"); }
/* 39 */     public Builder setMipmaps(boolean value) { throw new RuntimeException("Stub!"); }
/* 40 */     public Builder setFaces(boolean value) { throw new RuntimeException("Stub!"); }
/* 41 */     public Builder setYuvFormat(int yuvFormat) { throw new RuntimeException("Stub!"); }
/* 42 */     public Type create() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 44 */   Type() { throw new RuntimeException("Stub!"); }
/* 45 */   public Element getElement() { throw new RuntimeException("Stub!"); }
/* 46 */   public int getX() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getY() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getZ() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getYuv() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean hasMipmaps() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean hasFaces() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 53 */   public static Type createX(RenderScript rs, Element e, int dimX) { throw new RuntimeException("Stub!"); }
/* 54 */   public static Type createXY(RenderScript rs, Element e, int dimX, int dimY) { throw new RuntimeException("Stub!"); }
/* 55 */   public static Type createXYZ(RenderScript rs, Element e, int dimX, int dimY, int dimZ) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\Type.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */