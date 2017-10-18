/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.ColorStateList;
/*     */ import android.content.res.Resources;
/*     */ import android.content.res.Resources.Theme;
/*     */ import android.graphics.BitmapFactory.Options;
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.ColorFilter;
/*     */ import android.graphics.Outline;
/*     */ import android.graphics.PorterDuff.Mode;
/*     */ import android.graphics.Rect;
/*     */ import android.graphics.Region;
/*     */ import android.util.AttributeSet;
/*     */ import android.util.TypedValue;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlPullParserException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Drawable
/*     */ {
/*     */   public static abstract class ConstantState
/*     */   {
/*  28 */     public ConstantState() { throw new RuntimeException("Stub!"); }
/*     */     public abstract Drawable newDrawable();
/*  30 */     public Drawable newDrawable(Resources res) { throw new RuntimeException("Stub!"); }
/*     */     
/*  32 */     public Drawable newDrawable(Resources res, Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/*     */     public abstract int getChangingConfigurations();
/*  34 */     public boolean canApplyTheme() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  36 */   public Drawable() { throw new RuntimeException("Stub!"); }
/*     */   public abstract void draw(Canvas paramCanvas);
/*  38 */   public void setBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*  39 */   public void setBounds(Rect bounds) { throw new RuntimeException("Stub!"); }
/*  40 */   public final void copyBounds(Rect bounds) { throw new RuntimeException("Stub!"); }
/*  41 */   public final Rect copyBounds() { throw new RuntimeException("Stub!"); }
/*  42 */   public final Rect getBounds() { throw new RuntimeException("Stub!"); }
/*  43 */   public Rect getDirtyBounds() { throw new RuntimeException("Stub!"); }
/*  44 */   public void setChangingConfigurations(int configs) { throw new RuntimeException("Stub!"); }
/*  45 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  47 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/*  48 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
/*  49 */   public boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
/*  50 */   public final void setCallback(Callback cb) { throw new RuntimeException("Stub!"); }
/*  51 */   public Callback getCallback() { throw new RuntimeException("Stub!"); }
/*  52 */   public void invalidateSelf() { throw new RuntimeException("Stub!"); }
/*  53 */   public void scheduleSelf(Runnable what, long when) { throw new RuntimeException("Stub!"); }
/*  54 */   public void unscheduleSelf(Runnable what) { throw new RuntimeException("Stub!"); }
/*  55 */   public int getLayoutDirection() { throw new RuntimeException("Stub!"); }
/*  56 */   public final boolean setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*  57 */   public boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setAlpha(int paramInt);
/*  59 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setColorFilter(ColorFilter paramColorFilter);
/*  61 */   public void setColorFilter(int color, PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
/*  62 */   public void setTint(int tintColor) { throw new RuntimeException("Stub!"); }
/*  63 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/*  64 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/*  65 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/*  66 */   public void clearColorFilter() { throw new RuntimeException("Stub!"); }
/*  67 */   public void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
/*  68 */   public void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*  69 */   public void getHotspotBounds(Rect outRect) { throw new RuntimeException("Stub!"); }
/*  70 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean setState(int[] stateSet) { throw new RuntimeException("Stub!"); }
/*  72 */   public int[] getState() { throw new RuntimeException("Stub!"); }
/*  73 */   public void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
/*  74 */   public Drawable getCurrent() { throw new RuntimeException("Stub!"); }
/*  75 */   public final boolean setLevel(int level) { throw new RuntimeException("Stub!"); }
/*  76 */   public final int getLevel() { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/*  78 */   public final boolean isVisible() { throw new RuntimeException("Stub!"); }
/*  79 */   public void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
/*  80 */   public boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
/*     */   
/*  82 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/*     */   public abstract int getOpacity();
/*  85 */   public static int resolveOpacity(int op1, int op2) { throw new RuntimeException("Stub!"); }
/*  86 */   public Region getTransparentRegion() { throw new RuntimeException("Stub!"); }
/*  87 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
/*  88 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
/*  89 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/*  90 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/*  91 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/*  92 */   public int getMinimumWidth() { throw new RuntimeException("Stub!"); }
/*  93 */   public int getMinimumHeight() { throw new RuntimeException("Stub!"); }
/*  94 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/*  95 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/*  96 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*  97 */   public static Drawable createFromStream(InputStream is, String srcName) { throw new RuntimeException("Stub!"); }
/*  98 */   public static Drawable createFromResourceStream(Resources res, TypedValue value, InputStream is, String srcName) { throw new RuntimeException("Stub!"); }
/*  99 */   public static Drawable createFromResourceStream(Resources res, TypedValue value, InputStream is, String srcName, BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
/* 100 */   public static Drawable createFromXml(Resources r, XmlPullParser parser) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 101 */   public static Drawable createFromXml(Resources r, XmlPullParser parser, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 102 */   public static Drawable createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 103 */   public static Drawable createFromXmlInner(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 104 */   public static Drawable createFromPath(String pathName) { throw new RuntimeException("Stub!"); }
/* 105 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 106 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 107 */   public ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static abstract interface Callback
/*     */   {
/*     */     public abstract void invalidateDrawable(Drawable paramDrawable);
/*     */     
/*     */     public abstract void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong);
/*     */     
/*     */     public abstract void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable);
/*     */   }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\drawable\Drawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */