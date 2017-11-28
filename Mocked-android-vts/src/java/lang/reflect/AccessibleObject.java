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
/*    */ public class AccessibleObject
/*    */   implements AnnotatedElement
/*    */ {
/* 31 */   protected AccessibleObject() { throw new RuntimeException("Stub!"); }
/* 32 */   public static void setAccessible(AccessibleObject[] array, boolean flag) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 33 */   public void setAccessible(boolean flag) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isAccessible() { throw new RuntimeException("Stub!"); }
/* 35 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); }
/* 37 */   public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 38 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); }
/* 39 */   public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 40 */   public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 41 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\reflect\AccessibleObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */