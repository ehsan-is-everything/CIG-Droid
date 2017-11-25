/*    */ package android.icu.text;
/*    */ 
/*    */ import java.text.FieldPosition;
/*    */ 
/*    */ 
/*    */ public class DecimalFormat
/*    */   extends NumberFormat
/*    */ {
/*    */   public static final int PAD_AFTER_PREFIX = 1;
/*    */   public static final int PAD_AFTER_SUFFIX = 3;
/*    */   public static final int PAD_BEFORE_PREFIX = 0;
/*    */   public static final int PAD_BEFORE_SUFFIX = 2;
/*    */   
/* 14 */   public DecimalFormat() { throw new RuntimeException("Stub!"); }
/* 15 */   public DecimalFormat(String pattern) { throw new RuntimeException("Stub!"); }
/* 16 */   public DecimalFormat(String pattern, DecimalFormatSymbols symbols) { throw new RuntimeException("Stub!"); }
/* 17 */   public DecimalFormat(String pattern, DecimalFormatSymbols symbols, CurrencyPluralInfo infoInput, int style) { throw new RuntimeException("Stub!"); }
/* 18 */   public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 19 */   public StringBuffer format(long number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 20 */   public StringBuffer format(java.math.BigInteger number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 21 */   public StringBuffer format(java.math.BigDecimal number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 22 */   public StringBuffer format(android.icu.math.BigDecimal number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 23 */   public Number parse(String text, java.text.ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
/* 24 */   public android.icu.util.CurrencyAmount parseCurrency(CharSequence text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 25 */   public DecimalFormatSymbols getDecimalFormatSymbols() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setDecimalFormatSymbols(DecimalFormatSymbols newSymbols) { throw new RuntimeException("Stub!"); }
/* 27 */   public String getPositivePrefix() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setPositivePrefix(String newValue) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getNegativePrefix() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setNegativePrefix(String newValue) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getPositiveSuffix() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setPositiveSuffix(String newValue) { throw new RuntimeException("Stub!"); }
/* 33 */   public String getNegativeSuffix() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setNegativeSuffix(String newValue) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getMultiplier() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setMultiplier(int newValue) { throw new RuntimeException("Stub!"); }
/* 37 */   public java.math.BigDecimal getRoundingIncrement() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setRoundingIncrement(java.math.BigDecimal newValue) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setRoundingIncrement(android.icu.math.BigDecimal newValue) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setRoundingIncrement(double newValue) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getRoundingMode() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setRoundingMode(int roundingMode) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getFormatWidth() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setFormatWidth(int width) { throw new RuntimeException("Stub!"); }
/* 45 */   public char getPadCharacter() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setPadCharacter(char padChar) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getPadPosition() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setPadPosition(int padPos) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isScientificNotation() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setScientificNotation(boolean useScientific) { throw new RuntimeException("Stub!"); }
/* 51 */   public byte getMinimumExponentDigits() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setMinimumExponentDigits(byte minExpDig) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isExponentSignAlwaysShown() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setExponentSignAlwaysShown(boolean expSignAlways) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getGroupingSize() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setGroupingSize(int newValue) { throw new RuntimeException("Stub!"); }
/* 57 */   public int getSecondaryGroupingSize() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setSecondaryGroupingSize(int newValue) { throw new RuntimeException("Stub!"); }
/* 59 */   public android.icu.math.MathContext getMathContextICU() { throw new RuntimeException("Stub!"); }
/* 60 */   public java.math.MathContext getMathContext() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setMathContextICU(android.icu.math.MathContext newValue) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setMathContext(java.math.MathContext newValue) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean isDecimalSeparatorAlwaysShown() { throw new RuntimeException("Stub!"); }
/* 64 */   public void setDecimalPatternMatchRequired(boolean value) { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean isDecimalPatternMatchRequired() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setDecimalSeparatorAlwaysShown(boolean newValue) { throw new RuntimeException("Stub!"); }
/* 67 */   public CurrencyPluralInfo getCurrencyPluralInfo() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setCurrencyPluralInfo(CurrencyPluralInfo newInfo) { throw new RuntimeException("Stub!"); }
/* 69 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 71 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 72 */   public String toPattern() { throw new RuntimeException("Stub!"); }
/* 73 */   public String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
/* 74 */   public java.text.AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/* 75 */   public void applyPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 76 */   public void applyLocalizedPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 79 */   public int getMinimumSignificantDigits() { throw new RuntimeException("Stub!"); }
/* 80 */   public int getMaximumSignificantDigits() { throw new RuntimeException("Stub!"); }
/* 81 */   public void setMinimumSignificantDigits(int min) { throw new RuntimeException("Stub!"); }
/* 82 */   public void setMaximumSignificantDigits(int max) { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean areSignificantDigitsUsed() { throw new RuntimeException("Stub!"); }
/* 84 */   public void setSignificantDigitsUsed(boolean useSignificantDigits) { throw new RuntimeException("Stub!"); }
/* 85 */   public void setCurrency(android.icu.util.Currency theCurrency) { throw new RuntimeException("Stub!"); }
/* 86 */   public void setCurrencyUsage(android.icu.util.Currency.CurrencyUsage newUsage) { throw new RuntimeException("Stub!"); }
/* 87 */   public android.icu.util.Currency.CurrencyUsage getCurrencyUsage() { throw new RuntimeException("Stub!"); }
/* 88 */   public void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 89 */   public void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 90 */   public void setParseBigDecimal(boolean value) { throw new RuntimeException("Stub!"); }
/* 91 */   public boolean isParseBigDecimal() { throw new RuntimeException("Stub!"); }
/* 92 */   public void setParseMaxDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 93 */   public int getParseMaxDigits() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\DecimalFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */