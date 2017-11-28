/*    */ package android.test.suitebuilder;
/*    */ 
/*    */ import com.android.internal.util.Predicate;
/*    */ import java.util.List;
/*    */ import junit.framework.TestCase;
/*    */ import junit.framework.TestSuite;
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
/*    */ public class TestSuiteBuilder
/*    */ {
/*    */   @Deprecated
/*    */   public static class FailedToCreateTests
/*    */     extends TestCase
/*    */   {
/* 25 */     public FailedToCreateTests(Exception exception) { throw new RuntimeException("Stub!"); }
/* 26 */     public void testSuiteConstructionFailed() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   public TestSuiteBuilder(Class clazz) { throw new RuntimeException("Stub!"); }
/* 29 */   public TestSuiteBuilder(String name, ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
/* 30 */   public TestSuiteBuilder includePackages(String... packageNames) { throw new RuntimeException("Stub!"); }
/* 31 */   public TestSuiteBuilder excludePackages(String... packageNames) { throw new RuntimeException("Stub!"); }
/* 32 */   public TestSuiteBuilder addRequirements(List<Predicate<TestMethod>> predicates) { throw new RuntimeException("Stub!"); }
/* 33 */   public final TestSuiteBuilder includeAllPackagesUnderHere() { throw new RuntimeException("Stub!"); }
/* 34 */   public TestSuiteBuilder named(String newSuiteName) { throw new RuntimeException("Stub!"); }
/* 35 */   public final TestSuite build() { throw new RuntimeException("Stub!"); }
/* 36 */   protected String getSuiteName() { throw new RuntimeException("Stub!"); }
/* 37 */   public final TestSuiteBuilder addRequirements(Predicate<TestMethod>... predicates) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\suitebuilder\TestSuiteBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */