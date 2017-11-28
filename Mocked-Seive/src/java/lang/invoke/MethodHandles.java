/*    */ package java.lang.invoke;
/*    */ 
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Member;
/*    */ import java.lang.reflect.Method;
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
/*    */ public class MethodHandles
/*    */ {
/*    */   public static final class Lookup
/*    */   {
/*    */     public static final int PACKAGE = 8;
/*    */     public static final int PRIVATE = 2;
/*    */     public static final int PROTECTED = 4;
/*    */     public static final int PUBLIC = 1;
/*    */     
/* 31 */     Lookup() { throw new RuntimeException("Stub!"); }
/* 32 */     public Class<?> lookupClass() { throw new RuntimeException("Stub!"); }
/* 33 */     public int lookupModes() { throw new RuntimeException("Stub!"); }
/* 34 */     public Lookup in(Class<?> requestedLookupClass) { throw new RuntimeException("Stub!"); }
/* 35 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */     public MethodHandle findStatic(Class<?> refc, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 37 */     public MethodHandle findVirtual(Class<?> refc, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 38 */     public MethodHandle findConstructor(Class<?> refc, MethodType type) throws NoSuchMethodException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 39 */     public MethodHandle findSpecial(Class<?> refc, String name, MethodType type, Class<?> specialCaller) throws NoSuchMethodException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 40 */     public MethodHandle findGetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 41 */     public MethodHandle findSetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 42 */     public MethodHandle findStaticGetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 43 */     public MethodHandle findStaticSetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 44 */     public MethodHandle bind(Object receiver, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 45 */     public MethodHandle unreflect(Method m) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 46 */     public MethodHandle unreflectSpecial(Method m, Class<?> specialCaller) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 47 */     public MethodHandle unreflectConstructor(Constructor<?> c) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 48 */     public MethodHandle unreflectGetter(Field f) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 49 */     public MethodHandle unreflectSetter(Field f) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/* 50 */     public MethodHandleInfo revealDirect(MethodHandle target) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 56 */   MethodHandles() { throw new RuntimeException("Stub!"); }
/* 57 */   public static Lookup lookup() { throw new RuntimeException("Stub!"); }
/* 58 */   public static Lookup publicLookup() { throw new RuntimeException("Stub!"); }
/* 59 */   public static <T extends Member> T reflectAs(Class<T> expected, MethodHandle target) { throw new RuntimeException("Stub!"); }
/* 60 */   public static MethodHandle arrayElementGetter(Class<?> arrayClass) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 61 */   public static MethodHandle arrayElementSetter(Class<?> arrayClass) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 62 */   public static MethodHandle spreadInvoker(MethodType type, int leadingArgCount) { throw new RuntimeException("Stub!"); }
/* 63 */   public static MethodHandle exactInvoker(MethodType type) { throw new RuntimeException("Stub!"); }
/* 64 */   public static MethodHandle invoker(MethodType type) { throw new RuntimeException("Stub!"); }
/* 65 */   public static MethodHandle explicitCastArguments(MethodHandle target, MethodType newType) { throw new RuntimeException("Stub!"); }
/* 66 */   public static MethodHandle permuteArguments(MethodHandle target, MethodType newType, int... reorder) { throw new RuntimeException("Stub!"); }
/* 67 */   public static MethodHandle constant(Class<?> type, Object value) { throw new RuntimeException("Stub!"); }
/* 68 */   public static MethodHandle identity(Class<?> type) { throw new RuntimeException("Stub!"); }
/* 69 */   public static MethodHandle insertArguments(MethodHandle target, int pos, Object... values) { throw new RuntimeException("Stub!"); }
/* 70 */   public static MethodHandle dropArguments(MethodHandle target, int pos, List<Class<?>> valueTypes) { throw new RuntimeException("Stub!"); }
/* 71 */   public static MethodHandle dropArguments(MethodHandle target, int pos, Class<?>... valueTypes) { throw new RuntimeException("Stub!"); }
/* 72 */   public static MethodHandle filterArguments(MethodHandle target, int pos, MethodHandle... filters) { throw new RuntimeException("Stub!"); }
/* 73 */   public static MethodHandle collectArguments(MethodHandle target, int pos, MethodHandle filter) { throw new RuntimeException("Stub!"); }
/* 74 */   public static MethodHandle filterReturnValue(MethodHandle target, MethodHandle filter) { throw new RuntimeException("Stub!"); }
/* 75 */   public static MethodHandle foldArguments(MethodHandle target, MethodHandle combiner) { throw new RuntimeException("Stub!"); }
/* 76 */   public static MethodHandle guardWithTest(MethodHandle test, MethodHandle target, MethodHandle fallback) { throw new RuntimeException("Stub!"); }
/* 77 */   public static MethodHandle catchException(MethodHandle target, Class<? extends Throwable> exType, MethodHandle handler) { throw new RuntimeException("Stub!"); }
/* 78 */   public static MethodHandle throwException(Class<?> returnType, Class<? extends Throwable> exType) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\invoke\MethodHandles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */