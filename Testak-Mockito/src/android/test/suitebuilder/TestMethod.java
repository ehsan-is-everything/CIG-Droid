/*    */ package android.test.suitebuilder;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import junit.framework.TestCase;
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
/*    */ @Deprecated
/*    */ public class TestMethod
/*    */ {
/* 21 */   public TestMethod(Method method, Class<? extends TestCase> enclosingClass) { throw new RuntimeException("Stub!"); }
/* 22 */   public TestMethod(String methodName, Class<? extends TestCase> enclosingClass) { throw new RuntimeException("Stub!"); }
/* 23 */   public TestMethod(TestCase testCase) { throw new RuntimeException("Stub!"); }
/* 24 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 25 */   public String getEnclosingClassname() { throw new RuntimeException("Stub!"); }
/* 26 */   public <T extends Annotation> T getAnnotation(Class<T> annotationClass) { throw new RuntimeException("Stub!"); }
/*    */   
/* 28 */   public Class<? extends TestCase> getEnclosingClass() { throw new RuntimeException("Stub!"); }
/* 29 */   public TestCase createTest() throws InvocationTargetException, IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 31 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\suitebuilder\TestMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */