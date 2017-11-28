/*    */ package android.test;
/*    */ 
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Context;
/*    */ import java.util.List;
/*    */ import junit.framework.Test;
/*    */ import junit.framework.TestCase;
/*    */ import junit.framework.TestListener;
/*    */ import junit.framework.TestResult;
/*    */ import junit.runner.BaseTestRunner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class AndroidTestRunner
/*    */   extends BaseTestRunner
/*    */ {
/* 22 */   public AndroidTestRunner() { throw new RuntimeException("Stub!"); }
/*    */   
/* 24 */   public void setTestClassName(String testClassName, String testMethodName) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setTest(Test test) { throw new RuntimeException("Stub!"); }
/* 26 */   public void clearTestListeners() { throw new RuntimeException("Stub!"); }
/* 27 */   public void addTestListener(TestListener testListener) { throw new RuntimeException("Stub!"); }
/* 28 */   protected TestResult createTestResult() { throw new RuntimeException("Stub!"); }
/* 29 */   public List<TestCase> getTestCases() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getTestClassName() { throw new RuntimeException("Stub!"); }
/* 31 */   public TestResult getTestResult() { throw new RuntimeException("Stub!"); }
/* 32 */   public void runTest() { throw new RuntimeException("Stub!"); }
/* 33 */   public void runTest(TestResult testResult) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setContext(Context context) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public void setInstrumentaiton(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
/* 38 */   protected Class loadSuiteClass(String suiteClassName) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 39 */   public void testStarted(String testName) { throw new RuntimeException("Stub!"); }
/* 40 */   public void testEnded(String testName) { throw new RuntimeException("Stub!"); }
/* 41 */   public void testFailed(int status, Test test, Throwable t) { throw new RuntimeException("Stub!"); }
/* 42 */   protected void runFailed(String message) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\AndroidTestRunner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */