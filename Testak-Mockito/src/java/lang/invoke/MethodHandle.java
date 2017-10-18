/*    */ package java.lang.invoke;
/*    */ 
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
/*    */ 
/*    */ public abstract class MethodHandle
/*    */ {
/* 29 */   MethodHandle() { throw new RuntimeException("Stub!"); }
/* 30 */   public MethodType type() { throw new RuntimeException("Stub!"); }
/*    */   public final native Object invokeExact(Object... paramVarArgs) throws Throwable;
/*    */   public final native Object invoke(Object... paramVarArgs) throws Throwable;
/* 33 */   public Object invokeWithArguments(Object... arguments) throws Throwable { throw new RuntimeException("Stub!"); }
/* 34 */   public Object invokeWithArguments(List<?> arguments) throws Throwable { throw new RuntimeException("Stub!"); }
/* 35 */   public MethodHandle asType(MethodType newType) { throw new RuntimeException("Stub!"); }
/* 36 */   public MethodHandle asSpreader(Class<?> arrayType, int arrayLength) { throw new RuntimeException("Stub!"); }
/* 37 */   public MethodHandle asCollector(Class<?> arrayType, int arrayLength) { throw new RuntimeException("Stub!"); }
/* 38 */   public MethodHandle asVarargsCollector(Class<?> arrayType) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isVarargsCollector() { throw new RuntimeException("Stub!"); }
/* 40 */   public MethodHandle asFixedArity() { throw new RuntimeException("Stub!"); }
/* 41 */   public MethodHandle bindTo(Object x) { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\invoke\MethodHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */