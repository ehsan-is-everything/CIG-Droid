/*     */ package java.lang;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.nio.charset.Charset;
/*     */ import java.util.Comparator;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class String
/*     */   implements Serializable, Comparable<String>, CharSequence
/*     */ {
/*  30 */   public String() { throw new RuntimeException("Stub!"); }
/*  31 */   public String(String original) { throw new RuntimeException("Stub!"); }
/*  32 */   public String(char[] value) { throw new RuntimeException("Stub!"); }
/*  33 */   public String(char[] value, int offset, int count) { throw new RuntimeException("Stub!"); }
/*  34 */   public String(int[] codePoints, int offset, int count) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  36 */   public String(byte[] ascii, int hibyte, int offset, int count) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  38 */   public String(byte[] ascii, int hibyte) { throw new RuntimeException("Stub!"); }
/*  39 */   public String(byte[] bytes, int offset, int length, String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/*  40 */   public String(byte[] bytes, int offset, int length, Charset charset) { throw new RuntimeException("Stub!"); }
/*  41 */   public String(byte[] bytes, String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/*  42 */   public String(byte[] bytes, Charset charset) { throw new RuntimeException("Stub!"); }
/*  43 */   public String(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }
/*  44 */   public String(byte[] bytes) { throw new RuntimeException("Stub!"); }
/*  45 */   public String(StringBuffer buffer) { throw new RuntimeException("Stub!"); }
/*  46 */   public String(StringBuilder builder) { throw new RuntimeException("Stub!"); }
/*  47 */   public int length() { throw new RuntimeException("Stub!"); }
/*  48 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*     */   public native char charAt(int paramInt);
/*  50 */   public int codePointAt(int index) { throw new RuntimeException("Stub!"); }
/*  51 */   public int codePointBefore(int index) { throw new RuntimeException("Stub!"); }
/*  52 */   public int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/*  53 */   public int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/*  54 */   public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  56 */   public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }
/*  57 */   public byte[] getBytes(String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/*  58 */   public byte[] getBytes(Charset charset) { throw new RuntimeException("Stub!"); }
/*  59 */   public byte[] getBytes() { throw new RuntimeException("Stub!"); }
/*  60 */   public boolean equals(Object anObject) { throw new RuntimeException("Stub!"); }
/*  61 */   public boolean contentEquals(StringBuffer sb) { throw new RuntimeException("Stub!"); }
/*  62 */   public boolean contentEquals(CharSequence cs) { throw new RuntimeException("Stub!"); }
/*  63 */   public boolean equalsIgnoreCase(String anotherString) { throw new RuntimeException("Stub!"); }
/*     */   public native int compareTo(String paramString);
/*  65 */   public int compareToIgnoreCase(String str) { throw new RuntimeException("Stub!"); }
/*  66 */   public boolean regionMatches(int toffset, String other, int ooffset, int len) { throw new RuntimeException("Stub!"); }
/*  67 */   public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) { throw new RuntimeException("Stub!"); }
/*  68 */   public boolean startsWith(String prefix, int toffset) { throw new RuntimeException("Stub!"); }
/*  69 */   public boolean startsWith(String prefix) { throw new RuntimeException("Stub!"); }
/*  70 */   public boolean endsWith(String suffix) { throw new RuntimeException("Stub!"); }
/*  71 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  72 */   public int indexOf(int ch) { throw new RuntimeException("Stub!"); }
/*  73 */   public int indexOf(int ch, int fromIndex) { throw new RuntimeException("Stub!"); }
/*  74 */   public int lastIndexOf(int ch) { throw new RuntimeException("Stub!"); }
/*  75 */   public int lastIndexOf(int ch, int fromIndex) { throw new RuntimeException("Stub!"); }
/*  76 */   public int indexOf(String str) { throw new RuntimeException("Stub!"); }
/*  77 */   public int indexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/*  78 */   public int lastIndexOf(String str) { throw new RuntimeException("Stub!"); }
/*  79 */   public int lastIndexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/*  80 */   public String substring(int beginIndex) { throw new RuntimeException("Stub!"); }
/*  81 */   public String substring(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/*  82 */   public CharSequence subSequence(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/*     */   public native String concat(String paramString);
/*  84 */   public String replace(char oldChar, char newChar) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean matches(String regex) { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean contains(CharSequence s) { throw new RuntimeException("Stub!"); }
/*  87 */   public String replaceFirst(String regex, String replacement) { throw new RuntimeException("Stub!"); }
/*  88 */   public String replaceAll(String regex, String replacement) { throw new RuntimeException("Stub!"); }
/*  89 */   public String replace(CharSequence target, CharSequence replacement) { throw new RuntimeException("Stub!"); }
/*  90 */   public String[] split(String regex, int limit) { throw new RuntimeException("Stub!"); }
/*  91 */   public String[] split(String regex) { throw new RuntimeException("Stub!"); }
/*  92 */   public static String join(CharSequence delimiter, CharSequence... elements) { throw new RuntimeException("Stub!"); }
/*  93 */   public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) { throw new RuntimeException("Stub!"); }
/*  94 */   public String toLowerCase(Locale locale) { throw new RuntimeException("Stub!"); }
/*  95 */   public String toLowerCase() { throw new RuntimeException("Stub!"); }
/*  96 */   public String toUpperCase(Locale locale) { throw new RuntimeException("Stub!"); }
/*  97 */   public String toUpperCase() { throw new RuntimeException("Stub!"); }
/*  98 */   public String trim() { throw new RuntimeException("Stub!"); }
/*  99 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   public native char[] toCharArray();
/* 101 */   public static String format(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 102 */   public static String format(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 103 */   public static String valueOf(Object obj) { throw new RuntimeException("Stub!"); }
/* 104 */   public static String valueOf(char[] data) { throw new RuntimeException("Stub!"); }
/* 105 */   public static String valueOf(char[] data, int offset, int count) { throw new RuntimeException("Stub!"); }
/* 106 */   public static String copyValueOf(char[] data, int offset, int count) { throw new RuntimeException("Stub!"); }
/* 107 */   public static String copyValueOf(char[] data) { throw new RuntimeException("Stub!"); }
/* 108 */   public static String valueOf(boolean b) { throw new RuntimeException("Stub!"); }
/* 109 */   public static String valueOf(char c) { throw new RuntimeException("Stub!"); }
/* 110 */   public static String valueOf(int i) { throw new RuntimeException("Stub!"); }
/* 111 */   public static String valueOf(long l) { throw new RuntimeException("Stub!"); }
/* 112 */   public static String valueOf(float f) { throw new RuntimeException("Stub!"); }
/* 113 */   public static String valueOf(double d) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/* 116 */   public static final Comparator<String> CASE_INSENSITIVE_ORDER = null;
/*     */   
/*     */   public native String intern();
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\String.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */