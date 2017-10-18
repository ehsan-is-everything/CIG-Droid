/*    */ package java.sql;
/*    */ 
/*    */ import java.util.Iterator;
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
/*    */ public class SQLException
/*    */   extends Exception
/*    */   implements Iterable<Throwable>
/*    */ {
/* 31 */   public SQLException(String reason, String SQLState, int vendorCode) { throw new RuntimeException("Stub!"); }
/* 32 */   public SQLException(String reason, String SQLState) { throw new RuntimeException("Stub!"); }
/* 33 */   public SQLException(String reason) { throw new RuntimeException("Stub!"); }
/* 34 */   public SQLException() { throw new RuntimeException("Stub!"); }
/* 35 */   public SQLException(Throwable cause) { throw new RuntimeException("Stub!"); }
/* 36 */   public SQLException(String reason, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 37 */   public SQLException(String reason, String sqlState, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 38 */   public SQLException(String reason, String sqlState, int vendorCode, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 39 */   public String getSQLState() { throw new RuntimeException("Stub!"); }
/* 40 */   public int getErrorCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public SQLException getNextException() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setNextException(SQLException ex) { throw new RuntimeException("Stub!"); }
/* 43 */   public Iterator<Throwable> iterator() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\sql\SQLException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */