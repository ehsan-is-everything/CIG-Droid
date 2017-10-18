/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ 
/*    */ public class DateFormatSymbols
/*    */   implements java.io.Serializable, Cloneable
/*    */ {
/*    */   public static final int ABBREVIATED = 0;
/*    */   public static final int FORMAT = 0;
/*    */   public static final int NARROW = 2;
/*    */   public static final int SHORT = 3;
/*    */   public static final int STANDALONE = 1;
/*    */   public static final int WIDE = 1;
/*    */   
/* 15 */   public DateFormatSymbols() { throw new RuntimeException("Stub!"); }
/* 16 */   public DateFormatSymbols(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 17 */   public DateFormatSymbols(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 18 */   public DateFormatSymbols(android.icu.util.Calendar cal, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 19 */   public DateFormatSymbols(android.icu.util.Calendar cal, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 20 */   public DateFormatSymbols(Class<? extends android.icu.util.Calendar> calendarClass, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 21 */   public DateFormatSymbols(Class<? extends android.icu.util.Calendar> calendarClass, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 22 */   public DateFormatSymbols(java.util.ResourceBundle bundle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 23 */   public DateFormatSymbols(java.util.ResourceBundle bundle, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 24 */   public static DateFormatSymbols getInstance() { throw new RuntimeException("Stub!"); }
/* 25 */   public static DateFormatSymbols getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 26 */   public static DateFormatSymbols getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 27 */   public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 28 */   public String[] getEras() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setEras(String[] newEras) { throw new RuntimeException("Stub!"); }
/* 30 */   public String[] getEraNames() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setEraNames(String[] newEraNames) { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getMonths() { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getMonths(int context, int width) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setMonths(String[] newMonths) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setMonths(String[] newMonths, int context, int width) { throw new RuntimeException("Stub!"); }
/* 36 */   public String[] getShortMonths() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setShortMonths(String[] newShortMonths) { throw new RuntimeException("Stub!"); }
/* 38 */   public String[] getWeekdays() { throw new RuntimeException("Stub!"); }
/* 39 */   public String[] getWeekdays(int context, int width) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setWeekdays(String[] newWeekdays, int context, int width) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setWeekdays(String[] newWeekdays) { throw new RuntimeException("Stub!"); }
/* 42 */   public String[] getShortWeekdays() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setShortWeekdays(String[] newAbbrevWeekdays) { throw new RuntimeException("Stub!"); }
/* 44 */   public String[] getQuarters(int context, int width) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setQuarters(String[] newQuarters, int context, int width) { throw new RuntimeException("Stub!"); }
/* 46 */   public String[] getYearNames(int context, int width) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setYearNames(String[] yearNames, int context, int width) { throw new RuntimeException("Stub!"); }
/* 48 */   public String[] getZodiacNames(int context, int width) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setZodiacNames(String[] zodiacNames, int context, int width) { throw new RuntimeException("Stub!"); }
/* 50 */   public String[] getAmPmStrings() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setAmPmStrings(String[] newAmpms) { throw new RuntimeException("Stub!"); }
/* 52 */   public String[][] getZoneStrings() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setZoneStrings(String[][] newZoneStrings) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getLocalPatternChars() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setLocalPatternChars(String newLocalPatternChars) { throw new RuntimeException("Stub!"); }
/* 56 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 57 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 59 */   protected void initializeData(ULocale desiredLocale, String type) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\DateFormatSymbols.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */