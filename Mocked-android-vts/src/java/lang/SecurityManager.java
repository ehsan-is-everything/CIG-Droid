/*    */ package java.lang;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.net.InetAddress;
/*    */ import java.security.Permission;
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
/*    */ public class SecurityManager
/*    */ {
/*    */   @Deprecated
/*    */   protected boolean inCheck;
/*    */   
/* 30 */   public SecurityManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public boolean getInCheck() { throw new RuntimeException("Stub!"); }
/* 33 */   protected Class[] getClassContext() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   protected ClassLoader currentClassLoader() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   protected Class<?> currentLoadedClass() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   protected int classDepth(String name) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 41 */   protected int classLoaderDepth() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   protected boolean inClass(String name) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   protected boolean inClassLoader() { throw new RuntimeException("Stub!"); }
/* 46 */   public Object getSecurityContext() { throw new RuntimeException("Stub!"); }
/* 47 */   public void checkPermission(Permission perm) { throw new RuntimeException("Stub!"); }
/* 48 */   public void checkPermission(Permission perm, Object context) { throw new RuntimeException("Stub!"); }
/* 49 */   public void checkCreateClassLoader() { throw new RuntimeException("Stub!"); }
/* 50 */   public void checkAccess(Thread t) { throw new RuntimeException("Stub!"); }
/* 51 */   public void checkAccess(ThreadGroup g) { throw new RuntimeException("Stub!"); }
/* 52 */   public void checkExit(int status) { throw new RuntimeException("Stub!"); }
/* 53 */   public void checkExec(String cmd) { throw new RuntimeException("Stub!"); }
/* 54 */   public void checkLink(String lib) { throw new RuntimeException("Stub!"); }
/* 55 */   public void checkRead(FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/* 56 */   public void checkRead(String file) { throw new RuntimeException("Stub!"); }
/* 57 */   public void checkRead(String file, Object context) { throw new RuntimeException("Stub!"); }
/* 58 */   public void checkWrite(FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/* 59 */   public void checkWrite(String file) { throw new RuntimeException("Stub!"); }
/* 60 */   public void checkDelete(String file) { throw new RuntimeException("Stub!"); }
/* 61 */   public void checkConnect(String host, int port) { throw new RuntimeException("Stub!"); }
/* 62 */   public void checkConnect(String host, int port, Object context) { throw new RuntimeException("Stub!"); }
/* 63 */   public void checkListen(int port) { throw new RuntimeException("Stub!"); }
/* 64 */   public void checkAccept(String host, int port) { throw new RuntimeException("Stub!"); }
/* 65 */   public void checkMulticast(InetAddress maddr) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 67 */   public void checkMulticast(InetAddress maddr, byte ttl) { throw new RuntimeException("Stub!"); }
/* 68 */   public void checkPropertiesAccess() { throw new RuntimeException("Stub!"); }
/* 69 */   public void checkPropertyAccess(String key) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean checkTopLevelWindow(Object window) { throw new RuntimeException("Stub!"); }
/* 71 */   public void checkPrintJobAccess() { throw new RuntimeException("Stub!"); }
/* 72 */   public void checkSystemClipboardAccess() { throw new RuntimeException("Stub!"); }
/* 73 */   public void checkAwtEventQueueAccess() { throw new RuntimeException("Stub!"); }
/* 74 */   public void checkPackageAccess(String pkg) { throw new RuntimeException("Stub!"); }
/* 75 */   public void checkPackageDefinition(String pkg) { throw new RuntimeException("Stub!"); }
/* 76 */   public void checkSetFactory() { throw new RuntimeException("Stub!"); }
/* 77 */   public void checkMemberAccess(Class<?> clazz, int which) { throw new RuntimeException("Stub!"); }
/* 78 */   public void checkSecurityAccess(String target) { throw new RuntimeException("Stub!"); }
/* 79 */   public ThreadGroup getThreadGroup() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\SecurityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */