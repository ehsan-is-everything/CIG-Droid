/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class AnimatedVectorDrawable
/*    */   extends Drawable
/*    */   implements Animatable2
/*    */ {
/* 20 */   public AnimatedVectorDrawable() { throw new RuntimeException("Stub!"); }
/* 21 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 22 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 24 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 25 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/* 26 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
/* 27 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 32 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 40 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 42 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 43 */   public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 45 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isRunning() { throw new RuntimeException("Stub!"); }
/* 47 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 48 */   public void start() { throw new RuntimeException("Stub!"); }
/* 49 */   public void stop() { throw new RuntimeException("Stub!"); }
/* 50 */   public void registerAnimationCallback(Animatable2.AnimationCallback callback) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean unregisterAnimationCallback(Animatable2.AnimationCallback callback) { throw new RuntimeException("Stub!"); }
/* 52 */   public void clearAnimationCallbacks() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\drawable\AnimatedVectorDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */