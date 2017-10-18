/*    */ package java.lang;
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
/*    */ 
/*    */ public abstract class Enum<E extends Enum<E>>
/*    */   implements Comparable<E>, Serializable
/*    */ {
/* 31 */   protected Enum(String name, int ordinal) { throw new RuntimeException("Stub!"); }
/* 32 */   public final String name() { throw new RuntimeException("Stub!"); }
/* 33 */   public final int ordinal() { throw new RuntimeException("Stub!"); }
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 35 */   public final boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 36 */   public final int hashCode() { throw new RuntimeException("Stub!"); }
/* 37 */   protected final Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 38 */   public final int compareTo(E o) { throw new RuntimeException("Stub!"); }
/*    */   
/* 40 */   public final Class<E> getDeclaringClass() { throw new RuntimeException("Stub!"); }
/* 41 */   public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) { throw new RuntimeException("Stub!"); }
/* 42 */   protected final void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Enum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */