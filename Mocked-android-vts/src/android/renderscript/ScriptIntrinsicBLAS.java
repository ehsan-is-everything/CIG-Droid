/*     */ package android.renderscript;
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ScriptIntrinsicBLAS
/*     */   extends ScriptIntrinsic
/*     */ {
/*     */   public static final int CONJ_TRANSPOSE = 113;
/*     */   
/*     */ 
/*     */   public static final int LEFT = 141;
/*     */   
/*     */   public static final int LOWER = 122;
/*     */   public static final int NON_UNIT = 131;
/*     */   public static final int NO_TRANSPOSE = 111;
/*     */   public static final int RIGHT = 142;
/*     */   public static final int TRANSPOSE = 112;
/*     */   public static final int UNIT = 132;
/*     */   public static final int UPPER = 121;
/*     */   
/*  21 */   ScriptIntrinsicBLAS() { throw new RuntimeException("Stub!"); }
/*  22 */   public static ScriptIntrinsicBLAS create(RenderScript rs) { throw new RuntimeException("Stub!"); }
/*  23 */   public void SGEMV(int TransA, float alpha, Allocation A, Allocation X, int incX, float beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  24 */   public void DGEMV(int TransA, double alpha, Allocation A, Allocation X, int incX, double beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  25 */   public void CGEMV(int TransA, Float2 alpha, Allocation A, Allocation X, int incX, Float2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  26 */   public void ZGEMV(int TransA, Double2 alpha, Allocation A, Allocation X, int incX, Double2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  27 */   public void SGBMV(int TransA, int KL, int KU, float alpha, Allocation A, Allocation X, int incX, float beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  28 */   public void DGBMV(int TransA, int KL, int KU, double alpha, Allocation A, Allocation X, int incX, double beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  29 */   public void CGBMV(int TransA, int KL, int KU, Float2 alpha, Allocation A, Allocation X, int incX, Float2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  30 */   public void ZGBMV(int TransA, int KL, int KU, Double2 alpha, Allocation A, Allocation X, int incX, Double2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  31 */   public void STRMV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  32 */   public void DTRMV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  33 */   public void CTRMV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  34 */   public void ZTRMV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  35 */   public void STBMV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  36 */   public void DTBMV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  37 */   public void CTBMV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  38 */   public void ZTBMV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  39 */   public void STPMV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  40 */   public void DTPMV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  41 */   public void CTPMV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  42 */   public void ZTPMV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  43 */   public void STRSV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  44 */   public void DTRSV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  45 */   public void CTRSV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  46 */   public void ZTRSV(int Uplo, int TransA, int Diag, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  47 */   public void STBSV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  48 */   public void DTBSV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  49 */   public void CTBSV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  50 */   public void ZTBSV(int Uplo, int TransA, int Diag, int K, Allocation A, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  51 */   public void STPSV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  52 */   public void DTPSV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  53 */   public void CTPSV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  54 */   public void ZTPSV(int Uplo, int TransA, int Diag, Allocation Ap, Allocation X, int incX) { throw new RuntimeException("Stub!"); }
/*  55 */   public void SSYMV(int Uplo, float alpha, Allocation A, Allocation X, int incX, float beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  56 */   public void SSBMV(int Uplo, int K, float alpha, Allocation A, Allocation X, int incX, float beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  57 */   public void SSPMV(int Uplo, float alpha, Allocation Ap, Allocation X, int incX, float beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  58 */   public void SGER(float alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  59 */   public void SSYR(int Uplo, float alpha, Allocation X, int incX, Allocation A) { throw new RuntimeException("Stub!"); }
/*  60 */   public void SSPR(int Uplo, float alpha, Allocation X, int incX, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  61 */   public void SSYR2(int Uplo, float alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  62 */   public void SSPR2(int Uplo, float alpha, Allocation X, int incX, Allocation Y, int incY, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  63 */   public void DSYMV(int Uplo, double alpha, Allocation A, Allocation X, int incX, double beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  64 */   public void DSBMV(int Uplo, int K, double alpha, Allocation A, Allocation X, int incX, double beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  65 */   public void DSPMV(int Uplo, double alpha, Allocation Ap, Allocation X, int incX, double beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  66 */   public void DGER(double alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  67 */   public void DSYR(int Uplo, double alpha, Allocation X, int incX, Allocation A) { throw new RuntimeException("Stub!"); }
/*  68 */   public void DSPR(int Uplo, double alpha, Allocation X, int incX, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  69 */   public void DSYR2(int Uplo, double alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  70 */   public void DSPR2(int Uplo, double alpha, Allocation X, int incX, Allocation Y, int incY, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  71 */   public void CHEMV(int Uplo, Float2 alpha, Allocation A, Allocation X, int incX, Float2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  72 */   public void CHBMV(int Uplo, int K, Float2 alpha, Allocation A, Allocation X, int incX, Float2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  73 */   public void CHPMV(int Uplo, Float2 alpha, Allocation Ap, Allocation X, int incX, Float2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  74 */   public void CGERU(Float2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  75 */   public void CGERC(Float2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  76 */   public void CHER(int Uplo, float alpha, Allocation X, int incX, Allocation A) { throw new RuntimeException("Stub!"); }
/*  77 */   public void CHPR(int Uplo, float alpha, Allocation X, int incX, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  78 */   public void CHER2(int Uplo, Float2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  79 */   public void CHPR2(int Uplo, Float2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  80 */   public void ZHEMV(int Uplo, Double2 alpha, Allocation A, Allocation X, int incX, Double2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  81 */   public void ZHBMV(int Uplo, int K, Double2 alpha, Allocation A, Allocation X, int incX, Double2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  82 */   public void ZHPMV(int Uplo, Double2 alpha, Allocation Ap, Allocation X, int incX, Double2 beta, Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
/*  83 */   public void ZGERU(Double2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  84 */   public void ZGERC(Double2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  85 */   public void ZHER(int Uplo, double alpha, Allocation X, int incX, Allocation A) { throw new RuntimeException("Stub!"); }
/*  86 */   public void ZHPR(int Uplo, double alpha, Allocation X, int incX, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  87 */   public void ZHER2(int Uplo, Double2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation A) { throw new RuntimeException("Stub!"); }
/*  88 */   public void ZHPR2(int Uplo, Double2 alpha, Allocation X, int incX, Allocation Y, int incY, Allocation Ap) { throw new RuntimeException("Stub!"); }
/*  89 */   public void SGEMM(int TransA, int TransB, float alpha, Allocation A, Allocation B, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  90 */   public void DGEMM(int TransA, int TransB, double alpha, Allocation A, Allocation B, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  91 */   public void CGEMM(int TransA, int TransB, Float2 alpha, Allocation A, Allocation B, Float2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  92 */   public void ZGEMM(int TransA, int TransB, Double2 alpha, Allocation A, Allocation B, Double2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  93 */   public void SSYMM(int Side, int Uplo, float alpha, Allocation A, Allocation B, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  94 */   public void DSYMM(int Side, int Uplo, double alpha, Allocation A, Allocation B, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  95 */   public void CSYMM(int Side, int Uplo, Float2 alpha, Allocation A, Allocation B, Float2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  96 */   public void ZSYMM(int Side, int Uplo, Double2 alpha, Allocation A, Allocation B, Double2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  97 */   public void SSYRK(int Uplo, int Trans, float alpha, Allocation A, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  98 */   public void DSYRK(int Uplo, int Trans, double alpha, Allocation A, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/*  99 */   public void CSYRK(int Uplo, int Trans, Float2 alpha, Allocation A, Float2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 100 */   public void ZSYRK(int Uplo, int Trans, Double2 alpha, Allocation A, Double2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 101 */   public void SSYR2K(int Uplo, int Trans, float alpha, Allocation A, Allocation B, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 102 */   public void DSYR2K(int Uplo, int Trans, double alpha, Allocation A, Allocation B, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 103 */   public void CSYR2K(int Uplo, int Trans, Float2 alpha, Allocation A, Allocation B, Float2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 104 */   public void ZSYR2K(int Uplo, int Trans, Double2 alpha, Allocation A, Allocation B, Double2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 105 */   public void STRMM(int Side, int Uplo, int TransA, int Diag, float alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 106 */   public void DTRMM(int Side, int Uplo, int TransA, int Diag, double alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 107 */   public void CTRMM(int Side, int Uplo, int TransA, int Diag, Float2 alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 108 */   public void ZTRMM(int Side, int Uplo, int TransA, int Diag, Double2 alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 109 */   public void STRSM(int Side, int Uplo, int TransA, int Diag, float alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 110 */   public void DTRSM(int Side, int Uplo, int TransA, int Diag, double alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 111 */   public void CTRSM(int Side, int Uplo, int TransA, int Diag, Float2 alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 112 */   public void ZTRSM(int Side, int Uplo, int TransA, int Diag, Double2 alpha, Allocation A, Allocation B) { throw new RuntimeException("Stub!"); }
/* 113 */   public void CHEMM(int Side, int Uplo, Float2 alpha, Allocation A, Allocation B, Float2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 114 */   public void ZHEMM(int Side, int Uplo, Double2 alpha, Allocation A, Allocation B, Double2 beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 115 */   public void CHERK(int Uplo, int Trans, float alpha, Allocation A, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 116 */   public void ZHERK(int Uplo, int Trans, double alpha, Allocation A, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 117 */   public void CHER2K(int Uplo, int Trans, Float2 alpha, Allocation A, Allocation B, float beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 118 */   public void ZHER2K(int Uplo, int Trans, Double2 alpha, Allocation A, Allocation B, double beta, Allocation C) { throw new RuntimeException("Stub!"); }
/* 119 */   public void BNNM(Allocation A, int a_offset, Allocation B, int b_offset, Allocation C, int c_offset, int c_mult) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\ScriptIntrinsicBLAS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */