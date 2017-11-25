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
/*    */ public class IdentityHashMap<K, V>
/*    */   extends AbstractMap<K, V>
/*    */   implements Map<K, V>, Serializable, Cloneable
/*    */ {
/* 31 */   public IdentityHashMap() { throw new RuntimeException("Stub!"); }
/* 32 */   public IdentityHashMap(int expectedMaxSize) { throw new RuntimeException("Stub!"); }
/* 33 */   public IdentityHashMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 34 */   public int size() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 40 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 41 */   public void putAll(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 42 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 43 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 45 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 46 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 47 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/* 48 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/* 49 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); }
/*    */   
/* 51 */   public void forEach(BiConsumer<? super K, ? super V> action) { throw new RuntimeException("Stub!"); }
/*    */   
/* 53 */   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\IdentityHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */