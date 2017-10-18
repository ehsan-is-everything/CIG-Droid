/*    */ package android.graphics;
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
/*    */ public class Shader
/*    */ {
/*    */   public static enum TileMode
/*    */   {
/* 22 */     CLAMP, 
/* 23 */     MIRROR, 
/* 24 */     REPEAT;
/*    */     private TileMode() {} }
/*    */   @Deprecated
/* 27 */   public Shader() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean getLocalMatrix(Matrix localM) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setLocalMatrix(Matrix localM) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Shader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */