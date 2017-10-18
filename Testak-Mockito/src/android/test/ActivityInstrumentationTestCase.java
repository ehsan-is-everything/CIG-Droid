/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
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
/*    */ @Deprecated
/*    */ public abstract class ActivityInstrumentationTestCase<T extends Activity>
/*    */   extends ActivityTestCase
/*    */ {
/* 22 */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass) { throw new RuntimeException("Stub!"); }
/* 23 */   public ActivityInstrumentationTestCase(String pkg, Class<T> activityClass, boolean initialTouchMode) { throw new RuntimeException("Stub!"); }
/* 24 */   public T getActivity() { throw new RuntimeException("Stub!"); }
/* 25 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 26 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 27 */   public void testActivityTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\ActivityInstrumentationTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */