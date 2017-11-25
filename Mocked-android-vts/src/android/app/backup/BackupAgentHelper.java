/*    */ package android.app.backup;
/*    */ 
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.IOException;
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
/*    */ public class BackupAgentHelper
/*    */   extends BackupAgent
/*    */ {
/* 21 */   public BackupAgentHelper() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) throws IOException { throw new RuntimeException("Stub!"); }
/* 23 */   public void onRestore(BackupDataInput data, int appVersionCode, ParcelFileDescriptor newState) throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public void addHelper(String keyPrefix, BackupHelper helper) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\backup\BackupAgentHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */