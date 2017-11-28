/*    */ package android.content.res;
/*    */ 
/*    */ import android.graphics.Movie;
/*    */ import android.graphics.Typeface;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import android.util.TypedValue;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Resources
/*    */ {
/*    */   public static class NotFoundException
/*    */     extends RuntimeException
/*    */   {
/* 23 */     public NotFoundException() { throw new RuntimeException("Stub!"); }
/* 24 */     public NotFoundException(String name) { throw new RuntimeException("Stub!"); }
/* 25 */     public NotFoundException(String name, Exception cause) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public final class Theme {
/* 29 */     Theme() { throw new RuntimeException("Stub!"); }
/* 30 */     public void applyStyle(int resId, boolean force) { throw new RuntimeException("Stub!"); }
/* 31 */     public void setTo(Theme other) { throw new RuntimeException("Stub!"); }
/* 32 */     public TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); }
/* 33 */     public TypedArray obtainStyledAttributes(int resId, int[] attrs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 34 */     public TypedArray obtainStyledAttributes(AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/* 35 */     public boolean resolveAttribute(int resid, TypedValue outValue, boolean resolveRefs) { throw new RuntimeException("Stub!"); }
/* 36 */     public Resources getResources() { throw new RuntimeException("Stub!"); }
/* 37 */     public Drawable getDrawable(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 38 */     public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 39 */     public void dump(int priority, String tag, String prefix) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   @Deprecated
/* 42 */   public Resources(AssetManager assets, DisplayMetrics metrics, Configuration config) { throw new RuntimeException("Stub!"); }
/* 43 */   public static Resources getSystem() { throw new RuntimeException("Stub!"); }
/* 44 */   public CharSequence getText(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 45 */   public Typeface getFont(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 46 */   public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 47 */   public String getString(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 48 */   public String getString(int id, Object... formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 49 */   public String getQuantityString(int id, int quantity, Object... formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 50 */   public String getQuantityString(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 51 */   public CharSequence getText(int id, CharSequence def) { throw new RuntimeException("Stub!"); }
/* 52 */   public CharSequence[] getTextArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 53 */   public String[] getStringArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 54 */   public int[] getIntArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 55 */   public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 56 */   public float getDimension(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 57 */   public int getDimensionPixelOffset(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 58 */   public int getDimensionPixelSize(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 59 */   public float getFraction(int id, int base, int pbase) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public Drawable getDrawable(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 62 */   public Drawable getDrawable(int id, Theme theme) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 64 */   public Drawable getDrawableForDensity(int id, int density) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 65 */   public Drawable getDrawableForDensity(int id, int density, Theme theme) { throw new RuntimeException("Stub!"); }
/* 66 */   public Movie getMovie(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 68 */   public int getColor(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 69 */   public int getColor(int id, Theme theme) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 71 */   public ColorStateList getColorStateList(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 72 */   public ColorStateList getColorStateList(int id, Theme theme) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean getBoolean(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 74 */   public int getInteger(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 75 */   public XmlResourceParser getLayout(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 76 */   public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 77 */   public XmlResourceParser getXml(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 78 */   public InputStream openRawResource(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 79 */   public InputStream openRawResource(int id, TypedValue value) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 80 */   public AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 81 */   public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 82 */   public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 83 */   public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 84 */   public final Theme newTheme() { throw new RuntimeException("Stub!"); }
/* 85 */   public TypedArray obtainAttributes(AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 87 */   public void updateConfiguration(Configuration config, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 88 */   public DisplayMetrics getDisplayMetrics() { throw new RuntimeException("Stub!"); }
/* 89 */   public Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
/* 90 */   public int getIdentifier(String name, String defType, String defPackage) { throw new RuntimeException("Stub!"); }
/* 91 */   public String getResourceName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 92 */   public String getResourcePackageName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 93 */   public String getResourceTypeName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 94 */   public String getResourceEntryName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 95 */   public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 96 */   public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) throws XmlPullParserException { throw new RuntimeException("Stub!"); }
/* 97 */   public final AssetManager getAssets() { throw new RuntimeException("Stub!"); }
/* 98 */   public final void flushLayoutCache() { throw new RuntimeException("Stub!"); }
/* 99 */   public final void finishPreloading() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\res\Resources.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */