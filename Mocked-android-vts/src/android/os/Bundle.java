/*    */ package android.os;
/*    */ 
/*    */ import android.util.Size;
/*    */ import android.util.SizeF;
/*    */ import android.util.SparseArray;
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
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
/*    */ public final class Bundle
/*    */   extends BaseBundle
/*    */   implements Cloneable, Parcelable
/*    */ {
/* 22 */   public Bundle() { throw new RuntimeException("Stub!"); }
/* 23 */   public Bundle(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 24 */   public Bundle(int capacity) { throw new RuntimeException("Stub!"); }
/* 25 */   public Bundle(Bundle b) { throw new RuntimeException("Stub!"); }
/* 26 */   public Bundle(PersistableBundle b) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setClassLoader(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 28 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
/* 29 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 30 */   public Bundle deepCopy() { throw new RuntimeException("Stub!"); }
/* 31 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 32 */   public void remove(String key) { throw new RuntimeException("Stub!"); }
/* 33 */   public void putAll(Bundle bundle) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
/* 35 */   public void putByte(String key, byte value) { throw new RuntimeException("Stub!"); }
/* 36 */   public void putChar(String key, char value) { throw new RuntimeException("Stub!"); }
/* 37 */   public void putShort(String key, short value) { throw new RuntimeException("Stub!"); }
/* 38 */   public void putFloat(String key, float value) { throw new RuntimeException("Stub!"); }
/* 39 */   public void putCharSequence(String key, CharSequence value) { throw new RuntimeException("Stub!"); }
/* 40 */   public void putParcelable(String key, Parcelable value) { throw new RuntimeException("Stub!"); }
/* 41 */   public void putSize(String key, Size value) { throw new RuntimeException("Stub!"); }
/* 42 */   public void putSizeF(String key, SizeF value) { throw new RuntimeException("Stub!"); }
/* 43 */   public void putParcelableArray(String key, Parcelable[] value) { throw new RuntimeException("Stub!"); }
/* 44 */   public void putParcelableArrayList(String key, ArrayList<? extends Parcelable> value) { throw new RuntimeException("Stub!"); }
/* 45 */   public void putSparseParcelableArray(String key, SparseArray<? extends Parcelable> value) { throw new RuntimeException("Stub!"); }
/* 46 */   public void putIntegerArrayList(String key, ArrayList<Integer> value) { throw new RuntimeException("Stub!"); }
/* 47 */   public void putStringArrayList(String key, ArrayList<String> value) { throw new RuntimeException("Stub!"); }
/* 48 */   public void putCharSequenceArrayList(String key, ArrayList<CharSequence> value) { throw new RuntimeException("Stub!"); }
/* 49 */   public void putSerializable(String key, Serializable value) { throw new RuntimeException("Stub!"); }
/* 50 */   public void putByteArray(String key, byte[] value) { throw new RuntimeException("Stub!"); }
/* 51 */   public void putShortArray(String key, short[] value) { throw new RuntimeException("Stub!"); }
/* 52 */   public void putCharArray(String key, char[] value) { throw new RuntimeException("Stub!"); }
/* 53 */   public void putFloatArray(String key, float[] value) { throw new RuntimeException("Stub!"); }
/* 54 */   public void putCharSequenceArray(String key, CharSequence[] value) { throw new RuntimeException("Stub!"); }
/* 55 */   public void putBundle(String key, Bundle value) { throw new RuntimeException("Stub!"); }
/* 56 */   public void putBinder(String key, IBinder value) { throw new RuntimeException("Stub!"); }
/* 57 */   public byte getByte(String key) { throw new RuntimeException("Stub!"); }
/* 58 */   public Byte getByte(String key, byte defaultValue) { throw new RuntimeException("Stub!"); }
/* 59 */   public char getChar(String key) { throw new RuntimeException("Stub!"); }
/* 60 */   public char getChar(String key, char defaultValue) { throw new RuntimeException("Stub!"); }
/* 61 */   public short getShort(String key) { throw new RuntimeException("Stub!"); }
/* 62 */   public short getShort(String key, short defaultValue) { throw new RuntimeException("Stub!"); }
/* 63 */   public float getFloat(String key) { throw new RuntimeException("Stub!"); }
/* 64 */   public float getFloat(String key, float defaultValue) { throw new RuntimeException("Stub!"); }
/* 65 */   public CharSequence getCharSequence(String key) { throw new RuntimeException("Stub!"); }
/* 66 */   public CharSequence getCharSequence(String key, CharSequence defaultValue) { throw new RuntimeException("Stub!"); }
/* 67 */   public Size getSize(String key) { throw new RuntimeException("Stub!"); }
/* 68 */   public SizeF getSizeF(String key) { throw new RuntimeException("Stub!"); }
/* 69 */   public Bundle getBundle(String key) { throw new RuntimeException("Stub!"); }
/* 70 */   public <T extends Parcelable> T getParcelable(String key) { throw new RuntimeException("Stub!"); }
/* 71 */   public Parcelable[] getParcelableArray(String key) { throw new RuntimeException("Stub!"); }
/* 72 */   public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String key) { throw new RuntimeException("Stub!"); }
/* 73 */   public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String key) { throw new RuntimeException("Stub!"); }
/* 74 */   public Serializable getSerializable(String key) { throw new RuntimeException("Stub!"); }
/* 75 */   public ArrayList<Integer> getIntegerArrayList(String key) { throw new RuntimeException("Stub!"); }
/* 76 */   public ArrayList<String> getStringArrayList(String key) { throw new RuntimeException("Stub!"); }
/* 77 */   public ArrayList<CharSequence> getCharSequenceArrayList(String key) { throw new RuntimeException("Stub!"); }
/* 78 */   public byte[] getByteArray(String key) { throw new RuntimeException("Stub!"); }
/* 79 */   public short[] getShortArray(String key) { throw new RuntimeException("Stub!"); }
/* 80 */   public char[] getCharArray(String key) { throw new RuntimeException("Stub!"); }
/* 81 */   public float[] getFloatArray(String key) { throw new RuntimeException("Stub!"); }
/* 82 */   public CharSequence[] getCharSequenceArray(String key) { throw new RuntimeException("Stub!"); }
/* 83 */   public IBinder getBinder(String key) { throw new RuntimeException("Stub!"); }
/* 84 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 85 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 86 */   public void readFromParcel(Parcel parcel) { throw new RuntimeException("Stub!"); }
/* 87 */   public synchronized String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 90 */   public static final Bundle EMPTY = null; public static final Parcelable.Creator<Bundle> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\Bundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */