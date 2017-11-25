/*    */ package android.app.usage;
/*    */ 
/*    */ import android.content.pm.PackageManager.NameNotFoundException;
/*    */ import android.os.UserHandle;
/*    */ import java.io.IOException;
/*    */ import java.util.UUID;
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
/*    */ public class StorageStatsManager
/*    */ {
/* 20 */   StorageStatsManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public long getTotalBytes(UUID storageUuid) throws IOException { throw new RuntimeException("Stub!"); }
/* 22 */   public long getFreeBytes(UUID storageUuid) throws IOException { throw new RuntimeException("Stub!"); }
/* 23 */   public StorageStats queryStatsForPackage(UUID storageUuid, String packageName, UserHandle user) throws PackageManager.NameNotFoundException, IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public StorageStats queryStatsForUid(UUID storageUuid, int uid) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public StorageStats queryStatsForUser(UUID storageUuid, UserHandle user) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public ExternalStorageStats queryExternalStatsForUser(UUID storageUuid, UserHandle user) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\usage\StorageStatsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */