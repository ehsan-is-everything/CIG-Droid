/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.content.IntentSender;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.autofill.AutofillId;
/*    */ import android.view.autofill.AutofillValue;
/*    */ import android.widget.RemoteViews;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Dataset
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(RemoteViews presentation) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setAuthentication(IntentSender authentication) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setId(String id) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setValue(AutofillId id, AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setValue(AutofillId id, AutofillValue value, RemoteViews presentation) { throw new RuntimeException("Stub!"); }
/* 29 */     public Dataset build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   Dataset() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public static final Parcelable.Creator<Dataset> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\autofill\Dataset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */