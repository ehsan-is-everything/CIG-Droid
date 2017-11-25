/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.ContentProviderOperation;
/*    */ import android.content.ContentProviderResult;
/*    */ import android.content.ContentValues;
/*    */ import android.content.Context;
/*    */ import android.content.pm.PathPermission;
/*    */ import android.content.pm.ProviderInfo;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MockContentProvider
/*    */   extends ContentProvider
/*    */ {
/* 21 */   protected MockContentProvider() { throw new RuntimeException("Stub!"); }
/* 22 */   public MockContentProvider(Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public MockContentProvider(Context context, String readPermission, String writePermission, PathPermission[] pathPermissions) { throw new RuntimeException("Stub!"); }
/* 24 */   public int delete(Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 25 */   public String getType(Uri uri) { throw new RuntimeException("Stub!"); }
/* 26 */   public Uri insert(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean onCreate() { throw new RuntimeException("Stub!"); }
/* 28 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); }
/* 29 */   public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 30 */   public int bulkInsert(Uri uri, ContentValues[] values) { throw new RuntimeException("Stub!"); }
/* 31 */   public void attachInfo(Context context, ProviderInfo info) { throw new RuntimeException("Stub!"); }
/* 32 */   public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> operations) { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
/* 34 */   public AssetFileDescriptor openTypedAssetFile(Uri url, String mimeType, Bundle opts) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\mock\MockContentProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */