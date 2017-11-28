/*    */ package android.os;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResultReceiver
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ResultReceiver(Handler handler) { throw new RuntimeException("Stub!"); }
/* 22 */   public void send(int resultCode, Bundle resultData) { throw new RuntimeException("Stub!"); }
/* 23 */   protected void onReceiveResult(int resultCode, Bundle resultData) { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 27 */   public static final Parcelable.Creator<ResultReceiver> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\ResultReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */