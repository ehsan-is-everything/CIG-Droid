/*    */ package android.telephony;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ServiceState
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ServiceState() { throw new RuntimeException("Stub!"); }
/* 22 */   public ServiceState(ServiceState s) { throw new RuntimeException("Stub!"); }
/* 23 */   public ServiceState(Parcel in) { throw new RuntimeException("Stub!"); }
/* 24 */   protected void copyFrom(ServiceState s) { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean getRoaming() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getOperatorAlphaLong() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getOperatorAlphaShort() { throw new RuntimeException("Stub!"); }
/* 31 */   public String getOperatorNumeric() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean getIsManualSelection() { throw new RuntimeException("Stub!"); }
/* 33 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setStateOutOfService() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setStateOff() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setState(int state) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setRoaming(boolean roaming) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setOperatorName(String longName, String shortName, String numeric) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setIsManualSelection(boolean isManual) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 47 */   public static final Parcelable.Creator<ServiceState> CREATOR = null;
/*    */   public static final int STATE_EMERGENCY_ONLY = 2;
/*    */   public static final int STATE_IN_SERVICE = 0;
/*    */   public static final int STATE_OUT_OF_SERVICE = 1;
/*    */   public static final int STATE_POWER_OFF = 3;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\ServiceState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */