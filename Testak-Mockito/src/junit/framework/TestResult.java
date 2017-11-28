/*    */ package junit.framework;
/*    */ import java.util.Vector;
/*    */ 
/*  4 */ public class TestResult { public TestResult() { throw new RuntimeException("Stub!"); }
/*  5 */   public synchronized void addError(Test test, Throwable t) { throw new RuntimeException("Stub!"); }
/*  6 */   public synchronized void addFailure(Test test, AssertionFailedError t) { throw new RuntimeException("Stub!"); }
/*  7 */   public synchronized void addListener(TestListener listener) { throw new RuntimeException("Stub!"); }
/*  8 */   public synchronized void removeListener(TestListener listener) { throw new RuntimeException("Stub!"); }
/*  9 */   public void endTest(Test test) { throw new RuntimeException("Stub!"); }
/* 10 */   public synchronized int errorCount() { throw new RuntimeException("Stub!"); }
/* 11 */   public synchronized java.util.Enumeration<TestFailure> errors() { throw new RuntimeException("Stub!"); }
/* 12 */   public synchronized int failureCount() { throw new RuntimeException("Stub!"); }
/* 13 */   public synchronized java.util.Enumeration<TestFailure> failures() { throw new RuntimeException("Stub!"); }
/* 14 */   protected void run(TestCase test) { throw new RuntimeException("Stub!"); }
/* 15 */   public synchronized int runCount() { throw new RuntimeException("Stub!"); }
/* 16 */   public void runProtected(Test test, Protectable p) { throw new RuntimeException("Stub!"); }
/* 17 */   public synchronized boolean shouldStop() { throw new RuntimeException("Stub!"); }
/* 18 */   public void startTest(Test test) { throw new RuntimeException("Stub!"); }
/* 19 */   public synchronized void stop() { throw new RuntimeException("Stub!"); }
/* 20 */   public synchronized boolean wasSuccessful() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   protected Vector<TestFailure> fErrors;
/*    */   protected Vector<TestFailure> fFailures;
/*    */   protected Vector<TestListener> fListeners;
/*    */   protected int fRunTests;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\junit\framework\TestResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */