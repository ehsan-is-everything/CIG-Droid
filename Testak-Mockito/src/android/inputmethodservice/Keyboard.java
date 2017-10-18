/*    */ package android.inputmethodservice;
/*    */ 
/*    */ import android.content.res.XmlResourceParser;
/*    */ 
/*    */ public class Keyboard {
/*    */   public static final int EDGE_BOTTOM = 8;
/*    */   public static final int EDGE_LEFT = 1;
/*    */   public static final int EDGE_RIGHT = 2;
/*    */   public static final int EDGE_TOP = 4;
/*    */   public static final int KEYCODE_ALT = -6;
/*    */   public static final int KEYCODE_CANCEL = -3;
/*    */   public static final int KEYCODE_DELETE = -5;
/*    */   public static final int KEYCODE_DONE = -4;
/*    */   public static final int KEYCODE_MODE_CHANGE = -2;
/*    */   public static final int KEYCODE_SHIFT = -1;
/*    */   
/*    */   public static class Row {
/*    */     public int defaultHeight;
/*    */     public int defaultHorizontalGap;
/*    */     public int defaultWidth;
/*    */     
/* 22 */     public Row(Keyboard parent) { throw new RuntimeException("Stub!"); }
/* 23 */     public Row(android.content.res.Resources res, Keyboard parent, XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public int mode;
/*    */     public int rowEdgeFlags;
/*    */     public int verticalGap;
/*    */   }
/*    */   
/*    */   public static class Key
/*    */   {
/*    */     public Key(Keyboard.Row parent) {
/* 33 */       throw new RuntimeException("Stub!"); }
/* 34 */     public Key(android.content.res.Resources res, Keyboard.Row parent, int x, int y, XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
/* 35 */     public void onPressed() { throw new RuntimeException("Stub!"); }
/* 36 */     public void onReleased(boolean inside) { throw new RuntimeException("Stub!"); }
/* 37 */     public boolean isInside(int x, int y) { throw new RuntimeException("Stub!"); }
/* 38 */     public int squaredDistanceFrom(int x, int y) { throw new RuntimeException("Stub!"); }
/* 39 */     public int[] getCurrentDrawableState() { throw new RuntimeException("Stub!"); }
/* 40 */     public int[] codes = null;
/*    */     public int edgeFlags;
/*    */     public int gap;
/*    */     public int height;
/*    */     public android.graphics.drawable.Drawable icon;
/*    */     public android.graphics.drawable.Drawable iconPreview;
/*    */     public CharSequence label;
/*    */     public boolean modifier;
/*    */     public boolean on;
/*    */     public CharSequence popupCharacters;
/*    */     public int popupResId;
/*    */     public boolean pressed;
/*    */     public boolean repeatable;
/*    */     public boolean sticky;
/*    */     public CharSequence text;
/*    */     public int width;
/*    */     public int x;
/*    */     public int y; }
/*    */   
/* 59 */   public Keyboard(android.content.Context context, int xmlLayoutResId) { throw new RuntimeException("Stub!"); }
/* 60 */   public Keyboard(android.content.Context context, int xmlLayoutResId, int modeId, int width, int height) { throw new RuntimeException("Stub!"); }
/* 61 */   public Keyboard(android.content.Context context, int xmlLayoutResId, int modeId) { throw new RuntimeException("Stub!"); }
/* 62 */   public Keyboard(android.content.Context context, int layoutTemplateResId, CharSequence characters, int columns, int horizontalPadding) { throw new RuntimeException("Stub!"); }
/* 63 */   public java.util.List<Key> getKeys() { throw new RuntimeException("Stub!"); }
/* 64 */   public java.util.List<Key> getModifierKeys() { throw new RuntimeException("Stub!"); }
/* 65 */   protected int getHorizontalGap() { throw new RuntimeException("Stub!"); }
/* 66 */   protected void setHorizontalGap(int gap) { throw new RuntimeException("Stub!"); }
/* 67 */   protected int getVerticalGap() { throw new RuntimeException("Stub!"); }
/* 68 */   protected void setVerticalGap(int gap) { throw new RuntimeException("Stub!"); }
/* 69 */   protected int getKeyHeight() { throw new RuntimeException("Stub!"); }
/* 70 */   protected void setKeyHeight(int height) { throw new RuntimeException("Stub!"); }
/* 71 */   protected int getKeyWidth() { throw new RuntimeException("Stub!"); }
/* 72 */   protected void setKeyWidth(int width) { throw new RuntimeException("Stub!"); }
/* 73 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 74 */   public int getMinWidth() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean setShifted(boolean shiftState) { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean isShifted() { throw new RuntimeException("Stub!"); }
/* 77 */   public int getShiftKeyIndex() { throw new RuntimeException("Stub!"); }
/* 78 */   public int[] getNearestKeys(int x, int y) { throw new RuntimeException("Stub!"); }
/* 79 */   protected Row createRowFromXml(android.content.res.Resources res, XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
/* 80 */   protected Key createKeyFromXml(android.content.res.Resources res, Row parent, int x, int y, XmlResourceParser parser) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\inputmethodservice\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */