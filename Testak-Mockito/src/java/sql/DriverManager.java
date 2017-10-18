/*    */ package java.sql;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Properties;
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
/*    */ public class DriverManager
/*    */ {
/* 30 */   DriverManager() { throw new RuntimeException("Stub!"); }
/* 31 */   public static PrintWriter getLogWriter() { throw new RuntimeException("Stub!"); }
/* 32 */   public static void setLogWriter(PrintWriter out) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Connection getConnection(String url, Properties info) throws SQLException { throw new RuntimeException("Stub!"); }
/* 34 */   public static Connection getConnection(String url, String user, String password) throws SQLException { throw new RuntimeException("Stub!"); }
/* 35 */   public static Connection getConnection(String url) throws SQLException { throw new RuntimeException("Stub!"); }
/* 36 */   public static Driver getDriver(String url) throws SQLException { throw new RuntimeException("Stub!"); }
/* 37 */   public static synchronized void registerDriver(Driver driver) throws SQLException { throw new RuntimeException("Stub!"); }
/* 38 */   public static synchronized void deregisterDriver(Driver driver) throws SQLException { throw new RuntimeException("Stub!"); }
/* 39 */   public static Enumeration<Driver> getDrivers() { throw new RuntimeException("Stub!"); }
/* 40 */   public static void setLoginTimeout(int seconds) { throw new RuntimeException("Stub!"); }
/* 41 */   public static int getLoginTimeout() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   public static void setLogStream(PrintStream out) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public static PrintStream getLogStream() { throw new RuntimeException("Stub!"); }
/* 46 */   public static void println(String message) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\sql\DriverManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */