/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.net.Uri;
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
/*    */ public class SearchRecentSuggestionsProvider
/*    */   extends ContentProvider
/*    */ {
/*    */   public static final int DATABASE_MODE_2LINES = 2;
/*    */   public static final int DATABASE_MODE_QUERIES = 1;
/*    */   
/* 21 */   public SearchRecentSuggestionsProvider() { throw new RuntimeException("Stub!"); }
/* 22 */   protected void setupSuggestions(String authority, int mode) { throw new RuntimeException("Stub!"); }
/* 23 */   public int delete(Uri uri, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 24 */   public String getType(Uri uri) { throw new RuntimeException("Stub!"); }
/* 25 */   public Uri insert(Uri uri, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean onCreate() { throw new RuntimeException("Stub!"); }
/* 27 */   public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); }
/* 28 */   public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\SearchRecentSuggestionsProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */