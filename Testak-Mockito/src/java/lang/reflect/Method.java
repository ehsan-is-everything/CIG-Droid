/*    */ package java.lang.reflect;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
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
/*    */ public final class Method
/*    */   extends Executable
/*    */ {
/* 31 */   Method() { throw new RuntimeException("Stub!"); }
/* 32 */   public Class<?> getDeclaringClass() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getModifiers() { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public TypeVariable<Method>[] getTypeParameters() { throw new RuntimeException("Stub!"); }
/* 37 */   public Class<?> getReturnType() { throw new RuntimeException("Stub!"); }
/* 38 */   public Type getGenericReturnType() { throw new RuntimeException("Stub!"); }
/* 39 */   public Class<?>[] getParameterTypes() { throw new RuntimeException("Stub!"); }
/* 40 */   public int getParameterCount() { throw new RuntimeException("Stub!"); }
/* 41 */   public Type[] getGenericParameterTypes() { throw new RuntimeException("Stub!"); }
/*    */   public native Class<?>[] getExceptionTypes();
/* 43 */   public Type[] getGenericExceptionTypes() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 45 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public String toGenericString() { throw new RuntimeException("Stub!"); }
/*    */   public native Object invoke(Object paramObject, Object... paramVarArgs) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
/* 49 */   public boolean isBridge() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isVarArgs() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isDefault() { throw new RuntimeException("Stub!"); }
/*    */   public native Object getDefaultValue();
/* 54 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 55 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); }
/* 56 */   public Annotation[][] getParameterAnnotations() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\reflect\Method.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */