package javax.sql;

import java.util.EventListener;

public abstract interface RowSetListener
  extends EventListener
{
  public abstract void rowSetChanged(RowSetEvent paramRowSetEvent);
  
  public abstract void rowChanged(RowSetEvent paramRowSetEvent);
  
  public abstract void cursorMoved(RowSetEvent paramRowSetEvent);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\sql\RowSetListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */