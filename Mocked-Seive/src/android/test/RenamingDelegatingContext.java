/*    */ package android.test;
/*    */ 
/*    */ import android.content.ContentProvider;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ import android.database.sqlite.SQLiteDatabase;
/*    */ import android.database.sqlite.SQLiteDatabase.CursorFactory;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class RenamingDelegatingContext
/*    */   extends ContextWrapper
/*    */ {
/*    */   public RenamingDelegatingContext(Context context, String filePrefix)
/*    */   {
/* 22 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public RenamingDelegatingContext(Context context, Context fileContext, String filePrefix) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public static <T extends ContentProvider> T providerWithRenamedContext(Class<T> contentProvider, Context c, String filePrefix) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); }
/* 25 */   public static <T extends ContentProvider> T providerWithRenamedContext(Class<T> contentProvider, Context c, String filePrefix, boolean allowAccessToExistingFilesAndDbs) throws IllegalAccessException, InstantiationException { throw new RuntimeException("Stub!"); }
/* 26 */   public void makeExistingFilesAndDbsAccessible() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getDatabasePrefix() { throw new RuntimeException("Stub!"); }
/* 28 */   public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
/* 29 */   public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean deleteDatabase(String name) { throw new RuntimeException("Stub!"); }
/* 31 */   public File getDatabasePath(String name) { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] databaseList() { throw new RuntimeException("Stub!"); }
/* 33 */   public FileInputStream openFileInput(String name) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 34 */   public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public File getFileStreamPath(String name) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean deleteFile(String name) { throw new RuntimeException("Stub!"); }
/* 37 */   public String[] fileList() { throw new RuntimeException("Stub!"); }
/* 38 */   public File getCacheDir() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\RenamingDelegatingContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */