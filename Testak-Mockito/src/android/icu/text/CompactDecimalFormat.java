/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.math.BigInteger;
/*    */ import java.text.AttributedCharacterIterator;
/*    */ import java.text.FieldPosition;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CompactDecimalFormat
/*    */   extends DecimalFormat
/*    */ {
/*    */   public static enum CompactStyle
/*    */   {
/* 17 */     LONG, 
/* 18 */     SHORT;
/*    */     private CompactStyle() {} }
/* 20 */   CompactDecimalFormat() { throw new RuntimeException("Stub!"); }
/* 21 */   public static CompactDecimalFormat getInstance(ULocale locale, CompactStyle style) { throw new RuntimeException("Stub!"); }
/* 22 */   public static CompactDecimalFormat getInstance(Locale locale, CompactStyle style) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 24 */   public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 25 */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/* 26 */   public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 27 */   public StringBuffer format(BigInteger number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 28 */   public StringBuffer format(java.math.BigDecimal number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 29 */   public StringBuffer format(android.icu.math.BigDecimal number, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 30 */   public Number parse(String text, ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\CompactDecimalFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */