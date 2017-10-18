/*    */ package android.provider;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.content.ContentProviderClient;
/*    */ import android.content.ContentProviderOperation;
/*    */ import android.net.Uri;
/*    */ import android.os.RemoteException;
/*    */ import android.util.Pair;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SyncStateContract
/*    */ {
/*    */   public static abstract interface Columns
/*    */     extends BaseColumns
/*    */   {
/*    */     public static final String ACCOUNT_NAME = "account_name";
/*    */     public static final String ACCOUNT_TYPE = "account_type";
/*    */     public static final String DATA = "data";
/*    */   }
/*    */   
/*    */   public static class Constants
/*    */     implements SyncStateContract.Columns
/*    */   {
/*    */     public static final String CONTENT_DIRECTORY = "syncstate";
/*    */     
/*    */     public Constants()
/*    */     {
/* 30 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class Helpers {
/* 35 */     public Helpers() { throw new RuntimeException("Stub!"); }
/* 36 */     public static byte[] get(ContentProviderClient provider, Uri uri, Account account) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 37 */     public static void set(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 38 */     public static Uri insert(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 39 */     public static void update(ContentProviderClient provider, Uri uri, byte[] data) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 40 */     public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Uri uri, Account account) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 41 */     public static ContentProviderOperation newSetOperation(Uri uri, Account account, byte[] data) { throw new RuntimeException("Stub!"); }
/* 42 */     public static ContentProviderOperation newUpdateOperation(Uri uri, byte[] data) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 44 */   public SyncStateContract() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\provider\SyncStateContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */