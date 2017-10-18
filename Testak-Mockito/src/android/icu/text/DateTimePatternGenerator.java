/*    */ package android.icu.text;
/*    */ 
/*    */ import java.util.Set;
/*    */ 
/*    */ public class DateTimePatternGenerator implements android.icu.util.Freezable<DateTimePatternGenerator>, Cloneable { public static final int DAY = 7;
/*    */   public static final int DAYPERIOD = 10;
/*    */   public static final int DAY_OF_WEEK_IN_MONTH = 9;
/*    */   public static final int DAY_OF_YEAR = 8;
/*    */   public static final int ERA = 0;
/*    */   public static final int FRACTIONAL_SECOND = 14;
/*    */   public static final int HOUR = 11;
/*    */   public static final int MATCH_ALL_FIELDS_LENGTH = 65535;
/*    */   public static final int MATCH_HOUR_FIELD_LENGTH = 2048;
/*    */   
/*    */   public static final class PatternInfo { public static final int BASE_CONFLICT = 1; public static final int CONFLICT = 2; public static final int OK = 0;
/* 16 */     public PatternInfo() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */     public String conflictingPattern;
/*    */     public int status;
/*    */   }
/*    */   
/* 23 */   protected DateTimePatternGenerator() { throw new RuntimeException("Stub!"); }
/* 24 */   public static DateTimePatternGenerator getEmptyInstance() { throw new RuntimeException("Stub!"); }
/* 25 */   public static DateTimePatternGenerator getInstance() { throw new RuntimeException("Stub!"); }
/* 26 */   public static DateTimePatternGenerator getInstance(android.icu.util.ULocale uLocale) { throw new RuntimeException("Stub!"); }
/* 27 */   public static DateTimePatternGenerator getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 28 */   public String getBestPattern(String skeleton) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getBestPattern(String skeleton, int options) { throw new RuntimeException("Stub!"); }
/* 30 */   public DateTimePatternGenerator addPattern(String pattern, boolean override, PatternInfo returnInfo) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getSkeleton(String pattern) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getBaseSkeleton(String pattern) { throw new RuntimeException("Stub!"); }
/* 33 */   public java.util.Map<String, String> getSkeletons(java.util.Map<String, String> result) { throw new RuntimeException("Stub!"); }
/* 34 */   public Set<String> getBaseSkeletons(Set<String> result) { throw new RuntimeException("Stub!"); }
/* 35 */   public String replaceFieldTypes(String pattern, String skeleton) { throw new RuntimeException("Stub!"); }
/* 36 */   public String replaceFieldTypes(String pattern, String skeleton, int options) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setDateTimeFormat(String dateTimeFormat) { throw new RuntimeException("Stub!"); }
/* 38 */   public String getDateTimeFormat() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setDecimal(String decimal) { throw new RuntimeException("Stub!"); }
/* 40 */   public String getDecimal() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setAppendItemFormat(int field, String value) { throw new RuntimeException("Stub!"); }
/* 42 */   public String getAppendItemFormat(int field) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setAppendItemName(int field, String value) { throw new RuntimeException("Stub!"); }
/* 44 */   public String getAppendItemName(int field) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 46 */   public DateTimePatternGenerator freeze() { throw new RuntimeException("Stub!"); }
/* 47 */   public DateTimePatternGenerator cloneAsThawed() { throw new RuntimeException("Stub!"); }
/*    */   
/* 49 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int MATCH_NO_OPTIONS = 0;
/*    */   public static final int MINUTE = 12;
/*    */   public static final int MONTH = 3;
/*    */   public static final int QUARTER = 2;
/*    */   public static final int SECOND = 13;
/*    */   public static final int WEEKDAY = 6;
/*    */   public static final int WEEK_OF_MONTH = 5;
/*    */   public static final int WEEK_OF_YEAR = 4;
/*    */   public static final int YEAR = 1;
/*    */   public static final int ZONE = 15;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\DateTimePatternGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */