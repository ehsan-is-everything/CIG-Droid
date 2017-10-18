/*    */ package android.provider;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public class FontsContract
/*    */ {
/*    */   public static final class Columns implements BaseColumns
/*    */   {
/*    */     public static final String FILE_ID = "file_id";
/*    */     public static final String ITALIC = "font_italic";
/*    */     public static final String RESULT_CODE = "result_code";
/*    */     public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
/*    */     public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
/*    */     public static final int RESULT_CODE_MALFORMED_QUERY = 3;
/*    */     public static final int RESULT_CODE_OK = 0;
/*    */     public static final String TTC_INDEX = "font_ttc_index";
/*    */     public static final String VARIATION_SETTINGS = "font_variation_settings";
/*    */     public static final String WEIGHT = "font_weight";
/*    */     
/*    */     Columns()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static class FontInfo
/*    */   {
/* 36 */     FontInfo() { throw new RuntimeException("Stub!"); }
/* 37 */     public android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
/* 38 */     public int getTtcIndex() { throw new RuntimeException("Stub!"); }
/* 39 */     public android.graphics.fonts.FontVariationAxis[] getAxes() { throw new RuntimeException("Stub!"); }
/* 40 */     public int getWeight() { throw new RuntimeException("Stub!"); }
/* 41 */     public boolean isItalic() { throw new RuntimeException("Stub!"); }
/* 42 */     public int getResultCode() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static class FontFamilyResult { public static final int STATUS_OK = 0;
/*    */     
/* 46 */     FontFamilyResult() { throw new RuntimeException("Stub!"); }
/* 47 */     public int getStatusCode() { throw new RuntimeException("Stub!"); }
/* 48 */     public FontsContract.FontInfo[] getFonts() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int STATUS_REJECTED = 3;
/*    */     public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
/*    */     public static final int STATUS_WRONG_CERTIFICATES = 1; }
/*    */   
/*    */   public static class FontRequestCallback { public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
/*    */     
/* 56 */     public FontRequestCallback() { throw new RuntimeException("Stub!"); }
/* 57 */     public void onTypefaceRetrieved(android.graphics.Typeface typeface) { throw new RuntimeException("Stub!"); }
/* 58 */     public void onTypefaceRequestFailed(int reason) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
/*    */     public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
/*    */     public static final int FAIL_REASON_MALFORMED_QUERY = 3;
/*    */     public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
/*    */     public static final int FAIL_REASON_WRONG_CERTIFICATES = -2; }
/*    */   
/* 66 */   FontsContract() { throw new RuntimeException("Stub!"); }
/* 67 */   public static void requestFonts(Context context, FontRequest request, android.os.Handler handler, android.os.CancellationSignal cancellationSignal, FontRequestCallback callback) { throw new RuntimeException("Stub!"); }
/* 68 */   public static FontFamilyResult fetchFonts(Context context, android.os.CancellationSignal cancellationSignal, FontRequest request) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 69 */   public static android.graphics.Typeface buildTypeface(Context context, android.os.CancellationSignal cancellationSignal, FontInfo[] fonts) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\provider\FontsContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */