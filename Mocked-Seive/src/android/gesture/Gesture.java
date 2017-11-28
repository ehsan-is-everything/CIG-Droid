/*    */ package android.gesture;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Path;
/*    */ import android.graphics.RectF;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Gesture
/*    */   implements Parcelable
/*    */ {
/* 21 */   public Gesture() { throw new RuntimeException("Stub!"); }
/* 22 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 23 */   public ArrayList<GestureStroke> getStrokes() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getStrokesCount() { throw new RuntimeException("Stub!"); }
/* 25 */   public void addStroke(GestureStroke stroke) { throw new RuntimeException("Stub!"); }
/* 26 */   public float getLength() { throw new RuntimeException("Stub!"); }
/* 27 */   public RectF getBoundingBox() { throw new RuntimeException("Stub!"); }
/* 28 */   public Path toPath() { throw new RuntimeException("Stub!"); }
/* 29 */   public Path toPath(Path path) { throw new RuntimeException("Stub!"); }
/* 30 */   public Path toPath(int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); }
/* 31 */   public Path toPath(Path path, int width, int height, int edge, int numSample) { throw new RuntimeException("Stub!"); }
/* 32 */   public long getID() { throw new RuntimeException("Stub!"); }
/* 33 */   public Bitmap toBitmap(int width, int height, int edge, int numSample, int color) { throw new RuntimeException("Stub!"); }
/* 34 */   public Bitmap toBitmap(int width, int height, int inset, int color) { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 38 */   public static final Parcelable.Creator<Gesture> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\gesture\Gesture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */