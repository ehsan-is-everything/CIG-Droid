/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PointerIcon
/*    */   implements Parcelable
/*    */ {
/* 21 */   PointerIcon() { throw new RuntimeException("Stub!"); }
/* 22 */   public static PointerIcon getSystemIcon(Context context, int type) { throw new RuntimeException("Stub!"); }
/* 23 */   public static PointerIcon create(Bitmap bitmap, float hotSpotX, float hotSpotY) { throw new RuntimeException("Stub!"); }
/* 24 */   public static PointerIcon load(Resources resources, int resourceId) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 52 */   public static final Parcelable.Creator<PointerIcon> CREATOR = null;
/*    */   public static final int TYPE_ALIAS = 1010;
/*    */   public static final int TYPE_ALL_SCROLL = 1013;
/*    */   public static final int TYPE_ARROW = 1000;
/*    */   public static final int TYPE_CELL = 1006;
/*    */   public static final int TYPE_CONTEXT_MENU = 1001;
/*    */   public static final int TYPE_COPY = 1011;
/*    */   public static final int TYPE_CROSSHAIR = 1007;
/*    */   public static final int TYPE_DEFAULT = 1000;
/*    */   public static final int TYPE_GRAB = 1020;
/*    */   public static final int TYPE_GRABBING = 1021;
/*    */   public static final int TYPE_HAND = 1002;
/*    */   public static final int TYPE_HELP = 1003;
/*    */   public static final int TYPE_HORIZONTAL_DOUBLE_ARROW = 1014;
/*    */   public static final int TYPE_NO_DROP = 1012;
/*    */   public static final int TYPE_NULL = 0;
/*    */   public static final int TYPE_TEXT = 1008;
/*    */   public static final int TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW = 1017;
/*    */   public static final int TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW = 1016;
/*    */   public static final int TYPE_VERTICAL_DOUBLE_ARROW = 1015;
/*    */   public static final int TYPE_VERTICAL_TEXT = 1009;
/*    */   public static final int TYPE_WAIT = 1004;
/*    */   public static final int TYPE_ZOOM_IN = 1018;
/*    */   public static final int TYPE_ZOOM_OUT = 1019;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\PointerIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */