/*    */ package java.security;
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
/*    */ public final class AccessController
/*    */ {
/* 30 */   AccessController() { throw new RuntimeException("Stub!"); }
/* 31 */   public static <T> T doPrivileged(PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
/* 32 */   public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
/* 33 */   public static <T> T doPrivileged(PrivilegedAction<T> action, AccessControlContext context) { throw new RuntimeException("Stub!"); }
/* 34 */   public static <T> T doPrivileged(PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); }
/* 35 */   public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); }
/* 36 */   public static <T> T doPrivileged(PrivilegedExceptionAction<T> action, AccessControlContext context) throws PrivilegedActionException { throw new RuntimeException("Stub!"); }
/* 37 */   public static AccessControlContext getContext() { throw new RuntimeException("Stub!"); }
/* 38 */   public static void checkPermission(Permission perm) throws AccessControlException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\AccessController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */