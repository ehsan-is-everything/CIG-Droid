/*     */ package java.util.concurrent;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.AbstractMap;
/*     */ import java.util.Collection;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import java.util.Spliterator;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.DoubleBinaryOperator;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntBinaryOperator;
/*     */ import java.util.function.LongBinaryOperator;
/*     */ import java.util.function.ToDoubleBiFunction;
/*     */ import java.util.function.ToDoubleFunction;
/*     */ import java.util.function.ToIntBiFunction;
/*     */ import java.util.function.ToIntFunction;
/*     */ import java.util.function.ToLongBiFunction;
/*     */ import java.util.function.ToLongFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConcurrentHashMap<K, V>
/*     */   extends AbstractMap<K, V>
/*     */   implements ConcurrentMap<K, V>, Serializable
/*     */ {
/*     */   static abstract class CollectionView<K, V, E>
/*     */     implements Collection<E>, Serializable
/*     */   {
/*  44 */     CollectionView() { throw new RuntimeException("Stub!"); }
/*  45 */     public ConcurrentHashMap<K, V> getMap() { throw new RuntimeException("Stub!"); }
/*  46 */     public final void clear() { throw new RuntimeException("Stub!"); }
/*  47 */     public final int size() { throw new RuntimeException("Stub!"); }
/*  48 */     public final boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*     */     public abstract Iterator<E> iterator();
/*     */     public abstract boolean contains(Object paramObject);
/*     */     public abstract boolean remove(Object paramObject);
/*  52 */     public final Object[] toArray() { throw new RuntimeException("Stub!"); }
/*     */     
/*  54 */     public final <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); }
/*  55 */     public final String toString() { throw new RuntimeException("Stub!"); }
/*  56 */     public final boolean containsAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/*  57 */     public final boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/*  58 */     public final boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class KeySetView<K, V> extends ConcurrentHashMap.CollectionView<K, V, K>
/*     */     implements Set<K>, Serializable
/*     */   {
/*  64 */     KeySetView() { throw new RuntimeException("Stub!"); }
/*  65 */     public V getMappedValue() { throw new RuntimeException("Stub!"); }
/*  66 */     public boolean contains(Object o) { throw new RuntimeException("Stub!"); }
/*  67 */     public boolean remove(Object o) { throw new RuntimeException("Stub!"); }
/*  68 */     public Iterator<K> iterator() { throw new RuntimeException("Stub!"); }
/*  69 */     public boolean add(K e) { throw new RuntimeException("Stub!"); }
/*  70 */     public boolean addAll(Collection<? extends K> c) { throw new RuntimeException("Stub!"); }
/*  71 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  72 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  73 */     public Spliterator<K> spliterator() { throw new RuntimeException("Stub!"); }
/*  74 */     public void forEach(Consumer<? super K> action) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  76 */   public ConcurrentHashMap() { throw new RuntimeException("Stub!"); }
/*  77 */   public ConcurrentHashMap(int initialCapacity) { throw new RuntimeException("Stub!"); }
/*  78 */   public ConcurrentHashMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/*  79 */   public ConcurrentHashMap(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }
/*  80 */   public ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) { throw new RuntimeException("Stub!"); }
/*  81 */   public int size() { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*  83 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/*  86 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/*  87 */   public void putAll(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/*  88 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/*  89 */   public void clear() { throw new RuntimeException("Stub!"); }
/*  90 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/*  91 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/*  92 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/*  93 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  94 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  95 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  96 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
/*  97 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/*  98 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/*  99 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 100 */   public V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/* 101 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 102 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/* 103 */   public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 104 */   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 105 */   public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 106 */   public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 107 */   public boolean contains(Object value) { throw new RuntimeException("Stub!"); }
/* 108 */   public Enumeration<K> keys() { throw new RuntimeException("Stub!"); }
/* 109 */   public Enumeration<V> elements() { throw new RuntimeException("Stub!"); }
/* 110 */   public long mappingCount() { throw new RuntimeException("Stub!"); }
/* 111 */   public static <K> KeySetView<K, Boolean> newKeySet() { throw new RuntimeException("Stub!"); }
/* 112 */   public static <K> KeySetView<K, Boolean> newKeySet(int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 113 */   public KeySetView<K, V> keySet(V mappedValue) { throw new RuntimeException("Stub!"); }
/* 114 */   public void forEach(long parallelismThreshold, BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 115 */   public <U> void forEach(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
/* 116 */   public <U> U search(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
/* 117 */   public <U> U reduce(long parallelismThreshold, BiFunction<? super K, ? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
/* 118 */   public double reduceToDouble(long parallelismThreshold, ToDoubleBiFunction<? super K, ? super V> transformer, double basis, DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 119 */   public long reduceToLong(long parallelismThreshold, ToLongBiFunction<? super K, ? super V> transformer, long basis, LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 120 */   public int reduceToInt(long parallelismThreshold, ToIntBiFunction<? super K, ? super V> transformer, int basis, IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 121 */   public void forEachKey(long parallelismThreshold, Consumer<? super K> action) { throw new RuntimeException("Stub!"); }
/* 122 */   public <U> void forEachKey(long parallelismThreshold, Function<? super K, ? extends U> transformer, Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
/* 123 */   public <U> U searchKeys(long parallelismThreshold, Function<? super K, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
/* 124 */   public K reduceKeys(long parallelismThreshold, BiFunction<? super K, ? super K, ? extends K> reducer) { throw new RuntimeException("Stub!"); }
/* 125 */   public <U> U reduceKeys(long parallelismThreshold, Function<? super K, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
/* 126 */   public double reduceKeysToDouble(long parallelismThreshold, ToDoubleFunction<? super K> transformer, double basis, DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 127 */   public long reduceKeysToLong(long parallelismThreshold, ToLongFunction<? super K> transformer, long basis, LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 128 */   public int reduceKeysToInt(long parallelismThreshold, ToIntFunction<? super K> transformer, int basis, IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 129 */   public void forEachValue(long parallelismThreshold, Consumer<? super V> action) { throw new RuntimeException("Stub!"); }
/* 130 */   public <U> void forEachValue(long parallelismThreshold, Function<? super V, ? extends U> transformer, Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
/* 131 */   public <U> U searchValues(long parallelismThreshold, Function<? super V, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
/* 132 */   public V reduceValues(long parallelismThreshold, BiFunction<? super V, ? super V, ? extends V> reducer) { throw new RuntimeException("Stub!"); }
/* 133 */   public <U> U reduceValues(long parallelismThreshold, Function<? super V, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
/* 134 */   public double reduceValuesToDouble(long parallelismThreshold, ToDoubleFunction<? super V> transformer, double basis, DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 135 */   public long reduceValuesToLong(long parallelismThreshold, ToLongFunction<? super V> transformer, long basis, LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 136 */   public int reduceValuesToInt(long parallelismThreshold, ToIntFunction<? super V> transformer, int basis, IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 137 */   public void forEachEntry(long parallelismThreshold, Consumer<? super Map.Entry<K, V>> action) { throw new RuntimeException("Stub!"); }
/* 138 */   public <U> void forEachEntry(long parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> transformer, Consumer<? super U> action) { throw new RuntimeException("Stub!"); }
/* 139 */   public <U> U searchEntries(long parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> searchFunction) { throw new RuntimeException("Stub!"); }
/* 140 */   public Map.Entry<K, V> reduceEntries(long parallelismThreshold, BiFunction<Map.Entry<K, V>, Map.Entry<K, V>, ? extends Map.Entry<K, V>> reducer) { throw new RuntimeException("Stub!"); }
/* 141 */   public <U> U reduceEntries(long parallelismThreshold, Function<Map.Entry<K, V>, ? extends U> transformer, BiFunction<? super U, ? super U, ? extends U> reducer) { throw new RuntimeException("Stub!"); }
/* 142 */   public double reduceEntriesToDouble(long parallelismThreshold, ToDoubleFunction<Map.Entry<K, V>> transformer, double basis, DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 143 */   public long reduceEntriesToLong(long parallelismThreshold, ToLongFunction<Map.Entry<K, V>> transformer, long basis, LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/* 144 */   public int reduceEntriesToInt(long parallelismThreshold, ToIntFunction<Map.Entry<K, V>> transformer, int basis, IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\ConcurrentHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */