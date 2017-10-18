/*    */ package android.os;
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
/*    */ public class RemoteCallbackList<E extends IInterface>
/*    */ {
/* 20 */   public RemoteCallbackList() { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean register(E callback) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean register(E callback, Object cookie) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean unregister(E callback) { throw new RuntimeException("Stub!"); }
/* 24 */   public void kill() { throw new RuntimeException("Stub!"); }
/* 25 */   public void onCallbackDied(E callback) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onCallbackDied(E callback, Object cookie) { throw new RuntimeException("Stub!"); }
/* 27 */   public int beginBroadcast() { throw new RuntimeException("Stub!"); }
/* 28 */   public E getBroadcastItem(int index) { throw new RuntimeException("Stub!"); }
/* 29 */   public Object getBroadcastCookie(int index) { throw new RuntimeException("Stub!"); }
/* 30 */   public void finishBroadcast() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getRegisteredCallbackCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public E getRegisteredCallbackItem(int index) { throw new RuntimeException("Stub!"); }
/* 33 */   public Object getRegisteredCallbackCookie(int index) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\RemoteCallbackList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */