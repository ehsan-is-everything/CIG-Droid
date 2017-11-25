/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ 
/*    */ public class Gravity {
/*    */   public static final int AXIS_CLIP = 8;
/*    */   public static final int AXIS_PULL_AFTER = 4;
/*    */   public static final int AXIS_PULL_BEFORE = 2;
/*    */   public static final int AXIS_SPECIFIED = 1;
/*    */   public static final int AXIS_X_SHIFT = 0;
/*    */   public static final int AXIS_Y_SHIFT = 4;
/*    */   public static final int BOTTOM = 80;
/*    */   public static final int CENTER = 17;
/*    */   public static final int CENTER_HORIZONTAL = 1;
/*    */   public static final int CENTER_VERTICAL = 16;
/*    */   public static final int CLIP_HORIZONTAL = 8;
/*    */   public static final int CLIP_VERTICAL = 128;
/*    */   public static final int DISPLAY_CLIP_HORIZONTAL = 16777216;
/*    */   
/* 20 */   public Gravity() { throw new RuntimeException("Stub!"); }
/* 21 */   public static void apply(int gravity, int w, int h, Rect container, Rect outRect) { throw new RuntimeException("Stub!"); }
/* 22 */   public static void apply(int gravity, int w, int h, Rect container, Rect outRect, int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 23 */   public static void apply(int gravity, int w, int h, Rect container, int xAdj, int yAdj, Rect outRect) { throw new RuntimeException("Stub!"); }
/* 24 */   public static void apply(int gravity, int w, int h, Rect container, int xAdj, int yAdj, Rect outRect, int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 25 */   public static void applyDisplay(int gravity, Rect display, Rect inoutObj) { throw new RuntimeException("Stub!"); }
/* 26 */   public static void applyDisplay(int gravity, Rect display, Rect inoutObj, int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 27 */   public static boolean isVertical(int gravity) { throw new RuntimeException("Stub!"); }
/* 28 */   public static boolean isHorizontal(int gravity) { throw new RuntimeException("Stub!"); }
/* 29 */   public static int getAbsoluteGravity(int gravity, int layoutDirection) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int DISPLAY_CLIP_VERTICAL = 268435456;
/*    */   public static final int END = 8388613;
/*    */   public static final int FILL = 119;
/*    */   public static final int FILL_HORIZONTAL = 7;
/*    */   public static final int FILL_VERTICAL = 112;
/*    */   public static final int HORIZONTAL_GRAVITY_MASK = 7;
/*    */   public static final int LEFT = 3;
/*    */   public static final int NO_GRAVITY = 0;
/*    */   public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
/*    */   public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
/*    */   public static final int RIGHT = 5;
/*    */   public static final int START = 8388611;
/*    */   public static final int TOP = 48;
/*    */   public static final int VERTICAL_GRAVITY_MASK = 112;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\Gravity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */