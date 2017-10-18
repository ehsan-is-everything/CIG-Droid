package android.content;

import java.util.Iterator;

public abstract interface EntityIterator
  extends Iterator<Entity>
{
  public abstract void reset();
  
  public abstract void close();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\EntityIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */