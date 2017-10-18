/*    */ package android.text;
/*    */ 
/*    */ import android.graphics.drawable.Drawable;
/*    */ import org.xml.sax.XMLReader;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Html
/*    */ {
/*    */   public static final int FROM_HTML_MODE_COMPACT = 63;
/*    */   public static final int FROM_HTML_MODE_LEGACY = 0;
/*    */   public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
/*    */   public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
/*    */   public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
/*    */   
/* 28 */   Html() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public static Spanned fromHtml(String source) { throw new RuntimeException("Stub!"); }
/* 31 */   public static Spanned fromHtml(String source, int flags) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 33 */   public static Spanned fromHtml(String source, ImageGetter imageGetter, TagHandler tagHandler) { throw new RuntimeException("Stub!"); }
/* 34 */   public static Spanned fromHtml(String source, int flags, ImageGetter imageGetter, TagHandler tagHandler) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public static String toHtml(Spanned text) { throw new RuntimeException("Stub!"); }
/* 37 */   public static String toHtml(Spanned text, int option) { throw new RuntimeException("Stub!"); }
/* 38 */   public static String escapeHtml(CharSequence text) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TagHandler
/*    */   {
/*    */     public abstract void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader);
/*    */   }
/*    */   
/*    */   public static abstract interface ImageGetter
/*    */   {
/*    */     public abstract Drawable getDrawable(String paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\Html.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */