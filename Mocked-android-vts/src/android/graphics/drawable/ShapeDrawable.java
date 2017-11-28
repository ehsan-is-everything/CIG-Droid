/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.Shader;
/*    */ import android.graphics.drawable.shapes.Shape;
/*    */ import android.util.AttributeSet;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ 
/*    */ 
/*    */ public class ShapeDrawable
/*    */   extends Drawable
/*    */ {
/*    */   public static abstract class ShaderFactory
/*    */   {
/* 23 */     public ShaderFactory() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract Shader resize(int paramInt1, int paramInt2); }
/* 26 */   public ShapeDrawable() { throw new RuntimeException("Stub!"); }
/* 27 */   public ShapeDrawable(Shape s) { throw new RuntimeException("Stub!"); }
/* 28 */   public Shape getShape() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setShape(Shape s) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setShaderFactory(ShaderFactory fact) { throw new RuntimeException("Stub!"); }
/* 31 */   public ShaderFactory getShaderFactory() { throw new RuntimeException("Stub!"); }
/* 32 */   public Paint getPaint() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setIntrinsicWidth(int width) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setIntrinsicHeight(int height) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onDraw(Shape shape, Canvas canvas, Paint paint) { throw new RuntimeException("Stub!"); }
/* 41 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 48 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 50 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/* 51 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 53 */   protected boolean inflateTag(String name, Resources r, XmlPullParser parser, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 54 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 56 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 57 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 58 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\ShapeDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */