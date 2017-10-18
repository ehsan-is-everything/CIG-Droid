/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Clock;
/*    */ import java.time.Instant;
/*    */ import java.time.ZoneId;
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
/*    */ public final class HijrahChronology
/*    */   extends AbstractChronology
/*    */   implements Serializable
/*    */ {
/* 63 */   HijrahChronology() { throw new RuntimeException("Stub!"); }
/* 64 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 65 */   public String getCalendarType() { throw new RuntimeException("Stub!"); }
/* 66 */   public HijrahDate date(Era era, int yearOfEra, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 67 */   public HijrahDate date(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 68 */   public HijrahDate dateYearDay(Era era, int yearOfEra, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 69 */   public HijrahDate dateYearDay(int prolepticYear, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 70 */   public HijrahDate dateEpochDay(long epochDay) { throw new RuntimeException("Stub!"); }
/* 71 */   public HijrahDate dateNow() { throw new RuntimeException("Stub!"); }
/* 72 */   public HijrahDate dateNow(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 73 */   public HijrahDate dateNow(Clock clock) { throw new RuntimeException("Stub!"); }
/* 74 */   public HijrahDate date(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 76 */   public ChronoLocalDateTime<HijrahDate> localDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 78 */   public ChronoZonedDateTime<HijrahDate> zonedDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 80 */   public ChronoZonedDateTime<HijrahDate> zonedDateTime(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean isLeapYear(long prolepticYear) { throw new RuntimeException("Stub!"); }
/* 82 */   public int prolepticYear(Era era, int yearOfEra) { throw new RuntimeException("Stub!"); }
/* 83 */   public HijrahEra eraOf(int eraValue) { throw new RuntimeException("Stub!"); }
/* 84 */   public List<Era> eras() { throw new RuntimeException("Stub!"); }
/* 85 */   public ValueRange range(ChronoField field) { throw new RuntimeException("Stub!"); }
/* 86 */   public HijrahDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) { throw new RuntimeException("Stub!"); }
/*    */   
/* 88 */   public static final HijrahChronology INSTANCE = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\chrono\HijrahChronology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */