/*    */ package java.lang.reflect;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class Proxy
/*    */   implements Serializable
/*    */ {
/*    */   protected InvocationHandler h;
/*    */   
/* 31 */   protected Proxy(InvocationHandler h) { throw new RuntimeException("Stub!"); }
/* 32 */   public static Class<?> getProxyClass(ClassLoader loader, Class<?>... interfaces) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 33 */   public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 34 */   public static boolean isProxyClass(Class<?> cl) { throw new RuntimeException("Stub!"); }
/* 35 */   public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\reflect\Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */