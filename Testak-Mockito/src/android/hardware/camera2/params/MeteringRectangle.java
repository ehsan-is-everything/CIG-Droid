/*    */ package android.hardware.camera2.params;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ import android.graphics.Rect;
/*    */ import android.util.Size;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MeteringRectangle
/*    */ {
/*    */   public static final int METERING_WEIGHT_DONT_CARE = 0;
/*    */   public static final int METERING_WEIGHT_MAX = 1000;
/*    */   public static final int METERING_WEIGHT_MIN = 0;
/*    */   
/* 20 */   public MeteringRectangle(int x, int y, int width, int height, int meteringWeight) { throw new RuntimeException("Stub!"); }
/* 21 */   public MeteringRectangle(Point xy, Size dimensions, int meteringWeight) { throw new RuntimeException("Stub!"); }
/* 22 */   public MeteringRectangle(Rect rect, int meteringWeight) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getX() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getY() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getMeteringWeight() { throw new RuntimeException("Stub!"); }
/* 28 */   public Point getUpperLeftPoint() { throw new RuntimeException("Stub!"); }
/* 29 */   public Size getSize() { throw new RuntimeException("Stub!"); }
/* 30 */   public Rect getRect() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean equals(MeteringRectangle other) { throw new RuntimeException("Stub!"); }
/* 33 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\params\MeteringRectangle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */