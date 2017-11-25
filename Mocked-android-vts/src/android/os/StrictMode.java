/*    */ package android.os;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class StrictMode
/*    */ {
/*    */   public static final class ThreadPolicy
/*    */   {
/*    */     public static final class Builder
/*    */     {
/* 23 */       public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */       public Builder(StrictMode.ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
/* 25 */       public Builder detectAll() { throw new RuntimeException("Stub!"); }
/* 26 */       public Builder permitAll() { throw new RuntimeException("Stub!"); }
/* 27 */       public Builder detectNetwork() { throw new RuntimeException("Stub!"); }
/* 28 */       public Builder permitNetwork() { throw new RuntimeException("Stub!"); }
/* 29 */       public Builder detectDiskReads() { throw new RuntimeException("Stub!"); }
/* 30 */       public Builder permitDiskReads() { throw new RuntimeException("Stub!"); }
/* 31 */       public Builder detectCustomSlowCalls() { throw new RuntimeException("Stub!"); }
/* 32 */       public Builder permitCustomSlowCalls() { throw new RuntimeException("Stub!"); }
/* 33 */       public Builder permitResourceMismatches() { throw new RuntimeException("Stub!"); }
/* 34 */       public Builder detectUnbufferedIo() { throw new RuntimeException("Stub!"); }
/* 35 */       public Builder permitUnbufferedIo() { throw new RuntimeException("Stub!"); }
/* 36 */       public Builder detectResourceMismatches() { throw new RuntimeException("Stub!"); }
/* 37 */       public Builder detectDiskWrites() { throw new RuntimeException("Stub!"); }
/* 38 */       public Builder permitDiskWrites() { throw new RuntimeException("Stub!"); }
/* 39 */       public Builder penaltyDialog() { throw new RuntimeException("Stub!"); }
/* 40 */       public Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
/* 41 */       public Builder penaltyDeathOnNetwork() { throw new RuntimeException("Stub!"); }
/* 42 */       public Builder penaltyFlashScreen() { throw new RuntimeException("Stub!"); }
/* 43 */       public Builder penaltyLog() { throw new RuntimeException("Stub!"); }
/* 44 */       public Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
/* 45 */       public StrictMode.ThreadPolicy build() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 47 */     ThreadPolicy() { throw new RuntimeException("Stub!"); }
/* 48 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/* 50 */     public static final ThreadPolicy LAX = null;
/*    */   }
/*    */   
/*    */ 
/*    */   public static final class VmPolicy {
/*    */     public static final class Builder {
/* 56 */       public Builder() { throw new RuntimeException("Stub!"); }
/* 57 */       public Builder(StrictMode.VmPolicy base) { throw new RuntimeException("Stub!"); }
/* 58 */       public Builder setClassInstanceLimit(Class klass, int instanceLimit) { throw new RuntimeException("Stub!"); }
/* 59 */       public Builder detectActivityLeaks() { throw new RuntimeException("Stub!"); }
/* 60 */       public Builder detectAll() { throw new RuntimeException("Stub!"); }
/* 61 */       public Builder detectLeakedSqlLiteObjects() { throw new RuntimeException("Stub!"); }
/* 62 */       public Builder detectLeakedClosableObjects() { throw new RuntimeException("Stub!"); }
/* 63 */       public Builder detectLeakedRegistrationObjects() { throw new RuntimeException("Stub!"); }
/* 64 */       public Builder detectFileUriExposure() { throw new RuntimeException("Stub!"); }
/* 65 */       public Builder detectCleartextNetwork() { throw new RuntimeException("Stub!"); }
/* 66 */       public Builder detectContentUriWithoutPermission() { throw new RuntimeException("Stub!"); }
/* 67 */       public Builder detectUntaggedSockets() { throw new RuntimeException("Stub!"); }
/* 68 */       public Builder penaltyDeath() { throw new RuntimeException("Stub!"); }
/* 69 */       public Builder penaltyDeathOnCleartextNetwork() { throw new RuntimeException("Stub!"); }
/* 70 */       public Builder penaltyDeathOnFileUriExposure() { throw new RuntimeException("Stub!"); }
/* 71 */       public Builder penaltyLog() { throw new RuntimeException("Stub!"); }
/* 72 */       public Builder penaltyDropBox() { throw new RuntimeException("Stub!"); }
/* 73 */       public StrictMode.VmPolicy build() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 75 */     VmPolicy() { throw new RuntimeException("Stub!"); }
/* 76 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/* 78 */     public static final VmPolicy LAX = null; }
/*    */   
/* 80 */   StrictMode() { throw new RuntimeException("Stub!"); }
/* 81 */   public static void setThreadPolicy(ThreadPolicy policy) { throw new RuntimeException("Stub!"); }
/* 82 */   public static ThreadPolicy getThreadPolicy() { throw new RuntimeException("Stub!"); }
/* 83 */   public static ThreadPolicy allowThreadDiskWrites() { throw new RuntimeException("Stub!"); }
/* 84 */   public static ThreadPolicy allowThreadDiskReads() { throw new RuntimeException("Stub!"); }
/* 85 */   public static void setVmPolicy(VmPolicy policy) { throw new RuntimeException("Stub!"); }
/* 86 */   public static VmPolicy getVmPolicy() { throw new RuntimeException("Stub!"); }
/* 87 */   public static void enableDefaults() { throw new RuntimeException("Stub!"); }
/* 88 */   public static void noteSlowCall(String name) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\StrictMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */