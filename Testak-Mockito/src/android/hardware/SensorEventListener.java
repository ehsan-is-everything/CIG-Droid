package android.hardware;

public abstract interface SensorEventListener
{
  public abstract void onSensorChanged(SensorEvent paramSensorEvent);
  
  public abstract void onAccuracyChanged(Sensor paramSensor, int paramInt);
}


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\SensorEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */