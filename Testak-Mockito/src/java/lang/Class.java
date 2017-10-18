/*    */ package java.lang;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.Serializable;
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedElement;
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.GenericDeclaration;
/*    */ import java.lang.reflect.Method;
/*    */ import java.lang.reflect.Type;
/*    */ import java.lang.reflect.TypeVariable;
/*    */ import java.net.URL;
/*    */ import java.security.ProtectionDomain;
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
/*    */ public final class Class<T>
/*    */   implements Serializable, GenericDeclaration, Type, AnnotatedElement
/*    */ {
/* 31 */   Class() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toGenericString() { throw new RuntimeException("Stub!"); }
/* 34 */   public static Class<?> forName(String className) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public static Class<?> forName(String name, boolean initialize, ClassLoader loader) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   public native T newInstance() throws InstantiationException, IllegalAccessException;
/* 37 */   public boolean isInstance(Object obj) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isAssignableFrom(Class<?> cls) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isInterface() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isArray() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isPrimitive() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isAnnotation() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isSynthetic() { throw new RuntimeException("Stub!"); }
/* 44 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 45 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
/* 46 */   public synchronized TypeVariable<Class<T>>[] getTypeParameters() { throw new RuntimeException("Stub!"); }
/* 47 */   public Class<? super T> getSuperclass() { throw new RuntimeException("Stub!"); }
/* 48 */   public Type getGenericSuperclass() { throw new RuntimeException("Stub!"); }
/* 49 */   public Package getPackage() { throw new RuntimeException("Stub!"); }
/* 50 */   public Class<?>[] getInterfaces() { throw new RuntimeException("Stub!"); }
/* 51 */   public Type[] getGenericInterfaces() { throw new RuntimeException("Stub!"); }
/* 52 */   public Class<?> getComponentType() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getModifiers() { throw new RuntimeException("Stub!"); }
/* 54 */   public Object[] getSigners() { throw new RuntimeException("Stub!"); }
/* 55 */   public Method getEnclosingMethod() { throw new RuntimeException("Stub!"); }
/* 56 */   public Constructor<?> getEnclosingConstructor() { throw new RuntimeException("Stub!"); }
/*    */   public native Class<?> getDeclaringClass();
/*    */   public native Class<?> getEnclosingClass();
/* 59 */   public String getSimpleName() { throw new RuntimeException("Stub!"); }
/* 60 */   public String getTypeName() { throw new RuntimeException("Stub!"); }
/* 61 */   public String getCanonicalName() { throw new RuntimeException("Stub!"); }
/*    */   public native boolean isAnonymousClass();
/* 63 */   public boolean isLocalClass() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isMemberClass() { throw new RuntimeException("Stub!"); }
/* 65 */   public Class<?>[] getClasses() { throw new RuntimeException("Stub!"); }
/* 66 */   public Field[] getFields() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 67 */   public Method[] getMethods() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 68 */   public Constructor<?>[] getConstructors() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 69 */   public Field getField(String name) throws NoSuchFieldException { throw new RuntimeException("Stub!"); }
/* 70 */   public Method getMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); }
/* 71 */   public Constructor<T> getConstructor(Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); }
/*    */   public native Class<?>[] getDeclaredClasses();
/*    */   public native Field[] getDeclaredFields();
/* 74 */   public Method[] getDeclaredMethods() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 75 */   public Constructor<?>[] getDeclaredConstructors() throws SecurityException { throw new RuntimeException("Stub!"); }
/*    */   public native Field getDeclaredField(String paramString) throws NoSuchFieldException;
/* 77 */   public Method getDeclaredMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); }
/* 78 */   public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException { throw new RuntimeException("Stub!"); }
/* 79 */   public InputStream getResourceAsStream(String name) { throw new RuntimeException("Stub!"); }
/* 80 */   public URL getResource(String name) { throw new RuntimeException("Stub!"); }
/* 81 */   public ProtectionDomain getProtectionDomain() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean desiredAssertionStatus() { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean isEnum() { throw new RuntimeException("Stub!"); }
/* 84 */   public T[] getEnumConstants() { throw new RuntimeException("Stub!"); }
/*    */   
/* 86 */   public T cast(Object obj) { throw new RuntimeException("Stub!"); }
/*    */   
/* 88 */   public <U> Class<? extends U> asSubclass(Class<U> clazz) { throw new RuntimeException("Stub!"); }
/*    */   
/* 90 */   public <A extends Annotation> A getAnnotation(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 91 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); }
/* 92 */   public <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 93 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public native <A extends Annotation> A getDeclaredAnnotation(Class<A> paramClass);
/*    */   
/*    */   public native Annotation[] getDeclaredAnnotations();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */