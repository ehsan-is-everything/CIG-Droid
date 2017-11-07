package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class EnvironmentCompat
{
  public static final String MEDIA_UNKNOWN = "unknown";
  private static final String TAG = "EnvironmentCompat";
  
  public static String getStorageState(File paramFile)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return EnvironmentCompatKitKat.getStorageState(paramFile);
    }
    try
    {
      if (paramFile.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()))
      {
        String str = Environment.getExternalStorageState();
        return str;
      }
    }
    catch (IOException localIOException)
    {
      Log.w("EnvironmentCompat", "Failed to resolve canonical path: " + localIOException);
    }
    return "unknown";
  }
}


/* Location:              C:\Users\Lab\Desktop\testak-testiput-button-dex2jar.jar!\android\support\v4\os\EnvironmentCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */