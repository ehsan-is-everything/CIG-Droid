/*     */ package android.print;
/*     */ 
/*     */ import android.content.pm.PackageManager;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PrintAttributes
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int COLOR_MODE_COLOR = 2;
/*     */   public static final int COLOR_MODE_MONOCHROME = 1;
/*     */   
/*     */   public static final class MediaSize
/*     */   {
/*  23 */     public MediaSize(String id, String label, int widthMils, int heightMils) { throw new RuntimeException("Stub!"); }
/*  24 */     public String getId() { throw new RuntimeException("Stub!"); }
/*  25 */     public String getLabel(PackageManager packageManager) { throw new RuntimeException("Stub!"); }
/*  26 */     public int getWidthMils() { throw new RuntimeException("Stub!"); }
/*  27 */     public int getHeightMils() { throw new RuntimeException("Stub!"); }
/*  28 */     public boolean isPortrait() { throw new RuntimeException("Stub!"); }
/*  29 */     public MediaSize asPortrait() { throw new RuntimeException("Stub!"); }
/*  30 */     public MediaSize asLandscape() { throw new RuntimeException("Stub!"); }
/*  31 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  32 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  33 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */     public static final MediaSize UNKNOWN_PORTRAIT = null; public static final MediaSize UNKNOWN_LANDSCAPE = null; public static final MediaSize ROC_8K = null; public static final MediaSize ROC_16K = null; public static final MediaSize PRC_9 = null; public static final MediaSize PRC_8 = null; public static final MediaSize PRC_7 = null; public static final MediaSize PRC_6 = null; public static final MediaSize PRC_5 = null; public static final MediaSize PRC_4 = null; public static final MediaSize PRC_3 = null; public static final MediaSize PRC_2 = null; public static final MediaSize PRC_16K = null; public static final MediaSize PRC_10 = null; public static final MediaSize PRC_1 = null; public static final MediaSize OM_PA_KAI = null; public static final MediaSize OM_JUURO_KU_KAI = null; public static final MediaSize OM_DAI_PA_KAI = null; public static final MediaSize NA_TABLOID = null; public static final MediaSize NA_QUARTO = null; public static final MediaSize NA_MONARCH = null; public static final MediaSize NA_LETTER = null; public static final MediaSize NA_LEGAL = null; public static final MediaSize NA_LEDGER = null; public static final MediaSize NA_JUNIOR_LEGAL = null; public static final MediaSize NA_INDEX_5X8 = null; public static final MediaSize NA_INDEX_4X6 = null; public static final MediaSize NA_INDEX_3X5 = null; public static final MediaSize NA_GOVT_LETTER = null; public static final MediaSize NA_FOOLSCAP = null; public static final MediaSize JPN_YOU4 = null; public static final MediaSize JPN_OUFUKU = null; public static final MediaSize JPN_KAKU2 = null; public static final MediaSize JPN_KAHU = null; public static final MediaSize JPN_HAGAKI = null; public static final MediaSize JPN_CHOU4 = null; public static final MediaSize JPN_CHOU3 = null; public static final MediaSize JPN_CHOU2 = null; public static final MediaSize JIS_EXEC = null; public static final MediaSize JIS_B9 = null; public static final MediaSize JIS_B8 = null; public static final MediaSize JIS_B7 = null; public static final MediaSize JIS_B6 = null; public static final MediaSize JIS_B5 = null; public static final MediaSize JIS_B4 = null; public static final MediaSize JIS_B3 = null; public static final MediaSize JIS_B2 = null; public static final MediaSize JIS_B10 = null; public static final MediaSize JIS_B1 = null; public static final MediaSize JIS_B0 = null; public static final MediaSize ISO_C9 = null; public static final MediaSize ISO_C8 = null; public static final MediaSize ISO_C7 = null; public static final MediaSize ISO_C6 = null; public static final MediaSize ISO_C5 = null; public static final MediaSize ISO_C4 = null; public static final MediaSize ISO_C3 = null; public static final MediaSize ISO_C2 = null; public static final MediaSize ISO_C10 = null; public static final MediaSize ISO_C1 = null; public static final MediaSize ISO_C0 = null; public static final MediaSize ISO_B9 = null; public static final MediaSize ISO_B8 = null; public static final MediaSize ISO_B7 = null; public static final MediaSize ISO_B6 = null; public static final MediaSize ISO_B5 = null; public static final MediaSize ISO_B4 = null; public static final MediaSize ISO_B3 = null; public static final MediaSize ISO_B2 = null; public static final MediaSize ISO_B10 = null; public static final MediaSize ISO_B1 = null; public static final MediaSize ISO_B0 = null; public static final MediaSize ISO_A9 = null; public static final MediaSize ISO_A8 = null; public static final MediaSize ISO_A7 = null; public static final MediaSize ISO_A6 = null; public static final MediaSize ISO_A5 = null; public static final MediaSize ISO_A4 = null; public static final MediaSize ISO_A3 = null; public static final MediaSize ISO_A2 = null; public static final MediaSize ISO_A10 = null; public static final MediaSize ISO_A1 = null; public static final MediaSize ISO_A0 = null;
/*     */   }
/*     */   
/*     */   public static final class Resolution {
/* 121 */     public Resolution(String id, String label, int horizontalDpi, int verticalDpi) { throw new RuntimeException("Stub!"); }
/* 122 */     public String getId() { throw new RuntimeException("Stub!"); }
/* 123 */     public String getLabel() { throw new RuntimeException("Stub!"); }
/* 124 */     public int getHorizontalDpi() { throw new RuntimeException("Stub!"); }
/* 125 */     public int getVerticalDpi() { throw new RuntimeException("Stub!"); }
/* 126 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 127 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 128 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class Margins {
/* 132 */     public Margins(int leftMils, int topMils, int rightMils, int bottomMils) { throw new RuntimeException("Stub!"); }
/* 133 */     public int getLeftMils() { throw new RuntimeException("Stub!"); }
/* 134 */     public int getTopMils() { throw new RuntimeException("Stub!"); }
/* 135 */     public int getRightMils() { throw new RuntimeException("Stub!"); }
/* 136 */     public int getBottomMils() { throw new RuntimeException("Stub!"); }
/* 137 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 138 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 139 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/* 141 */     public static final Margins NO_MARGINS = null;
/*     */   }
/*     */   
/*     */   public static final class Builder {
/* 145 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 146 */     public Builder setMediaSize(PrintAttributes.MediaSize mediaSize) { throw new RuntimeException("Stub!"); }
/* 147 */     public Builder setResolution(PrintAttributes.Resolution resolution) { throw new RuntimeException("Stub!"); }
/* 148 */     public Builder setMinMargins(PrintAttributes.Margins margins) { throw new RuntimeException("Stub!"); }
/* 149 */     public Builder setColorMode(int colorMode) { throw new RuntimeException("Stub!"); }
/* 150 */     public Builder setDuplexMode(int duplexMode) { throw new RuntimeException("Stub!"); }
/* 151 */     public PrintAttributes build() { throw new RuntimeException("Stub!"); } }
/*     */   
/* 153 */   PrintAttributes() { throw new RuntimeException("Stub!"); }
/* 154 */   public MediaSize getMediaSize() { throw new RuntimeException("Stub!"); }
/* 155 */   public Resolution getResolution() { throw new RuntimeException("Stub!"); }
/* 156 */   public Margins getMinMargins() { throw new RuntimeException("Stub!"); }
/* 157 */   public int getColorMode() { throw new RuntimeException("Stub!"); }
/* 158 */   public int getDuplexMode() { throw new RuntimeException("Stub!"); }
/* 159 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 160 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 161 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 162 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 163 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */   public static final Parcelable.Creator<PrintAttributes> CREATOR = null;
/*     */   public static final int DUPLEX_MODE_LONG_EDGE = 2;
/*     */   public static final int DUPLEX_MODE_NONE = 1;
/*     */   public static final int DUPLEX_MODE_SHORT_EDGE = 4;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\print\PrintAttributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */