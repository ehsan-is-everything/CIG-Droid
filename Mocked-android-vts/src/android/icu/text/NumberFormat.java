/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ 
/*    */ public abstract class NumberFormat extends UFormat { public static final int ACCOUNTINGCURRENCYSTYLE = 7;
/*    */   public static final int CASHCURRENCYSTYLE = 8;
/*    */   public static final int CURRENCYSTYLE = 1;
/*    */   public static final int FRACTION_FIELD = 1;
/*    */   public static final int INTEGERSTYLE = 4;
/*    */   public static final int INTEGER_FIELD = 0;
/*    */   public static final int ISOCURRENCYSTYLE = 5;
/*    */   public static final int NUMBERSTYLE = 0;
/*    */   public static final int PERCENTSTYLE = 2;
/*    */   public static final int PLURALCURRENCYSTYLE = 6;
/*    */   public static final int SCIENTIFICSTYLE = 3;
/*    */   public static final int STANDARDCURRENCYSTYLE = 9;
/*    */   
/* 18 */   public static class Field extends java.text.Format.Field { protected Field(String fieldName) { super();throw new RuntimeException("Stub!"); }
/* 19 */     protected Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
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
/* 31 */     public static final Field SIGN = null; public static final Field PERMILLE = null; public static final Field PERCENT = null; public static final Field INTEGER = null; public static final Field GROUPING_SEPARATOR = null; public static final Field FRACTION = null; public static final Field EXPONENT_SYMBOL = null; public static final Field EXPONENT_SIGN = null; public static final Field EXPONENT = null; public static final Field DECIMAL_SEPARATOR = null; public static final Field CURRENCY = null; }
/*    */   
/* 33 */   public NumberFormat() { throw new RuntimeException("Stub!"); }
/* 34 */   public StringBuffer format(Object number, StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 35 */   public final Object parseObject(String source, java.text.ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
/* 36 */   public final String format(double number) { throw new RuntimeException("Stub!"); }
/* 37 */   public final String format(long number) { throw new RuntimeException("Stub!"); }
/* 38 */   public final String format(java.math.BigInteger number) { throw new RuntimeException("Stub!"); }
/* 39 */   public final String format(java.math.BigDecimal number) { throw new RuntimeException("Stub!"); }
/* 40 */   public final String format(android.icu.math.BigDecimal number) { throw new RuntimeException("Stub!"); }
/* 41 */   public final String format(android.icu.util.CurrencyAmount currAmt) { throw new RuntimeException("Stub!"); }
/*    */   public abstract StringBuffer format(double paramDouble, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/*    */   public abstract StringBuffer format(long paramLong, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/*    */   public abstract StringBuffer format(java.math.BigInteger paramBigInteger, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/*    */   public abstract StringBuffer format(java.math.BigDecimal paramBigDecimal, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/*    */   public abstract StringBuffer format(android.icu.math.BigDecimal paramBigDecimal, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/* 47 */   public StringBuffer format(android.icu.util.CurrencyAmount currAmt, StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Number parse(String paramString, java.text.ParsePosition paramParsePosition);
/* 49 */   public Number parse(String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
/* 50 */   public android.icu.util.CurrencyAmount parseCurrency(CharSequence text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setParseStrict(boolean value) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean isParseStrict() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setContext(DisplayContext context) { throw new RuntimeException("Stub!"); }
/* 56 */   public DisplayContext getContext(DisplayContext.Type type) { throw new RuntimeException("Stub!"); }
/* 57 */   public static final NumberFormat getInstance() { throw new RuntimeException("Stub!"); }
/* 58 */   public static NumberFormat getInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 59 */   public static NumberFormat getInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 60 */   public static final NumberFormat getInstance(int style) { throw new RuntimeException("Stub!"); }
/* 61 */   public static NumberFormat getInstance(java.util.Locale inLocale, int style) { throw new RuntimeException("Stub!"); }
/* 62 */   public static final NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }
/* 63 */   public static NumberFormat getNumberInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 64 */   public static NumberFormat getNumberInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 65 */   public static final NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }
/* 66 */   public static NumberFormat getIntegerInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 67 */   public static NumberFormat getIntegerInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 68 */   public static final NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }
/* 69 */   public static NumberFormat getCurrencyInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 70 */   public static NumberFormat getCurrencyInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 71 */   public static final NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }
/* 72 */   public static NumberFormat getPercentInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 73 */   public static NumberFormat getPercentInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 74 */   public static final NumberFormat getScientificInstance() { throw new RuntimeException("Stub!"); }
/* 75 */   public static NumberFormat getScientificInstance(java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }
/* 76 */   public static NumberFormat getScientificInstance(ULocale inLocale) { throw new RuntimeException("Stub!"); }
/* 77 */   public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 78 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 80 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
/* 82 */   public void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }
/* 83 */   public int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
/* 84 */   public void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 85 */   public int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
/* 86 */   public void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 87 */   public int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
/* 88 */   public void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 89 */   public int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
/* 90 */   public void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 91 */   public void setCurrency(android.icu.util.Currency theCurrency) { throw new RuntimeException("Stub!"); }
/* 92 */   public android.icu.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
/* 93 */   public int getRoundingMode() { throw new RuntimeException("Stub!"); }
/* 94 */   public void setRoundingMode(int roundingMode) { throw new RuntimeException("Stub!"); }
/* 95 */   public static NumberFormat getInstance(ULocale desiredLocale, int choice) { throw new RuntimeException("Stub!"); }
/* 96 */   protected static String getPattern(ULocale forLocale, int choice) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\NumberFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */