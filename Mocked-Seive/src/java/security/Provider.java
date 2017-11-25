/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Collection;
/*    */ import java.util.Enumeration;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Properties;
/*    */ import java.util.Set;
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
/*    */ public abstract class Provider
/*    */   extends Properties
/*    */ {
/*    */   public static class Service
/*    */   {
/* 33 */     public Service(Provider provider, String type, String algorithm, String className, List<String> aliases, Map<String, String> attributes) { throw new RuntimeException("Stub!"); }
/* 34 */     public final String getType() { throw new RuntimeException("Stub!"); }
/* 35 */     public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 36 */     public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 37 */     public final String getClassName() { throw new RuntimeException("Stub!"); }
/* 38 */     public final String getAttribute(String name) { throw new RuntimeException("Stub!"); }
/* 39 */     public Object newInstance(Object constructorParameter) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 40 */     public boolean supportsParameter(Object parameter) { throw new RuntimeException("Stub!"); }
/* 41 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 43 */   protected Provider(String name, double version, String info) { throw new RuntimeException("Stub!"); }
/* 44 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 45 */   public double getVersion() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getInfo() { throw new RuntimeException("Stub!"); }
/* 47 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 48 */   public synchronized void clear() { throw new RuntimeException("Stub!"); }
/* 49 */   public synchronized void load(InputStream inStream) throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public synchronized void putAll(Map<?, ?> t) { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized Set<Map.Entry<Object, Object>> entrySet() { throw new RuntimeException("Stub!"); }
/* 52 */   public Set<Object> keySet() { throw new RuntimeException("Stub!"); }
/* 53 */   public Collection<Object> values() { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized Object put(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 55 */   public synchronized Object putIfAbsent(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized Object remove(Object key) { throw new RuntimeException("Stub!"); }
/* 57 */   public synchronized boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 58 */   public synchronized boolean replace(Object key, Object oldValue, Object newValue) { throw new RuntimeException("Stub!"); }
/* 59 */   public synchronized Object replace(Object key, Object value) { throw new RuntimeException("Stub!"); }
/* 60 */   public synchronized void replaceAll(BiFunction<? super Object, ? super Object, ? extends Object> function) { throw new RuntimeException("Stub!"); }
/* 61 */   public synchronized Object compute(Object key, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 62 */   public synchronized Object computeIfAbsent(Object key, Function<? super Object, ? extends Object> mappingFunction) { throw new RuntimeException("Stub!"); }
/* 63 */   public synchronized Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 64 */   public synchronized Object merge(Object key, Object value, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) { throw new RuntimeException("Stub!"); }
/* 65 */   public Object get(Object key) { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized Object getOrDefault(Object key, Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 67 */   public synchronized void forEach(BiConsumer<? super Object, ? super Object> action) { throw new RuntimeException("Stub!"); }
/* 68 */   public Enumeration<Object> keys() { throw new RuntimeException("Stub!"); }
/* 69 */   public Enumeration<Object> elements() { throw new RuntimeException("Stub!"); }
/* 70 */   public String getProperty(String key) { throw new RuntimeException("Stub!"); }
/* 71 */   public synchronized Service getService(String type, String algorithm) { throw new RuntimeException("Stub!"); }
/* 72 */   public synchronized Set<Service> getServices() { throw new RuntimeException("Stub!"); }
/* 73 */   protected synchronized void putService(Service s) { throw new RuntimeException("Stub!"); }
/* 74 */   protected synchronized void removeService(Service s) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\Provider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */