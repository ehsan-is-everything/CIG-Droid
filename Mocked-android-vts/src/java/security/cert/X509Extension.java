package java.security.cert;

import java.util.Set;

public abstract interface X509Extension
{
  public abstract boolean hasUnsupportedCriticalExtension();
  
  public abstract Set<String> getCriticalExtensionOIDs();
  
  public abstract Set<String> getNonCriticalExtensionOIDs();
  
  public abstract byte[] getExtensionValue(String paramString);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\X509Extension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */