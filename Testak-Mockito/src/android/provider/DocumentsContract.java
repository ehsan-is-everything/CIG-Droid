/*     */ package android.provider;
/*     */ 
/*     */ import android.net.Uri;
/*     */ 
/*     */ public final class DocumentsContract { public static final String ACTION_DOCUMENT_SETTINGS = "android.provider.action.DOCUMENT_SETTINGS";
/*     */   public static final String EXTRA_ERROR = "error";
/*     */   public static final String EXTRA_EXCLUDE_SELF = "android.provider.extra.EXCLUDE_SELF";
/*     */   public static final String EXTRA_INFO = "info";
/*     */   
/*     */   public static final class Document { public static final String COLUMN_DISPLAY_NAME = "_display_name";
/*     */     public static final String COLUMN_DOCUMENT_ID = "document_id";
/*     */     public static final String COLUMN_FLAGS = "flags";
/*     */     public static final String COLUMN_ICON = "icon";
/*     */     public static final String COLUMN_LAST_MODIFIED = "last_modified";
/*     */     public static final String COLUMN_MIME_TYPE = "mime_type";
/*     */     public static final String COLUMN_SIZE = "_size";
/*     */     public static final String COLUMN_SUMMARY = "summary";
/*     */     public static final int FLAG_DIR_PREFERS_GRID = 16;
/*     */     public static final int FLAG_DIR_PREFERS_LAST_MODIFIED = 32;
/*     */     public static final int FLAG_DIR_SUPPORTS_CREATE = 8;
/*     */     
/*  22 */     Document() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int FLAG_SUPPORTS_COPY = 128;
/*     */     public static final int FLAG_SUPPORTS_DELETE = 4;
/*     */     public static final int FLAG_SUPPORTS_MOVE = 256;
/*     */     public static final int FLAG_SUPPORTS_REMOVE = 1024;
/*     */     public static final int FLAG_SUPPORTS_RENAME = 64;
/*     */     public static final int FLAG_SUPPORTS_SETTINGS = 2048;
/*     */     public static final int FLAG_SUPPORTS_THUMBNAIL = 1;
/*     */     public static final int FLAG_SUPPORTS_WRITE = 2;
/*     */     public static final int FLAG_VIRTUAL_DOCUMENT = 512;
/*     */     public static final int FLAG_WEB_LINKABLE = 4096;
/*     */     public static final String MIME_TYPE_DIR = "vnd.android.document/directory";
/*     */   }
/*     */   
/*     */   public static final class Root {
/*     */     public static final String COLUMN_AVAILABLE_BYTES = "available_bytes";
/*     */     public static final String COLUMN_CAPACITY_BYTES = "capacity_bytes";
/*     */     public static final String COLUMN_DOCUMENT_ID = "document_id";
/*     */     public static final String COLUMN_FLAGS = "flags";
/*     */     public static final String COLUMN_ICON = "icon";
/*     */     public static final String COLUMN_MIME_TYPES = "mime_types";
/*     */     public static final String COLUMN_ROOT_ID = "root_id";
/*     */     public static final String COLUMN_SUMMARY = "summary";
/*     */     
/*     */     Root() {
/*  48 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final String COLUMN_TITLE = "title";
/*     */     public static final int FLAG_LOCAL_ONLY = 2;
/*     */     public static final int FLAG_SUPPORTS_CREATE = 1;
/*     */     public static final int FLAG_SUPPORTS_EJECT = 32;
/*     */     public static final int FLAG_SUPPORTS_IS_CHILD = 16;
/*     */     public static final int FLAG_SUPPORTS_RECENTS = 4;
/*     */     public static final int FLAG_SUPPORTS_SEARCH = 8;
/*     */     public static final String MIME_TYPE_ITEM = "vnd.android.document/root";
/*     */   }
/*     */   
/*     */   public static final String EXTRA_INITIAL_URI = "android.provider.extra.INITIAL_URI";
/*     */   public static final String EXTRA_LOADING = "loading";
/*     */   public static final String EXTRA_ORIENTATION = "android.provider.extra.ORIENTATION";
/*     */   public static final String EXTRA_PROMPT = "android.provider.extra.PROMPT";
/*     */   public static final String PROVIDER_INTERFACE = "android.content.action.DOCUMENTS_PROVIDER";
/*     */   public static final class Path implements android.os.Parcelable
/*     */   {
/*     */     public Path(String rootId, java.util.List<String> path) {
/*  69 */       throw new RuntimeException("Stub!"); }
/*  70 */     public String getRootId() { throw new RuntimeException("Stub!"); }
/*  71 */     public java.util.List<String> getPath() { throw new RuntimeException("Stub!"); }
/*  72 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  73 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  74 */     public String toString() { throw new RuntimeException("Stub!"); }
/*  75 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  76 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*     */     
/*  78 */     public static final android.os.Parcelable.Creator<Path> CREATOR = null; }
/*     */   
/*  80 */   DocumentsContract() { throw new RuntimeException("Stub!"); }
/*  81 */   public static Uri buildRootsUri(String authority) { throw new RuntimeException("Stub!"); }
/*  82 */   public static Uri buildRootUri(String authority, String rootId) { throw new RuntimeException("Stub!"); }
/*  83 */   public static Uri buildRecentDocumentsUri(String authority, String rootId) { throw new RuntimeException("Stub!"); }
/*  84 */   public static Uri buildTreeDocumentUri(String authority, String documentId) { throw new RuntimeException("Stub!"); }
/*  85 */   public static Uri buildDocumentUri(String authority, String documentId) { throw new RuntimeException("Stub!"); }
/*  86 */   public static Uri buildDocumentUriUsingTree(Uri treeUri, String documentId) { throw new RuntimeException("Stub!"); }
/*  87 */   public static Uri buildChildDocumentsUri(String authority, String parentDocumentId) { throw new RuntimeException("Stub!"); }
/*  88 */   public static Uri buildChildDocumentsUriUsingTree(Uri treeUri, String parentDocumentId) { throw new RuntimeException("Stub!"); }
/*  89 */   public static Uri buildSearchDocumentsUri(String authority, String rootId, String query) { throw new RuntimeException("Stub!"); }
/*  90 */   public static boolean isDocumentUri(android.content.Context context, Uri uri) { throw new RuntimeException("Stub!"); }
/*  91 */   public static boolean isTreeUri(Uri uri) { throw new RuntimeException("Stub!"); }
/*  92 */   public static String getRootId(Uri rootUri) { throw new RuntimeException("Stub!"); }
/*  93 */   public static String getDocumentId(Uri documentUri) { throw new RuntimeException("Stub!"); }
/*  94 */   public static String getTreeDocumentId(Uri documentUri) { throw new RuntimeException("Stub!"); }
/*  95 */   public static String getSearchDocumentsQuery(Uri searchDocumentsUri) { throw new RuntimeException("Stub!"); }
/*  96 */   public static android.graphics.Bitmap getDocumentThumbnail(android.content.ContentResolver resolver, Uri documentUri, android.graphics.Point size, android.os.CancellationSignal signal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*  97 */   public static Uri createDocument(android.content.ContentResolver resolver, Uri parentDocumentUri, String mimeType, String displayName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*  98 */   public static Uri renameDocument(android.content.ContentResolver resolver, Uri documentUri, String displayName) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*  99 */   public static boolean deleteDocument(android.content.ContentResolver resolver, Uri documentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 100 */   public static Uri copyDocument(android.content.ContentResolver resolver, Uri sourceDocumentUri, Uri targetParentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 101 */   public static Uri moveDocument(android.content.ContentResolver resolver, Uri sourceDocumentUri, Uri sourceParentDocumentUri, Uri targetParentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 102 */   public static boolean removeDocument(android.content.ContentResolver resolver, Uri documentUri, Uri parentDocumentUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 103 */   public static void ejectRoot(android.content.ContentResolver resolver, Uri rootUri) { throw new RuntimeException("Stub!"); }
/* 104 */   public static Path findDocumentPath(android.content.ContentResolver resolver, Uri treeUri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 105 */   public static android.content.IntentSender createWebLinkIntent(android.content.ContentResolver resolver, Uri uri, android.os.Bundle options) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\provider\DocumentsContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */