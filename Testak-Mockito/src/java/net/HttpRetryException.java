/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public class HttpRetryException
/*    */   extends IOException
/*    */ {
/* 30 */   public HttpRetryException(String detail, int code) { throw new RuntimeException("Stub!"); }
/* 31 */   public HttpRetryException(String detail, int code, String location) { throw new RuntimeException("Stub!"); }
/* 32 */   public int responseCode() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getReason() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getLocation() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\HttpRetryException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */