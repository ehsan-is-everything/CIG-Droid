/*    */ package android.test;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.test.mock.MockContentResolver;
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
/*    */ public abstract class ProviderTestCase<T extends ContentProvider>
/*    */   extends InstrumentationTestCase
/*    */ {
/* 22 */   public ProviderTestCase(Class<T> providerClass, String providerAuthority) { throw new RuntimeException("Stub!"); }
/* 23 */   public T getProvider() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void setUp() throws Exception { throw new RuntimeException("Stub!"); }
/* 25 */   protected void tearDown() throws Exception { throw new RuntimeException("Stub!"); }
/* 26 */   public MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); }
/* 27 */   public IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); }
/* 28 */   public static <T extends ContentProvider> ContentResolver newResolverWithContentProviderFromSql(Context targetContext, Class<T> providerClass, String authority, String databaseName, int databaseVersion, String sql) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\ProviderTestCase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */