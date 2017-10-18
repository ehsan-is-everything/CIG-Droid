/*    */ package android.os.storage;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.ProxyFileDescriptorCallback;
/*    */ import java.io.File;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StorageManager
/*    */ {
/*    */   public static final String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
/*    */   public static final String EXTRA_REQUESTED_BYTES = "android.os.storage.extra.REQUESTED_BYTES";
/*    */   public static final String EXTRA_UUID = "android.os.storage.extra.UUID";
/*    */   
/* 20 */   StorageManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean mountObb(String rawPath, String key, OnObbStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean unmountObb(String rawPath, boolean force, OnObbStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isObbMounted(String rawPath) { throw new RuntimeException("Stub!"); }
/* 24 */   public String getMountedObbPath(String rawPath) { throw new RuntimeException("Stub!"); }
/* 25 */   public UUID getUuidForPath(File path) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public StorageVolume getStorageVolume(File file) { throw new RuntimeException("Stub!"); }
/* 27 */   public List<StorageVolume> getStorageVolumes() { throw new RuntimeException("Stub!"); }
/* 28 */   public StorageVolume getPrimaryStorageVolume() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isEncrypted(File file) { throw new RuntimeException("Stub!"); }
/* 30 */   public ParcelFileDescriptor openProxyFileDescriptor(int mode, ProxyFileDescriptorCallback callback, Handler handler) throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public long getCacheQuotaBytes(UUID storageUuid) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public long getCacheSizeBytes(UUID storageUuid) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public long getAllocatableBytes(UUID storageUuid) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void allocateBytes(UUID storageUuid, long bytes) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void allocateBytes(FileDescriptor fd, long bytes) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void setCacheBehaviorGroup(File path, boolean group) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isCacheBehaviorGroup(File path) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void setCacheBehaviorTombstone(File path, boolean tombstone) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isCacheBehaviorTombstone(File path) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 44 */   public static final UUID UUID_DEFAULT = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\storage\StorageManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */