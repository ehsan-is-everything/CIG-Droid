/*    */ package java.awt.font;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ public final class NumericShaper
/*    */   implements Serializable
/*    */ {
/*    */   public static final int ALL_RANGES = 524287;
/*    */   public static final int ARABIC = 2;
/*    */   public static final int BENGALI = 16;
/*    */   public static final int DEVANAGARI = 8;
/*    */   public static final int EASTERN_ARABIC = 4;
/*    */   public static final int ETHIOPIC = 65536;
/*    */   public static final int EUROPEAN = 1;
/*    */   public static final int GUJARATI = 64;
/*    */   public static final int GURMUKHI = 32;
/*    */   public static final int KANNADA = 1024;
/*    */   public static final int KHMER = 131072;
/*    */   public static final int LAO = 8192;
/*    */   public static final int MALAYALAM = 2048;
/*    */   public static final int MONGOLIAN = 262144;
/*    */   public static final int MYANMAR = 32768;
/*    */   public static final int ORIYA = 128;
/*    */   public static final int TAMIL = 256;
/*    */   public static final int TELUGU = 512;
/*    */   public static final int THAI = 4096;
/*    */   public static final int TIBETAN = 16384;
/*    */   
/*    */   public static enum Range
/*    */   {
/* 32 */     ARABIC, 
/* 33 */     BALINESE, 
/* 34 */     BENGALI, 
/* 35 */     CHAM, 
/* 36 */     DEVANAGARI, 
/* 37 */     EASTERN_ARABIC, 
/* 38 */     ETHIOPIC, 
/* 39 */     EUROPEAN, 
/* 40 */     GUJARATI, 
/* 41 */     GURMUKHI, 
/* 42 */     JAVANESE, 
/* 43 */     KANNADA, 
/* 44 */     KAYAH_LI, 
/* 45 */     KHMER, 
/* 46 */     LAO, 
/* 47 */     LEPCHA, 
/* 48 */     LIMBU, 
/* 49 */     MALAYALAM, 
/* 50 */     MEETEI_MAYEK, 
/* 51 */     MONGOLIAN, 
/* 52 */     MYANMAR, 
/* 53 */     MYANMAR_SHAN, 
/* 54 */     NEW_TAI_LUE, 
/* 55 */     NKO, 
/* 56 */     OL_CHIKI, 
/* 57 */     ORIYA, 
/* 58 */     SAURASHTRA, 
/* 59 */     SUNDANESE, 
/* 60 */     TAI_THAM_HORA, 
/* 61 */     TAI_THAM_THAM, 
/* 62 */     TAMIL, 
/* 63 */     TELUGU, 
/* 64 */     THAI, 
/* 65 */     TIBETAN, 
/* 66 */     VAI;
/*    */     private Range() {} }
/* 68 */   NumericShaper() { throw new RuntimeException("Stub!"); }
/* 69 */   public static NumericShaper getShaper(int singleRange) { throw new RuntimeException("Stub!"); }
/* 70 */   public static NumericShaper getShaper(Range singleRange) { throw new RuntimeException("Stub!"); }
/* 71 */   public static NumericShaper getContextualShaper(int ranges) { throw new RuntimeException("Stub!"); }
/* 72 */   public static NumericShaper getContextualShaper(Set<Range> ranges) { throw new RuntimeException("Stub!"); }
/* 73 */   public static NumericShaper getContextualShaper(int ranges, int defaultContext) { throw new RuntimeException("Stub!"); }
/* 74 */   public static NumericShaper getContextualShaper(Set<Range> ranges, Range defaultContext) { throw new RuntimeException("Stub!"); }
/* 75 */   public void shape(char[] text, int start, int count) { throw new RuntimeException("Stub!"); }
/* 76 */   public void shape(char[] text, int start, int count, int context) { throw new RuntimeException("Stub!"); }
/* 77 */   public void shape(char[] text, int start, int count, Range context) { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isContextual() { throw new RuntimeException("Stub!"); }
/* 79 */   public int getRanges() { throw new RuntimeException("Stub!"); }
/* 80 */   public Set<Range> getRangeSet() { throw new RuntimeException("Stub!"); }
/* 81 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 83 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\awt\font\NumericShaper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */