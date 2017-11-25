/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
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
/*    */ abstract class BasicTagTechnology
/*    */   implements TagTechnology
/*    */ {
/* 21 */   BasicTagTechnology() { throw new RuntimeException("Stub!"); }
/* 22 */   public Tag getTag() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 24 */   public void connect() throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\tech\BasicTagTechnology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */