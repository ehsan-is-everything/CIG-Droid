/*    */ package android.test;
/*    */ 
/*    */ import android.app.Instrumentation;
/*    */ import android.os.Bundle;
/*    */ import junit.framework.TestSuite;
/*    */ 
/*    */ @Deprecated
/*    */ public class InstrumentationTestRunner
/*    */   extends Instrumentation
/*    */   implements TestSuiteProvider
/*    */ {
/*    */   public static final String REPORT_KEY_NAME_CLASS = "class";
/*    */   public static final String REPORT_KEY_NAME_TEST = "test";
/*    */   public static final String REPORT_KEY_NUM_CURRENT = "current";
/*    */   public static final String REPORT_KEY_NUM_TOTAL = "numtests";
/*    */   public static final String REPORT_KEY_STACK = "stack";
/*    */   public static final String REPORT_VALUE_ID = "InstrumentationTestRunner";
/*    */   public static final int REPORT_VALUE_RESULT_ERROR = -1;
/*    */   public static final int REPORT_VALUE_RESULT_FAILURE = -2;
/*    */   public static final int REPORT_VALUE_RESULT_OK = 0;
/*    */   public static final int REPORT_VALUE_RESULT_START = 1;
/*    */   
/* 23 */   public InstrumentationTestRunner() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onCreate(Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 25 */   public Bundle getArguments() { throw new RuntimeException("Stub!"); }
/* 26 */   protected AndroidTestRunner getAndroidTestRunner() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 28 */   public TestSuite getTestSuite() { throw new RuntimeException("Stub!"); }
/* 29 */   public TestSuite getAllTests() { throw new RuntimeException("Stub!"); }
/* 30 */   public ClassLoader getLoader() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\InstrumentationTestRunner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */