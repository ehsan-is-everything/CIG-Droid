/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.ZoneId;
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
/*    */ public abstract class TimeZone
/*    */   implements Serializable, Cloneable
/*    */ {
/*    */   public static final int LONG = 1;
/*    */   public static final int SHORT = 0;
/*    */   
/* 44 */   public TimeZone() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getOffset(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/* 46 */   public int getOffset(long date) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setRawOffset(int paramInt);
/*    */   public abstract int getRawOffset();
/* 49 */   public String getID() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setID(String ID) { throw new RuntimeException("Stub!"); }
/* 51 */   public final String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 52 */   public final String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/* 53 */   public final String getDisplayName(boolean daylight, int style) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getDisplayName(boolean daylightTime, int style, Locale locale) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getDSTSavings() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean useDaylightTime();
/* 57 */   public boolean observesDaylightTime() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean inDaylightTime(Date paramDate);
/* 59 */   public static synchronized TimeZone getTimeZone(String id) { throw new RuntimeException("Stub!"); }
/* 60 */   public static TimeZone getTimeZone(ZoneId zoneId) { throw new RuntimeException("Stub!"); }
/* 61 */   public ZoneId toZoneId() { throw new RuntimeException("Stub!"); }
/* 62 */   public static synchronized String[] getAvailableIDs(int rawOffset) { throw new RuntimeException("Stub!"); }
/* 63 */   public static synchronized String[] getAvailableIDs() { throw new RuntimeException("Stub!"); }
/* 64 */   public static TimeZone getDefault() { throw new RuntimeException("Stub!"); }
/* 65 */   public static synchronized void setDefault(TimeZone timeZone) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean hasSameRules(TimeZone other) { throw new RuntimeException("Stub!"); }
/* 67 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\TimeZone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */