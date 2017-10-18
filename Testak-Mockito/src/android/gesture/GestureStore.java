/*    */ package android.gesture;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GestureStore
/*    */ {
/*    */   public static final int ORIENTATION_INVARIANT = 1;
/*    */   public static final int ORIENTATION_SENSITIVE = 2;
/*    */   public static final int SEQUENCE_INVARIANT = 1;
/*    */   public static final int SEQUENCE_SENSITIVE = 2;
/*    */   
/* 20 */   public GestureStore() { throw new RuntimeException("Stub!"); }
/* 21 */   public void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); }
/* 22 */   public int getOrientationStyle() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setSequenceType(int type) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getSequenceType() { throw new RuntimeException("Stub!"); }
/* 25 */   public Set<String> getGestureEntries() { throw new RuntimeException("Stub!"); }
/* 26 */   public ArrayList<Prediction> recognize(Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 27 */   public void addGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 28 */   public void removeGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 29 */   public void removeEntry(String entryName) { throw new RuntimeException("Stub!"); }
/* 30 */   public ArrayList<Gesture> getGestures(String entryName) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean hasChanged() { throw new RuntimeException("Stub!"); }
/* 32 */   public void save(OutputStream stream) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void save(OutputStream stream, boolean closeStream) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void load(InputStream stream) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void load(InputStream stream, boolean closeStream) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\gesture\GestureStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */