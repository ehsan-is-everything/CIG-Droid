package javax.sql;

import java.util.EventListener;

public abstract interface StatementEventListener
  extends EventListener
{
  public abstract void statementClosed(StatementEvent paramStatementEvent);
  
  public abstract void statementErrorOccurred(StatementEvent paramStatementEvent);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\sql\StatementEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */