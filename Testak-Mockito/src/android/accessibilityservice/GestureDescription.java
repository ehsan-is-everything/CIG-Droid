/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.graphics.Path;
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
/*    */ public final class GestureDescription
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 22 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder addStroke(GestureDescription.StrokeDescription strokeDescription) { throw new RuntimeException("Stub!"); }
/* 24 */     public GestureDescription build() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class StrokeDescription {
/* 28 */     public StrokeDescription(Path path, long startTime, long duration) { throw new RuntimeException("Stub!"); }
/* 29 */     public StrokeDescription(Path path, long startTime, long duration, boolean willContinue) { throw new RuntimeException("Stub!"); }
/* 30 */     public Path getPath() { throw new RuntimeException("Stub!"); }
/* 31 */     public long getStartTime() { throw new RuntimeException("Stub!"); }
/* 32 */     public long getDuration() { throw new RuntimeException("Stub!"); }
/* 33 */     public StrokeDescription continueStroke(Path path, long startTime, long duration, boolean willContinue) { throw new RuntimeException("Stub!"); }
/* 34 */     public boolean willContinue() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   GestureDescription() { throw new RuntimeException("Stub!"); }
/* 37 */   public static int getMaxStrokeCount() { throw new RuntimeException("Stub!"); }
/* 38 */   public static long getMaxGestureDuration() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getStrokeCount() { throw new RuntimeException("Stub!"); }
/* 40 */   public StrokeDescription getStroke(int index) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\accessibilityservice\GestureDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */