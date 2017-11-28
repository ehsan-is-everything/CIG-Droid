/*    */ package java.sql;
/*    */ 
/*    */ import java.util.Map;
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
/*    */ public class SQLClientInfoException
/*    */   extends SQLException
/*    */ {
/* 29 */   public SQLClientInfoException() { throw new RuntimeException("Stub!"); }
/* 30 */   public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); }
/* 31 */   public SQLClientInfoException(Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 32 */   public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); }
/* 33 */   public SQLClientInfoException(String reason, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 34 */   public SQLClientInfoException(String reason, String SQLState, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); }
/* 35 */   public SQLClientInfoException(String reason, String SQLState, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 36 */   public SQLClientInfoException(String reason, String SQLState, int vendorCode, Map<String, ClientInfoStatus> failedProperties) { throw new RuntimeException("Stub!"); }
/* 37 */   public SQLClientInfoException(String reason, String SQLState, int vendorCode, Map<String, ClientInfoStatus> failedProperties, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 38 */   public Map<String, ClientInfoStatus> getFailedProperties() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\sql\SQLClientInfoException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */