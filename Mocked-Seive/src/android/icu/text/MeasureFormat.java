/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Measure;
/*    */ import android.icu.util.MeasureUnit;
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.FieldPosition;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MeasureFormat
/*    */   extends UFormat
/*    */ {
/*    */   public static enum FormatWidth
/*    */   {
/* 20 */     NARROW, 
/* 21 */     NUMERIC, 
/* 22 */     SHORT, 
/* 23 */     WIDE;
/*    */     private FormatWidth() {} }
/* 25 */   MeasureFormat() { throw new RuntimeException("Stub!"); }
/* 26 */   public static MeasureFormat getInstance(ULocale locale, FormatWidth formatWidth) { throw new RuntimeException("Stub!"); }
/* 27 */   public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth) { throw new RuntimeException("Stub!"); }
/* 28 */   public static MeasureFormat getInstance(ULocale locale, FormatWidth formatWidth, NumberFormat format) { throw new RuntimeException("Stub!"); }
/* 29 */   public static MeasureFormat getInstance(Locale locale, FormatWidth formatWidth, NumberFormat format) { throw new RuntimeException("Stub!"); }
/* 30 */   public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 31 */   public final String formatMeasures(Measure... measures) { throw new RuntimeException("Stub!"); }
/* 32 */   public StringBuilder formatMeasurePerUnit(Measure measure, MeasureUnit perUnit, StringBuilder appendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 33 */   public StringBuilder formatMeasures(StringBuilder appendTo, FieldPosition fieldPosition, Measure... measures) { throw new RuntimeException("Stub!"); }
/* 34 */   public final boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 35 */   public final int hashCode() { throw new RuntimeException("Stub!"); }
/* 36 */   public FormatWidth getWidth() { throw new RuntimeException("Stub!"); }
/* 37 */   public final ULocale getLocale() { throw new RuntimeException("Stub!"); }
/* 38 */   public NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
/* 39 */   public static MeasureFormat getCurrencyFormat(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 40 */   public static MeasureFormat getCurrencyFormat(Locale locale) { throw new RuntimeException("Stub!"); }
/* 41 */   public static MeasureFormat getCurrencyFormat() { throw new RuntimeException("Stub!"); }
/* 42 */   public Measure parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\MeasureFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */