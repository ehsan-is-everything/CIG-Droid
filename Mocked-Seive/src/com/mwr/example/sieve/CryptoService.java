package com.mwr.example.sieve;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public class CryptoService
  extends Service
{
  public static final String KEY = "com.mwr.example.sieve.KEY";
  public static final int MSG_DECRYPT = 13476;
  public static final int MSG_ENCRYPT = 3452;
  public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
  public static final String RESULT = "com.mwr.example.sieve.RESULT";
  public static final String STRING = "com.mwr.example.sieve.STRING";
  private static final String TAG = "m_CryptoService";
  private Messenger responseHandler;
  private Messenger serviceHandler;
  private Looper serviceLooper;
  
  static
  {
    System.loadLibrary("encrypt");
    System.loadLibrary("decrypt");
  }
  
  private String decrypt(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = runNDKdecrypt(paramString, paramArrayOfByte);
      return paramString;
    }
    catch (Exception paramString)
    {
      Log.e("m_CryptoService", "ERROR: Error during decrytion: " + paramString.getMessage());
    }
    return null;
  }
  
  private byte[] encrypt(String paramString1, String paramString2)
  {
    byte[] arrayOfByte = (byte[])null;
    try
    {
      paramString1 = runNDKencrypt(paramString1, paramString2);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      Log.e("m_CryptoService", "ERROR: Error during encrytion: " + paramString1.getMessage());
    }
    return arrayOfByte;
  }
  
  private native String runNDKdecrypt(String paramString, byte[] paramArrayOfByte);
  
  private native byte[] runNDKencrypt(String paramString1, String paramString2);
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.serviceHandler.getBinder();
  }
  
  public void onCreate()
  {
    HandlerThread localHandlerThread = new HandlerThread("m_CryptoService", 10);
    localHandlerThread.start();
    this.serviceLooper = localHandlerThread.getLooper();
    this.serviceHandler = new Messenger(new MessageHandler(this.serviceLooper));
  }
  
  private final class MessageHandler
    extends Handler
  {
    public MessageHandler(Looper paramLooper)
    {
      super();
    }
    
    private void sendResponseMessage(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
    {
      try
      {
        Message localMessage = Message.obtain(null, paramInt1, paramInt2, paramInt3);
        if (paramBundle != null) {
          localMessage.setData(paramBundle);
        }
        CryptoService.this.responseHandler.send(localMessage);
        return;
      }
      catch (RemoteException paramBundle)
      {
        Log.e("m_CryptoService", "Unable to send message: " + paramInt1);
      }
    }
    
    private void sendUnrecognizedMessage()
    {
      Message localMessage = Message.obtain(null, 111111, null);
      try
      {
        CryptoService.this.responseHandler.send(localMessage);
        return;
      }
      catch (RemoteException localRemoteException) {}
    }
    
    public void handleMessage(Message paramMessage)
    {
      CryptoService.this.responseHandler = paramMessage.replyTo;
      Object localObject1 = (byte[])null;
      localObject1 = (Bundle)paramMessage.obj;
      switch (paramMessage.what)
      {
      default: 
        Log.e("m_CryptoService", "Error: unrecognized command: " + paramMessage.what);
        sendUnrecognizedMessage();
      }
      for (;;)
      {
        super.handleMessage(paramMessage);
        return;
        String str = ((Bundle)localObject1).getString("com.mwr.example.sieve.KEY");
        Object localObject2 = ((Bundle)localObject1).getString("com.mwr.example.sieve.STRING");
        ((Bundle)localObject1).putByteArray("com.mwr.example.sieve.RESULT", CryptoService.this.encrypt(str, (String)localObject2));
        sendResponseMessage(9, 91, paramMessage.arg1, (Bundle)localObject1);
        continue;
        str = ((Bundle)localObject1).getString("com.mwr.example.sieve.KEY");
        localObject2 = ((Bundle)localObject1).getByteArray("com.mwr.example.sieve.PASSWORD");
        ((Bundle)localObject1).putString("com.mwr.example.sieve.RESULT", CryptoService.this.decrypt(str, (byte[])localObject2));
        sendResponseMessage(9, 92, paramMessage.arg1, (Bundle)localObject1);
      }
    }
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\CryptoService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */