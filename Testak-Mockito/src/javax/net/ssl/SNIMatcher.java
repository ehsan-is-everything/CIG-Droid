/*    */ package javax.net.ssl;
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
/*    */ public abstract class SNIMatcher
/*    */ {
/* 29 */   protected SNIMatcher(int type) { throw new RuntimeException("Stub!"); }
/* 30 */   public final int getType() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean matches(SNIServerName paramSNIServerName);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\SNIMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */