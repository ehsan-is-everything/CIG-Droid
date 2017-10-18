/*    */ package android.os;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DropBoxManager
/*    */ {
/*    */   public static final String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
/*    */   public static final String EXTRA_TAG = "tag";
/*    */   public static final String EXTRA_TIME = "time";
/*    */   public static final int IS_EMPTY = 1;
/*    */   public static final int IS_GZIPPED = 4;
/*    */   public static final int IS_TEXT = 2;
/*    */   
/*    */   public static class Entry
/*    */     implements Parcelable, Closeable
/*    */   {
/* 23 */     public Entry(String tag, long millis) { throw new RuntimeException("Stub!"); }
/* 24 */     public Entry(String tag, long millis, String text) { throw new RuntimeException("Stub!"); }
/* 25 */     public Entry(String tag, long millis, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */     public Entry(String tag, long millis, ParcelFileDescriptor data, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */     public Entry(String tag, long millis, File data, int flags) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */     public void close() { throw new RuntimeException("Stub!"); }
/* 29 */     public String getTag() { throw new RuntimeException("Stub!"); }
/* 30 */     public long getTimeMillis() { throw new RuntimeException("Stub!"); }
/* 31 */     public int getFlags() { throw new RuntimeException("Stub!"); }
/* 32 */     public String getText(int maxBytes) { throw new RuntimeException("Stub!"); }
/* 33 */     public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 37 */     public static final Parcelable.Creator<Entry> CREATOR = null; }
/*    */   
/* 39 */   protected DropBoxManager() { throw new RuntimeException("Stub!"); }
/* 40 */   public void addText(String tag, String data) { throw new RuntimeException("Stub!"); }
/* 41 */   public void addData(String tag, byte[] data, int flags) { throw new RuntimeException("Stub!"); }
/* 42 */   public void addFile(String tag, File file, int flags) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isTagEnabled(String tag) { throw new RuntimeException("Stub!"); }
/* 44 */   public Entry getNextEntry(String tag, long msec) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\DropBoxManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */