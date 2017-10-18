/*    */ package android.net;
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
/*    */ public class LocalSocketAddress
/*    */ {
/*    */   public static enum Namespace
/*    */   {
/* 22 */     ABSTRACT, 
/* 23 */     FILESYSTEM, 
/* 24 */     RESERVED;
/*    */     private Namespace() {} }
/* 26 */   public LocalSocketAddress(String name, Namespace namespace) { throw new RuntimeException("Stub!"); }
/* 27 */   public LocalSocketAddress(String name) { throw new RuntimeException("Stub!"); }
/* 28 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 29 */   public Namespace getNamespace() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\LocalSocketAddress.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */