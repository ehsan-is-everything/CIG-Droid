/*    */ package android.app.backup;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BackupAgent
/*    */   extends ContextWrapper
/*    */ {
/*    */   public static final int TYPE_DIRECTORY = 2;
/*    */   public static final int TYPE_FILE = 1;
/*    */   
/*    */   public BackupAgent()
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 23 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onBackup(ParcelFileDescriptor paramParcelFileDescriptor1, BackupDataOutput paramBackupDataOutput, ParcelFileDescriptor paramParcelFileDescriptor2) throws IOException;
/*    */   public abstract void onRestore(BackupDataInput paramBackupDataInput, int paramInt, ParcelFileDescriptor paramParcelFileDescriptor) throws IOException;
/* 26 */   public void onFullBackup(FullBackupDataOutput data) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void onQuotaExceeded(long backupDataBytes, long quotaBytes) { throw new RuntimeException("Stub!"); }
/* 28 */   public final void fullBackupFile(File file, FullBackupDataOutput output) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onRestoreFile(ParcelFileDescriptor data, long size, File destination, int type, long mode, long mtime) throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public void onRestoreFinished() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\backup\BackupAgent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */