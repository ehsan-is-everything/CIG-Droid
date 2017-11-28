/*     */ package android.renderscript;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FieldPacker
/*     */ {
/*  20 */   public FieldPacker(int len) { throw new RuntimeException("Stub!"); }
/*  21 */   public FieldPacker(byte[] data) { throw new RuntimeException("Stub!"); }
/*  22 */   public void align(int v) { throw new RuntimeException("Stub!"); }
/*  23 */   public void subalign(int v) { throw new RuntimeException("Stub!"); }
/*  24 */   public void reset() { throw new RuntimeException("Stub!"); }
/*  25 */   public void reset(int i) { throw new RuntimeException("Stub!"); }
/*  26 */   public void skip(int i) { throw new RuntimeException("Stub!"); }
/*  27 */   public void addI8(byte v) { throw new RuntimeException("Stub!"); }
/*  28 */   public byte subI8() { throw new RuntimeException("Stub!"); }
/*  29 */   public void addI16(short v) { throw new RuntimeException("Stub!"); }
/*  30 */   public short subI16() { throw new RuntimeException("Stub!"); }
/*  31 */   public void addI32(int v) { throw new RuntimeException("Stub!"); }
/*  32 */   public int subI32() { throw new RuntimeException("Stub!"); }
/*  33 */   public void addI64(long v) { throw new RuntimeException("Stub!"); }
/*  34 */   public long subI64() { throw new RuntimeException("Stub!"); }
/*  35 */   public void addU8(short v) { throw new RuntimeException("Stub!"); }
/*  36 */   public void addU16(int v) { throw new RuntimeException("Stub!"); }
/*  37 */   public void addU32(long v) { throw new RuntimeException("Stub!"); }
/*  38 */   public void addU64(long v) { throw new RuntimeException("Stub!"); }
/*  39 */   public void addF32(float v) { throw new RuntimeException("Stub!"); }
/*  40 */   public float subF32() { throw new RuntimeException("Stub!"); }
/*  41 */   public void addF64(double v) { throw new RuntimeException("Stub!"); }
/*  42 */   public double subF64() { throw new RuntimeException("Stub!"); }
/*  43 */   public void addObj(BaseObj obj) { throw new RuntimeException("Stub!"); }
/*  44 */   public void addF32(Float2 v) { throw new RuntimeException("Stub!"); }
/*  45 */   public void addF32(Float3 v) { throw new RuntimeException("Stub!"); }
/*  46 */   public void addF32(Float4 v) { throw new RuntimeException("Stub!"); }
/*  47 */   public void addF64(Double2 v) { throw new RuntimeException("Stub!"); }
/*  48 */   public void addF64(Double3 v) { throw new RuntimeException("Stub!"); }
/*  49 */   public void addF64(Double4 v) { throw new RuntimeException("Stub!"); }
/*  50 */   public void addI8(Byte2 v) { throw new RuntimeException("Stub!"); }
/*  51 */   public void addI8(Byte3 v) { throw new RuntimeException("Stub!"); }
/*  52 */   public void addI8(Byte4 v) { throw new RuntimeException("Stub!"); }
/*  53 */   public void addU8(Short2 v) { throw new RuntimeException("Stub!"); }
/*  54 */   public void addU8(Short3 v) { throw new RuntimeException("Stub!"); }
/*  55 */   public void addU8(Short4 v) { throw new RuntimeException("Stub!"); }
/*  56 */   public void addI16(Short2 v) { throw new RuntimeException("Stub!"); }
/*  57 */   public void addI16(Short3 v) { throw new RuntimeException("Stub!"); }
/*  58 */   public void addI16(Short4 v) { throw new RuntimeException("Stub!"); }
/*  59 */   public void addU16(Int2 v) { throw new RuntimeException("Stub!"); }
/*  60 */   public void addU16(Int3 v) { throw new RuntimeException("Stub!"); }
/*  61 */   public void addU16(Int4 v) { throw new RuntimeException("Stub!"); }
/*  62 */   public void addI32(Int2 v) { throw new RuntimeException("Stub!"); }
/*  63 */   public void addI32(Int3 v) { throw new RuntimeException("Stub!"); }
/*  64 */   public void addI32(Int4 v) { throw new RuntimeException("Stub!"); }
/*  65 */   public void addU32(Long2 v) { throw new RuntimeException("Stub!"); }
/*  66 */   public void addU32(Long3 v) { throw new RuntimeException("Stub!"); }
/*  67 */   public void addU32(Long4 v) { throw new RuntimeException("Stub!"); }
/*  68 */   public void addI64(Long2 v) { throw new RuntimeException("Stub!"); }
/*  69 */   public void addI64(Long3 v) { throw new RuntimeException("Stub!"); }
/*  70 */   public void addI64(Long4 v) { throw new RuntimeException("Stub!"); }
/*  71 */   public void addU64(Long2 v) { throw new RuntimeException("Stub!"); }
/*  72 */   public void addU64(Long3 v) { throw new RuntimeException("Stub!"); }
/*  73 */   public void addU64(Long4 v) { throw new RuntimeException("Stub!"); }
/*  74 */   public Float2 subFloat2() { throw new RuntimeException("Stub!"); }
/*  75 */   public Float3 subFloat3() { throw new RuntimeException("Stub!"); }
/*  76 */   public Float4 subFloat4() { throw new RuntimeException("Stub!"); }
/*  77 */   public Double2 subDouble2() { throw new RuntimeException("Stub!"); }
/*  78 */   public Double3 subDouble3() { throw new RuntimeException("Stub!"); }
/*  79 */   public Double4 subDouble4() { throw new RuntimeException("Stub!"); }
/*  80 */   public Byte2 subByte2() { throw new RuntimeException("Stub!"); }
/*  81 */   public Byte3 subByte3() { throw new RuntimeException("Stub!"); }
/*  82 */   public Byte4 subByte4() { throw new RuntimeException("Stub!"); }
/*  83 */   public Short2 subShort2() { throw new RuntimeException("Stub!"); }
/*  84 */   public Short3 subShort3() { throw new RuntimeException("Stub!"); }
/*  85 */   public Short4 subShort4() { throw new RuntimeException("Stub!"); }
/*  86 */   public Int2 subInt2() { throw new RuntimeException("Stub!"); }
/*  87 */   public Int3 subInt3() { throw new RuntimeException("Stub!"); }
/*  88 */   public Int4 subInt4() { throw new RuntimeException("Stub!"); }
/*  89 */   public Long2 subLong2() { throw new RuntimeException("Stub!"); }
/*  90 */   public Long3 subLong3() { throw new RuntimeException("Stub!"); }
/*  91 */   public Long4 subLong4() { throw new RuntimeException("Stub!"); }
/*  92 */   public void addMatrix(Matrix4f v) { throw new RuntimeException("Stub!"); }
/*  93 */   public Matrix4f subMatrix4f() { throw new RuntimeException("Stub!"); }
/*  94 */   public void addMatrix(Matrix3f v) { throw new RuntimeException("Stub!"); }
/*  95 */   public Matrix3f subMatrix3f() { throw new RuntimeException("Stub!"); }
/*  96 */   public void addMatrix(Matrix2f v) { throw new RuntimeException("Stub!"); }
/*  97 */   public Matrix2f subMatrix2f() { throw new RuntimeException("Stub!"); }
/*  98 */   public void addBoolean(boolean v) { throw new RuntimeException("Stub!"); }
/*  99 */   public boolean subBoolean() { throw new RuntimeException("Stub!"); }
/* 100 */   public final byte[] getData() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\FieldPacker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */