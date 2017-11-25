/*    */ package android.print;
/*    */ 
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
/*    */ 
/*    */ public final class PrintJobInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(PrintJobInfo prototype) { throw new RuntimeException("Stub!"); }
/* 24 */     public void setCopies(int copies) { throw new RuntimeException("Stub!"); }
/* 25 */     public void setAttributes(PrintAttributes attributes) { throw new RuntimeException("Stub!"); }
/* 26 */     public void setPages(PageRange[] pages) { throw new RuntimeException("Stub!"); }
/* 27 */     public void putAdvancedOption(String key, String value) { throw new RuntimeException("Stub!"); }
/* 28 */     public void putAdvancedOption(String key, int value) { throw new RuntimeException("Stub!"); }
/* 29 */     public PrintJobInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   PrintJobInfo() { throw new RuntimeException("Stub!"); }
/* 32 */   public PrintJobId getId() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getLabel() { throw new RuntimeException("Stub!"); }
/* 34 */   public PrinterId getPrinterId() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 36 */   public long getCreationTime() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getCopies() { throw new RuntimeException("Stub!"); }
/* 38 */   public PageRange[] getPages() { throw new RuntimeException("Stub!"); }
/* 39 */   public PrintAttributes getAttributes() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean hasAdvancedOption(String key) { throw new RuntimeException("Stub!"); }
/* 41 */   public String getAdvancedStringOption(String key) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getAdvancedIntOption(String key) { throw new RuntimeException("Stub!"); }
/* 43 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 44 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */   public static final Parcelable.Creator<PrintJobInfo> CREATOR = null;
/*    */   public static final int STATE_BLOCKED = 4;
/*    */   public static final int STATE_CANCELED = 7;
/*    */   public static final int STATE_COMPLETED = 5;
/*    */   public static final int STATE_CREATED = 1;
/*    */   public static final int STATE_FAILED = 6;
/*    */   public static final int STATE_QUEUED = 2;
/*    */   public static final int STATE_STARTED = 3;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\print\PrintJobInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */