/*    */ package android.print;
/*    */ 
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
/*    */ 
/*    */ public final class PrinterCapabilitiesInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(PrinterId printerId) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder addMediaSize(PrintAttributes.MediaSize mediaSize, boolean isDefault) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder addResolution(PrintAttributes.Resolution resolution, boolean isDefault) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setMinMargins(PrintAttributes.Margins margins) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setColorModes(int colorModes, int defaultColorMode) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setDuplexModes(int duplexModes, int defaultDuplexMode) { throw new RuntimeException("Stub!"); }
/* 29 */     public PrinterCapabilitiesInfo build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   PrinterCapabilitiesInfo() { throw new RuntimeException("Stub!"); }
/* 32 */   public List<PrintAttributes.MediaSize> getMediaSizes() { throw new RuntimeException("Stub!"); }
/* 33 */   public List<PrintAttributes.Resolution> getResolutions() { throw new RuntimeException("Stub!"); }
/* 34 */   public PrintAttributes.Margins getMinMargins() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getColorModes() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getDuplexModes() { throw new RuntimeException("Stub!"); }
/* 37 */   public PrintAttributes getDefaults() { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public static final Parcelable.Creator<PrinterCapabilitiesInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\print\PrinterCapabilitiesInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */