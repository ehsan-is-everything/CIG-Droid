package org.apache.http.conn.ssl;

import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
public abstract interface X509HostnameVerifier
  extends HostnameVerifier
{
  public abstract boolean verify(String paramString, SSLSession paramSSLSession);
  
  public abstract void verify(String paramString, SSLSocket paramSSLSocket)
    throws IOException;
  
  public abstract void verify(String paramString, X509Certificate paramX509Certificate)
    throws SSLException;
  
  public abstract void verify(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
    throws SSLException;
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\apache\http\conn\ssl\X509HostnameVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */