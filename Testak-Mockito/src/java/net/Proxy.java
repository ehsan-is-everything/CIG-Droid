/*    */ package java.net;
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
/*    */ 
/*    */ 
/*    */ public class Proxy
/*    */ {
/*    */   public static enum Type
/*    */   {
/* 31 */     DIRECT, 
/* 32 */     HTTP, 
/* 33 */     SOCKS;
/*    */     private Type() {} }
/* 35 */   public Proxy(Type type, SocketAddress sa) { throw new RuntimeException("Stub!"); }
/* 36 */   public Type type() { throw new RuntimeException("Stub!"); }
/* 37 */   public SocketAddress address() { throw new RuntimeException("Stub!"); }
/* 38 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 39 */   public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 40 */   public final int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/* 42 */   public static final Proxy NO_PROXY = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */