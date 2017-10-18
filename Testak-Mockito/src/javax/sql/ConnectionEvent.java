/*    */ package javax.sql;
/*    */ 
/*    */ import java.sql.SQLException;
/*    */ import java.util.EventObject;
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
/*    */ public class ConnectionEvent
/*    */   extends EventObject
/*    */ {
/*    */   public ConnectionEvent(PooledConnection con)
/*    */   {
/* 30 */     super(null);throw new RuntimeException("Stub!"); }
/* 31 */   public ConnectionEvent(PooledConnection con, SQLException ex) { super(null);throw new RuntimeException("Stub!"); }
/* 32 */   public SQLException getSQLException() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\sql\ConnectionEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */