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
/*    */ public abstract class Executable
/*    */   extends AccessibleObject
/*    */   implements Member, GenericDeclaration
/*    */ {
/* 31 */   Executable() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Class<?> getDeclaringClass();
/*    */   public abstract String getName();
/*    */   public abstract int getModifiers();
/*    */   public abstract TypeVariable<?>[] getTypeParameters();
/*    */   public abstract Class<?>[] getParameterTypes();
/* 37 */   public int getParameterCount() { throw new RuntimeException("Stub!"); }
/* 38 */   public Type[] getGenericParameterTypes() { throw new RuntimeException("Stub!"); }
/* 39 */   public Parameter[] getParameters() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Class<?>[] getExceptionTypes();
/* 41 */   public Type[] getGenericExceptionTypes() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String toGenericString();
/* 43 */   public boolean isVarArgs() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Annotation[][] getParameterAnnotations();
/* 46 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 47 */   public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 48 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean isAnnotationPresent(Class<? extends Annotation> annotationType) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\reflect\Executable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */