package java.sql;

public abstract interface Savepoint
{
  public abstract int getSavepointId()
    throws SQLException;
  
  public abstract String getSavepointName()
    throws SQLException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\sql\Savepoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */