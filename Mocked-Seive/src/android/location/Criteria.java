/*    */ package android.location;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Criteria
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ACCURACY_COARSE = 2;
/*    */   public static final int ACCURACY_FINE = 1;
/*    */   public static final int ACCURACY_HIGH = 3;
/*    */   public static final int ACCURACY_LOW = 1;
/*    */   public static final int ACCURACY_MEDIUM = 2;
/*    */   
/* 21 */   public Criteria() { throw new RuntimeException("Stub!"); }
/* 22 */   public Criteria(Criteria criteria) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setHorizontalAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getHorizontalAccuracy() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setVerticalAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getVerticalAccuracy() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setSpeedAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getSpeedAccuracy() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setBearingAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getBearingAccuracy() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setAccuracy(int accuracy) { throw new RuntimeException("Stub!"); }
/* 32 */   public int getAccuracy() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPowerRequirement(int level) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getPowerRequirement() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setCostAllowed(boolean costAllowed) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isCostAllowed() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setAltitudeRequired(boolean altitudeRequired) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isAltitudeRequired() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSpeedRequired(boolean speedRequired) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isSpeedRequired() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setBearingRequired(boolean bearingRequired) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isBearingRequired() { throw new RuntimeException("Stub!"); }
/* 43 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 44 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 56 */   public static final Parcelable.Creator<Criteria> CREATOR = null;
/*    */   public static final int NO_REQUIREMENT = 0;
/*    */   public static final int POWER_HIGH = 3;
/*    */   public static final int POWER_LOW = 1;
/*    */   public static final int POWER_MEDIUM = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\location\Criteria.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */