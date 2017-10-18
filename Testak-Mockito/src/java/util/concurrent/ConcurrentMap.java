/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface ConcurrentMap<K, V>
/*    */   extends Map<K, V>
/*    */ {
/* 40 */   public V getOrDefault(Object key, V defaultValue) { throw new RuntimeException("Stub!"); }
/* 41 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/*    */   public abstract V putIfAbsent(K paramK, V paramV);
/*    */   public abstract boolean remove(Object paramObject1, Object paramObject2);
/*    */   public abstract boolean replace(K paramK, V paramV1, V paramV2);
/*    */   public abstract V replace(K paramK, V paramV);
/* 46 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/* 47 */   public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 48 */   public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 49 */   public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 50 */   public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\concurrent\ConcurrentMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */