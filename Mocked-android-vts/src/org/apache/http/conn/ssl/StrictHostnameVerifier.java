/*    */ package org.apache.http.conn.ssl;
/*    */ 
/*    */ import javax.net.ssl.SSLException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class StrictHostnameVerifier
/*    */   extends AbstractVerifier
/*    */ {
/* 37 */   public StrictHostnameVerifier() { throw new RuntimeException("Stub!"); }
/* 38 */   public final void verify(String host, String[] cns, String[] subjectAlts) throws SSLException { throw new RuntimeException("Stub!"); }
/* 39 */   public final String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\apache\http\conn\ssl\StrictHostnameVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */