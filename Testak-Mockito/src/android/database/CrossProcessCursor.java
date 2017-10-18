package android.database;

public abstract interface CrossProcessCursor
  extends Cursor
{
  public abstract CursorWindow getWindow();
  
  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);
  
  public abstract boolean onMove(int paramInt1, int paramInt2);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\CrossProcessCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */