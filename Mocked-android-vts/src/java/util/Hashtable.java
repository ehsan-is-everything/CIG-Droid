/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
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
/*    */ 
/*    */ public class Hashtable<K, V>
/*    */   extends Dictionary<K, V>
/*    */   implements Map<K, V>, Cloneable, Serializable
/*    */ {
/* 32 */   public Hashtable(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }
/* 33 */   public Hashtable(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 34 */   public Hashtable() { throw new RuntimeException("Stub!"); }
/* 35 */   public Hashtable(Map<? extends K, ? extends V> t) { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized int size() { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized Enumeration<K> keys() { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized Enumeration<V> elements() { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized boolean contains(Object value) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 42 */   public synchronized boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public synchronized V get(Object key) { throw new RuntimeException("Stub!"); }
/*    */   
/* 46 */   protected void rehash() { throw new RuntimeException("Stub!"); }
/* 47 */   public synchronized V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 48 */   public synchronized V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 49 */   public synchronized void putAll(Map<? extends K, ? extends V> t) { throw new RuntimeException("Stub!"); }
/* 50 */   public synchronized void clear() { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized Object clone() { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized String toString() { throw new RuntimeException("Stub!"); }
/* 53 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/* 54 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/* 55 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 57 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); }
/* 58 */   public synchronized V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/*    */   
/* 60 */   public synchronized void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/*    */   
/* 62 */   public synchronized void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/* 63 */   public synchronized V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
/* 64 */   public synchronized boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 65 */   public synchronized boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 67 */   public synchronized V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 68 */   public synchronized V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 69 */   public synchronized V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 70 */   public synchronized V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Hashtable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */