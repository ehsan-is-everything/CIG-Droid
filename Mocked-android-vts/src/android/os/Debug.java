/*     */ package android.os;
/*     */ 
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Debug
/*     */ {
/*     */   public static final int SHOW_CLASSLOADER = 2;
/*     */   public static final int SHOW_FULL_DETAIL = 1;
/*     */   public static final int SHOW_INITIALIZED = 4;
/*     */   @Deprecated
/*     */   public static final int TRACE_COUNT_ALLOCS = 1;
/*     */   
/*     */   public static class MemoryInfo
/*     */     implements Parcelable
/*     */   {
/*  23 */     public MemoryInfo() { throw new RuntimeException("Stub!"); }
/*  24 */     public int getTotalPss() { throw new RuntimeException("Stub!"); }
/*  25 */     public int getTotalSwappablePss() { throw new RuntimeException("Stub!"); }
/*  26 */     public int getTotalPrivateDirty() { throw new RuntimeException("Stub!"); }
/*  27 */     public int getTotalSharedDirty() { throw new RuntimeException("Stub!"); }
/*  28 */     public int getTotalPrivateClean() { throw new RuntimeException("Stub!"); }
/*  29 */     public int getTotalSharedClean() { throw new RuntimeException("Stub!"); }
/*  30 */     public String getMemoryStat(String statName) { throw new RuntimeException("Stub!"); }
/*  31 */     public Map<String, String> getMemoryStats() { throw new RuntimeException("Stub!"); }
/*  32 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  33 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  34 */     public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
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
/*  45 */     public static final Parcelable.Creator<MemoryInfo> CREATOR = null;
/*     */     public int dalvikPrivateDirty;
/*     */     public int dalvikPss;
/*     */     public int dalvikSharedDirty; public int nativePrivateDirty; public int nativePss; public int nativeSharedDirty; public int otherPrivateDirty; public int otherPss; public int otherSharedDirty; }
/*     */   @Deprecated
/*  50 */   public static class InstructionCount { public InstructionCount() { throw new RuntimeException("Stub!"); }
/*  51 */     public boolean resetAndStart() { throw new RuntimeException("Stub!"); }
/*  52 */     public boolean collect() { throw new RuntimeException("Stub!"); }
/*  53 */     public int globalTotal() { throw new RuntimeException("Stub!"); }
/*  54 */     public int globalMethodInvocations() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  56 */   Debug() { throw new RuntimeException("Stub!"); }
/*  57 */   public static void waitForDebugger() { throw new RuntimeException("Stub!"); }
/*  58 */   public static boolean waitingForDebugger() { throw new RuntimeException("Stub!"); }
/*  59 */   public static boolean isDebuggerConnected() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  61 */   public static void changeDebugPort(int port) { throw new RuntimeException("Stub!"); }
/*  62 */   public static void startNativeTracing() { throw new RuntimeException("Stub!"); }
/*  63 */   public static void stopNativeTracing() { throw new RuntimeException("Stub!"); }
/*  64 */   public static void enableEmulatorTraceOutput() { throw new RuntimeException("Stub!"); }
/*  65 */   public static void startMethodTracing() { throw new RuntimeException("Stub!"); }
/*  66 */   public static void startMethodTracing(String tracePath) { throw new RuntimeException("Stub!"); }
/*  67 */   public static void startMethodTracing(String tracePath, int bufferSize) { throw new RuntimeException("Stub!"); }
/*  68 */   public static void startMethodTracing(String tracePath, int bufferSize, int flags) { throw new RuntimeException("Stub!"); }
/*  69 */   public static void startMethodTracingSampling(String tracePath, int bufferSize, int intervalUs) { throw new RuntimeException("Stub!"); }
/*  70 */   public static void stopMethodTracing() { throw new RuntimeException("Stub!"); }
/*  71 */   public static long threadCpuTimeNanos() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  73 */   public static void startAllocCounting() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  75 */   public static void stopAllocCounting() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  77 */   public static int getGlobalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  79 */   public static void resetGlobalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public static int getGlobalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  83 */   public static void resetGlobalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  85 */   public static int getGlobalFreedCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  87 */   public static void resetGlobalFreedCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  89 */   public static int getGlobalFreedSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  91 */   public static void resetGlobalFreedSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  93 */   public static int getGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  95 */   public static void resetGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  97 */   public static int getGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  99 */   public static void resetGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 101 */   public static int getGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 103 */   public static void resetGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 105 */   public static int getGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 107 */   public static void resetGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 109 */   public static void resetGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 111 */   public static int getGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 113 */   public static int getGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 115 */   public static void resetGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 117 */   public static int getGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 119 */   public static void resetGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 121 */   public static int getThreadAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 123 */   public static void resetThreadAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 125 */   public static int getThreadAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 127 */   public static void resetThreadAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 129 */   public static int getThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 131 */   public static void resetThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 133 */   public static int getThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 135 */   public static void resetThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 137 */   public static int getThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 139 */   public static void resetThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 141 */   public static void resetAllCounts() { throw new RuntimeException("Stub!"); }
/* 142 */   public static String getRuntimeStat(String statName) { throw new RuntimeException("Stub!"); }
/* 143 */   public static Map<String, String> getRuntimeStats() { throw new RuntimeException("Stub!"); }
/*     */   public static native long getNativeHeapSize();
/*     */   public static native long getNativeHeapAllocatedSize();
/*     */   public static native long getNativeHeapFreeSize();
/*     */   public static native void getMemoryInfo(MemoryInfo paramMemoryInfo);
/*     */   public static native long getPss();
/*     */   @Deprecated
/* 150 */   public static int setAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 152 */   public static int setGlobalAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
/* 153 */   public static void printLoadedClasses(int flags) { throw new RuntimeException("Stub!"); }
/* 154 */   public static int getLoadedClassCount() { throw new RuntimeException("Stub!"); }
/* 155 */   public static void dumpHprofData(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/*     */   public static native int getBinderSentTransactions();
/*     */   public static native int getBinderReceivedTransactions();
/*     */   public static final native int getBinderLocalObjectCount();
/*     */   public static final native int getBinderProxyObjectCount();
/*     */   public static final native int getBinderDeathObjectCount();
/* 161 */   public static boolean dumpService(String name, FileDescriptor fd, String[] args) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\Debug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */