/*    */ package java.util;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ResourceBundle
/*    */ {
/*    */   protected ResourceBundle parent;
/*    */   
/*    */   public static class Control
/*    */   {
/*    */     public static final long TTL_NO_EXPIRATION_CONTROL = -2L;
/*    */     public static final long TTL_DONT_CACHE = -1L;
/*    */     
/* 47 */     protected Control() { throw new RuntimeException("Stub!"); }
/* 48 */     public static final Control getControl(List<String> formats) { throw new RuntimeException("Stub!"); }
/* 49 */     public static final Control getNoFallbackControl(List<String> formats) { throw new RuntimeException("Stub!"); }
/* 50 */     public List<String> getFormats(String baseName) { throw new RuntimeException("Stub!"); }
/* 51 */     public List<Locale> getCandidateLocales(String baseName, Locale locale) { throw new RuntimeException("Stub!"); }
/* 52 */     public Locale getFallbackLocale(String baseName, Locale locale) { throw new RuntimeException("Stub!"); }
/* 53 */     public ResourceBundle newBundle(String baseName, Locale locale, String format, ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException { throw new RuntimeException("Stub!"); }
/* 54 */     public long getTimeToLive(String baseName, Locale locale) { throw new RuntimeException("Stub!"); }
/* 55 */     public boolean needsReload(String baseName, Locale locale, String format, ClassLoader loader, ResourceBundle bundle, long loadTime) { throw new RuntimeException("Stub!"); }
/* 56 */     public String toBundleName(String baseName, Locale locale) { throw new RuntimeException("Stub!"); }
/* 57 */     public final String toResourceName(String bundleName, String suffix) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 63 */     public static final List<String> FORMAT_PROPERTIES = null; public static final List<String> FORMAT_DEFAULT = null; public static final List<String> FORMAT_CLASS = null; }
/*    */   
/* 65 */   public ResourceBundle() { throw new RuntimeException("Stub!"); }
/* 66 */   public String getBaseBundleName() { throw new RuntimeException("Stub!"); }
/* 67 */   public final String getString(String key) { throw new RuntimeException("Stub!"); }
/* 68 */   public final String[] getStringArray(String key) { throw new RuntimeException("Stub!"); }
/* 69 */   public final Object getObject(String key) { throw new RuntimeException("Stub!"); }
/* 70 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/* 71 */   protected void setParent(ResourceBundle parent) { throw new RuntimeException("Stub!"); }
/* 72 */   public static final ResourceBundle getBundle(String baseName) { throw new RuntimeException("Stub!"); }
/* 73 */   public static final ResourceBundle getBundle(String baseName, Control control) { throw new RuntimeException("Stub!"); }
/* 74 */   public static final ResourceBundle getBundle(String baseName, Locale locale) { throw new RuntimeException("Stub!"); }
/* 75 */   public static final ResourceBundle getBundle(String baseName, Locale targetLocale, Control control) { throw new RuntimeException("Stub!"); }
/* 76 */   public static ResourceBundle getBundle(String baseName, Locale locale, ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 77 */   public static ResourceBundle getBundle(String baseName, Locale targetLocale, ClassLoader loader, Control control) { throw new RuntimeException("Stub!"); }
/* 78 */   public static final void clearCache() { throw new RuntimeException("Stub!"); }
/* 79 */   public static final void clearCache(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract Object handleGetObject(String paramString);
/*    */   public abstract Enumeration<String> getKeys();
/* 82 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); }
/* 83 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); }
/* 84 */   protected Set<String> handleKeySet() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\ResourceBundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */