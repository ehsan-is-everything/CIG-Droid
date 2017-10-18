package android.nfc.tech;

import android.nfc.Tag;
import java.io.Closeable;
import java.io.IOException;

public abstract interface TagTechnology
  extends Closeable
{
  public abstract Tag getTag();
  
  public abstract void connect()
    throws IOException;
  
  public abstract void close()
    throws IOException;
  
  public abstract boolean isConnected();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\tech\TagTechnology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */