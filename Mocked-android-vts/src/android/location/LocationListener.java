package android.location;

import android.os.Bundle;

public abstract interface LocationListener
{
  public abstract void onLocationChanged(Location paramLocation);
  
  public abstract void onStatusChanged(String paramString, int paramInt, Bundle paramBundle);
  
  public abstract void onProviderEnabled(String paramString);
  
  public abstract void onProviderDisabled(String paramString);
}


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\location\LocationListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */