/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.database.ContentObserver;
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MockContentResolver
/*    */   extends ContentResolver
/*    */ {
/*    */   public MockContentResolver()
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public MockContentResolver(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public void addProvider(String name, ContentProvider provider) { throw new RuntimeException("Stub!"); }
/* 24 */   public void notifyChange(Uri uri, ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\mock\MockContentResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */