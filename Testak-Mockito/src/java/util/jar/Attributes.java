/*    */ package java.util.jar;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
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
/*    */ public class Attributes
/*    */   implements Map<Object, Object>, Cloneable
/*    */ {
/*    */   protected Map<Object, Object> map;
/*    */   
/*    */   public static class Name
/*    */   {
/* 33 */     public Name(String name) { throw new RuntimeException("Stub!"); }
/* 34 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 35 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 36 */     public String toString() { throw new RuntimeException("Stub!"); }
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
/* 57 */     public static final Name SPECIFICATION_VERSION = null; public static final Name SPECIFICATION_VENDOR = null; public static final Name SPECIFICATION_TITLE = null; public static final Name SIGNATURE_VERSION = null; public static final Name SEALED = null; public static final Name MANIFEST_VERSION = null; public static final Name MAIN_CLASS = null; public static final Name IMPLEMENTATION_VERSION = null; @Deprecated
/* 57 */     public static final Name IMPLEMENTATION_VENDOR_ID = null; public static final Name IMPLEMENTATION_VENDOR = null; @Deprecated
/* 57 */     public static final Name IMPLEMENTATION_URL = null; public static final Name IMPLEMENTATION_TITLE = null; public static final Name EXTENSION_NAME = null; public static final Name EXTENSION_LIST = null; @Deprecated
/* 57 */     public static final Name EXTENSION_INSTALLATION = null; public static final Name CONTENT_TYPE = null; public static final Name CLASS_PATH = null; }
/*    */   
/* 59 */   public Attributes() { throw new RuntimeException("Stub!"); }
/* 60 */   public Attributes(int size) { throw new RuntimeException("Stub!"); }
/* 61 */   public Attributes(Attributes attr) { throw new RuntimeException("Stub!"); }
/* 62 */   public Object get(Object name) { throw new RuntimeException("Stub!"); }
/* 63 */   public String getValue(String name) { throw new RuntimeException("Stub!"); }
/* 64 */   public String getValue(Name name) { throw new RuntimeException("Stub!"); }
/* 65 */   public Object put(Object name, Object value) { throw new RuntimeException("Stub!"); }
/* 66 */   public String putValue(String name, String value) { throw new RuntimeException("Stub!"); }
/* 67 */   public Object remove(Object name) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean containsKey(Object name) { throw new RuntimeException("Stub!"); }
/* 70 */   public void putAll(Map<?, ?> attr) { throw new RuntimeException("Stub!"); }
/* 71 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 72 */   public int size() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 74 */   public Set<Object> keySet() { throw new RuntimeException("Stub!"); }
/* 75 */   public Collection<Object> values() { throw new RuntimeException("Stub!"); }
/* 76 */   public Set<Map.Entry<Object, Object>> entrySet() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 78 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 79 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\Attributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */