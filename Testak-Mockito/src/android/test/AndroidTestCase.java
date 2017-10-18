/*    */ package android.test;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import android.test.suitebuilder.annotation.Suppress;
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
/*    */ @Deprecated
/*    */ public class AndroidTestCase
/*    */   extends TestCase
/*    */ {
/*    */   protected Context mContext;
/*    */   
/* 22 */   public AndroidTestCase() { throw new RuntimeException("Stub!"); }
/* 23 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 24 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/*    */   @Suppress
/* 26 */   public void testAndroidTestCaseSetupProperly() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setContext(Context context) { throw new RuntimeException("Stub!"); }
/* 28 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 29 */   public void assertActivityRequiresPermission(String packageName, String className, String permission) { throw new RuntimeException("Stub!"); }
/* 30 */   public void assertReadingContentUriRequiresPermission(Uri uri, String permission) { throw new RuntimeException("Stub!"); }
/* 31 */   public void assertWritingContentUriRequiresPermission(Uri uri, String permission) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void scrubClass(Class<?> testCaseClass) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\AndroidTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */