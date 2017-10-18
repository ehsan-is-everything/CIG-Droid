/*    */ package android.util;
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
/*    */ public abstract class Property<T, V>
/*    */ {
/* 19 */   public Property(Class<V> type, String name) { throw new RuntimeException("Stub!"); }
/* 20 */   public static <T, V> Property<T, V> of(Class<T> hostType, Class<V> valueType, String name) { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); }
/* 22 */   public void set(T object, V value) { throw new RuntimeException("Stub!"); }
/*    */   public abstract V get(T paramT);
/* 24 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 25 */   public Class<V> getType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\util\Property.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */