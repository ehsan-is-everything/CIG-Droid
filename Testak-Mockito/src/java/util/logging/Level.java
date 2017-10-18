/*    */ package java.util.logging;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class Level
/*    */   implements Serializable
/*    */ {
/* 30 */   protected Level(String name, int value) { throw new RuntimeException("Stub!"); }
/* 31 */   protected Level(String name, int value, String resourceBundleName) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getResourceBundleName() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getLocalizedName() { throw new RuntimeException("Stub!"); }
/* 35 */   public final String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public final int intValue() { throw new RuntimeException("Stub!"); }
/* 37 */   public static synchronized Level parse(String name) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean equals(Object ox) { throw new RuntimeException("Stub!"); }
/* 39 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 49 */   public static final Level WARNING = null; public static final Level SEVERE = null; public static final Level OFF = null; public static final Level INFO = null; public static final Level FINEST = null; public static final Level FINER = null; public static final Level FINE = null; public static final Level CONFIG = null; public static final Level ALL = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\logging\Level.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */