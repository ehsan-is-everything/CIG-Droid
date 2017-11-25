/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.time.Clock;
/*    */ import java.time.Instant;
/*    */ import java.time.ZoneId;
/*    */ import java.time.format.ResolverStyle;
/*    */ import java.time.format.TextStyle;
/*    */ import java.time.temporal.ChronoField;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.ValueRange;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
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
/*    */ public abstract interface Chronology
/*    */   extends Comparable<Chronology>
/*    */ {
/* 66 */   public static Chronology from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 67 */   public static Chronology ofLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/* 68 */   public static Chronology of(String id) { throw new RuntimeException("Stub!"); }
/* 69 */   public static Set<Chronology> getAvailableChronologies() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getId();
/*    */   public abstract String getCalendarType();
/* 72 */   public ChronoLocalDate date(Era era, int yearOfEra, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDate date(int paramInt1, int paramInt2, int paramInt3);
/* 74 */   public ChronoLocalDate dateYearDay(Era era, int yearOfEra, int dayOfYear) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDate dateYearDay(int paramInt1, int paramInt2);
/*    */   public abstract ChronoLocalDate dateEpochDay(long paramLong);
/* 77 */   public ChronoLocalDate dateNow() { throw new RuntimeException("Stub!"); }
/* 78 */   public ChronoLocalDate dateNow(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 79 */   public ChronoLocalDate dateNow(Clock clock) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDate date(TemporalAccessor paramTemporalAccessor);
/* 81 */   public ChronoLocalDateTime<? extends ChronoLocalDate> localDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 82 */   public ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 83 */   public ChronoZonedDateTime<? extends ChronoLocalDate> zonedDateTime(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isLeapYear(long paramLong);
/*    */   public abstract int prolepticYear(Era paramEra, int paramInt);
/*    */   public abstract Era eraOf(int paramInt);
/*    */   public abstract List<Era> eras();
/*    */   public abstract ValueRange range(ChronoField paramChronoField);
/* 89 */   public String getDisplayName(TextStyle style, Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDate resolveDate(Map<TemporalField, Long> paramMap, ResolverStyle paramResolverStyle);
/* 91 */   public ChronoPeriod period(int years, int months, int days) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract int compareTo(Chronology paramChronology);
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\Chronology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */