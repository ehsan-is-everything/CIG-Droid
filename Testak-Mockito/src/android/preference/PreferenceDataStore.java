/*    */ package android.preference;
/*    */ 
/*    */ import java.util.Set;
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
/*    */ public abstract interface PreferenceDataStore
/*    */ {
/* 20 */   public void putString(String key, String value) { throw new RuntimeException("Stub!"); }
/* 21 */   public void putStringSet(String key, Set<String> values) { throw new RuntimeException("Stub!"); }
/* 22 */   public void putInt(String key, int value) { throw new RuntimeException("Stub!"); }
/* 23 */   public void putLong(String key, long value) { throw new RuntimeException("Stub!"); }
/* 24 */   public void putFloat(String key, float value) { throw new RuntimeException("Stub!"); }
/* 25 */   public void putBoolean(String key, boolean value) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getString(String key, String defValue) { throw new RuntimeException("Stub!"); }
/* 27 */   public Set<String> getStringSet(String key, Set<String> defValues) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getInt(String key, int defValue) { throw new RuntimeException("Stub!"); }
/* 29 */   public long getLong(String key, long defValue) { throw new RuntimeException("Stub!"); }
/* 30 */   public float getFloat(String key, float defValue) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean getBoolean(String key, boolean defValue) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\preference\PreferenceDataStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */