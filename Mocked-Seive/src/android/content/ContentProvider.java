/*    */ package android.content;
/*    */ 
/*    */ import android.content.pm.PathPermission;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.content.res.Configuration;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ContentProvider
/*    */   implements ComponentCallbacks2
/*    */ {
/* 25 */   public ContentProvider() { throw new RuntimeException("Stub!"); }
/* 26 */   public final Context getContext() { throw new RuntimeException("Stub!"); }
/* 27 */   public final String getCallingPackage() { throw new RuntimeException("Stub!"); }
/* 28 */   protected final void setReadPermission(String permission) { throw new RuntimeException("Stub!"); }
/* 29 */   public final String getReadPermission() { throw new RuntimeException("Stub!"); }
/* 30 */   protected final void setWritePermission(String permission) { throw new RuntimeException("Stub!"); }
/* 31 */   public final String getWritePermission() { throw new RuntimeException("Stub!"); }
/* 32 */   protected final void setPathPermissions(PathPermission[] permissions) { throw new RuntimeException("Stub!"); }
/* 33 */   public final PathPermission[] getPathPermissions() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean onCreate();
/* 35 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 36 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 37 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2);
/* 39 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 40 */   public Cursor query(Uri uri, String[] projection, Bundle queryArgs, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getType(Uri paramUri);
/* 42 */   public Uri canonicalize(Uri url) { throw new RuntimeException("Stub!"); }
/* 43 */   public Uri uncanonicalize(Uri url) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean refresh(Uri uri, Bundle args, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Uri insert(Uri paramUri, ContentValues paramContentValues);
/* 46 */   public int bulkInsert(Uri uri, ContentValues[] values) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int delete(Uri paramUri, String paramString, String[] paramArrayOfString);
/*    */   public abstract int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString);
/* 49 */   public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 50 */   public ParcelFileDescriptor openFile(Uri uri, String mode, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 51 */   public AssetFileDescriptor openAssetFile(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 52 */   public AssetFileDescriptor openAssetFile(Uri uri, String mode, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 53 */   protected final ParcelFileDescriptor openFileHelper(Uri uri, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 54 */   public String[] getStreamTypes(Uri uri, String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
/* 55 */   public AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 56 */   public AssetFileDescriptor openTypedAssetFile(Uri uri, String mimeTypeFilter, Bundle opts, CancellationSignal signal) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 57 */   public <T> ParcelFileDescriptor openPipeHelper(Uri uri, String mimeType, Bundle opts, T args, PipeDataWriter<T> func) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 58 */   protected boolean isTemporary() { throw new RuntimeException("Stub!"); }
/* 59 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); }
/* 60 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) throws OperationApplicationException { throw new RuntimeException("Stub!"); }
/* 61 */   public Bundle call(String method, String arg, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 62 */   public void shutdown() { throw new RuntimeException("Stub!"); }
/* 63 */   public void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface PipeDataWriter<T>
/*    */   {
/*    */     public abstract void writeDataToPipe(ParcelFileDescriptor paramParcelFileDescriptor, Uri paramUri, String paramString, Bundle paramBundle, T paramT);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ContentProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */