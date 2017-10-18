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
/*    */ public abstract interface AnnotatedElement
/*    */ {
/* 30 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); }
/*    */   public abstract <T extends Annotation> T getAnnotation(Class<T> paramClass);
/*    */   public abstract Annotation[] getAnnotations();
/* 33 */   public <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 34 */   public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/* 35 */   public <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Annotation[] getDeclaredAnnotations();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\reflect\AnnotatedElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */