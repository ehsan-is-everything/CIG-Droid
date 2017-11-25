/*    */ package javax.xml.datatype;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.math.BigInteger;
/*    */ import java.util.GregorianCalendar;
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
/*    */ public abstract class DatatypeFactory
/*    */ {
/* 23 */   protected DatatypeFactory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static DatatypeFactory newInstance() throws DatatypeConfigurationException { throw new RuntimeException("Stub!"); }
/* 25 */   public static DatatypeFactory newInstance(String factoryClassName, ClassLoader classLoader) throws DatatypeConfigurationException { throw new RuntimeException("Stub!"); }
/*    */   public abstract Duration newDuration(String paramString);
/*    */   public abstract Duration newDuration(long paramLong);
/*    */   public abstract Duration newDuration(boolean paramBoolean, BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3, BigInteger paramBigInteger4, BigInteger paramBigInteger5, BigDecimal paramBigDecimal);
/* 29 */   public Duration newDuration(boolean isPositive, int years, int months, int days, int hours, int minutes, int seconds) { throw new RuntimeException("Stub!"); }
/* 30 */   public Duration newDurationDayTime(String lexicalRepresentation) { throw new RuntimeException("Stub!"); }
/* 31 */   public Duration newDurationDayTime(long durationInMilliseconds) { throw new RuntimeException("Stub!"); }
/* 32 */   public Duration newDurationDayTime(boolean isPositive, BigInteger day, BigInteger hour, BigInteger minute, BigInteger second) { throw new RuntimeException("Stub!"); }
/* 33 */   public Duration newDurationDayTime(boolean isPositive, int day, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 34 */   public Duration newDurationYearMonth(String lexicalRepresentation) { throw new RuntimeException("Stub!"); }
/* 35 */   public Duration newDurationYearMonth(long durationInMilliseconds) { throw new RuntimeException("Stub!"); }
/* 36 */   public Duration newDurationYearMonth(boolean isPositive, BigInteger year, BigInteger month) { throw new RuntimeException("Stub!"); }
/* 37 */   public Duration newDurationYearMonth(boolean isPositive, int year, int month) { throw new RuntimeException("Stub!"); }
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar();
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(String paramString);
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(GregorianCalendar paramGregorianCalendar);
/*    */   public abstract XMLGregorianCalendar newXMLGregorianCalendar(BigInteger paramBigInteger, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, BigDecimal paramBigDecimal, int paramInt6);
/* 42 */   public XMLGregorianCalendar newXMLGregorianCalendar(int year, int month, int day, int hour, int minute, int second, int millisecond, int timezone) { throw new RuntimeException("Stub!"); }
/* 43 */   public XMLGregorianCalendar newXMLGregorianCalendarDate(int year, int month, int day, int timezone) { throw new RuntimeException("Stub!"); }
/* 44 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int timezone) { throw new RuntimeException("Stub!"); }
/* 45 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, BigDecimal fractionalSecond, int timezone) { throw new RuntimeException("Stub!"); }
/* 46 */   public XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int milliseconds, int timezone) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 49 */   public static final String DATATYPEFACTORY_IMPLEMENTATION_CLASS = null;
/*    */   public static final String DATATYPEFACTORY_PROPERTY = "javax.xml.datatype.DatatypeFactory";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\xml\datatype\DatatypeFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */