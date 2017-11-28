/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.io.Serializable;
/*    */ import java.util.Locale;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class TimeZoneNames
/*    */   implements Serializable
/*    */ {
/*    */   public static enum NameType
/*    */   {
/* 16 */     EXEMPLAR_LOCATION, 
/* 17 */     LONG_DAYLIGHT, 
/* 18 */     LONG_GENERIC, 
/* 19 */     LONG_STANDARD, 
/* 20 */     SHORT_DAYLIGHT, 
/* 21 */     SHORT_GENERIC, 
/* 22 */     SHORT_STANDARD;
/*    */     private NameType() {} }
/* 24 */   TimeZoneNames() { throw new RuntimeException("Stub!"); }
/* 25 */   public static TimeZoneNames getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 26 */   public static TimeZoneNames getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 27 */   public static TimeZoneNames getTZDBInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Set<String> getAvailableMetaZoneIDs();
/*    */   public abstract Set<String> getAvailableMetaZoneIDs(String paramString);
/*    */   public abstract String getMetaZoneID(String paramString, long paramLong);
/*    */   public abstract String getReferenceZoneID(String paramString1, String paramString2);
/*    */   public abstract String getMetaZoneDisplayName(String paramString, NameType paramNameType);
/* 33 */   public final String getDisplayName(String tzID, NameType type, long date) { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getTimeZoneDisplayName(String paramString, NameType paramNameType);
/* 35 */   public String getExemplarLocationName(String tzID) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\TimeZoneNames.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */