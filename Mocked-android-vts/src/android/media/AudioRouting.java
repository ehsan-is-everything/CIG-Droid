package android.media;

import android.os.Handler;

public abstract interface AudioRouting
{
  public abstract boolean setPreferredDevice(AudioDeviceInfo paramAudioDeviceInfo);
  
  public abstract AudioDeviceInfo getPreferredDevice();
  
  public abstract AudioDeviceInfo getRoutedDevice();
  
  public abstract void addOnRoutingChangedListener(OnRoutingChangedListener paramOnRoutingChangedListener, Handler paramHandler);
  
  public abstract void removeOnRoutingChangedListener(OnRoutingChangedListener paramOnRoutingChangedListener);
  
  public static abstract interface OnRoutingChangedListener
  {
    public abstract void onRoutingChanged(AudioRouting paramAudioRouting);
  }
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\AudioRouting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */