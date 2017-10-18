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
/*    */ public final class FillEventHistory
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Event
/*    */   {
/*    */     public static final int TYPE_AUTHENTICATION_SELECTED = 2;
/*    */     public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = 1;
/*    */     public static final int TYPE_DATASET_SELECTED = 0;
/*    */     public static final int TYPE_SAVE_SHOWN = 3;
/*    */     
/* 23 */     Event() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getType() { throw new RuntimeException("Stub!"); }
/* 25 */     public String getDatasetId() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 31 */   FillEventHistory() { throw new RuntimeException("Stub!"); }
/* 32 */   public Bundle getClientState() { throw new RuntimeException("Stub!"); }
/* 33 */   public List<Event> getEvents() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public static final Parcelable.Creator<FillEventHistory> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\autofill\FillEventHistory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */