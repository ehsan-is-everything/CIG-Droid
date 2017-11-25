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
/*    */ public class HashMap<K, V>
/*    */   extends AbstractMap<K, V>
/*    */   implements Map<K, V>, Cloneable, Serializable
/*    */ {
/* 31 */   public HashMap(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }
/* 32 */   public HashMap(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 33 */   public HashMap() { throw new RuntimeException("Stub!"); }
/* 34 */   public HashMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 35 */   public int size() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 37 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/* 39 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 40 */   public void putAll(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 41 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 42 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 44 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/* 45 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/* 46 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/* 47 */   public V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/* 48 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 51 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 52 */   public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 53 */   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 54 */   public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 55 */   public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 57 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/*    */   
/* 59 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\HashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */