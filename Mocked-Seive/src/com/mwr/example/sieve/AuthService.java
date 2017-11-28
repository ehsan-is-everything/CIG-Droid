package com.mwr.example.sieve;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;

public class AuthService
  extends Service
{
  static final int MSG_CHECK = 2354;
  static final int MSG_CHECK_IF_INITALISED = 2;
  static final int MSG_FIRST_LAUNCH = 4;
  static final int MSG_SAY_HELLO = 1;
  static final int MSG_SET = 6345;
  static final int MSG_UNREGISTER = -1;
  public static final String PASSWORD = "com.mwr.example.sieve.PASSWORD";
  public static final String PIN = "com.mwr.example.sieve.PIN";
  private static final String TAG = "m_AuthService";
  static final int TYPE_KEY = 7452;
  static final int TYPE_PIN = 9234;
  private int NOTIFICATION = 2131034112;
  private NotificationManager nManager;
  private Messenger responseHandler;
  private Messenger serviceHandler;
  private Looper serviceLooper;
  
  private String getKey()
  {
    Cursor localCursor = new CursorLoader(this, DBContentProvider.KEYS_URI, new String[] { "Password" }, null, null, null).loadInBackground();
    localCursor.moveToFirst();
    return localCursor.getString(localCursor.getColumnIndex("Password"));
  }
  
  private boolean setKey(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("Password", paramString);
    return getContentResolver().insert(DBContentProvider.KEYS_URI, localContentValues) != null;
  }
  
  private boolean setPin(String paramString)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("pin", paramString);
    return getContentResolver().update(DBContentProvider.KEYS_URI, localContentValues, "pin IS NULL", null) > 0;
  }
  
  private void showNotification()
  {
    NotificationCompat.Builder localBuilder = new NotificationCompat.Builder(this).setSmallIcon(2130837504).setContentTitle(getText(2131034112)).setOngoing(true).setContentText("Click to access your passwords");
    Intent localIntent = new Intent(this, MainLoginActivity.class);
    localIntent.addFlags(1048576);
    localBuilder.setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, localIntent, 268435456));
    this.nManager.notify(this.NOTIFICATION, localBuilder.build());
  }
  
  private boolean verifyKey(String paramString)
  {
    return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[] { "Password" }, "Password = ?", new String[] { paramString }, null).loadInBackground().getCount() == 1;
  }
  
  private boolean verifyPin(String paramString)
  {
    return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[] { "pin" }, "pin = ?", new String[] { paramString }, null).loadInBackground().getCount() == 1;
  }
  
  public boolean checkKeyExists()
  {
    return new CursorLoader(this, DBContentProvider.KEYS_URI, new String[] { "Password" }, null, null, null).loadInBackground().getCount() > 0;
  }
  
  public boolean checkPinExists()
  {
    Cursor localCursor = new CursorLoader(this, DBContentProvider.KEYS_URI, new String[] { "pin" }, null, null, null).loadInBackground();
    boolean bool = false;
    localCursor.moveToFirst();
    int i = 0;
    if (i >= localCursor.getCount()) {
      return bool;
    }
    if (localCursor.getString(localCursor.getColumnIndex("pin")) != null) {}
    for (bool = true;; bool = false)
    {
      i += 1;
      break;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.serviceHandler.getBinder();
  }
  
  public void onCreate()
  {
    this.nManager = ((NotificationManager)getSystemService("notification"));
    HandlerThread localHandlerThread = new HandlerThread("m_AuthService", 10);
    localHandlerThread.start();
    this.serviceLooper = localHandlerThread.getLooper();
    this.serviceHandler = new Messenger(new MessageHandler(this.serviceLooper));
  }
  
  public void onDestroy()
  {
    this.nManager.cancelAll();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 1;
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
        AuthService.this.responseHandler.send(localMessage);
        return;
      }
      catch (RemoteException paramBundle)
      {
        Log.e("m_AuthService", "Unable to send message: " + paramInt1);
      }
    }
    
    private void sendUnrecognisedMessage()
    {
      try
      {
        Message localMessage = Message.obtain(null, 111111, 122222, 1, null);
        AuthService.this.responseHandler.send(localMessage);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("m_AuthService", "Unable to send message");
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      AuthService.this.responseHandler = paramMessage.replyTo;
      Bundle localBundle = (Bundle)paramMessage.obj;
      int j;
      int i;
      switch (paramMessage.what)
      {
      default: 
        Log.e("m_AuthService", "Error: unrecognized command: " + paramMessage.what);
        sendUnrecognisedMessage();
        super.handleMessage(paramMessage);
        return;
      case 2354: 
        if (paramMessage.arg1 == 7452)
        {
          j = 42;
          paramMessage = localBundle.getString("com.mwr.example.sieve.PASSWORD");
          if (AuthService.this.verifyKey(paramMessage))
          {
            AuthService.this.showNotification();
            i = 0;
            paramMessage = localBundle;
          }
        }
        for (;;)
        {
          sendResponseMessage(5, j, i, paramMessage);
          return;
          i = 1;
          paramMessage = localBundle;
          continue;
          if (paramMessage.arg1 != 9234) {
            break;
          }
          j = 41;
          paramMessage = localBundle.getString("com.mwr.example.sieve.PIN");
          if (AuthService.this.verifyPin(paramMessage))
          {
            paramMessage = new Bundle();
            paramMessage.putString("com.mwr.example.sieve.PASSWORD", AuthService.this.getKey());
            i = 0;
          }
          else
          {
            i = 1;
            paramMessage = localBundle;
          }
        }
        sendUnrecognisedMessage();
        return;
      case 4: 
        if (AuthService.this.checkKeyExists()) {
          if (AuthService.this.checkPinExists()) {
            i = 31;
          }
        }
        for (;;)
        {
          sendResponseMessage(3, i, 1, null);
          return;
          i = 32;
          continue;
          i = 33;
        }
      }
      if (paramMessage.arg1 == 7452)
      {
        j = 42;
        paramMessage = localBundle.getString("com.mwr.example.sieve.PASSWORD");
        if (AuthService.this.setKey(paramMessage)) {
          i = 0;
        }
      }
      for (;;)
      {
        sendResponseMessage(4, j, i, null);
        return;
        i = 1;
        continue;
        if (paramMessage.arg1 != 9234) {
          break;
        }
        j = 41;
        paramMessage = localBundle.getString("com.mwr.example.sieve.PIN");
        if (AuthService.this.setPin(paramMessage)) {
          i = 0;
        } else {
          i = 1;
        }
      }
      sendUnrecognisedMessage();
    }
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\classes-dex2jar.jar!\com\mwr\example\sieve\AuthService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */