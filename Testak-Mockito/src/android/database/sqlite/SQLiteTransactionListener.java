package android.database.sqlite;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();
  
  public abstract void onCommit();
  
  public abstract void onRollback();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\sqlite\SQLiteTransactionListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */