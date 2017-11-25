/*    */ package android.test;
/*    */ 
/*    */ import android.app.Application;
/*    */ import android.app.Service;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class ServiceTestCase<T extends Service>
/*    */   extends AndroidTestCase
/*    */ {
/* 22 */   public ServiceTestCase(Class<T> serviceClass) { throw new RuntimeException("Stub!"); }
/* 23 */   public T getService() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 25 */   protected void setupService() { throw new RuntimeException("Stub!"); }
/* 26 */   protected void startService(Intent intent) { throw new RuntimeException("Stub!"); }
/* 27 */   protected IBinder bindService(Intent intent) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void shutdownService() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 30 */   public void setApplication(Application application) { throw new RuntimeException("Stub!"); }
/* 31 */   public Application getApplication() { throw new RuntimeException("Stub!"); }
/* 32 */   public Context getSystemContext() { throw new RuntimeException("Stub!"); }
/* 33 */   public void testServiceTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\ServiceTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */