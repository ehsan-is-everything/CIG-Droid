/*    */ package android.icu.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class TimeZone
/*    */   implements Serializable, Cloneable, Freezable<TimeZone>
/*    */ {
/*    */   public static final String UNKNOWN_ZONE_ID = "Etc/Unknown";
/*    */   
/* 18 */   public TimeZone() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getOffset(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/* 20 */   public int getOffset(long date) { throw new RuntimeException("Stub!"); }
/* 21 */   public void getOffset(long date, boolean local, int[] offsets) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setRawOffset(int paramInt);
/*    */   public abstract int getRawOffset();
/* 24 */   public String getID() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setID(String ID) { throw new RuntimeException("Stub!"); }
/* 26 */   public final String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 27 */   public final String getDisplayName(Locale locale) { throw new RuntimeException("Stub!"); }
/* 28 */   public final String getDisplayName(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 29 */   public final String getDisplayName(boolean daylight, int style) { throw new RuntimeException("Stub!"); }
/* 30 */   public String getDisplayName(boolean daylight, int style, Locale locale) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getDisplayName(boolean daylight, int style, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 32 */   public int getDSTSavings() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean useDaylightTime();
/* 35 */   public boolean observesDaylightTime() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean inDaylightTime(Date paramDate);
/* 37 */   public static TimeZone getTimeZone(String ID) { throw new RuntimeException("Stub!"); }
/* 38 */   public static TimeZone getFrozenTimeZone(String ID) { throw new RuntimeException("Stub!"); }
/* 39 */   public static TimeZone getTimeZone(String ID, int type) { throw new RuntimeException("Stub!"); }
/* 40 */   public static Set<String> getAvailableIDs(SystemTimeZoneType zoneType, String region, Integer rawOffset) { throw new RuntimeException("Stub!"); }
/* 41 */   public static String[] getAvailableIDs(int rawOffset) { throw new RuntimeException("Stub!"); }
/* 42 */   public static String[] getAvailableIDs(String country) { throw new RuntimeException("Stub!"); }
/* 43 */   public static String[] getAvailableIDs() { throw new RuntimeException("Stub!"); }
/* 44 */   public static int countEquivalentIDs(String id) { throw new RuntimeException("Stub!"); }
/* 45 */   public static String getEquivalentID(String id, int index) { throw new RuntimeException("Stub!"); }
/* 46 */   public static TimeZone getDefault() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean hasSameRules(TimeZone other) { throw new RuntimeException("Stub!"); }
/* 48 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 50 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 51 */   public static String getTZDataVersion() { throw new RuntimeException("Stub!"); }
/* 52 */   public static String getCanonicalID(String id) { throw new RuntimeException("Stub!"); }
/* 53 */   public static String getCanonicalID(String id, boolean[] isSystemID) { throw new RuntimeException("Stub!"); }
/* 54 */   public static String getRegion(String id) { throw new RuntimeException("Stub!"); }
/* 55 */   public static String getWindowsID(String id) { throw new RuntimeException("Stub!"); }
/* 56 */   public static String getIDForWindowsID(String winid, String region) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 58 */   public TimeZone freeze() { throw new RuntimeException("Stub!"); }
/* 59 */   public TimeZone cloneAsThawed() { throw new RuntimeException("Stub!"); }
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
/* 73 */   public static final TimeZone UNKNOWN_ZONE = null; public static final int TIMEZONE_JDK = 1; public static final int TIMEZONE_ICU = 0; public static final int SHORT_GMT = 4; public static final int SHORT_GENERIC = 2; public static final int SHORT_COMMONLY_USED = 6; public static final int SHORT = 0; public static final int LONG_GMT = 5; public static final int LONG_GENERIC = 3; public static final int LONG = 1; public static final TimeZone GMT_ZONE = null;
/*    */   public static final int GENERIC_LOCATION = 7;
/*    */   
/*    */   public static enum SystemTimeZoneType
/*    */   {
/*    */     private SystemTimeZoneType() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\TimeZone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */