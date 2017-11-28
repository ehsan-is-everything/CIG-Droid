/*    */ package android.content;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Map.Entry;
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
/*    */ public final class ContentValues
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ContentValues() { throw new RuntimeException("Stub!"); }
/* 22 */   public ContentValues(int size) { throw new RuntimeException("Stub!"); }
/* 23 */   public ContentValues(ContentValues from) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); }
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 26 */   public void put(String key, String value) { throw new RuntimeException("Stub!"); }
/* 27 */   public void putAll(ContentValues other) { throw new RuntimeException("Stub!"); }
/* 28 */   public void put(String key, Byte value) { throw new RuntimeException("Stub!"); }
/* 29 */   public void put(String key, Short value) { throw new RuntimeException("Stub!"); }
/* 30 */   public void put(String key, Integer value) { throw new RuntimeException("Stub!"); }
/* 31 */   public void put(String key, Long value) { throw new RuntimeException("Stub!"); }
/* 32 */   public void put(String key, Float value) { throw new RuntimeException("Stub!"); }
/* 33 */   public void put(String key, Double value) { throw new RuntimeException("Stub!"); }
/* 34 */   public void put(String key, Boolean value) { throw new RuntimeException("Stub!"); }
/* 35 */   public void put(String key, byte[] value) { throw new RuntimeException("Stub!"); }
/* 36 */   public void putNull(String key) { throw new RuntimeException("Stub!"); }
/* 37 */   public int size() { throw new RuntimeException("Stub!"); }
/* 38 */   public void remove(String key) { throw new RuntimeException("Stub!"); }
/* 39 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); }
/* 41 */   public Object get(String key) { throw new RuntimeException("Stub!"); }
/* 42 */   public String getAsString(String key) { throw new RuntimeException("Stub!"); }
/* 43 */   public Long getAsLong(String key) { throw new RuntimeException("Stub!"); }
/* 44 */   public Integer getAsInteger(String key) { throw new RuntimeException("Stub!"); }
/* 45 */   public Short getAsShort(String key) { throw new RuntimeException("Stub!"); }
/* 46 */   public Byte getAsByte(String key) { throw new RuntimeException("Stub!"); }
/* 47 */   public Double getAsDouble(String key) { throw new RuntimeException("Stub!"); }
/* 48 */   public Float getAsFloat(String key) { throw new RuntimeException("Stub!"); }
/* 49 */   public Boolean getAsBoolean(String key) { throw new RuntimeException("Stub!"); }
/* 50 */   public byte[] getAsByteArray(String key) { throw new RuntimeException("Stub!"); }
/* 51 */   public Set<Map.Entry<String, Object>> valueSet() { throw new RuntimeException("Stub!"); }
/* 52 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); }
/* 53 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 55 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 56 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 59 */   public static final Parcelable.Creator<ContentValues> CREATOR = null;
/*    */   public static final String TAG = "ContentValues";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ContentValues.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */