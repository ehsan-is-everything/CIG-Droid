package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

@Deprecated
public abstract interface LayeredSocketFactory
  extends SocketFactory
{
  public abstract Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
    throws IOException, UnknownHostException;
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\apache\http\conn\scheme\LayeredSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */