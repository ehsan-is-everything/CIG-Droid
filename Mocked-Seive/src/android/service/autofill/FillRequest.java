/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
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
/*    */ public final class FillRequest
/*    */   implements Parcelable
/*    */ {
/* 21 */   FillRequest() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/* 24 */   public List<FillContext> getFillContexts() { throw new RuntimeException("Stub!"); }
/* 25 */   public Bundle getClientState() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 30 */   public static final Parcelable.Creator<FillRequest> CREATOR = null;
/*    */   public static final int FLAG_MANUAL_REQUEST = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\autofill\FillRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */