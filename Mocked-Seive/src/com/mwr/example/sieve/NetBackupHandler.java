package com.mwr.example.sieve;

import android.os.AsyncTask;
import android.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class NetBackupHandler
{
  public static final int BACKUP_SUCCESS = 459835;
  private static final String END_HEADER = "\r\n\r\n";
  private static final String GET_REQUEST = "GET /Backup.xml HTTP/1.1";
  private static final int NOT_RUNNING = 243652;
  public static final int OPERATION_FAILED = 23485;
  private static final String POST_REQUEST = "POST /Backup.xml HTTP/1.1";
  public static final int RESTORE_SUCCESS = 745745;
  private static final int RUNNING_BACKUP = 2436235;
  private static final int RUNNING_RESTORE = 67456234;
  private static final String TAG = "m_NetBackup";
  private String port = "8000";
  private int result = -1;
  private ResultListener rl;
  private int state = 243652;
  private String url = "localhost";
  
  public NetBackupHandler(String paramString1, String paramString2, ResultListener paramResultListener)
  {
    this.url = paramString1;
    this.port = paramString2;
    this.rl = paramResultListener;
  }
  
  private Socket getNewHttpConnection()
  {
    Object localObject = new X509TrustManager()
    {
      public void checkClientTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString)
        throws CertificateException
      {}
      
      public void checkServerTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString)
        throws CertificateException
      {}
      
      public X509Certificate[] getAcceptedIssuers()
      {
        return null;
      }
    };
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      SecureRandom localSecureRandom = new SecureRandom();
      localSSLContext.init(new KeyManager[0], new TrustManager[] { localObject }, localSecureRandom);
      localObject = localSSLContext.getSocketFactory().createSocket(this.url, Integer.parseInt(this.port));
      return (Socket)localObject;
    }
    catch (Exception localException)
    {
      Log.e("m_NetBackup", "ERROR: Socket createion error: " + localException.getMessage());
    }
    return null;
  }
  
  public void performNetBackup(String paramString)
  {
    try
    {
      if (this.state == 243652)
      {
        this.state = 2436235;
        new NetBackup(null).execute(new String[] { paramString });
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void performNetRestore()
  {
    try
    {
      Log.i("m_NetBackup", "performNetRestore");
      if (this.state == 243652)
      {
        this.state = 67456234;
        new NetRestore(null).execute(new Void[0]);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private class NetBackup
    extends AsyncTask<String, Void, Object>
  {
    private NetBackup() {}
    
    protected Void doInBackground(String... paramVarArgs)
    {
      OutputStream localOutputStream = null;
      InputStream localInputStream = null;
      byte[] arrayOfByte = new byte['က'];
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4096);
      localByteBuffer.mark();
      for (;;)
      {
        try
        {
          localSocket = NetBackupHandler.this.getNewHttpConnection();
          if (!localSocket.isConnected()) {
            continue;
          }
          localOutputStream = localSocket.getOutputStream();
          localInputStream = localSocket.getInputStream();
          if ((localOutputStream == null) || (localInputStream == null)) {
            continue;
          }
          localOutputStream.write(("POST /Backup.xml HTTP/1.1\r\nContent-Length: " + paramVarArgs[0].length() + "\r\n\r\n" + paramVarArgs[0]).getBytes());
        }
        catch (Exception paramVarArgs)
        {
          Socket localSocket;
          int i;
          Log.e("m_NetBackup", "Error during connection: " + paramVarArgs.getMessage());
          break label224;
          localByteBuffer.put(arrayOfByte, 0, i);
          continue;
          Log.e("m_NetBackup", "Connection to server failed!");
          NetBackupHandler.this.result = 23485;
          continue;
        }
        i = localInputStream.read(arrayOfByte);
        if (i != -1) {
          continue;
        }
        localByteBuffer.reset();
        NetBackupHandler.this.result = 459835;
        localSocket.close();
        break label224;
        Log.e("m_NetBackup", "Socket is NOT Connected!");
        NetBackupHandler.this.result = 23485;
      }
      label224:
      return null;
    }
    
    protected void onPostExecute(Object paramObject)
    {
      NetBackupHandler.this.state = 243652;
      NetBackupHandler.this.rl.onTaskFinish(NetBackupHandler.this.result, null);
    }
  }
  
  private class NetRestore
    extends AsyncTask<Void, Void, String>
  {
    private NetRestore() {}
    
    protected String doInBackground(Void... paramVarArgs)
    {
      paramVarArgs = new byte['က'];
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4096);
      localByteBuffer.mark();
      try
      {
        Object localObject = NetBackupHandler.this.getNewHttpConnection();
        if (((Socket)localObject).isConnected())
        {
          OutputStream localOutputStream = ((Socket)localObject).getOutputStream();
          localObject = ((Socket)localObject).getInputStream();
          if (localOutputStream != null) {
            localOutputStream.write("GET /Backup.xml HTTP/1.1\r\n\r\n".getBytes());
          }
        }
        else
        {
          for (;;)
          {
            int i = ((InputStream)localObject).read(paramVarArgs);
            if (i == -1)
            {
              localByteBuffer.reset();
              paramVarArgs = new String(localByteBuffer.array());
              paramVarArgs.trim();
              paramVarArgs = paramVarArgs.split("\r\n\r\n")[1].split("\000")[0];
              NetBackupHandler.this.result = 745745;
              return paramVarArgs;
              Log.e("m_NetBackup", "Socket is NOT Connected!");
              NetBackupHandler.this.result = 23485;
              return null;
            }
            localByteBuffer.put(paramVarArgs, 0, i);
          }
        }
        return null;
      }
      catch (Exception paramVarArgs)
      {
        Log.e("m_NetBackup", "Error during connection: " + paramVarArgs.getMessage());
        NetBackupHandler.this.result = 23485;
      }
    }
    
    protected void onPostExecute(String paramString)
    {
      NetBackupHandler.this.state = 243652;
      NetBackupHandler.this.rl.onTaskFinish(NetBackupHandler.this.result, paramString);
    }
  }
  
  public static abstract interface ResultListener
  {
    public abstract void onTaskFinish(int paramInt, String paramString);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\NetBackupHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */