/*    */ package android.media;
/*    */ 
/*    */ import android.graphics.Bitmap;
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
/*    */ @Deprecated
/*    */ public abstract class MediaMetadataEditor
/*    */ {
/*    */   public static final int BITMAP_KEY_ARTWORK = 100;
/*    */   public static final int RATING_KEY_BY_OTHERS = 101;
/*    */   public static final int RATING_KEY_BY_USER = 268435457;
/*    */   
/* 21 */   MediaMetadataEditor() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void apply();
/* 23 */   public synchronized void clear() { throw new RuntimeException("Stub!"); }
/* 24 */   public synchronized void addEditableKey(int key) { throw new RuntimeException("Stub!"); }
/* 25 */   public synchronized void removeEditableKeys() { throw new RuntimeException("Stub!"); }
/* 26 */   public synchronized int[] getEditableKeys() { throw new RuntimeException("Stub!"); }
/* 27 */   public synchronized MediaMetadataEditor putString(int key, String value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 28 */   public synchronized MediaMetadataEditor putLong(int key, long value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 29 */   public synchronized MediaMetadataEditor putBitmap(int key, Bitmap bitmap) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 30 */   public synchronized MediaMetadataEditor putObject(int key, Object value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 31 */   public synchronized long getLong(int key, long defaultValue) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized String getString(int key, String defaultValue) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized Bitmap getBitmap(int key, Bitmap defaultValue) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized Object getObject(int key, Object defaultValue) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaMetadataEditor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */