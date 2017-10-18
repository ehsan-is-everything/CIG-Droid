/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Clock;
/*    */ import java.time.Instant;
/*    */ import java.time.LocalDate;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.Period;
/*    */ import java.time.ZoneId;
/*    */ import java.time.ZonedDateTime;
/*    */ import java.time.format.ResolverStyle;
/*    */ import java.time.temporal.ChronoField;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.ValueRange;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public final class IsoChronology
/*    */   extends AbstractChronology
/*    */   implements Serializable
/*    */ {
/* 67 */   IsoChronology() { throw new RuntimeException("Stub!"); }
/* 68 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 69 */   public String getCalendarType() { throw new RuntimeException("Stub!"); }
/* 70 */   public LocalDate date(Era era, int yearOfEra, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 71 */   public LocalDate date(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 72 */   public LocalDate dateYearDay(Era era, int yearOfEra, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 73 */   public LocalDate dateYearDay(int prolepticYear, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 74 */   public LocalDate dateEpochDay(long epochDay) { throw new RuntimeException("Stub!"); }
/* 75 */   public LocalDate date(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 76 */   public LocalDateTime localDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 77 */   public ZonedDateTime zonedDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 78 */   public ZonedDateTime zonedDateTime(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 79 */   public LocalDate dateNow() { throw new RuntimeException("Stub!"); }
/* 80 */   public LocalDate dateNow(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 81 */   public LocalDate dateNow(Clock clock) { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean isLeapYear(long prolepticYear) { throw new RuntimeException("Stub!"); }
/* 83 */   public int prolepticYear(Era era, int yearOfEra) { throw new RuntimeException("Stub!"); }
/* 84 */   public IsoEra eraOf(int eraValue) { throw new RuntimeException("Stub!"); }
/* 85 */   public List<Era> eras() { throw new RuntimeException("Stub!"); }
/* 86 */   public LocalDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) { throw new RuntimeException("Stub!"); }
/* 87 */   public ValueRange range(ChronoField field) { throw new RuntimeException("Stub!"); }
/* 88 */   public Period period(int years, int months, int days) { throw new RuntimeException("Stub!"); }
/*    */   
/* 90 */   public static final IsoChronology INSTANCE = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\chrono\IsoChronology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */