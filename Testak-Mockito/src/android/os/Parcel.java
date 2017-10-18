/*     */ package android.os;
/*     */ 
/*     */ import android.util.Size;
/*     */ import android.util.SizeF;
/*     */ import android.util.SparseArray;
/*     */ import android.util.SparseBooleanArray;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Parcel
/*     */ {
/*  20 */   Parcel() { throw new RuntimeException("Stub!"); }
/*  21 */   public static Parcel obtain() { throw new RuntimeException("Stub!"); }
/*  22 */   public final void recycle() { throw new RuntimeException("Stub!"); }
/*  23 */   public final int dataSize() { throw new RuntimeException("Stub!"); }
/*  24 */   public final int dataAvail() { throw new RuntimeException("Stub!"); }
/*  25 */   public final int dataPosition() { throw new RuntimeException("Stub!"); }
/*  26 */   public final int dataCapacity() { throw new RuntimeException("Stub!"); }
/*  27 */   public final void setDataSize(int size) { throw new RuntimeException("Stub!"); }
/*  28 */   public final void setDataPosition(int pos) { throw new RuntimeException("Stub!"); }
/*  29 */   public final void setDataCapacity(int size) { throw new RuntimeException("Stub!"); }
/*  30 */   public final byte[] marshall() { throw new RuntimeException("Stub!"); }
/*  31 */   public final void unmarshall(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
/*  32 */   public final void appendFrom(Parcel parcel, int offset, int length) { throw new RuntimeException("Stub!"); }
/*  33 */   public final boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
/*  34 */   public final void writeInterfaceToken(String interfaceName) { throw new RuntimeException("Stub!"); }
/*  35 */   public final void enforceInterface(String interfaceName) { throw new RuntimeException("Stub!"); }
/*  36 */   public final void writeByteArray(byte[] b) { throw new RuntimeException("Stub!"); }
/*  37 */   public final void writeByteArray(byte[] b, int offset, int len) { throw new RuntimeException("Stub!"); }
/*  38 */   public final void writeInt(int val) { throw new RuntimeException("Stub!"); }
/*  39 */   public final void writeLong(long val) { throw new RuntimeException("Stub!"); }
/*  40 */   public final void writeFloat(float val) { throw new RuntimeException("Stub!"); }
/*  41 */   public final void writeDouble(double val) { throw new RuntimeException("Stub!"); }
/*  42 */   public final void writeString(String val) { throw new RuntimeException("Stub!"); }
/*  43 */   public final void writeStrongBinder(IBinder val) { throw new RuntimeException("Stub!"); }
/*  44 */   public final void writeStrongInterface(IInterface val) { throw new RuntimeException("Stub!"); }
/*  45 */   public final void writeFileDescriptor(FileDescriptor val) { throw new RuntimeException("Stub!"); }
/*  46 */   public final void writeByte(byte val) { throw new RuntimeException("Stub!"); }
/*  47 */   public final void writeMap(Map val) { throw new RuntimeException("Stub!"); }
/*  48 */   public final void writeBundle(Bundle val) { throw new RuntimeException("Stub!"); }
/*  49 */   public final void writePersistableBundle(PersistableBundle val) { throw new RuntimeException("Stub!"); }
/*  50 */   public final void writeSize(Size val) { throw new RuntimeException("Stub!"); }
/*  51 */   public final void writeSizeF(SizeF val) { throw new RuntimeException("Stub!"); }
/*  52 */   public final void writeList(List val) { throw new RuntimeException("Stub!"); }
/*  53 */   public final void writeArray(Object[] val) { throw new RuntimeException("Stub!"); }
/*  54 */   public final void writeSparseArray(SparseArray<Object> val) { throw new RuntimeException("Stub!"); }
/*  55 */   public final void writeSparseBooleanArray(SparseBooleanArray val) { throw new RuntimeException("Stub!"); }
/*  56 */   public final void writeBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); }
/*  57 */   public final boolean[] createBooleanArray() { throw new RuntimeException("Stub!"); }
/*  58 */   public final void readBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); }
/*  59 */   public final void writeCharArray(char[] val) { throw new RuntimeException("Stub!"); }
/*  60 */   public final char[] createCharArray() { throw new RuntimeException("Stub!"); }
/*  61 */   public final void readCharArray(char[] val) { throw new RuntimeException("Stub!"); }
/*  62 */   public final void writeIntArray(int[] val) { throw new RuntimeException("Stub!"); }
/*  63 */   public final int[] createIntArray() { throw new RuntimeException("Stub!"); }
/*  64 */   public final void readIntArray(int[] val) { throw new RuntimeException("Stub!"); }
/*  65 */   public final void writeLongArray(long[] val) { throw new RuntimeException("Stub!"); }
/*  66 */   public final long[] createLongArray() { throw new RuntimeException("Stub!"); }
/*  67 */   public final void readLongArray(long[] val) { throw new RuntimeException("Stub!"); }
/*  68 */   public final void writeFloatArray(float[] val) { throw new RuntimeException("Stub!"); }
/*  69 */   public final float[] createFloatArray() { throw new RuntimeException("Stub!"); }
/*  70 */   public final void readFloatArray(float[] val) { throw new RuntimeException("Stub!"); }
/*  71 */   public final void writeDoubleArray(double[] val) { throw new RuntimeException("Stub!"); }
/*  72 */   public final double[] createDoubleArray() { throw new RuntimeException("Stub!"); }
/*  73 */   public final void readDoubleArray(double[] val) { throw new RuntimeException("Stub!"); }
/*  74 */   public final void writeStringArray(String[] val) { throw new RuntimeException("Stub!"); }
/*  75 */   public final String[] createStringArray() { throw new RuntimeException("Stub!"); }
/*  76 */   public final void readStringArray(String[] val) { throw new RuntimeException("Stub!"); }
/*  77 */   public final void writeBinderArray(IBinder[] val) { throw new RuntimeException("Stub!"); }
/*  78 */   public final IBinder[] createBinderArray() { throw new RuntimeException("Stub!"); }
/*  79 */   public final void readBinderArray(IBinder[] val) { throw new RuntimeException("Stub!"); }
/*  80 */   public final <T extends Parcelable> void writeTypedList(List<T> val) { throw new RuntimeException("Stub!"); }
/*  81 */   public final void writeStringList(List<String> val) { throw new RuntimeException("Stub!"); }
/*  82 */   public final void writeBinderList(List<IBinder> val) { throw new RuntimeException("Stub!"); }
/*  83 */   public final <T extends Parcelable> void writeTypedArray(T[] val, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*  84 */   public final <T extends Parcelable> void writeTypedObject(T val, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*  85 */   public final void writeValue(Object v) { throw new RuntimeException("Stub!"); }
/*  86 */   public final void writeParcelable(Parcelable p, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*  87 */   public final void writeSerializable(Serializable s) { throw new RuntimeException("Stub!"); }
/*  88 */   public final void writeException(Exception e) { throw new RuntimeException("Stub!"); }
/*  89 */   public final void writeNoException() { throw new RuntimeException("Stub!"); }
/*  90 */   public final void readException() { throw new RuntimeException("Stub!"); }
/*  91 */   public final void readException(int code, String msg) { throw new RuntimeException("Stub!"); }
/*  92 */   public final int readInt() { throw new RuntimeException("Stub!"); }
/*  93 */   public final long readLong() { throw new RuntimeException("Stub!"); }
/*  94 */   public final float readFloat() { throw new RuntimeException("Stub!"); }
/*  95 */   public final double readDouble() { throw new RuntimeException("Stub!"); }
/*  96 */   public final String readString() { throw new RuntimeException("Stub!"); }
/*  97 */   public final IBinder readStrongBinder() { throw new RuntimeException("Stub!"); }
/*  98 */   public final ParcelFileDescriptor readFileDescriptor() { throw new RuntimeException("Stub!"); }
/*  99 */   public final byte readByte() { throw new RuntimeException("Stub!"); }
/* 100 */   public final void readMap(Map outVal, ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 101 */   public final void readList(List outVal, ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 102 */   public final HashMap readHashMap(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 103 */   public final Bundle readBundle() { throw new RuntimeException("Stub!"); }
/* 104 */   public final Bundle readBundle(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 105 */   public final PersistableBundle readPersistableBundle() { throw new RuntimeException("Stub!"); }
/* 106 */   public final PersistableBundle readPersistableBundle(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 107 */   public final Size readSize() { throw new RuntimeException("Stub!"); }
/* 108 */   public final SizeF readSizeF() { throw new RuntimeException("Stub!"); }
/* 109 */   public final byte[] createByteArray() { throw new RuntimeException("Stub!"); }
/* 110 */   public final void readByteArray(byte[] val) { throw new RuntimeException("Stub!"); }
/* 111 */   public final ArrayList readArrayList(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 112 */   public final Object[] readArray(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 113 */   public final SparseArray readSparseArray(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 114 */   public final SparseBooleanArray readSparseBooleanArray() { throw new RuntimeException("Stub!"); }
/* 115 */   public final <T> ArrayList<T> createTypedArrayList(Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
/* 116 */   public final <T> void readTypedList(List<T> list, Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
/* 117 */   public final ArrayList<String> createStringArrayList() { throw new RuntimeException("Stub!"); }
/* 118 */   public final ArrayList<IBinder> createBinderArrayList() { throw new RuntimeException("Stub!"); }
/* 119 */   public final void readStringList(List<String> list) { throw new RuntimeException("Stub!"); }
/* 120 */   public final void readBinderList(List<IBinder> list) { throw new RuntimeException("Stub!"); }
/* 121 */   public final <T> T[] createTypedArray(Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
/* 122 */   public final <T> void readTypedArray(T[] val, Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
/* 123 */   public final <T> T readTypedObject(Parcelable.Creator<T> c) { throw new RuntimeException("Stub!"); }
/* 124 */   public final <T extends Parcelable> void writeParcelableArray(T[] value, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 125 */   public final Object readValue(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/*     */   
/* 127 */   public final <T extends Parcelable> T readParcelable(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 128 */   public final Parcelable[] readParcelableArray(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 129 */   public final Serializable readSerializable() { throw new RuntimeException("Stub!"); }
/* 130 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*     */   
/* 132 */   public static final Parcelable.Creator<String> STRING_CREATOR = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\Parcel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */