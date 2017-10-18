/*    */ package java.util.prefs;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Preferences
/*    */ {
/*    */   public static final int MAX_KEY_LENGTH = 80;
/*    */   public static final int MAX_NAME_LENGTH = 80;
/*    */   public static final int MAX_VALUE_LENGTH = 8192;
/*    */   
/* 30 */   protected Preferences() { throw new RuntimeException("Stub!"); }
/* 31 */   public static Preferences userNodeForPackage(Class<?> c) { throw new RuntimeException("Stub!"); }
/* 32 */   public static Preferences systemNodeForPackage(Class<?> c) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Preferences userRoot() { throw new RuntimeException("Stub!"); }
/* 34 */   public static Preferences systemRoot() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void put(String paramString1, String paramString2);
/*    */   public abstract String get(String paramString1, String paramString2);
/*    */   public abstract void remove(String paramString);
/*    */   public abstract void clear() throws BackingStoreException;
/*    */   public abstract void putInt(String paramString, int paramInt);
/*    */   public abstract int getInt(String paramString, int paramInt);
/*    */   public abstract void putLong(String paramString, long paramLong);
/*    */   public abstract long getLong(String paramString, long paramLong);
/*    */   public abstract void putBoolean(String paramString, boolean paramBoolean);
/*    */   public abstract boolean getBoolean(String paramString, boolean paramBoolean);
/*    */   public abstract void putFloat(String paramString, float paramFloat);
/*    */   public abstract float getFloat(String paramString, float paramFloat);
/*    */   public abstract void putDouble(String paramString, double paramDouble);
/*    */   public abstract double getDouble(String paramString, double paramDouble);
/*    */   public abstract void putByteArray(String paramString, byte[] paramArrayOfByte);
/*    */   public abstract byte[] getByteArray(String paramString, byte[] paramArrayOfByte);
/*    */   public abstract String[] keys() throws BackingStoreException;
/*    */   public abstract String[] childrenNames() throws BackingStoreException;
/*    */   public abstract Preferences parent();
/*    */   public abstract Preferences node(String paramString);
/*    */   public abstract boolean nodeExists(String paramString) throws BackingStoreException;
/*    */   public abstract void removeNode() throws BackingStoreException;
/*    */   public abstract String name();
/*    */   public abstract String absolutePath();
/*    */   public abstract boolean isUserNode();
/*    */   public abstract String toString();
/*    */   public abstract void flush() throws BackingStoreException;
/*    */   public abstract void sync() throws BackingStoreException;
/*    */   public abstract void addPreferenceChangeListener(PreferenceChangeListener paramPreferenceChangeListener);
/*    */   public abstract void removePreferenceChangeListener(PreferenceChangeListener paramPreferenceChangeListener);
/*    */   public abstract void addNodeChangeListener(NodeChangeListener paramNodeChangeListener);
/*    */   public abstract void removeNodeChangeListener(NodeChangeListener paramNodeChangeListener);
/*    */   public abstract void exportNode(OutputStream paramOutputStream) throws IOException, BackingStoreException;
/*    */   public abstract void exportSubtree(OutputStream paramOutputStream) throws IOException, BackingStoreException;
/* 69 */   public static void importPreferences(InputStream is) throws IOException, InvalidPreferencesFormatException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\prefs\Preferences.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */