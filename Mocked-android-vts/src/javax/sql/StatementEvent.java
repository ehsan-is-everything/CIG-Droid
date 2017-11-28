/*    */ package javax.sql;
/*    */ 
/*    */ import java.sql.PreparedStatement;
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
/*    */ 
/*    */ 
/*    */ public class StatementEvent
/*    */   extends EventObject
/*    */ {
/*    */   public StatementEvent(PooledConnection con, PreparedStatement statement)
/*    */   {
/* 33 */     super(null);throw new RuntimeException("Stub!"); }
/* 34 */   public StatementEvent(PooledConnection con, PreparedStatement statement, SQLException exception) { super(null);throw new RuntimeException("Stub!"); }
/* 35 */   public PreparedStatement getStatement() { throw new RuntimeException("Stub!"); }
/* 36 */   public SQLException getSQLException() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\sql\StatementEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */