/*    */ package java.time.temporal;
/*    */ 
/*    */ import java.time.format.ResolverStyle;
/*    */ import java.util.Locale;
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
/*    */ public abstract interface TemporalField
/*    */ {
/* 65 */   public String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract TemporalUnit getBaseUnit();
/*    */   public abstract TemporalUnit getRangeUnit();
/*    */   public abstract ValueRange range();
/*    */   public abstract boolean isDateBased();
/*    */   public abstract boolean isTimeBased();
/*    */   public abstract boolean isSupportedBy(TemporalAccessor paramTemporalAccessor);
/*    */   public abstract ValueRange rangeRefinedBy(TemporalAccessor paramTemporalAccessor);
/*    */   public abstract long getFrom(TemporalAccessor paramTemporalAccessor);
/*    */   public abstract <R extends Temporal> R adjustInto(R paramR, long paramLong);
/* 75 */   public TemporalAccessor resolve(Map<TemporalField, Long> fieldValues, TemporalAccessor partialTemporal, ResolverStyle resolverStyle) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\temporal\TemporalField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */