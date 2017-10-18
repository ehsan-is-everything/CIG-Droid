/*    */ package android.text;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ 
/*    */ public class TextUtils
/*    */ {
/*    */   public static final int CAP_MODE_CHARACTERS = 4096;
/*    */   public static final int CAP_MODE_SENTENCES = 16384;
/*    */   public static final int CAP_MODE_WORDS = 8192;
/*    */   
/*    */   public static abstract interface StringSplitter
/*    */     extends Iterable<String>
/*    */   {
/*    */     public abstract void setString(String paramString);
/*    */   }
/*    */   
/*    */   public static class SimpleStringSplitter
/*    */     implements TextUtils.StringSplitter, Iterator<String>
/*    */   {
/* 28 */     public SimpleStringSplitter(char delimiter) { throw new RuntimeException("Stub!"); }
/* 29 */     public void setString(String string) { throw new RuntimeException("Stub!"); }
/* 30 */     public Iterator<String> iterator() { throw new RuntimeException("Stub!"); }
/* 31 */     public boolean hasNext() { throw new RuntimeException("Stub!"); }
/* 32 */     public String next() { throw new RuntimeException("Stub!"); }
/* 33 */     public void remove() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static enum TruncateAt {
/* 37 */     END, 
/* 38 */     MARQUEE, 
/* 39 */     MIDDLE, 
/* 40 */     START;
/*    */     
/*    */ 
/*    */     private TruncateAt() {}
/*    */   }
/*    */   
/* 46 */   TextUtils() { throw new RuntimeException("Stub!"); }
/* 47 */   public static void getChars(CharSequence s, int start, int end, char[] dest, int destoff) { throw new RuntimeException("Stub!"); }
/* 48 */   public static int indexOf(CharSequence s, char ch) { throw new RuntimeException("Stub!"); }
/* 49 */   public static int indexOf(CharSequence s, char ch, int start) { throw new RuntimeException("Stub!"); }
/* 50 */   public static int indexOf(CharSequence s, char ch, int start, int end) { throw new RuntimeException("Stub!"); }
/* 51 */   public static int lastIndexOf(CharSequence s, char ch) { throw new RuntimeException("Stub!"); }
/* 52 */   public static int lastIndexOf(CharSequence s, char ch, int last) { throw new RuntimeException("Stub!"); }
/* 53 */   public static int lastIndexOf(CharSequence s, char ch, int start, int last) { throw new RuntimeException("Stub!"); }
/* 54 */   public static int indexOf(CharSequence s, CharSequence needle) { throw new RuntimeException("Stub!"); }
/* 55 */   public static int indexOf(CharSequence s, CharSequence needle, int start) { throw new RuntimeException("Stub!"); }
/* 56 */   public static int indexOf(CharSequence s, CharSequence needle, int start, int end) { throw new RuntimeException("Stub!"); }
/* 57 */   public static boolean regionMatches(CharSequence one, int toffset, CharSequence two, int ooffset, int len) { throw new RuntimeException("Stub!"); }
/* 58 */   public static String substring(CharSequence source, int start, int end) { throw new RuntimeException("Stub!"); }
/* 59 */   public static String join(CharSequence delimiter, Object[] tokens) { throw new RuntimeException("Stub!"); }
/* 60 */   public static String join(CharSequence delimiter, Iterable tokens) { throw new RuntimeException("Stub!"); }
/* 61 */   public static String[] split(String text, String expression) { throw new RuntimeException("Stub!"); }
/* 62 */   public static String[] split(String text, Pattern pattern) { throw new RuntimeException("Stub!"); }
/* 63 */   public static CharSequence stringOrSpannedString(CharSequence source) { throw new RuntimeException("Stub!"); }
/* 64 */   public static boolean isEmpty(CharSequence str) { throw new RuntimeException("Stub!"); }
/* 65 */   public static int getTrimmedLength(CharSequence s) { throw new RuntimeException("Stub!"); }
/* 66 */   public static boolean equals(CharSequence a, CharSequence b) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 68 */   public static CharSequence getReverse(CharSequence source, int start, int end) { throw new RuntimeException("Stub!"); }
/* 69 */   public static void writeToParcel(CharSequence cs, Parcel p, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 70 */   public static void dumpSpans(CharSequence cs, Printer printer, String prefix) { throw new RuntimeException("Stub!"); }
/* 71 */   public static CharSequence replace(CharSequence template, String[] sources, CharSequence[] destinations) { throw new RuntimeException("Stub!"); }
/* 72 */   public static CharSequence expandTemplate(CharSequence template, CharSequence... values) { throw new RuntimeException("Stub!"); }
/* 73 */   public static int getOffsetBefore(CharSequence text, int offset) { throw new RuntimeException("Stub!"); }
/* 74 */   public static int getOffsetAfter(CharSequence text, int offset) { throw new RuntimeException("Stub!"); }
/* 75 */   public static void copySpansFrom(Spanned source, int start, int end, Class kind, Spannable dest, int destoff) { throw new RuntimeException("Stub!"); }
/* 76 */   public static CharSequence ellipsize(CharSequence text, TextPaint p, float avail, TruncateAt where) { throw new RuntimeException("Stub!"); }
/* 77 */   public static CharSequence ellipsize(CharSequence text, TextPaint paint, float avail, TruncateAt where, boolean preserveLength, EllipsizeCallback callback) { throw new RuntimeException("Stub!"); }
/* 78 */   public static CharSequence listEllipsize(Context context, List<CharSequence> elements, String separator, TextPaint paint, float avail, int moreId) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 80 */   public static CharSequence commaEllipsize(CharSequence text, TextPaint p, float avail, String oneMore, String more) { throw new RuntimeException("Stub!"); }
/* 81 */   public static String htmlEncode(String s) { throw new RuntimeException("Stub!"); }
/* 82 */   public static CharSequence concat(CharSequence... text) { throw new RuntimeException("Stub!"); }
/* 83 */   public static boolean isGraphic(CharSequence str) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 85 */   public static boolean isGraphic(char c) { throw new RuntimeException("Stub!"); }
/* 86 */   public static boolean isDigitsOnly(CharSequence str) { throw new RuntimeException("Stub!"); }
/* 87 */   public static int getCapsMode(CharSequence cs, int off, int reqModes) { throw new RuntimeException("Stub!"); }
/* 88 */   public static int getLayoutDirectionFromLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 93 */   public static final Parcelable.Creator<CharSequence> CHAR_SEQUENCE_CREATOR = null;
/*    */   
/*    */   public static abstract interface EllipsizeCallback
/*    */   {
/*    */     public abstract void ellipsized(int paramInt1, int paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\TextUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */