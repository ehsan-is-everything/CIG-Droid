/*    */ package android.media.midi;
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
/*    */ public final class MidiDeviceStatus
/*    */   implements Parcelable
/*    */ {
/* 21 */   MidiDeviceStatus() { throw new RuntimeException("Stub!"); }
/* 22 */   public MidiDeviceInfo getDeviceInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isInputPortOpen(int portNumber) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getOutputPortOpenCount(int portNumber) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public static final Parcelable.Creator<MidiDeviceStatus> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\midi\MidiDeviceStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */