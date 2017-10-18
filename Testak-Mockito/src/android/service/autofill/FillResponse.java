/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.content.IntentSender;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.autofill.AutofillId;
/*    */ import android.widget.RemoteViews;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FillResponse
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setAuthentication(AutofillId[] ids, IntentSender authentication, RemoteViews presentation) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setIgnoredIds(AutofillId... ids) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder addDataset(Dataset dataset) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setSaveInfo(SaveInfo saveInfo) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setClientState(Bundle clientState) { throw new RuntimeException("Stub!"); }
/* 29 */     public FillResponse build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   FillResponse() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public static final Parcelable.Creator<FillResponse> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\autofill\FillResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */