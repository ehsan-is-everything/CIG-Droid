/*    */ package android.hardware.camera2.params;
/*    */ 
/*    */ import android.graphics.PointF;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class TonemapCurve
/*    */ {
/*    */   public static final int CHANNEL_BLUE = 2;
/*    */   public static final int CHANNEL_GREEN = 1;
/*    */   public static final int CHANNEL_RED = 0;
/*    */   public static final float LEVEL_BLACK = 0.0F;
/*    */   public static final float LEVEL_WHITE = 1.0F;
/*    */   public static final int POINT_SIZE = 2;
/*    */   
/* 20 */   public TonemapCurve(float[] red, float[] green, float[] blue) { throw new RuntimeException("Stub!"); }
/* 21 */   public int getPointCount(int colorChannel) { throw new RuntimeException("Stub!"); }
/* 22 */   public PointF getPoint(int colorChannel, int index) { throw new RuntimeException("Stub!"); }
/* 23 */   public void copyColorCurve(int colorChannel, float[] destination, int offset) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\camera2\params\TonemapCurve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */