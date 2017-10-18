/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public abstract class AbsSavedState
/*    */   implements Parcelable
/*    */ {
/* 21 */   protected AbsSavedState(Parcelable superState) { throw new RuntimeException("Stub!"); }
/* 22 */   protected AbsSavedState(Parcel source) { throw new RuntimeException("Stub!"); }
/* 23 */   protected AbsSavedState(Parcel source, ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 24 */   public final Parcelable getSuperState() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 29 */   public static final AbsSavedState EMPTY_STATE = null; public static final Parcelable.Creator<AbsSavedState> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\AbsSavedState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */