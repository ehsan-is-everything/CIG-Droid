/*    */ package java.util.logging;
/*    */ 
/*    */ import java.beans.PropertyChangeListener;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Enumeration;
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
/*    */ public class LogManager
/*    */ {
/*    */   public static final String LOGGING_MXBEAN_NAME = "java.util.logging:type=Logging";
/*    */   
/* 31 */   protected LogManager() { throw new RuntimeException("Stub!"); }
/* 32 */   public static LogManager getLogManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void addPropertyChangeListener(PropertyChangeListener l) throws SecurityException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public void removePropertyChangeListener(PropertyChangeListener l) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean addLogger(Logger logger) { throw new RuntimeException("Stub!"); }
/* 38 */   public Logger getLogger(String name) { throw new RuntimeException("Stub!"); }
/* 39 */   public Enumeration<String> getLoggerNames() { throw new RuntimeException("Stub!"); }
/* 40 */   public void readConfiguration() throws IOException, SecurityException { throw new RuntimeException("Stub!"); }
/* 41 */   public void reset() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 42 */   public void readConfiguration(InputStream ins) throws IOException, SecurityException { throw new RuntimeException("Stub!"); }
/* 43 */   public String getProperty(String name) { throw new RuntimeException("Stub!"); }
/* 44 */   public void checkAccess() throws SecurityException { throw new RuntimeException("Stub!"); }
/* 45 */   public static synchronized LoggingMXBean getLoggingMXBean() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\logging\LogManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */