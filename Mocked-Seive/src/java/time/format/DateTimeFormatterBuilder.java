/*     */ package java.time.format;
/*     */ 
/*     */ import java.time.ZoneId;
/*     */ import java.time.chrono.ChronoLocalDate;
/*     */ import java.time.chrono.Chronology;
/*     */ import java.time.temporal.TemporalField;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class DateTimeFormatterBuilder
/*     */ {
/*  65 */   public DateTimeFormatterBuilder() { throw new RuntimeException("Stub!"); }
/*  66 */   public static String getLocalizedDateTimePattern(FormatStyle dateStyle, FormatStyle timeStyle, Chronology chrono, Locale locale) { throw new RuntimeException("Stub!"); }
/*  67 */   public DateTimeFormatterBuilder parseCaseSensitive() { throw new RuntimeException("Stub!"); }
/*  68 */   public DateTimeFormatterBuilder parseCaseInsensitive() { throw new RuntimeException("Stub!"); }
/*  69 */   public DateTimeFormatterBuilder parseStrict() { throw new RuntimeException("Stub!"); }
/*  70 */   public DateTimeFormatterBuilder parseLenient() { throw new RuntimeException("Stub!"); }
/*  71 */   public DateTimeFormatterBuilder parseDefaulting(TemporalField field, long value) { throw new RuntimeException("Stub!"); }
/*  72 */   public DateTimeFormatterBuilder appendValue(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  73 */   public DateTimeFormatterBuilder appendValue(TemporalField field, int width) { throw new RuntimeException("Stub!"); }
/*  74 */   public DateTimeFormatterBuilder appendValue(TemporalField field, int minWidth, int maxWidth, SignStyle signStyle) { throw new RuntimeException("Stub!"); }
/*  75 */   public DateTimeFormatterBuilder appendValueReduced(TemporalField field, int width, int maxWidth, int baseValue) { throw new RuntimeException("Stub!"); }
/*  76 */   public DateTimeFormatterBuilder appendValueReduced(TemporalField field, int width, int maxWidth, ChronoLocalDate baseDate) { throw new RuntimeException("Stub!"); }
/*  77 */   public DateTimeFormatterBuilder appendFraction(TemporalField field, int minWidth, int maxWidth, boolean decimalPoint) { throw new RuntimeException("Stub!"); }
/*  78 */   public DateTimeFormatterBuilder appendText(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public DateTimeFormatterBuilder appendText(TemporalField field, TextStyle textStyle) { throw new RuntimeException("Stub!"); }
/*  80 */   public DateTimeFormatterBuilder appendText(TemporalField field, Map<Long, String> textLookup) { throw new RuntimeException("Stub!"); }
/*  81 */   public DateTimeFormatterBuilder appendInstant() { throw new RuntimeException("Stub!"); }
/*  82 */   public DateTimeFormatterBuilder appendInstant(int fractionalDigits) { throw new RuntimeException("Stub!"); }
/*  83 */   public DateTimeFormatterBuilder appendOffsetId() { throw new RuntimeException("Stub!"); }
/*  84 */   public DateTimeFormatterBuilder appendOffset(String pattern, String noOffsetText) { throw new RuntimeException("Stub!"); }
/*  85 */   public DateTimeFormatterBuilder appendLocalizedOffset(TextStyle style) { throw new RuntimeException("Stub!"); }
/*  86 */   public DateTimeFormatterBuilder appendZoneId() { throw new RuntimeException("Stub!"); }
/*  87 */   public DateTimeFormatterBuilder appendZoneRegionId() { throw new RuntimeException("Stub!"); }
/*  88 */   public DateTimeFormatterBuilder appendZoneOrOffsetId() { throw new RuntimeException("Stub!"); }
/*  89 */   public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle) { throw new RuntimeException("Stub!"); }
/*  90 */   public DateTimeFormatterBuilder appendZoneText(TextStyle textStyle, Set<ZoneId> preferredZones) { throw new RuntimeException("Stub!"); }
/*  91 */   public DateTimeFormatterBuilder appendChronologyId() { throw new RuntimeException("Stub!"); }
/*  92 */   public DateTimeFormatterBuilder appendChronologyText(TextStyle textStyle) { throw new RuntimeException("Stub!"); }
/*  93 */   public DateTimeFormatterBuilder appendLocalized(FormatStyle dateStyle, FormatStyle timeStyle) { throw new RuntimeException("Stub!"); }
/*  94 */   public DateTimeFormatterBuilder appendLiteral(char literal) { throw new RuntimeException("Stub!"); }
/*  95 */   public DateTimeFormatterBuilder appendLiteral(String literal) { throw new RuntimeException("Stub!"); }
/*  96 */   public DateTimeFormatterBuilder append(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  97 */   public DateTimeFormatterBuilder appendOptional(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  98 */   public DateTimeFormatterBuilder appendPattern(String pattern) { throw new RuntimeException("Stub!"); }
/*  99 */   public DateTimeFormatterBuilder padNext(int padWidth) { throw new RuntimeException("Stub!"); }
/* 100 */   public DateTimeFormatterBuilder padNext(int padWidth, char padChar) { throw new RuntimeException("Stub!"); }
/* 101 */   public DateTimeFormatterBuilder optionalStart() { throw new RuntimeException("Stub!"); }
/* 102 */   public DateTimeFormatterBuilder optionalEnd() { throw new RuntimeException("Stub!"); }
/* 103 */   public DateTimeFormatter toFormatter() { throw new RuntimeException("Stub!"); }
/* 104 */   public DateTimeFormatter toFormatter(Locale locale) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\format\DateTimeFormatterBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */