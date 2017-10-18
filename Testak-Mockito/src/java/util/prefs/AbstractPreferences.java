/*    */ package java.util.prefs;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ public abstract class AbstractPreferences
/*    */   extends Preferences
/*    */ {
/*    */   protected final Object lock;
/*    */   protected boolean newNode;
/*    */   
/* 31 */   protected AbstractPreferences(AbstractPreferences parent, String name) { throw new RuntimeException("Stub!"); }
/* 32 */   public void put(String key, String value) { throw new RuntimeException("Stub!"); }
/* 33 */   public String get(String key, String def) { throw new RuntimeException("Stub!"); }
/* 34 */   public void remove(String key) { throw new RuntimeException("Stub!"); }
/* 35 */   public void clear() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/* 36 */   public void putInt(String key, int value) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getInt(String key, int def) { throw new RuntimeException("Stub!"); }
/* 38 */   public void putLong(String key, long value) { throw new RuntimeException("Stub!"); }
/* 39 */   public long getLong(String key, long def) { throw new RuntimeException("Stub!"); }
/* 40 */   public void putBoolean(String key, boolean value) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean getBoolean(String key, boolean def) { throw new RuntimeException("Stub!"); }
/* 42 */   public void putFloat(String key, float value) { throw new RuntimeException("Stub!"); }
/* 43 */   public float getFloat(String key, float def) { throw new RuntimeException("Stub!"); }
/* 44 */   public void putDouble(String key, double value) { throw new RuntimeException("Stub!"); }
/* 45 */   public double getDouble(String key, double def) { throw new RuntimeException("Stub!"); }
/* 46 */   public void putByteArray(String key, byte[] value) { throw new RuntimeException("Stub!"); }
/* 47 */   public byte[] getByteArray(String key, byte[] def) { throw new RuntimeException("Stub!"); }
/* 48 */   public String[] keys() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/* 49 */   public String[] childrenNames() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/* 50 */   protected final AbstractPreferences[] cachedChildren() { throw new RuntimeException("Stub!"); }
/* 51 */   public Preferences parent() { throw new RuntimeException("Stub!"); }
/* 52 */   public Preferences node(String path) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean nodeExists(String path) throws BackingStoreException { throw new RuntimeException("Stub!"); }
/* 54 */   public void removeNode() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/* 55 */   public String name() { throw new RuntimeException("Stub!"); }
/* 56 */   public String absolutePath() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isUserNode() { throw new RuntimeException("Stub!"); }
/* 58 */   public void addPreferenceChangeListener(PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
/* 59 */   public void removePreferenceChangeListener(PreferenceChangeListener pcl) { throw new RuntimeException("Stub!"); }
/* 60 */   public void addNodeChangeListener(NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
/* 61 */   public void removeNodeChangeListener(NodeChangeListener ncl) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void putSpi(String paramString1, String paramString2);
/*    */   protected abstract String getSpi(String paramString);
/*    */   protected abstract void removeSpi(String paramString);
/*    */   protected abstract void removeNodeSpi() throws BackingStoreException;
/*    */   protected abstract String[] keysSpi() throws BackingStoreException;
/*    */   protected abstract String[] childrenNamesSpi() throws BackingStoreException;
/* 68 */   protected AbstractPreferences getChild(String nodeName) throws BackingStoreException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract AbstractPreferences childSpi(String paramString);
/* 70 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 71 */   public void sync() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void syncSpi() throws BackingStoreException;
/* 73 */   public void flush() throws BackingStoreException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void flushSpi() throws BackingStoreException;
/* 75 */   protected boolean isRemoved() { throw new RuntimeException("Stub!"); }
/* 76 */   public void exportNode(OutputStream os) throws IOException, BackingStoreException { throw new RuntimeException("Stub!"); }
/* 77 */   public void exportSubtree(OutputStream os) throws IOException, BackingStoreException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\prefs\AbstractPreferences.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */