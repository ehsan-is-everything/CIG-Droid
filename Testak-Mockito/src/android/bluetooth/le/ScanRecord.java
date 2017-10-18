/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.os.ParcelUuid;
/*    */ import android.util.SparseArray;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public final class ScanRecord
/*    */ {
/* 20 */   ScanRecord() { throw new RuntimeException("Stub!"); }
/* 21 */   public int getAdvertiseFlags() { throw new RuntimeException("Stub!"); }
/* 22 */   public List<ParcelUuid> getServiceUuids() { throw new RuntimeException("Stub!"); }
/* 23 */   public SparseArray<byte[]> getManufacturerSpecificData() { throw new RuntimeException("Stub!"); }
/* 24 */   public byte[] getManufacturerSpecificData(int manufacturerId) { throw new RuntimeException("Stub!"); }
/* 25 */   public Map<ParcelUuid, byte[]> getServiceData() { throw new RuntimeException("Stub!"); }
/* 26 */   public byte[] getServiceData(ParcelUuid serviceDataUuid) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getTxPowerLevel() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getDeviceName() { throw new RuntimeException("Stub!"); }
/* 29 */   public byte[] getBytes() { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\ScanRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */