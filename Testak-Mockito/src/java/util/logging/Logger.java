/*    */ package java.util.logging;
/*    */ 
/*    */ import java.util.ResourceBundle;
/*    */ import java.util.function.Supplier;
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
/*    */ public class Logger
/*    */ {
/*    */   public static final String GLOBAL_LOGGER_NAME = "global";
/*    */   
/* 31 */   protected Logger(String name, String resourceBundleName) { throw new RuntimeException("Stub!"); }
/* 32 */   public static final Logger getGlobal() { throw new RuntimeException("Stub!"); }
/* 33 */   public static Logger getLogger(String name) { throw new RuntimeException("Stub!"); }
/* 34 */   public static Logger getLogger(String name, String resourceBundleName) { throw new RuntimeException("Stub!"); }
/* 35 */   public static Logger getAnonymousLogger() { throw new RuntimeException("Stub!"); }
/* 36 */   public static Logger getAnonymousLogger(String resourceBundleName) { throw new RuntimeException("Stub!"); }
/* 37 */   public ResourceBundle getResourceBundle() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getResourceBundleName() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setFilter(Filter newFilter) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 40 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 41 */   public void log(LogRecord record) { throw new RuntimeException("Stub!"); }
/* 42 */   public void log(Level level, String msg) { throw new RuntimeException("Stub!"); }
/* 43 */   public void log(Level level, Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 44 */   public void log(Level level, String msg, Object param1) { throw new RuntimeException("Stub!"); }
/* 45 */   public void log(Level level, String msg, Object[] params) { throw new RuntimeException("Stub!"); }
/* 46 */   public void log(Level level, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); }
/* 47 */   public void log(Level level, Throwable thrown, Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 48 */   public void logp(Level level, String sourceClass, String sourceMethod, String msg) { throw new RuntimeException("Stub!"); }
/* 49 */   public void logp(Level level, String sourceClass, String sourceMethod, Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 50 */   public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object param1) { throw new RuntimeException("Stub!"); }
/* 51 */   public void logp(Level level, String sourceClass, String sourceMethod, String msg, Object[] params) { throw new RuntimeException("Stub!"); }
/* 52 */   public void logp(Level level, String sourceClass, String sourceMethod, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); }
/* 53 */   public void logp(Level level, String sourceClass, String sourceMethod, Throwable thrown, Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 55 */   public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Object param1) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 59 */   public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Object[] params) { throw new RuntimeException("Stub!"); }
/* 60 */   public void logrb(Level level, String sourceClass, String sourceMethod, ResourceBundle bundle, String msg, Object... params) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 62 */   public void logrb(Level level, String sourceClass, String sourceMethod, String bundleName, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); }
/* 63 */   public void logrb(Level level, String sourceClass, String sourceMethod, ResourceBundle bundle, String msg, Throwable thrown) { throw new RuntimeException("Stub!"); }
/* 64 */   public void entering(String sourceClass, String sourceMethod) { throw new RuntimeException("Stub!"); }
/* 65 */   public void entering(String sourceClass, String sourceMethod, Object param1) { throw new RuntimeException("Stub!"); }
/* 66 */   public void entering(String sourceClass, String sourceMethod, Object[] params) { throw new RuntimeException("Stub!"); }
/* 67 */   public void exiting(String sourceClass, String sourceMethod) { throw new RuntimeException("Stub!"); }
/* 68 */   public void exiting(String sourceClass, String sourceMethod, Object result) { throw new RuntimeException("Stub!"); }
/* 69 */   public void throwing(String sourceClass, String sourceMethod, Throwable thrown) { throw new RuntimeException("Stub!"); }
/* 70 */   public void severe(String msg) { throw new RuntimeException("Stub!"); }
/* 71 */   public void warning(String msg) { throw new RuntimeException("Stub!"); }
/* 72 */   public void info(String msg) { throw new RuntimeException("Stub!"); }
/* 73 */   public void config(String msg) { throw new RuntimeException("Stub!"); }
/* 74 */   public void fine(String msg) { throw new RuntimeException("Stub!"); }
/* 75 */   public void finer(String msg) { throw new RuntimeException("Stub!"); }
/* 76 */   public void finest(String msg) { throw new RuntimeException("Stub!"); }
/* 77 */   public void severe(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 78 */   public void warning(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 79 */   public void info(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 80 */   public void config(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 81 */   public void fine(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 82 */   public void finer(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 83 */   public void finest(Supplier<String> msgSupplier) { throw new RuntimeException("Stub!"); }
/* 84 */   public void setLevel(Level newLevel) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 85 */   public Level getLevel() { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean isLoggable(Level level) { throw new RuntimeException("Stub!"); }
/* 87 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 88 */   public void addHandler(Handler handler) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 89 */   public void removeHandler(Handler handler) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 90 */   public Handler[] getHandlers() { throw new RuntimeException("Stub!"); }
/* 91 */   public void setUseParentHandlers(boolean useParentHandlers) { throw new RuntimeException("Stub!"); }
/* 92 */   public boolean getUseParentHandlers() { throw new RuntimeException("Stub!"); }
/* 93 */   public void setResourceBundle(ResourceBundle bundle) { throw new RuntimeException("Stub!"); }
/* 94 */   public Logger getParent() { throw new RuntimeException("Stub!"); }
/* 95 */   public void setParent(Logger parent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */   @Deprecated
/* 99 */   public static final Logger global = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\logging\Logger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */