package android.hardware;

@Deprecated
public abstract interface SensorListener
{
  public abstract void onSensorChanged(int paramInt, float[] paramArrayOfFloat);
  
  public abstract void onAccuracyChanged(int paramInt1, int paramInt2);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\SensorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */