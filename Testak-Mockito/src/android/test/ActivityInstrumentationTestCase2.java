/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.Intent;
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
/*    */ @Deprecated
/*    */ public abstract class ActivityInstrumentationTestCase2<T extends Activity>
/*    */   extends ActivityTestCase
/*    */ {
/*    */   @Deprecated
/* 23 */   public ActivityInstrumentationTestCase2(String pkg, Class<T> activityClass) { throw new RuntimeException("Stub!"); }
/* 24 */   public ActivityInstrumentationTestCase2(Class<T> activityClass) { throw new RuntimeException("Stub!"); }
/* 25 */   public T getActivity() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setActivityIntent(Intent i) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setActivityInitialTouchMode(boolean initialTouchMode) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 29 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 30 */   protected void runTest() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\ActivityInstrumentationTestCase2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */