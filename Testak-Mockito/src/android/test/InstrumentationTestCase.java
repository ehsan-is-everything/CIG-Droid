/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.Instrumentation;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
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
/*    */ @Deprecated
/*    */ public class InstrumentationTestCase
/*    */   extends TestCase
/*    */ {
/* 22 */   public InstrumentationTestCase() { throw new RuntimeException("Stub!"); }
/* 23 */   public void injectInstrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public void injectInsrumentation(Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
/* 26 */   public Instrumentation getInstrumentation() { throw new RuntimeException("Stub!"); }
/* 27 */   public final <T extends Activity> T launchActivity(String pkg, Class<T> activityCls, Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public final <T extends Activity> T launchActivityWithIntent(String pkg, Class<T> activityCls, Intent intent) { throw new RuntimeException("Stub!"); }
/* 30 */   public void runTestOnUiThread(Runnable r) throws Throwable { throw new RuntimeException("Stub!"); }
/* 31 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!"); }
/* 32 */   public void sendKeys(String keysSequence) { throw new RuntimeException("Stub!"); }
/* 33 */   public void sendKeys(int... keys) { throw new RuntimeException("Stub!"); }
/* 34 */   public void sendRepeatedKeys(int... keys) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\InstrumentationTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */