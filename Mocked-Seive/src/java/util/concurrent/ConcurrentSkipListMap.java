/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractMap;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.NavigableSet;
/*    */ import java.util.Set;
/*    */ import java.util.SortedMap;
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
/*    */ 
/*    */ public class ConcurrentSkipListMap<K, V>
/*    */   extends AbstractMap<K, V>
/*    */   implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable
/*    */ {
/* 41 */   public ConcurrentSkipListMap() { throw new RuntimeException("Stub!"); }
/* 42 */   public ConcurrentSkipListMap(Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); }
/* 43 */   public ConcurrentSkipListMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 44 */   public ConcurrentSkipListMap(SortedMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 45 */   public ConcurrentSkipListMap<K, V> clone() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/* 47 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/* 48 */   public V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/* 49 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 50 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 52 */   public int size() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 54 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 55 */   public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 56 */   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 57 */   public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 58 */   public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 59 */   public NavigableSet<K> keySet() { throw new RuntimeException("Stub!"); }
/* 60 */   public NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); }
/* 61 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/* 62 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/* 63 */   public ConcurrentNavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); }
/* 64 */   public NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 66 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 69 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 70 */   public Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); }
/* 71 */   public K firstKey() { throw new RuntimeException("Stub!"); }
/* 72 */   public K lastKey() { throw new RuntimeException("Stub!"); }
/* 73 */   public ConcurrentNavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) { throw new RuntimeException("Stub!"); }
/* 74 */   public ConcurrentNavigableMap<K, V> headMap(K toKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 75 */   public ConcurrentNavigableMap<K, V> tailMap(K fromKey, boolean inclusive) { throw new RuntimeException("Stub!"); }
/* 76 */   public ConcurrentNavigableMap<K, V> subMap(K fromKey, K toKey) { throw new RuntimeException("Stub!"); }
/* 77 */   public ConcurrentNavigableMap<K, V> headMap(K toKey) { throw new RuntimeException("Stub!"); }
/* 78 */   public ConcurrentNavigableMap<K, V> tailMap(K fromKey) { throw new RuntimeException("Stub!"); }
/* 79 */   public Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); }
/* 80 */   public K lowerKey(K key) { throw new RuntimeException("Stub!"); }
/* 81 */   public Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); }
/* 82 */   public K floorKey(K key) { throw new RuntimeException("Stub!"); }
/* 83 */   public Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); }
/* 84 */   public K ceilingKey(K key) { throw new RuntimeException("Stub!"); }
/* 85 */   public Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); }
/* 86 */   public K higherKey(K key) { throw new RuntimeException("Stub!"); }
/* 87 */   public Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); }
/* 88 */   public Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); }
/* 89 */   public Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); }
/* 90 */   public Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!"); }
/* 91 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 92 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\ConcurrentSkipListMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */