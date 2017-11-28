/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Freezable;
/*    */ import android.icu.util.Output;
/*    */ import android.icu.util.TimeZone;
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.AttributedCharacterIterator;
/*    */ import java.text.FieldPosition;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.EnumSet;
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class TimeZoneFormat extends UFormat implements Freezable<TimeZoneFormat>, java.io.Serializable
/*    */ {
/*    */   public static enum Style
/*    */   {
/* 17 */     EXEMPLAR_LOCATION, 
/* 18 */     GENERIC_LOCATION, 
/* 19 */     GENERIC_LONG, 
/* 20 */     GENERIC_SHORT, 
/* 21 */     ISO_BASIC_FIXED, 
/* 22 */     ISO_BASIC_FULL, 
/* 23 */     ISO_BASIC_LOCAL_FIXED, 
/* 24 */     ISO_BASIC_LOCAL_FULL, 
/* 25 */     ISO_BASIC_LOCAL_SHORT, 
/* 26 */     ISO_BASIC_SHORT, 
/* 27 */     ISO_EXTENDED_FIXED, 
/* 28 */     ISO_EXTENDED_FULL, 
/* 29 */     ISO_EXTENDED_LOCAL_FIXED, 
/* 30 */     ISO_EXTENDED_LOCAL_FULL, 
/* 31 */     LOCALIZED_GMT, 
/* 32 */     LOCALIZED_GMT_SHORT, 
/* 33 */     SPECIFIC_LONG, 
/* 34 */     SPECIFIC_SHORT, 
/* 35 */     ZONE_ID, 
/* 36 */     ZONE_ID_SHORT;
/*    */     
/*    */     private Style() {} }
/*    */   
/* 40 */   public static enum GMTOffsetPatternType { NEGATIVE_H, 
/* 41 */     NEGATIVE_HM, 
/* 42 */     NEGATIVE_HMS, 
/* 43 */     POSITIVE_H, 
/* 44 */     POSITIVE_HM, 
/* 45 */     POSITIVE_HMS;
/*    */     
/*    */     private GMTOffsetPatternType() {} }
/*    */   
/* 49 */   public static enum TimeType { DAYLIGHT, 
/* 50 */     STANDARD, 
/* 51 */     UNKNOWN;
/*    */     
/*    */     private TimeType() {} }
/*    */   
/* 55 */   public static enum ParseOption { ALL_STYLES, 
/* 56 */     TZ_DATABASE_ABBREVIATIONS;
/*    */     private ParseOption() {} }
/* 58 */   protected TimeZoneFormat(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 59 */   public static TimeZoneFormat getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 60 */   public static TimeZoneFormat getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 61 */   public TimeZoneNames getTimeZoneNames() { throw new RuntimeException("Stub!"); }
/* 62 */   public TimeZoneFormat setTimeZoneNames(TimeZoneNames tznames) { throw new RuntimeException("Stub!"); }
/* 63 */   public String getGMTPattern() { throw new RuntimeException("Stub!"); }
/* 64 */   public TimeZoneFormat setGMTPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 65 */   public String getGMTOffsetPattern(GMTOffsetPatternType type) { throw new RuntimeException("Stub!"); }
/* 66 */   public TimeZoneFormat setGMTOffsetPattern(GMTOffsetPatternType type, String pattern) { throw new RuntimeException("Stub!"); }
/* 67 */   public String getGMTOffsetDigits() { throw new RuntimeException("Stub!"); }
/* 68 */   public TimeZoneFormat setGMTOffsetDigits(String digits) { throw new RuntimeException("Stub!"); }
/* 69 */   public String getGMTZeroFormat() { throw new RuntimeException("Stub!"); }
/* 70 */   public TimeZoneFormat setGMTZeroFormat(String gmtZeroFormat) { throw new RuntimeException("Stub!"); }
/* 71 */   public TimeZoneFormat setDefaultParseOptions(EnumSet<ParseOption> options) { throw new RuntimeException("Stub!"); }
/* 72 */   public EnumSet<ParseOption> getDefaultParseOptions() { throw new RuntimeException("Stub!"); }
/* 73 */   public final String formatOffsetISO8601Basic(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) { throw new RuntimeException("Stub!"); }
/* 74 */   public final String formatOffsetISO8601Extended(int offset, boolean useUtcIndicator, boolean isShort, boolean ignoreSeconds) { throw new RuntimeException("Stub!"); }
/* 75 */   public String formatOffsetLocalizedGMT(int offset) { throw new RuntimeException("Stub!"); }
/* 76 */   public String formatOffsetShortLocalizedGMT(int offset) { throw new RuntimeException("Stub!"); }
/* 77 */   public final String format(Style style, TimeZone tz, long date) { throw new RuntimeException("Stub!"); }
/* 78 */   public String format(Style style, TimeZone tz, long date, Output<TimeType> timeType) { throw new RuntimeException("Stub!"); }
/* 79 */   public final int parseOffsetISO8601(String text, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 80 */   public int parseOffsetLocalizedGMT(String text, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 81 */   public int parseOffsetShortLocalizedGMT(String text, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 82 */   public TimeZone parse(Style style, String text, ParsePosition pos, EnumSet<ParseOption> options, Output<TimeType> timeType) { throw new RuntimeException("Stub!"); }
/* 83 */   public TimeZone parse(Style style, String text, ParsePosition pos, Output<TimeType> timeType) { throw new RuntimeException("Stub!"); }
/* 84 */   public final TimeZone parse(String text, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 85 */   public final TimeZone parse(String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
/* 86 */   public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 87 */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/* 88 */   public Object parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 89 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 90 */   public TimeZoneFormat freeze() { throw new RuntimeException("Stub!"); }
/* 91 */   public TimeZoneFormat cloneAsThawed() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\TimeZoneFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */