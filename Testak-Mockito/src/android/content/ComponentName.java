/*    */ package android.content;
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
/*    */ public final class ComponentName
/*    */   implements Parcelable, Cloneable, Comparable<ComponentName>
/*    */ {
/* 21 */   public ComponentName(String pkg, String cls) { throw new RuntimeException("Stub!"); }
/* 22 */   public ComponentName(Context pkg, String cls) { throw new RuntimeException("Stub!"); }
/* 23 */   public ComponentName(Context pkg, Class<?> cls) { throw new RuntimeException("Stub!"); }
/* 24 */   public ComponentName(Parcel in) { throw new RuntimeException("Stub!"); }
/* 25 */   public static ComponentName createRelative(String pkg, String cls) { throw new RuntimeException("Stub!"); }
/* 26 */   public static ComponentName createRelative(Context pkg, String cls) { throw new RuntimeException("Stub!"); }
/* 27 */   public ComponentName clone() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getClassName() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getShortClassName() { throw new RuntimeException("Stub!"); }
/* 31 */   public String flattenToString() { throw new RuntimeException("Stub!"); }
/* 32 */   public String flattenToShortString() { throw new RuntimeException("Stub!"); }
/* 33 */   public static ComponentName unflattenFromString(String str) { throw new RuntimeException("Stub!"); }
/* 34 */   public String toShortString() { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 38 */   public int compareTo(ComponentName that) { throw new RuntimeException("Stub!"); }
/* 39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 40 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   public static void writeToParcel(ComponentName c, Parcel out) { throw new RuntimeException("Stub!"); }
/* 42 */   public static ComponentName readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public static final Parcelable.Creator<ComponentName> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\ComponentName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */