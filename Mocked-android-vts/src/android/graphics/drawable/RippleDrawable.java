/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class RippleDrawable
/*    */   extends LayerDrawable
/*    */ {
/*    */   public static final int RADIUS_AUTO = -1;
/*    */   
/*    */   public RippleDrawable(ColorStateList color, Drawable content, Drawable mask)
/*    */   {
/* 21 */     super((Drawable[])null);throw new RuntimeException("Stub!"); }
/* 22 */   public void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 24 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 25 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setColor(ColorStateList color) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setRadius(int radius) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getRadius() { throw new RuntimeException("Stub!"); }
/* 31 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean setDrawableByLayerId(int id, Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPaddingMode(int mode) { throw new RuntimeException("Stub!"); }
/* 34 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 38 */   public void getHotspotBounds(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 39 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 40 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 41 */   public void invalidateSelf() { throw new RuntimeException("Stub!"); }
/* 42 */   public Rect getDirtyBounds() { throw new RuntimeException("Stub!"); }
/* 43 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 44 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\RippleDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */