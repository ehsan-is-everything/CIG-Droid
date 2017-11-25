/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Freezable;
/*    */ import android.icu.util.ULocale;
/*    */ import java.io.Serializable;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DateIntervalInfo
/*    */   implements Cloneable, Freezable<DateIntervalInfo>, Serializable
/*    */ {
/*    */   public static final class PatternInfo
/*    */     implements Cloneable, Serializable
/*    */   {
/* 18 */     public PatternInfo(String firstPart, String secondPart, boolean firstDateInPtnIsLaterDate) { throw new RuntimeException("Stub!"); }
/* 19 */     public String getFirstPart() { throw new RuntimeException("Stub!"); }
/* 20 */     public String getSecondPart() { throw new RuntimeException("Stub!"); }
/* 21 */     public boolean firstDateInPtnIsLaterDate() { throw new RuntimeException("Stub!"); }
/* 22 */     public boolean equals(Object a) { throw new RuntimeException("Stub!"); }
/* 23 */     public int hashCode() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 25 */   public DateIntervalInfo(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 26 */   public DateIntervalInfo(Locale locale) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setIntervalPattern(String skeleton, int lrgDiffCalUnit, String intervalPattern) { throw new RuntimeException("Stub!"); }
/* 28 */   public PatternInfo getIntervalPattern(String skeleton, int field) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getFallbackIntervalPattern() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setFallbackIntervalPattern(String fallbackPattern) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean getDefaultOrder() { throw new RuntimeException("Stub!"); }
/* 32 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isFrozen() { throw new RuntimeException("Stub!"); }
/* 34 */   public DateIntervalInfo freeze() { throw new RuntimeException("Stub!"); }
/* 35 */   public DateIntervalInfo cloneAsThawed() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object a) { throw new RuntimeException("Stub!"); }
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\DateIntervalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */