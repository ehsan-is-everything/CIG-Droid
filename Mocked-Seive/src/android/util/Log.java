/*    */ package android.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Log
/*    */ {
/*    */   public static final int ASSERT = 7;
/*    */   
/*    */ 
/*    */   public static final int DEBUG = 3;
/*    */   
/*    */   public static final int ERROR = 6;
/*    */   
/*    */   public static final int INFO = 4;
/*    */   
/*    */   public static final int VERBOSE = 2;
/*    */   
/*    */   public static final int WARN = 5;
/*    */   
/* 20 */   Log() { throw new RuntimeException("Stub!"); }
/* 21 */   public static int v(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 22 */   public static int v(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 23 */   public static int d(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 24 */   public static int d(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 25 */   public static int i(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 26 */   public static int i(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 27 */   public static int w(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 28 */   public static int w(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/*    */   public static native boolean isLoggable(String paramString, int paramInt);
/* 30 */   public static int w(String tag, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 31 */   public static int e(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 32 */   public static int e(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 33 */   public static int wtf(String tag, String msg) { throw new RuntimeException("Stub!"); }
/* 34 */   public static int wtf(String tag, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 35 */   public static int wtf(String tag, String msg, Throwable tr) { throw new RuntimeException("Stub!"); }
/* 36 */   public static String getStackTraceString(Throwable tr) { throw new RuntimeException("Stub!"); }
/* 37 */   public static int println(int priority, String tag, String msg) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\Log.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */