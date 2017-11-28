/*    */ package java.text;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import java.util.Locale;
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
/*    */ public abstract class Collator
/*    */   implements Comparator<Object>, Cloneable
/*    */ {
/*    */   public static final int CANONICAL_DECOMPOSITION = 1;
/*    */   public static final int FULL_DECOMPOSITION = 2;
/*    */   public static final int IDENTICAL = 3;
/*    */   public static final int NO_DECOMPOSITION = 0;
/*    */   public static final int PRIMARY = 0;
/*    */   public static final int SECONDARY = 1;
/*    */   public static final int TERTIARY = 2;
/*    */   
/* 44 */   protected Collator() { throw new RuntimeException("Stub!"); }
/* 45 */   public static synchronized Collator getInstance() { throw new RuntimeException("Stub!"); }
/* 46 */   public static synchronized Collator getInstance(Locale desiredLocale) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int compare(String paramString1, String paramString2);
/* 48 */   public int compare(Object o1, Object o2) { throw new RuntimeException("Stub!"); }
/*    */   public abstract CollationKey getCollationKey(String paramString);
/* 50 */   public boolean equals(String source, String target) { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized int getStrength() { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized void setStrength(int newStrength) { throw new RuntimeException("Stub!"); }
/* 53 */   public synchronized int getDecomposition() { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized void setDecomposition(int decompositionMode) { throw new RuntimeException("Stub!"); }
/* 55 */   public static synchronized Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 56 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean equals(Object that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract int hashCode();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\text\Collator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */