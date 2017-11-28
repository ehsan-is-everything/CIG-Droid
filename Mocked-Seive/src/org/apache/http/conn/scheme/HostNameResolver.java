package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.InetAddress;

@Deprecated
public abstract interface HostNameResolver
{
  public abstract InetAddress resolve(String paramString)
    throws IOException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\apache\http\conn\scheme\HostNameResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */