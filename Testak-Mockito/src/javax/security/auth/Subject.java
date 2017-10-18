/*    */ package javax.security.auth;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.AccessControlContext;
/*    */ import java.security.Principal;
/*    */ import java.security.PrivilegedAction;
/*    */ import java.security.PrivilegedActionException;
/*    */ import java.security.PrivilegedExceptionAction;
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
/*    */ public final class Subject
/*    */   implements Serializable
/*    */ {
/* 30 */   public Subject() { throw new RuntimeException("Stub!"); }
/* 31 */   public Subject(boolean readOnly, Set<? extends Principal> principals, Set<?> pubCredentials, Set<?> privCredentials) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setReadOnly() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); }
/* 34 */   public static Subject getSubject(AccessControlContext acc) { throw new RuntimeException("Stub!"); }
/* 35 */   public static <T> T doAs(Subject subject, PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
/* 36 */   public static <T> T doAs(Subject subject, PrivilegedExceptionAction<T> action) throws PrivilegedActionException { throw new RuntimeException("Stub!"); }
/* 37 */   public static <T> T doAsPrivileged(Subject subject, PrivilegedAction<T> action, AccessControlContext acc) { throw new RuntimeException("Stub!"); }
/* 38 */   public static <T> T doAsPrivileged(Subject subject, PrivilegedExceptionAction<T> action, AccessControlContext acc) throws PrivilegedActionException { throw new RuntimeException("Stub!"); }
/* 39 */   public Set<Principal> getPrincipals() { throw new RuntimeException("Stub!"); }
/* 40 */   public <T extends Principal> Set<T> getPrincipals(Class<T> c) { throw new RuntimeException("Stub!"); }
/* 41 */   public Set<Object> getPublicCredentials() { throw new RuntimeException("Stub!"); }
/* 42 */   public Set<Object> getPrivateCredentials() { throw new RuntimeException("Stub!"); }
/* 43 */   public <T> Set<T> getPublicCredentials(Class<T> c) { throw new RuntimeException("Stub!"); }
/* 44 */   public <T> Set<T> getPrivateCredentials(Class<T> c) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\security\auth\Subject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */