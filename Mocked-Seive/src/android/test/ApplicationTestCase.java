/*    */ package android.test;
/*    */ 
/*    */ import android.app.Application;
/*    */ import android.content.Context;
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
/*    */ public abstract class ApplicationTestCase<T extends Application>
/*    */   extends AndroidTestCase
/*    */ {
/* 22 */   public ApplicationTestCase(Class<T> applicationClass) { throw new RuntimeException("Stub!"); }
/* 23 */   public T getApplication() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 25 */   protected final void createApplication() { throw new RuntimeException("Stub!"); }
/* 26 */   protected final void terminateApplication() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 28 */   public Context getSystemContext() { throw new RuntimeException("Stub!"); }
/* 29 */   public final void testApplicationTestCaseSetUpProperly() throws Exception { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\ApplicationTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */