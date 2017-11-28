/*    */ package android.icu.util;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class Currency
/*    */   extends MeasureUnit
/*    */ {
/*    */   public static final int LONG_NAME = 1;
/*    */   public static final int PLURAL_LONG_NAME = 2;
/*    */   public static final int SYMBOL_NAME = 0;
/*    */   
/*    */   public static enum CurrencyUsage
/*    */   {
/* 16 */     CASH, 
/* 17 */     STANDARD;
/*    */     private CurrencyUsage() {} }
/* 19 */   protected Currency(String theISOCode) { throw new RuntimeException("Stub!"); }
/* 20 */   public static Currency getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 21 */   public static Currency getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 22 */   public static String[] getAvailableCurrencyCodes(ULocale loc, Date d) { throw new RuntimeException("Stub!"); }
/* 23 */   public static String[] getAvailableCurrencyCodes(Locale loc, Date d) { throw new RuntimeException("Stub!"); }
/* 24 */   public static Set<Currency> getAvailableCurrencies() { throw new RuntimeException("Stub!"); }
/* 25 */   public static Currency getInstance(String theISOCode) { throw new RuntimeException("Stub!"); }
/* 26 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 27 */   public static ULocale[] getAvailableULocales() { throw new RuntimeException("Stub!"); }
/* 28 */   public static final String[] getKeywordValuesForLocale(String key, ULocale locale, boolean commonlyUsed) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getCurrencyCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getNumericCode() { throw new RuntimeException("Stub!"); }
/* 31 */   public String getSymbol() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getSymbol(Locale loc) { throw new RuntimeException("Stub!"); }
/* 33 */   public String getSymbol(ULocale uloc) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getName(Locale locale, int nameStyle, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getName(ULocale locale, int nameStyle, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getName(Locale locale, int nameStyle, String pluralCount, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
/* 37 */   public String getName(ULocale locale, int nameStyle, String pluralCount, boolean[] isChoiceFormat) { throw new RuntimeException("Stub!"); }
/*    */   
/* 39 */   public String getDisplayName() { throw new RuntimeException("Stub!"); }
/*    */   
/* 41 */   public String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getDefaultFractionDigits() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getDefaultFractionDigits(CurrencyUsage Usage) { throw new RuntimeException("Stub!"); }
/* 44 */   public double getRoundingIncrement() { throw new RuntimeException("Stub!"); }
/* 45 */   public double getRoundingIncrement(CurrencyUsage Usage) { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public static boolean isAvailable(String code, Date from, Date to) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\Currency.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */