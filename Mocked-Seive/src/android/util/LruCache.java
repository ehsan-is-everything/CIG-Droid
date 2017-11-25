/*    */ package android.util;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LruCache<K, V>
/*    */ {
/* 20 */   public LruCache(int maxSize) { throw new RuntimeException("Stub!"); }
/* 21 */   public void resize(int maxSize) { throw new RuntimeException("Stub!"); }
/* 22 */   public final V get(K key) { throw new RuntimeException("Stub!"); }
/* 23 */   public final V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 24 */   public void trimToSize(int maxSize) { throw new RuntimeException("Stub!"); }
/* 25 */   public final V remove(K key) { throw new RuntimeException("Stub!"); }
/* 26 */   protected void entryRemoved(boolean evicted, K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 27 */   protected V create(K key) { throw new RuntimeException("Stub!"); }
/* 28 */   protected int sizeOf(K key, V value) { throw new RuntimeException("Stub!"); }
/* 29 */   public final void evictAll() { throw new RuntimeException("Stub!"); }
/* 30 */   public final synchronized int size() { throw new RuntimeException("Stub!"); }
/* 31 */   public final synchronized int maxSize() { throw new RuntimeException("Stub!"); }
/* 32 */   public final synchronized int hitCount() { throw new RuntimeException("Stub!"); }
/* 33 */   public final synchronized int missCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public final synchronized int createCount() { throw new RuntimeException("Stub!"); }
/* 35 */   public final synchronized int putCount() { throw new RuntimeException("Stub!"); }
/* 36 */   public final synchronized int evictionCount() { throw new RuntimeException("Stub!"); }
/* 37 */   public final synchronized Map<K, V> snapshot() { throw new RuntimeException("Stub!"); }
/* 38 */   public final synchronized String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\LruCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */