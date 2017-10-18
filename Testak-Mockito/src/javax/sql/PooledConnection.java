package javax.sql;

import java.sql.Connection;
import java.sql.SQLException;

public abstract interface PooledConnection
{
  public abstract Connection getConnection()
    throws SQLException;
  
  public abstract void close()
    throws SQLException;
  
  public abstract void addConnectionEventListener(ConnectionEventListener paramConnectionEventListener);
  
  public abstract void removeConnectionEventListener(ConnectionEventListener paramConnectionEventListener);
  
  public abstract void addStatementEventListener(StatementEventListener paramStatementEventListener);
  
  public abstract void removeStatementEventListener(StatementEventListener paramStatementEventListener);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\sql\PooledConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */