package com.mwr.example.sieve;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public class CryptoServiceConnector
  extends Handler
  implements ServiceConnection
{
  static final int MSG_ERROR = 111111;
  static final int MSG_RESULT = 9;
  private static final String TAG = "m_CryptoServiceConnector";
  static final int TYPE_DECRYPT = 92;
  static final int TYPE_ENCRYPT = 91;
  ResponseListener activity;
  private boolean bound;
  private Messenger responseHandler;
  private Messenger serviceMessenger;
  
  public CryptoServiceConnector(ResponseListener paramResponseListener)
  {
    this.activity = paramResponseListener;
  }
  
  private void sendToServer(Message paramMessage)
  {
    if (this.bound) {
      try
      {
        paramMessage.replyTo = this.responseHandler;
        this.serviceMessenger.send(paramMessage);
        return;
      }
      catch (RemoteException paramMessage)
      {
        Log.e("m_CryptoServiceConnector", "Unable to send message to Service");
        this.activity.sendFailed();
        this.bound = false;
        return;
      }
    }
    Log.e("m_CryptoServiceConnector", "ERROR: We are not bound to Crypto!");
    this.activity.sendFailed();
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.serviceMessenger = new Messenger(paramIBinder);
    this.responseHandler = new Messenger(new MessageHandler());
    this.bound = true;
    this.activity.connected();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.activity.sendFailed();
    this.bound = false;
  }
  
  public void sendForDecryption(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.KEY", paramString);
    localBundle.putByteArray("com.mwr.example.sieve.PASSWORD", paramArrayOfByte);
    sendToServer(Message.obtain(null, 13476, paramInt, 0, localBundle));
  }
  
  public void sendForEncryption(String paramString1, String paramString2, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.KEY", paramString1);
    localBundle.putString("com.mwr.example.sieve.STRING", paramString2);
    sendToServer(Message.obtain(null, 3452, paramInt, 0, localBundle));
  }
  
  private class MessageHandler
    extends Handler
  {
    public MessageHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        return;
      case 9: 
        switch (paramMessage.arg1)
        {
        default: 
          return;
        case 91: 
          CryptoServiceConnector.this.activity.encryptionReturned(paramMessage.getData().getByteArray("com.mwr.example.sieve.RESULT"), paramMessage.arg2);
          return;
        }
        CryptoServiceConnector.this.activity.decryptionReturned(paramMessage.getData().getString("com.mwr.example.sieve.RESULT"), paramMessage.arg2);
        return;
      }
      CryptoServiceConnector.this.activity.sendFailed();
    }
  }
  
  public static abstract interface ResponseListener
  {
    public abstract void connected();
    
    public abstract void decryptionReturned(String paramString, int paramInt);
    
    public abstract void encryptionReturned(byte[] paramArrayOfByte, int paramInt);
    
    public abstract void sendFailed();
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\CryptoServiceConnector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */