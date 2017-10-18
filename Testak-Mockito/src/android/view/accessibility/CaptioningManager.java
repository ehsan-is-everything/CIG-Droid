/*    */ package android.view.accessibility;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class CaptioningManager
/*    */ {
/*    */   public static final class CaptionStyle
/*    */   {
/*    */     public static final int EDGE_TYPE_DEPRESSED = 4;
/*    */     public static final int EDGE_TYPE_DROP_SHADOW = 2;
/*    */     public static final int EDGE_TYPE_NONE = 0;
/*    */     public static final int EDGE_TYPE_OUTLINE = 1;
/*    */     public static final int EDGE_TYPE_RAISED = 3;
/*    */     public static final int EDGE_TYPE_UNSPECIFIED = -1;
/*    */     public final int backgroundColor;
/*    */     public final int edgeColor;
/*    */     public final int edgeType;
/*    */     public final int foregroundColor;
/*    */     public final int windowColor;
/*    */     
/* 22 */     CaptionStyle() { throw new RuntimeException("Stub!"); }
/* 23 */     public boolean hasBackgroundColor() { throw new RuntimeException("Stub!"); }
/* 24 */     public boolean hasForegroundColor() { throw new RuntimeException("Stub!"); }
/* 25 */     public boolean hasEdgeType() { throw new RuntimeException("Stub!"); }
/* 26 */     public boolean hasEdgeColor() { throw new RuntimeException("Stub!"); }
/* 27 */     public boolean hasWindowColor() { throw new RuntimeException("Stub!"); }
/* 28 */     public android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
/*    */   }
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
/*    */   public static abstract class CaptioningChangeListener
/*    */   {
/* 43 */     public CaptioningChangeListener() { throw new RuntimeException("Stub!"); }
/* 44 */     public void onEnabledChanged(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 45 */     public void onUserStyleChanged(CaptioningManager.CaptionStyle userStyle) { throw new RuntimeException("Stub!"); }
/* 46 */     public void onLocaleChanged(Locale locale) { throw new RuntimeException("Stub!"); }
/* 47 */     public void onFontScaleChanged(float fontScale) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 49 */   CaptioningManager() { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 51 */   public final Locale getLocale() { throw new RuntimeException("Stub!"); }
/* 52 */   public final float getFontScale() { throw new RuntimeException("Stub!"); }
/* 53 */   public CaptionStyle getUserStyle() { throw new RuntimeException("Stub!"); }
/* 54 */   public void addCaptioningChangeListener(CaptioningChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 55 */   public void removeCaptioningChangeListener(CaptioningChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\accessibility\CaptioningManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */