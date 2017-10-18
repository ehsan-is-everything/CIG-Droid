/*     */ package java.time.format;
/*     */ 
/*     */ import java.text.Format;
/*     */ import java.text.ParsePosition;
/*     */ import java.time.Period;
/*     */ import java.time.ZoneId;
/*     */ import java.time.chrono.Chronology;
/*     */ import java.time.temporal.TemporalAccessor;
/*     */ import java.time.temporal.TemporalField;
/*     */ import java.time.temporal.TemporalQuery;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class DateTimeFormatter
/*     */ {
/*  65 */   DateTimeFormatter() { throw new RuntimeException("Stub!"); }
/*  66 */   public static DateTimeFormatter ofPattern(String pattern) { throw new RuntimeException("Stub!"); }
/*  67 */   public static DateTimeFormatter ofPattern(String pattern, Locale locale) { throw new RuntimeException("Stub!"); }
/*  68 */   public static DateTimeFormatter ofLocalizedDate(FormatStyle dateStyle) { throw new RuntimeException("Stub!"); }
/*  69 */   public static DateTimeFormatter ofLocalizedTime(FormatStyle timeStyle) { throw new RuntimeException("Stub!"); }
/*  70 */   public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateTimeStyle) { throw new RuntimeException("Stub!"); }
/*  71 */   public static DateTimeFormatter ofLocalizedDateTime(FormatStyle dateStyle, FormatStyle timeStyle) { throw new RuntimeException("Stub!"); }
/*  72 */   public static final TemporalQuery<Period> parsedExcessDays() { throw new RuntimeException("Stub!"); }
/*  73 */   public static final TemporalQuery<Boolean> parsedLeapSecond() { throw new RuntimeException("Stub!"); }
/*  74 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/*  75 */   public DateTimeFormatter withLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/*  76 */   public DecimalStyle getDecimalStyle() { throw new RuntimeException("Stub!"); }
/*  77 */   public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) { throw new RuntimeException("Stub!"); }
/*  78 */   public Chronology getChronology() { throw new RuntimeException("Stub!"); }
/*  79 */   public DateTimeFormatter withChronology(Chronology chrono) { throw new RuntimeException("Stub!"); }
/*  80 */   public ZoneId getZone() { throw new RuntimeException("Stub!"); }
/*  81 */   public DateTimeFormatter withZone(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  82 */   public ResolverStyle getResolverStyle() { throw new RuntimeException("Stub!"); }
/*  83 */   public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) { throw new RuntimeException("Stub!"); }
/*  84 */   public Set<TemporalField> getResolverFields() { throw new RuntimeException("Stub!"); }
/*  85 */   public DateTimeFormatter withResolverFields(TemporalField... resolverFields) { throw new RuntimeException("Stub!"); }
/*  86 */   public DateTimeFormatter withResolverFields(Set<TemporalField> resolverFields) { throw new RuntimeException("Stub!"); }
/*  87 */   public String format(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  88 */   public void formatTo(TemporalAccessor temporal, Appendable appendable) { throw new RuntimeException("Stub!"); }
/*  89 */   public TemporalAccessor parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  90 */   public TemporalAccessor parse(CharSequence text, ParsePosition position) { throw new RuntimeException("Stub!"); }
/*  91 */   public <T> T parse(CharSequence text, TemporalQuery<T> query) { throw new RuntimeException("Stub!"); }
/*  92 */   public TemporalAccessor parseBest(CharSequence text, TemporalQuery<?>... queries) { throw new RuntimeException("Stub!"); }
/*  93 */   public TemporalAccessor parseUnresolved(CharSequence text, ParsePosition position) { throw new RuntimeException("Stub!"); }
/*  94 */   public Format toFormat() { throw new RuntimeException("Stub!"); }
/*  95 */   public Format toFormat(TemporalQuery<?> parseQuery) { throw new RuntimeException("Stub!"); }
/*  96 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */   public static final DateTimeFormatter RFC_1123_DATE_TIME = null; public static final DateTimeFormatter ISO_ZONED_DATE_TIME = null; public static final DateTimeFormatter ISO_WEEK_DATE = null; public static final DateTimeFormatter ISO_TIME = null; public static final DateTimeFormatter ISO_ORDINAL_DATE = null; public static final DateTimeFormatter ISO_OFFSET_TIME = null; public static final DateTimeFormatter ISO_OFFSET_DATE_TIME = null; public static final DateTimeFormatter ISO_OFFSET_DATE = null; public static final DateTimeFormatter ISO_LOCAL_TIME = null; public static final DateTimeFormatter ISO_LOCAL_DATE_TIME = null; public static final DateTimeFormatter ISO_LOCAL_DATE = null; public static final DateTimeFormatter ISO_INSTANT = null; public static final DateTimeFormatter ISO_DATE_TIME = null; public static final DateTimeFormatter ISO_DATE = null; public static final DateTimeFormatter BASIC_ISO_DATE = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\format\DateTimeFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */