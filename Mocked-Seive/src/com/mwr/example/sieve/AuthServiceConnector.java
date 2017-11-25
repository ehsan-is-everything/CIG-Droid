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

public class AuthServiceConnector
  extends Handler
  implements ServiceConnection
{
  static final int MSG_CHECK = 5;
  static final int MSG_ERROR = 111111;
  static final int MSG_FIRST_LAUNCH = 3;
  static final int MSG_SET = 4;
  private static final String TAG = "m_AuthServiceConnector";
  static final int TYPE_HAS_KEY_HAS_PIN = 31;
  static final int TYPE_HAS_KEY_NO_PIN = 32;
  static final int TYPE_KEY = 42;
  static final int TYPE_MSG_UNDEFINED = 122222;
  static final int TYPE_NO_KEY_NO_PIN = 33;
  static final int TYPE_PIN = 41;
  ResponseListener activity;
  private boolean bound;
  private Messenger responseHandler;
  private Messenger serviceMessenger;
  
  public AuthServiceConnector(ResponseListener paramResponseListener)
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
      catch (RemoteException localRemoteException)
      {
        Log.e("m_AuthServiceConnector", "Unable to send message: " + paramMessage.what);
        this.activity.sendFailed();
        return;
      }
    }
    Log.e("m_AuthServiceConnector", "ERROR: We are not bound to Crypto!");
  }
  
  public void checkFirstLaunch()
  {
    sendToServer(Message.obtain(null, 4));
  }
  
  public void checkKey(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.PASSWORD", paramString);
    sendToServer(Message.obtain(null, 2354, 7452, 0, localBundle));
  }
  
  public void checkPin(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.PIN", paramString);
    sendToServer(Message.obtain(null, 2354, 9234, 0, localBundle));
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
    this.bound = false;
    this.activity.sendFailed();
  }
  
  public void setKey(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.PASSWORD", paramString);
    sendToServer(Message.obtain(null, 6345, 7452, 0, localBundle));
  }
  
  public void setPin(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mwr.example.sieve.PIN", paramString);
    sendToServer(Message.obtain(null, 6345, 9234, 0, localBundle));
  }
  
  private class MessageHandler
    extends Handler
  {
    public MessageHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      boolean bool2 = true;
      boolean bool3 = true;
      boolean bool4 = true;
      boolean bool1 = true;
      switch (paramMessage.what)
      {
      }
      for (;;)
      {
        Log.e("m_AuthServiceConnector", "Error: Recieved unrecognised Message, what: " + paramMessage.what + ", arg1: " + paramMessage.arg1);
        return;
        AuthServiceConnector.this.activity.firstLaunchResult(paramMessage.arg1);
        return;
        AuthServiceConnector.ResponseListener localResponseListener;
        switch (paramMessage.arg1)
        {
        default: 
          return;
        case 41: 
          localResponseListener = AuthServiceConnector.this.activity;
          if (paramMessage.arg2 != 0) {
            break;
          }
        }
        for (;;)
        {
          localResponseListener.setPinResult(bool1);
          return;
          localResponseListener = AuthServiceConnector.this.activity;
          if (paramMessage.arg2 == 0) {}
          for (bool1 = bool2;; bool1 = false)
          {
            localResponseListener.setKeyResult(bool1);
            return;
          }
          bool1 = false;
        }
        switch (paramMessage.arg1)
        {
        default: 
          return;
        case 41: 
          localResponseListener = AuthServiceConnector.this.activity;
          if (paramMessage.arg2 != 0) {
            break;
          }
        }
        for (bool1 = bool3;; bool1 = false)
        {
          localResponseListener.checkPinResult(bool1);
          return;
          localResponseListener = AuthServiceConnector.this.activity;
          if (paramMessage.arg2 == 0) {}
          for (bool1 = bool4;; bool1 = false)
          {
            localResponseListener.checkKeyResult(bool1);
            return;
          }
        }
        AuthServiceConnector.this.activity.sendFailed();
      }
    }
  }
  
  public static abstract interface ResponseListener
  {
    public abstract void checkKeyResult(boolean paramBoolean);
    
    public abstract void checkPinResult(boolean paramBoolean);
    
    public abstract void connected();
    
    public abstract void firstLaunchResult(int paramInt);
    
    public abstract void sendFailed();
    
    public abstract void setKeyResult(boolean paramBoolean);
    
    public abstract void setPinResult(boolean paramBoolean);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\AuthServiceConnector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */