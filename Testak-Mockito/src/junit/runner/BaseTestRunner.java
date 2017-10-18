/*    */ package junit.runner;
/*    */ 
/*    */ import junit.framework.Test;
/*    */ 
/*  5 */ public abstract class BaseTestRunner implements junit.framework.TestListener { public BaseTestRunner() { throw new RuntimeException("Stub!"); }
/*  6 */   public synchronized void startTest(Test test) { throw new RuntimeException("Stub!"); }
/*  7 */   protected static void setPreferences(java.util.Properties preferences) { throw new RuntimeException("Stub!"); }
/*  8 */   protected static java.util.Properties getPreferences() { throw new RuntimeException("Stub!"); }
/*  9 */   public static void savePreferences() throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 10 */   public void setPreference(String key, String value) { throw new RuntimeException("Stub!"); }
/* 11 */   public synchronized void endTest(Test test) { throw new RuntimeException("Stub!"); }
/* 12 */   public synchronized void addError(Test test, Throwable t) { throw new RuntimeException("Stub!"); }
/* 13 */   public synchronized void addFailure(Test test, junit.framework.AssertionFailedError t) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void testStarted(String paramString);
/*    */   public abstract void testEnded(String paramString);
/*    */   public abstract void testFailed(int paramInt, Test paramTest, Throwable paramThrowable);
/* 17 */   public Test getTest(String suiteClassName) { throw new RuntimeException("Stub!"); }
/* 18 */   public String elapsedTimeAsString(long runTime) { throw new RuntimeException("Stub!"); }
/* 19 */   protected String processArguments(String[] args) { throw new RuntimeException("Stub!"); }
/* 20 */   public void setLoading(boolean enable) { throw new RuntimeException("Stub!"); }
/* 21 */   public String extractClassName(String className) { throw new RuntimeException("Stub!"); }
/* 22 */   public static String truncate(String s) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void runFailed(String paramString);
/*    */   @Deprecated
/* 25 */   public TestSuiteLoader getLoader() { throw new RuntimeException("Stub!"); }
/* 26 */   protected Class<?> loadSuiteClass(String suiteClassName) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 27 */   protected void clearStatus() { throw new RuntimeException("Stub!"); }
/* 28 */   protected boolean useReloadingTestSuiteLoader() { throw new RuntimeException("Stub!"); }
/* 29 */   public static String getPreference(String key) { throw new RuntimeException("Stub!"); }
/* 30 */   public static int getPreference(String key, int dflt) { throw new RuntimeException("Stub!"); }
/* 31 */   public static String getFilteredTrace(Throwable t) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 33 */   public static boolean inVAJava() { throw new RuntimeException("Stub!"); }
/* 34 */   public static String getFilteredTrace(String stack) { throw new RuntimeException("Stub!"); }
/* 35 */   protected static boolean showStackRaw() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String SUITE_METHODNAME = "suite";
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\junit\runner\BaseTestRunner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */