/*     */ package java.time.temporal;
/*     */ 
/*     */ import java.util.Locale;
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
/*     */ 
/*     */ public enum ChronoField
/*     */   implements TemporalField
/*     */ {
/*  61 */   ALIGNED_DAY_OF_WEEK_IN_MONTH, 
/*  62 */   ALIGNED_DAY_OF_WEEK_IN_YEAR, 
/*  63 */   ALIGNED_WEEK_OF_MONTH, 
/*  64 */   ALIGNED_WEEK_OF_YEAR, 
/*  65 */   AMPM_OF_DAY, 
/*  66 */   CLOCK_HOUR_OF_AMPM, 
/*  67 */   CLOCK_HOUR_OF_DAY, 
/*  68 */   DAY_OF_MONTH, 
/*  69 */   DAY_OF_WEEK, 
/*  70 */   DAY_OF_YEAR, 
/*  71 */   EPOCH_DAY, 
/*  72 */   ERA, 
/*  73 */   HOUR_OF_AMPM, 
/*  74 */   HOUR_OF_DAY, 
/*  75 */   INSTANT_SECONDS, 
/*  76 */   MICRO_OF_DAY, 
/*  77 */   MICRO_OF_SECOND, 
/*  78 */   MILLI_OF_DAY, 
/*  79 */   MILLI_OF_SECOND, 
/*  80 */   MINUTE_OF_DAY, 
/*  81 */   MINUTE_OF_HOUR, 
/*  82 */   MONTH_OF_YEAR, 
/*  83 */   NANO_OF_DAY, 
/*  84 */   NANO_OF_SECOND, 
/*  85 */   OFFSET_SECONDS, 
/*  86 */   PROLEPTIC_MONTH, 
/*  87 */   SECOND_OF_DAY, 
/*  88 */   SECOND_OF_MINUTE, 
/*  89 */   YEAR, 
/*  90 */   YEAR_OF_ERA;
/*  91 */   private ChronoField() {} public String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/*  92 */   public TemporalUnit getBaseUnit() { throw new RuntimeException("Stub!"); }
/*  93 */   public TemporalUnit getRangeUnit() { throw new RuntimeException("Stub!"); }
/*  94 */   public ValueRange range() { throw new RuntimeException("Stub!"); }
/*  95 */   public boolean isDateBased() { throw new RuntimeException("Stub!"); }
/*  96 */   public boolean isTimeBased() { throw new RuntimeException("Stub!"); }
/*  97 */   public long checkValidValue(long value) { throw new RuntimeException("Stub!"); }
/*  98 */   public int checkValidIntValue(long value) { throw new RuntimeException("Stub!"); }
/*  99 */   public boolean isSupportedBy(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 100 */   public ValueRange rangeRefinedBy(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 101 */   public long getFrom(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*     */   
/* 103 */   public <R extends Temporal> R adjustInto(R temporal, long newValue) { throw new RuntimeException("Stub!"); }
/* 104 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\temporal\ChronoField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */