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
/*    */ public abstract class ActivityTestCase
/*    */   extends InstrumentationTestCase
/*    */ {
/* 22 */   public ActivityTestCase() { throw new RuntimeException("Stub!"); }
/* 23 */   protected Activity getActivity() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void setActivity(Activity testActivity) { throw new RuntimeException("Stub!"); }
/* 25 */   protected void scrubClass(Class<?> testCaseClass) throws IllegalAccessException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\ActivityTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */