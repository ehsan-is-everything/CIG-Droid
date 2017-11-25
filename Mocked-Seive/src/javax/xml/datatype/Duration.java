/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import javax.xml.namespace.QName;
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
/*    */ public abstract class Duration
/*    */ {
/* 23 */   public Duration() { throw new RuntimeException("Stub!"); }
/* 24 */   public QName getXMLSchemaType() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getSign();
/* 26 */   public int getYears() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getMonths() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getDays() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getHours() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getMinutes() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getSeconds() { throw new RuntimeException("Stub!"); }
/* 32 */   public long getTimeInMillis(Calendar startInstant) { throw new RuntimeException("Stub!"); }
/* 33 */   public long getTimeInMillis(Date startInstant) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Number getField(DatatypeConstants.Field paramField);
/*    */   public abstract boolean isSet(DatatypeConstants.Field paramField);
/*    */   public abstract Duration add(Duration paramDuration);
/*    */   public abstract void addTo(Calendar paramCalendar);
/* 38 */   public void addTo(Date date) { throw new RuntimeException("Stub!"); }
/* 39 */   public Duration subtract(Duration rhs) { throw new RuntimeException("Stub!"); }
/* 40 */   public Duration multiply(int factor) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Duration multiply(BigDecimal paramBigDecimal);
/*    */   public abstract Duration negate();
/*    */   public abstract Duration normalizeWith(Calendar paramCalendar);
/*    */   public abstract int compare(Duration paramDuration);
/* 45 */   public boolean isLongerThan(Duration duration) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isShorterThan(Duration duration) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean equals(Object duration) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int hashCode();
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\datatype\Duration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */