/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.io.Serializable;
/*    */ import java.text.ParseException;
/*    */ import java.util.Collection;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PluralRules
/*    */   implements Serializable
/*    */ {
/*    */   public static enum PluralType
/*    */   {
/* 17 */     CARDINAL, 
/* 18 */     ORDINAL;
/*    */     private PluralType() {} }
/* 20 */   PluralRules() { throw new RuntimeException("Stub!"); }
/* 21 */   public static PluralRules parseDescription(String description) throws ParseException { throw new RuntimeException("Stub!"); }
/* 22 */   public static PluralRules createRules(String description) { throw new RuntimeException("Stub!"); }
/* 23 */   public static PluralRules forLocale(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 24 */   public static PluralRules forLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/* 25 */   public static PluralRules forLocale(ULocale locale, PluralType type) { throw new RuntimeException("Stub!"); }
/* 26 */   public static PluralRules forLocale(Locale locale, PluralType type) { throw new RuntimeException("Stub!"); }
/* 27 */   public String select(double number) { throw new RuntimeException("Stub!"); }
/* 28 */   public Set<String> getKeywords() { throw new RuntimeException("Stub!"); }
/* 29 */   public double getUniqueKeywordValue(String keyword) { throw new RuntimeException("Stub!"); }
/* 30 */   public Collection<Double> getAllKeywordValues(String keyword) { throw new RuntimeException("Stub!"); }
/* 31 */   public Collection<Double> getSamples(String keyword) { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean equals(Object rhs) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean equals(PluralRules rhs) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 43 */   public static final PluralRules DEFAULT = null;
/*    */   public static final String KEYWORD_FEW = "few";
/*    */   public static final String KEYWORD_MANY = "many";
/*    */   public static final String KEYWORD_ONE = "one";
/*    */   public static final String KEYWORD_OTHER = "other";
/*    */   public static final String KEYWORD_TWO = "two";
/*    */   public static final String KEYWORD_ZERO = "zero";
/*    */   public static final double NO_UNIQUE_VALUE = -0.00123456777D;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\PluralRules.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */