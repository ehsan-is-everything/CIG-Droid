/*    */ package android.print;
/*    */ 
/*    */ import android.app.PendingIntent;
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
/*    */ public final class PrinterInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(PrinterId printerId, String name, int status) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder(PrinterInfo other) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setStatus(int status) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setIconResourceId(int iconResourceId) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setHasCustomPrinterIcon(boolean hasCustomPrinterIcon) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setName(String name) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setDescription(String description) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setInfoIntent(PendingIntent infoIntent) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setCapabilities(PrinterCapabilitiesInfo capabilities) { throw new RuntimeException("Stub!"); }
/* 32 */     public PrinterInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   PrinterInfo() { throw new RuntimeException("Stub!"); }
/* 35 */   public PrinterId getId() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getStatus() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getDescription() { throw new RuntimeException("Stub!"); }
/* 39 */   public PrinterCapabilitiesInfo getCapabilities() { throw new RuntimeException("Stub!"); }
/* 40 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 41 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 42 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 44 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 49 */   public static final Parcelable.Creator<PrinterInfo> CREATOR = null;
/*    */   public static final int STATUS_BUSY = 2;
/*    */   public static final int STATUS_IDLE = 1;
/*    */   public static final int STATUS_UNAVAILABLE = 3;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\print\PrinterInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */