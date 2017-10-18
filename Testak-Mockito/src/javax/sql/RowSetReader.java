package javax.sql;

import java.sql.SQLException;

public abstract interface RowSetReader
{
  public abstract void readData(RowSetInternal paramRowSetInternal)
    throws SQLException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\sql\RowSetReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */