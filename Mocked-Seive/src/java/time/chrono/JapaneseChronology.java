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
/*    */ public final class JapaneseChronology
/*    */   extends AbstractChronology
/*    */   implements Serializable
/*    */ {
/* 62 */   JapaneseChronology() { throw new RuntimeException("Stub!"); }
/* 63 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 64 */   public String getCalendarType() { throw new RuntimeException("Stub!"); }
/* 65 */   public JapaneseDate date(Era era, int yearOfEra, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 66 */   public JapaneseDate date(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 67 */   public JapaneseDate dateYearDay(Era era, int yearOfEra, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 68 */   public JapaneseDate dateYearDay(int prolepticYear, int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 69 */   public JapaneseDate dateEpochDay(long epochDay) { throw new RuntimeException("Stub!"); }
/* 70 */   public JapaneseDate dateNow() { throw new RuntimeException("Stub!"); }
/* 71 */   public JapaneseDate dateNow(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 72 */   public JapaneseDate dateNow(Clock clock) { throw new RuntimeException("Stub!"); }
/* 73 */   public JapaneseDate date(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 75 */   public ChronoLocalDateTime<JapaneseDate> localDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 77 */   public ChronoZonedDateTime<JapaneseDate> zonedDateTime(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 79 */   public ChronoZonedDateTime<JapaneseDate> zonedDateTime(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isLeapYear(long prolepticYear) { throw new RuntimeException("Stub!"); }
/* 81 */   public int prolepticYear(Era era, int yearOfEra) { throw new RuntimeException("Stub!"); }
/* 82 */   public JapaneseEra eraOf(int eraValue) { throw new RuntimeException("Stub!"); }
/* 83 */   public List<Era> eras() { throw new RuntimeException("Stub!"); }
/* 84 */   public ValueRange range(ChronoField field) { throw new RuntimeException("Stub!"); }
/* 85 */   public JapaneseDate resolveDate(Map<TemporalField, Long> fieldValues, ResolverStyle resolverStyle) { throw new RuntimeException("Stub!"); }
/*    */   
/* 87 */   public static final JapaneseChronology INSTANCE = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\JapaneseChronology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */