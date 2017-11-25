/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Calendar;
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.AttributedCharacterIterator;
/*    */ import java.text.FieldPosition;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class SimpleDateFormat
/*    */   extends DateFormat
/*    */ {
/* 15 */   public SimpleDateFormat() { throw new RuntimeException("Stub!"); }
/* 16 */   public SimpleDateFormat(String pattern) { throw new RuntimeException("Stub!"); }
/* 17 */   public SimpleDateFormat(String pattern, Locale loc) { throw new RuntimeException("Stub!"); }
/* 18 */   public SimpleDateFormat(String pattern, ULocale loc) { throw new RuntimeException("Stub!"); }
/* 19 */   public SimpleDateFormat(String pattern, String override, ULocale loc) { throw new RuntimeException("Stub!"); }
/* 20 */   public SimpleDateFormat(String pattern, DateFormatSymbols formatData) { throw new RuntimeException("Stub!"); }
/* 21 */   public void set2DigitYearStart(Date startDate) { throw new RuntimeException("Stub!"); }
/* 22 */   public Date get2DigitYearStart() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setContext(DisplayContext context) { throw new RuntimeException("Stub!"); }
/* 24 */   public StringBuffer format(Calendar cal, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 25 */   protected DateFormat.Field patternCharToDateFormatField(char ch) { throw new RuntimeException("Stub!"); }
/* 26 */   protected String subFormat(char ch, int count, int beginOffset, FieldPosition pos, DateFormatSymbols fmtData, Calendar cal) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 27 */   public void setNumberFormat(NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
/* 28 */   protected String zeroPaddingNumber(long value, int minDigits, int maxDigits) { throw new RuntimeException("Stub!"); }
/* 29 */   public void parse(String text, Calendar cal, ParsePosition parsePos) { throw new RuntimeException("Stub!"); }
/* 30 */   protected int matchString(String text, int start, int field, String[] data, Calendar cal) { throw new RuntimeException("Stub!"); }
/* 31 */   protected int matchQuarterString(String text, int start, int field, String[] data, Calendar cal) { throw new RuntimeException("Stub!"); }
/* 32 */   protected int subParse(String text, int start, char ch, int count, boolean obeyCount, boolean allowNegative, boolean[] ambiguousYear, Calendar cal) { throw new RuntimeException("Stub!"); }
/* 33 */   public String toPattern() { throw new RuntimeException("Stub!"); }
/* 34 */   public String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
/* 35 */   public void applyPattern(String pat) { throw new RuntimeException("Stub!"); }
/* 36 */   public void applyLocalizedPattern(String pat) { throw new RuntimeException("Stub!"); }
/* 37 */   public DateFormatSymbols getDateFormatSymbols() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setDateFormatSymbols(DateFormatSymbols newFormatSymbols) { throw new RuntimeException("Stub!"); }
/* 39 */   protected DateFormatSymbols getSymbols() { throw new RuntimeException("Stub!"); }
/* 40 */   public TimeZoneFormat getTimeZoneFormat() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setTimeZoneFormat(TimeZoneFormat tzfmt) { throw new RuntimeException("Stub!"); }
/* 42 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 43 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 45 */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setNumberFormat(String fields, NumberFormat overrideNF) { throw new RuntimeException("Stub!"); }
/* 47 */   public NumberFormat getNumberFormat(char field) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\SimpleDateFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */