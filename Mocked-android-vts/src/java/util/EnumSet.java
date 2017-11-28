/*    */ package java.util;
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
/*    */ public abstract class EnumSet<E extends Enum<E>>
/*    */   extends AbstractSet<E>
/*    */   implements Cloneable, Serializable
/*    */ {
/* 32 */   EnumSet() { throw new RuntimeException("Stub!"); }
/* 33 */   public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType) { throw new RuntimeException("Stub!"); }
/* 34 */   public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType) { throw new RuntimeException("Stub!"); }
/* 35 */   public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s) { throw new RuntimeException("Stub!"); }
/* 36 */   public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c) { throw new RuntimeException("Stub!"); }
/* 37 */   public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s) { throw new RuntimeException("Stub!"); }
/* 38 */   public static <E extends Enum<E>> EnumSet<E> of(E e) { throw new RuntimeException("Stub!"); }
/* 39 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2) { throw new RuntimeException("Stub!"); }
/* 40 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3) { throw new RuntimeException("Stub!"); }
/* 41 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4) { throw new RuntimeException("Stub!"); }
/* 42 */   public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4, E e5) { throw new RuntimeException("Stub!"); }
/*    */   @SafeVarargs
/* 44 */   public static <E extends Enum<E>> EnumSet<E> of(E first, E... rest) { throw new RuntimeException("Stub!"); }
/* 45 */   public static <E extends Enum<E>> EnumSet<E> range(E from, E to) { throw new RuntimeException("Stub!"); }
/*    */   
/* 47 */   public EnumSet<E> clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\EnumSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */