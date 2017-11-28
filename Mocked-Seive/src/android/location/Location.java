/*    */ package android.location;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Location
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Location(String provider) { throw new RuntimeException("Stub!"); }
/* 22 */   public Location(Location l) { throw new RuntimeException("Stub!"); }
/* 23 */   public void set(Location l) { throw new RuntimeException("Stub!"); }
/* 24 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 25 */   public static String convert(double coordinate, int outputType) { throw new RuntimeException("Stub!"); }
/* 26 */   public static double convert(String coordinate) { throw new RuntimeException("Stub!"); }
/* 27 */   public static void distanceBetween(double startLatitude, double startLongitude, double endLatitude, double endLongitude, float[] results) { throw new RuntimeException("Stub!"); }
/* 28 */   public float distanceTo(Location dest) { throw new RuntimeException("Stub!"); }
/* 29 */   public float bearingTo(Location dest) { throw new RuntimeException("Stub!"); }
/* 30 */   public String getProvider() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setProvider(String provider) { throw new RuntimeException("Stub!"); }
/* 32 */   public long getTime() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTime(long time) { throw new RuntimeException("Stub!"); }
/* 34 */   public long getElapsedRealtimeNanos() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setElapsedRealtimeNanos(long time) { throw new RuntimeException("Stub!"); }
/* 36 */   public double getLatitude() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setLatitude(double latitude) { throw new RuntimeException("Stub!"); }
/* 38 */   public double getLongitude() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setLongitude(double longitude) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean hasAltitude() { throw new RuntimeException("Stub!"); }
/* 41 */   public double getAltitude() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setAltitude(double altitude) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public void removeAltitude() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean hasSpeed() { throw new RuntimeException("Stub!"); }
/* 46 */   public float getSpeed() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setSpeed(float speed) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 49 */   public void removeSpeed() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean hasBearing() { throw new RuntimeException("Stub!"); }
/* 51 */   public float getBearing() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setBearing(float bearing) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public void removeBearing() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean hasAccuracy() { throw new RuntimeException("Stub!"); }
/* 56 */   public float getAccuracy() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setAccuracy(float horizontalAccuracy) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 59 */   public void removeAccuracy() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean hasVerticalAccuracy() { throw new RuntimeException("Stub!"); }
/* 61 */   public float getVerticalAccuracyMeters() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setVerticalAccuracyMeters(float verticalAccuracyMeters) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean hasSpeedAccuracy() { throw new RuntimeException("Stub!"); }
/* 64 */   public float getSpeedAccuracyMetersPerSecond() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setSpeedAccuracyMetersPerSecond(float speedAccuracyMeterPerSecond) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean hasBearingAccuracy() { throw new RuntimeException("Stub!"); }
/* 67 */   public float getBearingAccuracyDegrees() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setBearingAccuracyDegrees(float bearingAccuracyDegrees) { throw new RuntimeException("Stub!"); }
/* 69 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 70 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 71 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 72 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 73 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 74 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean isFromMockProvider() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 80 */   public static final Parcelable.Creator<Location> CREATOR = null;
/*    */   public static final int FORMAT_DEGREES = 0;
/*    */   public static final int FORMAT_MINUTES = 1;
/*    */   public static final int FORMAT_SECONDS = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\location\Location.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */