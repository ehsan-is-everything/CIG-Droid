package javax.sql;

import java.sql.SQLException;

public abstract interface ConnectionPoolDataSource
  extends CommonDataSource
{
  public abstract PooledConnection getPooledConnection()
    throws SQLException;
  
  public abstract PooledConnection getPooledConnection(String paramString1, String paramString2)
    throws SQLException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\sql\ConnectionPoolDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */