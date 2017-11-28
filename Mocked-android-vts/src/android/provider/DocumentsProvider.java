/*    */ package android.provider;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentValues;
/*    */ import android.content.Context;
/*    */ import android.content.IntentSender;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.graphics.Point;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ 
/*    */ 
/*    */ public abstract class DocumentsProvider
/*    */   extends ContentProvider
/*    */ {
/* 21 */   public DocumentsProvider() { throw new RuntimeException("Stub!"); }
/* 22 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isChildDocument(String parentDocumentId, String documentId) { throw new RuntimeException("Stub!"); }
/*    */   
/* 25 */   public String createDocument(String parentDocumentId, String mimeType, String displayName) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 27 */   public String renameDocument(String documentId, String displayName) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public void deleteDocument(String documentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public String copyDocument(String sourceDocumentId, String targetParentDocumentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public String moveDocument(String sourceDocumentId, String sourceParentDocumentId, String targetParentDocumentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 35 */   public void removeDocument(String documentId, String parentDocumentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */   public DocumentsContract.Path findDocumentPath(String parentDocumentId, String childDocumentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */   public IntentSender createWebLinkIntent(String documentId, Bundle options) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Cursor queryRoots(String[] paramArrayOfString) throws FileNotFoundException;
/* 40 */   public Cursor queryRecentDocuments(String rootId, String[] projection) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   public abstract Cursor queryDocument(String paramString, String[] paramArrayOfString) throws FileNotFoundException;
/*    */   public abstract Cursor queryChildDocuments(String paramString1, String[] paramArrayOfString, String paramString2) throws FileNotFoundException;
/* 43 */   public Cursor queryChildDocuments(String parentDocumentId, String[] projection, Bundle queryArgs) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 45 */   public Cursor querySearchDocuments(String rootId, String query, String[] projection) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 47 */   public void ejectRoot(String rootId) { throw new RuntimeException("Stub!"); }
/* 48 */   public String getDocumentType(String documentId) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ParcelFileDescriptor openDocument(String paramString1, String paramString2, CancellationSignal paramCancellationSignal) throws FileNotFoundException;
/* 51 */   public AssetFileDescriptor openDocumentThumbnail(String documentId, Point sizeHint, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 53 */   public AssetFileDescriptor openTypedDocument(String documentId, String mimeTypeFilter, Bundle opts, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 54 */   public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); }
/* 55 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 56 */   public final Cursor query(Uri uri, String[] projection, Bundle queryArgs, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 57 */   public final String getType(Uri uri) { throw new RuntimeException("Stub!"); }
/* 58 */   public Uri canonicalize(Uri uri) { throw new RuntimeException("Stub!"); }
/* 59 */   public final Uri insert(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 60 */   public final int delete(Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 61 */   public final int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 62 */   public Bundle call(String method, String arg, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 63 */   public final void revokeDocumentPermission(String documentId) { throw new RuntimeException("Stub!"); }
/* 64 */   public final ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 65 */   public final ParcelFileDescriptor openFile(Uri uri, String mode, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 67 */   public final AssetFileDescriptor openAssetFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/* 69 */   public final AssetFileDescriptor openAssetFile(Uri uri, String mode, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 70 */   public final AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 71 */   public final AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 72 */   public String[] getDocumentStreamTypes(String documentId, String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
/* 73 */   public String[] getStreamTypes(Uri uri, String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\provider\DocumentsProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */