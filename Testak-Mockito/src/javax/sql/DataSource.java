package javax.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Wrapper;

public abstract interface DataSource
  extends CommonDataSource, Wrapper
{
  public abstract Connection getConnection()
    throws SQLException;
  
  public abstract Connection getConnection(String paramString1, String paramString2)
    throws SQLException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\sql\DataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */