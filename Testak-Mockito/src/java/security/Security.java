/*    */ package java.security;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Security
/*    */ {
/* 30 */   Security() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public static String getAlgorithmProperty(String algName, String propName) { throw new RuntimeException("Stub!"); }
/* 33 */   public static synchronized int insertProviderAt(Provider provider, int position) { throw new RuntimeException("Stub!"); }
/* 34 */   public static int addProvider(Provider provider) { throw new RuntimeException("Stub!"); }
/* 35 */   public static synchronized void removeProvider(String name) { throw new RuntimeException("Stub!"); }
/* 36 */   public static Provider[] getProviders() { throw new RuntimeException("Stub!"); }
/* 37 */   public static Provider getProvider(String name) { throw new RuntimeException("Stub!"); }
/* 38 */   public static Provider[] getProviders(String filter) { throw new RuntimeException("Stub!"); }
/* 39 */   public static Provider[] getProviders(Map<String, String> filter) { throw new RuntimeException("Stub!"); }
/* 40 */   public static String getProperty(String key) { throw new RuntimeException("Stub!"); }
/* 41 */   public static void setProperty(String key, String datum) { throw new RuntimeException("Stub!"); }
/* 42 */   public static Set<String> getAlgorithms(String serviceName) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\Security.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */