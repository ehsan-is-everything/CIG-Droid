/*    */ package android.printservice;
/*    */ 
/*    */ import android.print.PrintJobId;
/*    */ import android.print.PrintJobInfo;
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
/*    */ public final class PrintJob
/*    */ {
/* 20 */   PrintJob() { throw new RuntimeException("Stub!"); }
/* 21 */   public PrintJobId getId() { throw new RuntimeException("Stub!"); }
/* 22 */   public PrintJobInfo getInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public PrintDocument getDocument() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isQueued() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isStarted() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isBlocked() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isCompleted() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isFailed() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isCancelled() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean start() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean block(String reason) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean complete() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean fail(String error) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean cancel() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setProgress(float progress) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setStatus(CharSequence status) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setStatus(int statusResId) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean setTag(String tag) { throw new RuntimeException("Stub!"); }
/* 39 */   public String getTag() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getAdvancedStringOption(String key) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean hasAdvancedOption(String key) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getAdvancedIntOption(String key) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 44 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\printservice\PrintJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */