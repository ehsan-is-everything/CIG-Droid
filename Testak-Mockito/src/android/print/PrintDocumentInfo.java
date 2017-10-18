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
/*    */ public final class PrintDocumentInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CONTENT_TYPE_DOCUMENT = 0;
/*    */   public static final int CONTENT_TYPE_PHOTO = 1;
/*    */   public static final int CONTENT_TYPE_UNKNOWN = -1;
/*    */   
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(String name) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setPageCount(int pageCount) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setContentType(int type) { throw new RuntimeException("Stub!"); }
/* 26 */     public PrintDocumentInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   PrintDocumentInfo() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getPageCount() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getContentType() { throw new RuntimeException("Stub!"); }
/* 32 */   public long getDataSize() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 37 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 43 */   public static final Parcelable.Creator<PrintDocumentInfo> CREATOR = null;
/*    */   public static final int PAGE_COUNT_UNKNOWN = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\print\PrintDocumentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */