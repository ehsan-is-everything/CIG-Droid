/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.content.IntentSender;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.view.autofill.AutofillId;
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
/*    */ public final class SaveInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(int type, AutofillId[] requiredIds) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setOptionalIds(AutofillId[] ids) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setNegativeAction(int style, IntentSender listener) { throw new RuntimeException("Stub!"); }
/* 28 */     public SaveInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 30 */   SaveInfo() { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 32 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
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
/* 44 */   public static final Parcelable.Creator<SaveInfo> CREATOR = null;
/*    */   public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = 1;
/*    */   public static final int NEGATIVE_BUTTON_STYLE_CANCEL = 0;
/*    */   public static final int NEGATIVE_BUTTON_STYLE_REJECT = 1;
/*    */   public static final int SAVE_DATA_TYPE_ADDRESS = 2;
/*    */   public static final int SAVE_DATA_TYPE_CREDIT_CARD = 4;
/*    */   public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = 16;
/*    */   public static final int SAVE_DATA_TYPE_GENERIC = 0;
/*    */   public static final int SAVE_DATA_TYPE_PASSWORD = 1;
/*    */   public static final int SAVE_DATA_TYPE_USERNAME = 8;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\autofill\SaveInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */