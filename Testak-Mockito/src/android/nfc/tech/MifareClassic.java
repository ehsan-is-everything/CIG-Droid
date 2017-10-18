/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
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
/*    */ public final class MifareClassic
/*    */   extends BasicTagTechnology
/*    */ {
/*    */   public static final int BLOCK_SIZE = 16;
/*    */   
/* 21 */   MifareClassic() { throw new RuntimeException("Stub!"); }
/* 22 */   public static MifareClassic get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getSize() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getSectorCount() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getBlockCount() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getBlockCountInSector(int sectorIndex) { throw new RuntimeException("Stub!"); }
/* 28 */   public int blockToSector(int blockIndex) { throw new RuntimeException("Stub!"); }
/* 29 */   public int sectorToBlock(int sectorIndex) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean authenticateSectorWithKeyA(int sectorIndex, byte[] key) throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean authenticateSectorWithKeyB(int sectorIndex, byte[] key) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public byte[] readBlock(int blockIndex) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void writeBlock(int blockIndex, byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void increment(int blockIndex, int value) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void decrement(int blockIndex, int value) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void transfer(int blockIndex) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void restore(int blockIndex) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/*    */   
/* 43 */   public static final byte[] KEY_DEFAULT = null;
/* 44 */   public static final byte[] KEY_MIFARE_APPLICATION_DIRECTORY = null;
/* 45 */   public static final byte[] KEY_NFC_FORUM = null;
/*    */   public static final int SIZE_1K = 1024;
/*    */   public static final int SIZE_2K = 2048;
/*    */   public static final int SIZE_4K = 4096;
/*    */   public static final int SIZE_MINI = 320;
/*    */   public static final int TYPE_CLASSIC = 0;
/*    */   public static final int TYPE_PLUS = 1;
/*    */   public static final int TYPE_PRO = 2;
/*    */   public static final int TYPE_UNKNOWN = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\tech\MifareClassic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */