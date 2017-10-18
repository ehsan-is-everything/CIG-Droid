/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.res.AssetManager;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Configuration;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.content.res.TypedArray;
/*    */ import android.content.res.XmlResourceParser;
/*    */ import android.graphics.Movie;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import android.util.TypedValue;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ @Deprecated
/*    */ public class MockResources extends Resources
/*    */ {
/*    */   public MockResources()
/*    */   {
/* 22 */     super((AssetManager)null, (DisplayMetrics)null, (Configuration)null);throw new RuntimeException("Stub!"); }
/* 23 */   public void updateConfiguration(Configuration config, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 24 */   public CharSequence getText(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 26 */   public String getString(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 27 */   public String getString(int id, Object... formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 28 */   public String getQuantityString(int id, int quantity, Object... formatArgs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 29 */   public String getQuantityString(int id, int quantity) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 30 */   public CharSequence getText(int id, CharSequence def) { throw new RuntimeException("Stub!"); }
/* 31 */   public CharSequence[] getTextArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getStringArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   public int[] getIntArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 34 */   public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public float getDimension(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */   public int getDimensionPixelOffset(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */   public int getDimensionPixelSize(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 38 */   public Drawable getDrawable(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 39 */   public Movie getMovie(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 40 */   public int getColor(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 41 */   public ColorStateList getColorStateList(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 42 */   public int getInteger(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 43 */   public XmlResourceParser getLayout(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 44 */   public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 45 */   public XmlResourceParser getXml(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 46 */   public InputStream openRawResource(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 47 */   public android.content.res.AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 48 */   public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 49 */   public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 50 */   public TypedArray obtainAttributes(AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
/* 51 */   public DisplayMetrics getDisplayMetrics() { throw new RuntimeException("Stub!"); }
/* 52 */   public Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getIdentifier(String name, String defType, String defPackage) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getResourceName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 55 */   public String getResourcePackageName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 56 */   public String getResourceTypeName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 57 */   public String getResourceEntryName(int resid) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\mock\MockResources.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */