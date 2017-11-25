/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class AbstractMap<K, V>
/*    */   implements Map<K, V>
/*    */ {
/*    */   public static class SimpleEntry<K, V>
/*    */     implements Map.Entry<K, V>, Serializable
/*    */   {
/* 33 */     public SimpleEntry(K key, V value) { throw new RuntimeException("Stub!"); }
/* 34 */     public SimpleEntry(Map.Entry<? extends K, ? extends V> entry) { throw new RuntimeException("Stub!"); }
/* 35 */     public K getKey() { throw new RuntimeException("Stub!"); }
/* 36 */     public V getValue() { throw new RuntimeException("Stub!"); }
/* 37 */     public V setValue(V value) { throw new RuntimeException("Stub!"); }
/* 38 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 39 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 40 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class SimpleImmutableEntry<K, V>
/*    */     implements Map.Entry<K, V>, Serializable {
/* 45 */     public SimpleImmutableEntry(K key, V value) { throw new RuntimeException("Stub!"); }
/* 46 */     public SimpleImmutableEntry(Map.Entry<? extends K, ? extends V> entry) { throw new RuntimeException("Stub!"); }
/* 47 */     public K getKey() { throw new RuntimeException("Stub!"); }
/* 48 */     public V getValue() { throw new RuntimeException("Stub!"); }
/* 49 */     public V setValue(V value) { throw new RuntimeException("Stub!"); }
/* 50 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 51 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 52 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 54 */   protected AbstractMap() { throw new RuntimeException("Stub!"); }
/* 55 */   public int size() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); }
/* 59 */   public V get(Object key) { throw new RuntimeException("Stub!"); }
/* 60 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); }
/* 61 */   public V remove(Object key) { throw new RuntimeException("Stub!"); }
/* 62 */   public void putAll(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); }
/* 63 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 64 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); }
/* 65 */   public Collection<V> values() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Set<Map.Entry<K, V>> entrySet();
/* 67 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 68 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 69 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 70 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\AbstractMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */