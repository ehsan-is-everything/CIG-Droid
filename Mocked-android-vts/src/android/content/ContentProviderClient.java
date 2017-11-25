/*    */ package android.content;
/*    */ 
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.RemoteException;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ContentProviderClient
/*    */   implements AutoCloseable
/*    */ {
/* 21 */   ContentProviderClient() { throw new RuntimeException("Stub!"); }
/* 22 */   public Cursor query(Uri url, String[] projection, String selection, String[] selectionArgs, String sortOrder) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 23 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 24 */   public Cursor query(Uri uri, String[] projection, Bundle queryArgs, CancellationSignal cancellationSignal) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 25 */   public String getType(Uri url) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 26 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 27 */   public final Uri canonicalize(Uri url) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 28 */   public final Uri uncanonicalize(Uri url) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean refresh(Uri url, Bundle args, CancellationSignal cancellationSignal) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 30 */   public Uri insert(Uri url, ContentValues initialValues) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 31 */   public int bulkInsert(Uri url, ContentValues[] initialValues) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 32 */   public int delete(Uri url, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 33 */   public int update(Uri url, ContentValues values, String selection, String[] selectionArgs) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 34 */   public ParcelFileDescriptor openFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public ParcelFileDescriptor openFile(Uri url, String mode, CancellationSignal signal) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */   public AssetFileDescriptor openAssetFile(Uri url, String mode) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */   public AssetFileDescriptor openAssetFile(Uri url, String mode, CancellationSignal signal) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 38 */   public final AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, Bundle opts) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 39 */   public final AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, Bundle opts, CancellationSignal signal) throws RemoteException, FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 40 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws RemoteException, OperationApplicationException { throw new RuntimeException("Stub!"); }
/* 41 */   public Bundle call(String method, String arg, Bundle extras) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 42 */   public void close() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public boolean release() { throw new RuntimeException("Stub!"); }
/* 45 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 46 */   public ContentProvider getLocalContentProvider() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ContentProviderClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */