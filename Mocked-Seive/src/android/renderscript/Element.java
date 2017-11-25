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
/*     */ public class Element
/*     */   extends BaseObj
/*     */ {
/*     */   public static enum DataType
/*     */   {
/*  23 */     BOOLEAN, 
/*  24 */     FLOAT_16, 
/*  25 */     FLOAT_32, 
/*  26 */     FLOAT_64, 
/*  27 */     MATRIX_2X2, 
/*  28 */     MATRIX_3X3, 
/*  29 */     MATRIX_4X4, 
/*  30 */     NONE, 
/*  31 */     RS_ALLOCATION, 
/*  32 */     RS_ELEMENT, 
/*  33 */     RS_FONT, 
/*  34 */     RS_MESH, 
/*  35 */     RS_PROGRAM_FRAGMENT, 
/*  36 */     RS_PROGRAM_RASTER, 
/*  37 */     RS_PROGRAM_STORE, 
/*  38 */     RS_PROGRAM_VERTEX, 
/*  39 */     RS_SAMPLER, 
/*  40 */     RS_SCRIPT, 
/*  41 */     RS_TYPE, 
/*  42 */     SIGNED_16, 
/*  43 */     SIGNED_32, 
/*  44 */     SIGNED_64, 
/*  45 */     SIGNED_8, 
/*  46 */     UNSIGNED_16, 
/*  47 */     UNSIGNED_32, 
/*  48 */     UNSIGNED_4_4_4_4, 
/*  49 */     UNSIGNED_5_5_5_1, 
/*  50 */     UNSIGNED_5_6_5, 
/*  51 */     UNSIGNED_64, 
/*  52 */     UNSIGNED_8;
/*     */     
/*     */     private DataType() {} }
/*     */   
/*  56 */   public static enum DataKind { PIXEL_A, 
/*  57 */     PIXEL_DEPTH, 
/*  58 */     PIXEL_L, 
/*  59 */     PIXEL_LA, 
/*  60 */     PIXEL_RGB, 
/*  61 */     PIXEL_RGBA, 
/*  62 */     PIXEL_YUV, 
/*  63 */     USER;
/*     */     
/*     */     private DataKind() {} }
/*     */   
/*  67 */   public static class Builder { public Builder(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  68 */     public Builder add(Element element, String name, int arraySize) { throw new RuntimeException("Stub!"); }
/*  69 */     public Builder add(Element element, String name) { throw new RuntimeException("Stub!"); }
/*  70 */     public Element create() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  72 */   Element() { throw new RuntimeException("Stub!"); }
/*  73 */   public int getBytesSize() { throw new RuntimeException("Stub!"); }
/*  74 */   public int getVectorSize() { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean isComplex() { throw new RuntimeException("Stub!"); }
/*  76 */   public int getSubElementCount() { throw new RuntimeException("Stub!"); }
/*  77 */   public Element getSubElement(int index) { throw new RuntimeException("Stub!"); }
/*  78 */   public String getSubElementName(int index) { throw new RuntimeException("Stub!"); }
/*  79 */   public int getSubElementArraySize(int index) { throw new RuntimeException("Stub!"); }
/*  80 */   public int getSubElementOffsetBytes(int index) { throw new RuntimeException("Stub!"); }
/*  81 */   public DataType getDataType() { throw new RuntimeException("Stub!"); }
/*  82 */   public DataKind getDataKind() { throw new RuntimeException("Stub!"); }
/*  83 */   public static Element BOOLEAN(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  84 */   public static Element U8(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  85 */   public static Element I8(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  86 */   public static Element U16(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  87 */   public static Element I16(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  88 */   public static Element U32(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  89 */   public static Element I32(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  90 */   public static Element U64(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  91 */   public static Element I64(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  92 */   public static Element F16(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  93 */   public static Element F32(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  94 */   public static Element F64(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  95 */   public static Element ELEMENT(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  96 */   public static Element TYPE(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  97 */   public static Element ALLOCATION(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  98 */   public static Element SAMPLER(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  99 */   public static Element SCRIPT(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 100 */   public static Element MESH(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 101 */   public static Element PROGRAM_FRAGMENT(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 102 */   public static Element PROGRAM_VERTEX(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 103 */   public static Element PROGRAM_RASTER(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 104 */   public static Element PROGRAM_STORE(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 105 */   public static Element FONT(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 106 */   public static Element A_8(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 107 */   public static Element RGB_565(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 108 */   public static Element RGB_888(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 109 */   public static Element RGBA_5551(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 110 */   public static Element RGBA_4444(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 111 */   public static Element RGBA_8888(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 112 */   public static Element F16_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 113 */   public static Element F16_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 114 */   public static Element F16_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 115 */   public static Element F32_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 116 */   public static Element F32_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 117 */   public static Element F32_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 118 */   public static Element F64_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 119 */   public static Element F64_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 120 */   public static Element F64_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 121 */   public static Element U8_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 122 */   public static Element U8_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 123 */   public static Element U8_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 124 */   public static Element I8_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 125 */   public static Element I8_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 126 */   public static Element I8_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 127 */   public static Element U16_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 128 */   public static Element U16_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 129 */   public static Element U16_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 130 */   public static Element I16_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 131 */   public static Element I16_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 132 */   public static Element I16_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 133 */   public static Element U32_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 134 */   public static Element U32_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 135 */   public static Element U32_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 136 */   public static Element I32_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 137 */   public static Element I32_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 138 */   public static Element I32_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 139 */   public static Element U64_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 140 */   public static Element U64_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 141 */   public static Element U64_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 142 */   public static Element I64_2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 143 */   public static Element I64_3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 144 */   public static Element I64_4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 145 */   public static Element YUV(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 146 */   public static Element MATRIX_4X4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 148 */   public static Element MATRIX4X4(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 149 */   public static Element MATRIX_3X3(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 150 */   public static Element MATRIX_2X2(RenderScript rs) { throw new RuntimeException("Stub!"); }
/* 151 */   public static Element createVector(RenderScript rs, DataType dt, int size) { throw new RuntimeException("Stub!"); }
/* 152 */   public static Element createPixel(RenderScript rs, DataType dt, DataKind dk) { throw new RuntimeException("Stub!"); }
/* 153 */   public boolean isCompatible(Element e) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\Element.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */