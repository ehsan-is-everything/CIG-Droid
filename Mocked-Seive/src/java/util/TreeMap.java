/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BiFunction;
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
/*    */ 
/*    */ public class TreeMap<K, V>
/*    */   extends AbstractMap<K, V>
/*    */   implements NavigableMap<K, V>, Cloneable, Serializable
/*    */ {
/* 32 */   public TreeMap() { throw new RuntimeException("Stub!"); }
/* 33 */   public TreeMap(Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); }
/* 34 */   public TreeMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 35 */   public TreeMap(SortedMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 36 */   public int size() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 39 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/* 40 */   public Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); }
/* 41 */   public K firstKey() { throw new RuntimeException("Stub!"); }
/* 42 */   public K lastKey() { throw new RuntimeException("Stub!"); }
/* 43 */   public void putAll(Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); }
/* 44 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 45 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 46 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 47 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 48 */   public Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); }
/* 49 */   public Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); }
/* 50 */   public Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); }
/* 51 */   public Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!"); }
/* 52 */   public Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); }
/* 53 */   public K lowerKey(K key) { throw new RuntimeException("Stub!"); }
/* 54 */   public Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); }
/* 55 */   public K floorKey(K key) { throw new RuntimeException("Stub!"); }
/* 56 */   public Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); }
/* 57 */   public K ceilingKey(K key) { throw new RuntimeException("Stub!"); }
/* 58 */   public Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); }
/* 59 */   public K higherKey(K key) { throw new RuntimeException("Stub!"); }
/* 60 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/* 61 */   public NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); }
/* 62 */   public NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); }
/* 63 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/* 64 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/* 65 */   public NavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); }
/* 66 */   public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) { throw new RuntimeException("Stub!"); }
/* 67 */   public NavigableMap<K, V> headMap(K toKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 68 */   public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 69 */   public SortedMap<K, V> subMap(K fromKey, K toKey) { throw new RuntimeException("Stub!"); }
/* 70 */   public SortedMap<K, V> headMap(K toKey) { throw new RuntimeException("Stub!"); }
/* 71 */   public SortedMap<K, V> tailMap(K fromKey) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 73 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 74 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 75 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\TreeMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */