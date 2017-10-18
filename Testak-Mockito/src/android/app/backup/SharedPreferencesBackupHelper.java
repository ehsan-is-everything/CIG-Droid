/*    */ package android.app.backup;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.ParcelFileDescriptor;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SharedPreferencesBackupHelper
/*    */   extends FileBackupHelperBase
/*    */   implements BackupHelper
/*    */ {
/* 22 */   public SharedPreferencesBackupHelper(Context context, String... prefGroups) { throw new RuntimeException("Stub!"); }
/* 23 */   public void performBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) { throw new RuntimeException("Stub!"); }
/* 24 */   public void restoreEntity(BackupDataInputStream data) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\backup\SharedPreferencesBackupHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */