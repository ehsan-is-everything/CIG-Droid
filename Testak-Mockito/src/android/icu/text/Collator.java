/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Freezable;
/*    */ import android.icu.util.ULocale;
/*    */ import android.icu.util.VersionInfo;
/*    */ import java.util.Comparator;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Collator
/*    */   implements Comparator<Object>, Freezable<Collator>, Cloneable
/*    */ {
/*    */   public static final int CANONICAL_DECOMPOSITION = 17;
/*    */   public static final int FULL_DECOMPOSITION = 15;
/*    */   public static final int IDENTICAL = 15;
/*    */   public static final int NO_DECOMPOSITION = 16;
/*    */   public static final int PRIMARY = 0;
/*    */   public static final int QUATERNARY = 3;
/*    */   public static final int SECONDARY = 1;
/*    */   public static final int TERTIARY = 2;
/*    */   
/* 26 */   protected Collator() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 28 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setStrength(int newStrength) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setDecomposition(int decomposition) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setReorderCodes(int... order) { throw new RuntimeException("Stub!"); }
/* 32 */   public static final Collator getInstance() { throw new RuntimeException("Stub!"); }
/* 33 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 34 */   public static final Collator getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 35 */   public static final Collator getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 36 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 37 */   public static final ULocale[] getAvailableULocales() { throw new RuntimeException("Stub!"); }
/* 38 */   public static final String[] getKeywords() { throw new RuntimeException("Stub!"); }
/* 39 */   public static final String[] getKeywordValues(String keyword) { throw new RuntimeException("Stub!"); }
/* 40 */   public static final String[] getKeywordValuesForLocale(String key, ULocale locale, boolean commonlyUsed) { throw new RuntimeException("Stub!"); }
/* 41 */   public static final ULocale getFunctionalEquivalent(String keyword, ULocale locID, boolean[] isAvailable) { throw new RuntimeException("Stub!"); }
/* 42 */   public static final ULocale getFunctionalEquivalent(String keyword, ULocale locID) { throw new RuntimeException("Stub!"); }
/* 43 */   public static String getDisplayName(Locale objectLocale, Locale displayLocale) { throw new RuntimeException("Stub!"); }
/* 44 */   public static String getDisplayName(ULocale objectLocale, ULocale displayLocale) { throw new RuntimeException("Stub!"); }
/* 45 */   public static String getDisplayName(Locale objectLocale) { throw new RuntimeException("Stub!"); }
/* 46 */   public static String getDisplayName(ULocale objectLocale) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getStrength() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getDecomposition() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean equals(String source, String target) { throw new RuntimeException("Stub!"); }
/* 50 */   public UnicodeSet getTailoredSet() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int compare(String paramString1, String paramString2);
/* 52 */   public int compare(Object source, Object target) { throw new RuntimeException("Stub!"); }
/*    */   public abstract CollationKey getCollationKey(String paramString);
/* 54 */   public Collator setMaxVariable(int group) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getMaxVariable() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getVariableTop();
/*    */   public abstract VersionInfo getVersion();
/*    */   public abstract VersionInfo getUCAVersion();
/* 59 */   public int[] getReorderCodes() { throw new RuntimeException("Stub!"); }
/* 60 */   public static int[] getEquivalentReorderCodes(int reorderCode) { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 62 */   public Collator freeze() { throw new RuntimeException("Stub!"); }
/* 63 */   public Collator cloneAsThawed() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ReorderCodes
/*    */   {
/*    */     public static final int CURRENCY = 4099;
/*    */     public static final int DEFAULT = -1;
/*    */     public static final int DIGIT = 4100;
/*    */     public static final int FIRST = 4096;
/*    */     public static final int NONE = 103;
/*    */     public static final int OTHERS = 103;
/*    */     public static final int PUNCTUATION = 4097;
/*    */     public static final int SPACE = 4096;
/*    */     public static final int SYMBOL = 4098;
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\Collator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */