/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Instant;
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
/*    */ public class Date
/*    */   implements Serializable, Cloneable, Comparable<Date>
/*    */ {
/* 31 */   public Date() { throw new RuntimeException("Stub!"); }
/* 32 */   public Date(long date) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public Date(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public Date(int year, int month, int date, int hrs, int min) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public Date(int year, int month, int date, int hrs, int min, int sec) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public Date(String s) { throw new RuntimeException("Stub!"); }
/* 41 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   public static long UTC(int year, int month, int date, int hrs, int min, int sec) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public static long parse(String s) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 47 */   public int getYear() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 49 */   public void setYear(int year) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public int getMonth() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 53 */   public void setMonth(int month) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 55 */   public int getDate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public void setDate(int date) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 59 */   public int getDay() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public int getHours() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 63 */   public void setHours(int hours) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 65 */   public int getMinutes() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 67 */   public void setMinutes(int minutes) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 69 */   public int getSeconds() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 71 */   public void setSeconds(int seconds) { throw new RuntimeException("Stub!"); }
/* 72 */   public long getTime() { throw new RuntimeException("Stub!"); }
/* 73 */   public void setTime(long time) { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean before(Date when) { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean after(Date when) { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 77 */   public int compareTo(Date anotherDate) { throw new RuntimeException("Stub!"); }
/* 78 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 79 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 81 */   public String toLocaleString() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 83 */   public String toGMTString() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 85 */   public int getTimezoneOffset() { throw new RuntimeException("Stub!"); }
/* 86 */   public static Date from(Instant instant) { throw new RuntimeException("Stub!"); }
/* 87 */   public Instant toInstant() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Date.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */