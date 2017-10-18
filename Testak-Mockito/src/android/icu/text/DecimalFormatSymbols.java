/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class DecimalFormatSymbols
/*    */   implements Cloneable, java.io.Serializable
/*    */ {
/*    */   public static final int CURRENCY_SPC_CURRENCY_MATCH = 0;
/*    */   public static final int CURRENCY_SPC_INSERT = 2;
/*    */   public static final int CURRENCY_SPC_SURROUNDING_MATCH = 1;
/*    */   
/* 14 */   public DecimalFormatSymbols() { throw new RuntimeException("Stub!"); }
/* 15 */   public DecimalFormatSymbols(Locale locale) { throw new RuntimeException("Stub!"); }
/* 16 */   public DecimalFormatSymbols(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 17 */   public static DecimalFormatSymbols getInstance() { throw new RuntimeException("Stub!"); }
/* 18 */   public static DecimalFormatSymbols getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 19 */   public static DecimalFormatSymbols getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 20 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 21 */   public char getZeroDigit() { throw new RuntimeException("Stub!"); }
/* 22 */   public char[] getDigits() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setZeroDigit(char zeroDigit) { throw new RuntimeException("Stub!"); }
/* 24 */   public char getSignificantDigit() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setSignificantDigit(char sigDigit) { throw new RuntimeException("Stub!"); }
/* 26 */   public char getGroupingSeparator() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setGroupingSeparator(char groupingSeparator) { throw new RuntimeException("Stub!"); }
/* 28 */   public char getDecimalSeparator() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setDecimalSeparator(char decimalSeparator) { throw new RuntimeException("Stub!"); }
/* 30 */   public char getPerMill() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setPerMill(char perMill) { throw new RuntimeException("Stub!"); }
/* 32 */   public char getPercent() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPercent(char percent) { throw new RuntimeException("Stub!"); }
/* 34 */   public char getDigit() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setDigit(char digit) { throw new RuntimeException("Stub!"); }
/* 36 */   public char getPatternSeparator() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setPatternSeparator(char patternSeparator) { throw new RuntimeException("Stub!"); }
/* 38 */   public String getInfinity() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setInfinity(String infinity) { throw new RuntimeException("Stub!"); }
/* 40 */   public String getNaN() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setNaN(String NaN) { throw new RuntimeException("Stub!"); }
/* 42 */   public char getMinusSign() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setMinusSign(char minusSign) { throw new RuntimeException("Stub!"); }
/* 44 */   public char getPlusSign() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setPlusSign(char plus) { throw new RuntimeException("Stub!"); }
/* 46 */   public String getCurrencySymbol() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setCurrencySymbol(String currency) { throw new RuntimeException("Stub!"); }
/* 48 */   public String getInternationalCurrencySymbol() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setInternationalCurrencySymbol(String currency) { throw new RuntimeException("Stub!"); }
/* 50 */   public android.icu.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setCurrency(android.icu.util.Currency currency) { throw new RuntimeException("Stub!"); }
/* 52 */   public char getMonetaryDecimalSeparator() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setMonetaryDecimalSeparator(char sep) { throw new RuntimeException("Stub!"); }
/* 54 */   public char getMonetaryGroupingSeparator() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setMonetaryGroupingSeparator(char sep) { throw new RuntimeException("Stub!"); }
/* 56 */   public String getExponentMultiplicationSign() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setExponentMultiplicationSign(String exponentMultiplicationSign) { throw new RuntimeException("Stub!"); }
/* 58 */   public String getExponentSeparator() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setExponentSeparator(String exp) { throw new RuntimeException("Stub!"); }
/* 60 */   public char getPadEscape() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setPadEscape(char c) { throw new RuntimeException("Stub!"); }
/* 62 */   public String getPatternForCurrencySpacing(int itemType, boolean beforeCurrency) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setPatternForCurrencySpacing(int itemType, boolean beforeCurrency, String pattern) { throw new RuntimeException("Stub!"); }
/* 64 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/* 65 */   public ULocale getULocale() { throw new RuntimeException("Stub!"); }
/* 66 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 68 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\DecimalFormatSymbols.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */