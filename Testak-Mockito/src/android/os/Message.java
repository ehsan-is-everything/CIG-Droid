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
/*    */ public final class Message
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Message() { throw new RuntimeException("Stub!"); }
/* 22 */   public static Message obtain() { throw new RuntimeException("Stub!"); }
/* 23 */   public static Message obtain(Message orig) { throw new RuntimeException("Stub!"); }
/* 24 */   public static Message obtain(Handler h) { throw new RuntimeException("Stub!"); }
/* 25 */   public static Message obtain(Handler h, Runnable callback) { throw new RuntimeException("Stub!"); }
/* 26 */   public static Message obtain(Handler h, int what) { throw new RuntimeException("Stub!"); }
/* 27 */   public static Message obtain(Handler h, int what, Object obj) { throw new RuntimeException("Stub!"); }
/* 28 */   public static Message obtain(Handler h, int what, int arg1, int arg2) { throw new RuntimeException("Stub!"); }
/* 29 */   public static Message obtain(Handler h, int what, int arg1, int arg2, Object obj) { throw new RuntimeException("Stub!"); }
/* 30 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 31 */   public void copyFrom(Message o) { throw new RuntimeException("Stub!"); }
/* 32 */   public long getWhen() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTarget(Handler target) { throw new RuntimeException("Stub!"); }
/* 34 */   public Handler getTarget() { throw new RuntimeException("Stub!"); }
/* 35 */   public Runnable getCallback() { throw new RuntimeException("Stub!"); }
/* 36 */   public Bundle getData() { throw new RuntimeException("Stub!"); }
/* 37 */   public Bundle peekData() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setData(Bundle data) { throw new RuntimeException("Stub!"); }
/* 39 */   public void sendToTarget() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isAsynchronous() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setAsynchronous(boolean async) { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 43 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 44 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 52 */   public static final Parcelable.Creator<Message> CREATOR = null;
/*    */   public int arg1;
/*    */   public int arg2;
/*    */   public Object obj;
/*    */   public Messenger replyTo;
/*    */   public int sendingUid;
/*    */   public int what;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\Message.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */