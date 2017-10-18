/*    */ package android.location;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class GnssMeasurementsEvent
/*    */   implements Parcelable
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/*    */     public static final int STATUS_LOCATION_DISABLED = 2;
/*    */     public static final int STATUS_NOT_SUPPORTED = 0;
/*    */     public static final int STATUS_READY = 1;
/*    */     
/* 23 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onStatusChanged(int status) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 30 */   GnssMeasurementsEvent() { throw new RuntimeException("Stub!"); }
/* 31 */   public GnssClock getClock() { throw new RuntimeException("Stub!"); }
/* 32 */   public Collection<GnssMeasurement> getMeasurements() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public static final Parcelable.Creator<GnssMeasurementsEvent> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\GnssMeasurementsEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */