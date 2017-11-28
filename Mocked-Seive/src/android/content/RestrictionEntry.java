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
/*    */ public class RestrictionEntry
/*    */   implements Parcelable
/*    */ {
/* 21 */   public RestrictionEntry(int type, String key) { throw new RuntimeException("Stub!"); }
/* 22 */   public RestrictionEntry(String key, String selectedString) { throw new RuntimeException("Stub!"); }
/* 23 */   public RestrictionEntry(String key, boolean selectedState) { throw new RuntimeException("Stub!"); }
/* 24 */   public RestrictionEntry(String key, String[] selectedStrings) { throw new RuntimeException("Stub!"); }
/* 25 */   public RestrictionEntry(String key, int selectedInt) { throw new RuntimeException("Stub!"); }
/* 26 */   public RestrictionEntry(Parcel in) { throw new RuntimeException("Stub!"); }
/* 27 */   public static RestrictionEntry createBundleEntry(String key, RestrictionEntry[] restrictionEntries) { throw new RuntimeException("Stub!"); }
/* 28 */   public static RestrictionEntry createBundleArrayEntry(String key, RestrictionEntry[] restrictionEntries) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setType(int type) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 31 */   public String getSelectedString() { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getAllSelectedStrings() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean getSelectedState() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getIntValue() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setIntValue(int value) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setSelectedString(String selectedString) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSelectedState(boolean state) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setAllSelectedStrings(String[] allSelectedStrings) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setChoiceValues(String[] choiceValues) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setChoiceValues(Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); }
/* 41 */   public RestrictionEntry[] getRestrictions() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setRestrictions(RestrictionEntry[] restrictions) { throw new RuntimeException("Stub!"); }
/* 43 */   public String[] getChoiceValues() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setChoiceEntries(String[] choiceEntries) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setChoiceEntries(Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); }
/* 46 */   public String[] getChoiceEntries() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getDescription() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setDescription(String description) { throw new RuntimeException("Stub!"); }
/* 49 */   public String getKey() { throw new RuntimeException("Stub!"); }
/* 50 */   public String getTitle() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setTitle(String title) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 53 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 54 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 55 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 56 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 66 */   public static final Parcelable.Creator<RestrictionEntry> CREATOR = null;
/*    */   public static final int TYPE_BOOLEAN = 1;
/*    */   public static final int TYPE_BUNDLE = 7;
/*    */   public static final int TYPE_BUNDLE_ARRAY = 8;
/*    */   public static final int TYPE_CHOICE = 2;
/*    */   public static final int TYPE_INTEGER = 5;
/*    */   public static final int TYPE_MULTI_SELECT = 4;
/*    */   public static final int TYPE_NULL = 0;
/*    */   public static final int TYPE_STRING = 6;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\RestrictionEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */