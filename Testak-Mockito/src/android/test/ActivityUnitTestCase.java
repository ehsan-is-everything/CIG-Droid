/*    */ package android.test;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.Application;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
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
/*    */ public abstract class ActivityUnitTestCase<T extends Activity>
/*    */   extends ActivityTestCase
/*    */ {
/* 22 */   public ActivityUnitTestCase(Class<T> activityClass) { throw new RuntimeException("Stub!"); }
/* 23 */   public T getActivity() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 25 */   protected T startActivity(Intent intent, Bundle savedInstanceState, Object lastNonConfigurationInstance) { throw new RuntimeException("Stub!"); }
/* 26 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 27 */   public void setApplication(Application application) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setActivityContext(Context activityContext) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getRequestedOrientation() { throw new RuntimeException("Stub!"); }
/* 30 */   public Intent getStartedActivityIntent() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getStartedActivityRequest() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isFinishCalled() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getFinishedActivityRequest() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\ActivityUnitTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */