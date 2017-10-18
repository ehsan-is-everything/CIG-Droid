/*    */ package android.provider;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ public class BlockedNumberContract
/*    */ {
/*    */   public static final String AUTHORITY = "com.android.blockednumber";
/*    */   
/*    */   public static class BlockedNumbers
/*    */   {
/*    */     public static final String COLUMN_E164_NUMBER = "e164_number";
/*    */     public static final String COLUMN_ID = "_id";
/*    */     public static final String COLUMN_ORIGINAL_NUMBER = "original_number";
/*    */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/blocked_number";
/*    */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/blocked_number";
/*    */     
/*    */     BlockedNumbers()
/*    */     {
/* 21 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 28 */     public static final Uri CONTENT_URI = null; }
/*    */   
/* 30 */   BlockedNumberContract() { throw new RuntimeException("Stub!"); }
/* 31 */   public static boolean isBlocked(Context context, String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 32 */   public static int unblock(Context context, String phoneNumber) { throw new RuntimeException("Stub!"); }
/* 33 */   public static boolean canCurrentUserBlockNumbers(Context context) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 36 */   public static final Uri AUTHORITY_URI = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\provider\BlockedNumberContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */