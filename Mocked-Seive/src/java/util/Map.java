/*    */ package java.util;
/*    */ 
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Map<K, V>
/*    */ {
/*    */   public abstract int size();
/*    */   
/*    */   public abstract boolean isEmpty();
/*    */   
/*    */   public abstract boolean containsKey(Object paramObject);
/*    */   
/*    */   public abstract boolean containsValue(Object paramObject);
/*    */   
/*    */   public abstract V get(Object paramObject);
/*    */   
/*    */   public abstract V put(K paramK, V paramV);
/*    */   
/*    */   public abstract V remove(Object paramObject);
/*    */   
/*    */   public static abstract interface Entry<K, V>
/*    */   {
/*    */     public abstract K getKey();
/*    */     
/*    */     public abstract V getValue();
/*    */     
/*    */     public abstract V setValue(V paramV);
/*    */     
/*    */     public abstract boolean equals(Object paramObject);
/*    */     
/*    */     public abstract int hashCode();
/*    */     
/* 36 */     public static <K extends Comparable<? super K>, V> Comparator<Entry<K, V>> comparingByKey() { throw new RuntimeException("Stub!"); }
/* 37 */     public static <K, V extends Comparable<? super V>> Comparator<Entry<K, V>> comparingByValue() { throw new RuntimeException("Stub!"); }
/* 38 */     public static <K, V> Comparator<Entry<K, V>> comparingByKey(Comparator<? super K> cmp) { throw new RuntimeException("Stub!"); }
/* 39 */     public static <K, V> Comparator<Entry<K, V>> comparingByValue(Comparator<? super V> cmp) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public abstract void putAll(Map<? extends K, ? extends V> paramMap);
/*    */   
/*    */   public abstract void clear();
/*    */   
/*    */   public abstract Set<K> keySet();
/*    */   
/*    */   public abstract Collection<V> values();
/*    */   
/*    */   public abstract Set<Entry<K, V>> entrySet();
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/* 55 */   public V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/* 56 */   public void forEach(java.util.function.BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/* 57 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/* 58 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); }
/* 61 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); }
/* 62 */   public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 63 */   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 64 */   public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 65 */   public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Map.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */