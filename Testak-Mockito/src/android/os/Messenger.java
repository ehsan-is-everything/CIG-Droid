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
/*    */ public final class Messenger
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Messenger(Handler target) { throw new RuntimeException("Stub!"); }
/* 22 */   public Messenger(IBinder target) { throw new RuntimeException("Stub!"); }
/* 23 */   public void send(Message message) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 24 */   public IBinder getBinder() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); }
/* 26 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public static void writeMessengerOrNullToParcel(Messenger messenger, Parcel out) { throw new RuntimeException("Stub!"); }
/* 30 */   public static Messenger readMessengerOrNullFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/* 32 */   public static final Parcelable.Creator<Messenger> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\Messenger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */