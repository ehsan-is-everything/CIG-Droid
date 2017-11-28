/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RelativeDateTimeFormatter
/*    */ {
/*    */   public static enum Style
/*    */   {
/* 15 */     LONG, 
/* 16 */     NARROW, 
/* 17 */     SHORT;
/*    */     
/*    */     private Style() {} }
/*    */   
/* 21 */   public static enum RelativeUnit { DAYS, 
/* 22 */     HOURS, 
/* 23 */     MINUTES, 
/* 24 */     MONTHS, 
/* 25 */     SECONDS, 
/* 26 */     WEEKS, 
/* 27 */     YEARS;
/*    */     
/*    */     private RelativeUnit() {} }
/*    */   
/* 31 */   public static enum AbsoluteUnit { DAY, 
/* 32 */     FRIDAY, 
/* 33 */     MONDAY, 
/* 34 */     MONTH, 
/* 35 */     NOW, 
/* 36 */     SATURDAY, 
/* 37 */     SUNDAY, 
/* 38 */     THURSDAY, 
/* 39 */     TUESDAY, 
/* 40 */     WEDNESDAY, 
/* 41 */     WEEK, 
/* 42 */     YEAR;
/*    */     
/*    */     private AbsoluteUnit() {} }
/*    */   
/* 46 */   public static enum Direction { LAST, 
/* 47 */     LAST_2, 
/* 48 */     NEXT, 
/* 49 */     NEXT_2, 
/* 50 */     PLAIN, 
/* 51 */     THIS;
/*    */     private Direction() {} }
/* 53 */   RelativeDateTimeFormatter() { throw new RuntimeException("Stub!"); }
/* 54 */   public static RelativeDateTimeFormatter getInstance() { throw new RuntimeException("Stub!"); }
/* 55 */   public static RelativeDateTimeFormatter getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 56 */   public static RelativeDateTimeFormatter getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 57 */   public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf) { throw new RuntimeException("Stub!"); }
/* 58 */   public static RelativeDateTimeFormatter getInstance(ULocale locale, NumberFormat nf, Style style, DisplayContext capitalizationContext) { throw new RuntimeException("Stub!"); }
/* 59 */   public static RelativeDateTimeFormatter getInstance(Locale locale, NumberFormat nf) { throw new RuntimeException("Stub!"); }
/* 60 */   public String format(double quantity, Direction direction, RelativeUnit unit) { throw new RuntimeException("Stub!"); }
/* 61 */   public String format(Direction direction, AbsoluteUnit unit) { throw new RuntimeException("Stub!"); }
/* 62 */   public String combineDateAndTime(String relativeDateString, String timeString) { throw new RuntimeException("Stub!"); }
/* 63 */   public NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
/* 64 */   public DisplayContext getCapitalizationContext() { throw new RuntimeException("Stub!"); }
/* 65 */   public Style getFormatStyle() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\RelativeDateTimeFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */