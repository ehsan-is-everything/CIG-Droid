/*    */ package java.lang;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.AnnotatedElement;
/*    */ import java.net.URL;
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
/*    */ public class Package
/*    */   implements AnnotatedElement
/*    */ {
/* 31 */   Package() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getSpecificationTitle() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getSpecificationVersion() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getSpecificationVendor() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getImplementationTitle() { throw new RuntimeException("Stub!"); }
/* 37 */   public String getImplementationVersion() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getImplementationVendor() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isSealed() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isSealed(URL url) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isCompatibleWith(String desired) throws NumberFormatException { throw new RuntimeException("Stub!"); }
/* 42 */   public static Package getPackage(String name) { throw new RuntimeException("Stub!"); }
/* 43 */   public static Package[] getPackages() { throw new RuntimeException("Stub!"); }
/* 44 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 46 */   public <A extends Annotation> A getAnnotation(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { throw new RuntimeException("Stub!"); }
/* 48 */   public <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 49 */   public Annotation[] getAnnotations() { throw new RuntimeException("Stub!"); }
/* 50 */   public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 51 */   public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> annotationClass) { throw new RuntimeException("Stub!"); }
/* 52 */   public Annotation[] getDeclaredAnnotations() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\Package.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */