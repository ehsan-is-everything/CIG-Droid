/*    */ package android.view.autofill;
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
/*    */ public final class AutofillValue
/*    */   implements Parcelable
/*    */ {
/* 21 */   AutofillValue() { throw new RuntimeException("Stub!"); }
/* 22 */   public CharSequence getTextValue() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isText() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean getToggleValue() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isToggle() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getListValue() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isList() { throw new RuntimeException("Stub!"); }
/* 28 */   public long getDateValue() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isDate() { throw new RuntimeException("Stub!"); }
/* 30 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public static AutofillValue forText(CharSequence value) { throw new RuntimeException("Stub!"); }
/* 36 */   public static AutofillValue forToggle(boolean value) { throw new RuntimeException("Stub!"); }
/* 37 */   public static AutofillValue forList(int value) { throw new RuntimeException("Stub!"); }
/* 38 */   public static AutofillValue forDate(long value) { throw new RuntimeException("Stub!"); }
/*    */   
/* 40 */   public static final Parcelable.Creator<AutofillValue> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\autofill\AutofillValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */