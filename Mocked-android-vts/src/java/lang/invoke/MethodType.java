/*    */ package java.lang.invoke;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
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
/*    */ public final class MethodType
/*    */   implements Serializable
/*    */ {
/* 30 */   MethodType() { throw new RuntimeException("Stub!"); }
/* 31 */   public static MethodType methodType(Class<?> rtype, Class<?>[] ptypes) { throw new RuntimeException("Stub!"); }
/* 32 */   public static MethodType methodType(Class<?> rtype, List<Class<?>> ptypes) { throw new RuntimeException("Stub!"); }
/* 33 */   public static MethodType methodType(Class<?> rtype, Class<?> ptype0, Class<?>... ptypes) { throw new RuntimeException("Stub!"); }
/* 34 */   public static MethodType methodType(Class<?> rtype) { throw new RuntimeException("Stub!"); }
/* 35 */   public static MethodType methodType(Class<?> rtype, Class<?> ptype0) { throw new RuntimeException("Stub!"); }
/* 36 */   public static MethodType methodType(Class<?> rtype, MethodType ptypes) { throw new RuntimeException("Stub!"); }
/* 37 */   public static MethodType genericMethodType(int objectArgCount, boolean finalArray) { throw new RuntimeException("Stub!"); }
/* 38 */   public static MethodType genericMethodType(int objectArgCount) { throw new RuntimeException("Stub!"); }
/* 39 */   public MethodType changeParameterType(int num, Class<?> nptype) { throw new RuntimeException("Stub!"); }
/* 40 */   public MethodType insertParameterTypes(int num, Class<?>... ptypesToInsert) { throw new RuntimeException("Stub!"); }
/* 41 */   public MethodType appendParameterTypes(Class<?>... ptypesToInsert) { throw new RuntimeException("Stub!"); }
/* 42 */   public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) { throw new RuntimeException("Stub!"); }
/* 43 */   public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) { throw new RuntimeException("Stub!"); }
/* 44 */   public MethodType dropParameterTypes(int start, int end) { throw new RuntimeException("Stub!"); }
/* 45 */   public MethodType changeReturnType(Class<?> nrtype) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean hasPrimitives() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean hasWrappers() { throw new RuntimeException("Stub!"); }
/* 48 */   public MethodType erase() { throw new RuntimeException("Stub!"); }
/* 49 */   public MethodType generic() { throw new RuntimeException("Stub!"); }
/* 50 */   public MethodType wrap() { throw new RuntimeException("Stub!"); }
/* 51 */   public MethodType unwrap() { throw new RuntimeException("Stub!"); }
/* 52 */   public Class<?> parameterType(int num) { throw new RuntimeException("Stub!"); }
/* 53 */   public int parameterCount() { throw new RuntimeException("Stub!"); }
/* 54 */   public Class<?> returnType() { throw new RuntimeException("Stub!"); }
/* 55 */   public List<Class<?>> parameterList() { throw new RuntimeException("Stub!"); }
/* 56 */   public Class<?>[] parameterArray() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean equals(Object x) { throw new RuntimeException("Stub!"); }
/* 58 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader) throws IllegalArgumentException, TypeNotPresentException { throw new RuntimeException("Stub!"); }
/* 61 */   public String toMethodDescriptorString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\invoke\MethodType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */