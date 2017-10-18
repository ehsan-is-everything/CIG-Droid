/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.IBinder;
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
/*    */ public final class InputBinding
/*    */   implements Parcelable
/*    */ {
/* 21 */   public InputBinding(InputConnection conn, IBinder connToken, int uid, int pid) { throw new RuntimeException("Stub!"); }
/* 22 */   public InputBinding(InputConnection conn, InputBinding binding) { throw new RuntimeException("Stub!"); }
/* 23 */   public InputConnection getConnection() { throw new RuntimeException("Stub!"); }
/* 24 */   public IBinder getConnectionToken() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getUid() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getPid() { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public static final Parcelable.Creator<InputBinding> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\InputBinding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */