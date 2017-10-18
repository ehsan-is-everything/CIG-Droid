/*    */ package android.gesture;
/*    */ 
/*    */ import java.util.ArrayList;
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
/*    */ public abstract class GestureLibrary
/*    */ {
/*    */   protected final GestureStore mStore;
/*    */   
/* 21 */   protected GestureLibrary() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean save();
/*    */   public abstract boolean load();
/* 24 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setOrientationStyle(int style) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getOrientationStyle() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setSequenceType(int type) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getSequenceType() { throw new RuntimeException("Stub!"); }
/* 29 */   public Set<String> getGestureEntries() { throw new RuntimeException("Stub!"); }
/* 30 */   public ArrayList<Prediction> recognize(Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 31 */   public void addGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 32 */   public void removeGesture(String entryName, Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 33 */   public void removeEntry(String entryName) { throw new RuntimeException("Stub!"); }
/* 34 */   public ArrayList<Gesture> getGestures(String entryName) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\gesture\GestureLibrary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */