/*    */ package java.text;
/*    */ 
/*    */ import java.math.RoundingMode;
/*    */ import java.util.Currency;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DecimalFormat
/*    */   extends NumberFormat
/*    */ {
/* 44 */   public DecimalFormat() { throw new RuntimeException("Stub!"); }
/* 45 */   public DecimalFormat(String pattern) { throw new RuntimeException("Stub!"); }
/* 46 */   public DecimalFormat(String pattern, DecimalFormatSymbols symbols) { throw new RuntimeException("Stub!"); }
/* 47 */   public final StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 48 */   public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 49 */   public StringBuffer format(long number, StringBuffer result, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 50 */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/* 51 */   public Number parse(String text, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 52 */   public DecimalFormatSymbols getDecimalFormatSymbols() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setDecimalFormatSymbols(DecimalFormatSymbols newSymbols) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getPositivePrefix() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setPositivePrefix(String newValue) { throw new RuntimeException("Stub!"); }
/* 56 */   public String getNegativePrefix() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setNegativePrefix(String newValue) { throw new RuntimeException("Stub!"); }
/* 58 */   public String getPositiveSuffix() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setPositiveSuffix(String newValue) { throw new RuntimeException("Stub!"); }
/* 60 */   public String getNegativeSuffix() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setNegativeSuffix(String newValue) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getMultiplier() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setMultiplier(int newValue) { throw new RuntimeException("Stub!"); }
/* 64 */   public int getGroupingSize() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setGroupingSize(int newValue) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
/* 67 */   public void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean isDecimalSeparatorAlwaysShown() { throw new RuntimeException("Stub!"); }
/* 69 */   public void setDecimalSeparatorAlwaysShown(boolean newValue) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean isParseBigDecimal() { throw new RuntimeException("Stub!"); }
/* 71 */   public void setParseBigDecimal(boolean newValue) { throw new RuntimeException("Stub!"); }
/* 72 */   public void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
/* 74 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 76 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 77 */   public String toPattern() { throw new RuntimeException("Stub!"); }
/* 78 */   public String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
/* 79 */   public void applyPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 80 */   public void applyLocalizedPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 81 */   public void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 82 */   public void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 83 */   public void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 84 */   public void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }
/* 85 */   public int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
/* 86 */   public int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
/* 87 */   public int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
/* 88 */   public int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
/* 89 */   public Currency getCurrency() { throw new RuntimeException("Stub!"); }
/* 90 */   public void setCurrency(Currency currency) { throw new RuntimeException("Stub!"); }
/* 91 */   public RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }
/* 92 */   public void setRoundingMode(RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\DecimalFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */