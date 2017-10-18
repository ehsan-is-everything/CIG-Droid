package android.webkit;

import android.net.Uri;
import java.util.Map;

public abstract interface WebResourceRequest
{
  public abstract Uri getUrl();
  
  public abstract boolean isForMainFrame();
  
  public abstract boolean isRedirect();
  
  public abstract boolean hasGesture();
  
  public abstract String getMethod();
  
  public abstract Map<String, String> getRequestHeaders();
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\webkit\WebResourceRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */