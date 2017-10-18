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
/*    */ public final class SaveRequest
/*    */   implements Parcelable
/*    */ {
/* 21 */   SaveRequest() { throw new RuntimeException("Stub!"); }
/* 22 */   public List<FillContext> getFillContexts() { throw new RuntimeException("Stub!"); }
/* 23 */   public Bundle getClientState() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 27 */   public static final Parcelable.Creator<SaveRequest> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\autofill\SaveRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */