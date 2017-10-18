/*    */ package android.graphics;
/*    */ 
/*    */ import android.content.res.AssetManager;
/*    */ import android.graphics.fonts.FontVariationAxis;
/*    */ import java.io.File;
/*    */ import java.io.FileDescriptor;
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
/*    */ public class Typeface
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 22 */     public Builder(File path) { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder(FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder(String path) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder(AssetManager assetManager, String path) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setWeight(int weight) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setItalic(boolean italic) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setTtcIndex(int ttcIndex) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setFontVariationSettings(String variationSettings) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setFontVariationSettings(FontVariationAxis[] axes) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setFallback(String familyName) { throw new RuntimeException("Stub!"); }
/* 32 */     public Typeface build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   Typeface() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getStyle() { throw new RuntimeException("Stub!"); }
/* 36 */   public final boolean isBold() { throw new RuntimeException("Stub!"); }
/* 37 */   public final boolean isItalic() { throw new RuntimeException("Stub!"); }
/* 38 */   public static Typeface create(String familyName, int style) { throw new RuntimeException("Stub!"); }
/* 39 */   public static Typeface create(Typeface family, int style) { throw new RuntimeException("Stub!"); }
/* 40 */   public static Typeface defaultFromStyle(int style) { throw new RuntimeException("Stub!"); }
/* 41 */   public static Typeface createFromAsset(AssetManager mgr, String path) { throw new RuntimeException("Stub!"); }
/* 42 */   public static Typeface createFromFile(File path) { throw new RuntimeException("Stub!"); }
/* 43 */   public static Typeface createFromFile(String path) { throw new RuntimeException("Stub!"); }
/* 44 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 46 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */   public static final Typeface SERIF = null; public static final Typeface SANS_SERIF = null; public static final int NORMAL = 0; public static final Typeface MONOSPACE = null; public static final int ITALIC = 2; public static final Typeface DEFAULT_BOLD = null; public static final Typeface DEFAULT = null;
/*    */   public static final int BOLD_ITALIC = 3;
/*    */   public static final int BOLD = 1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Typeface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */