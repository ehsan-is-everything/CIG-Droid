/*    */ package java.time.temporal;
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
/*    */ 
/*    */ public abstract interface TemporalAccessor
/*    */ {
/*    */   public abstract boolean isSupported(TemporalField paramTemporalField);
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
/* 66 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 67 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*    */   public abstract long getLong(TemporalField paramTemporalField);
/* 69 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\temporal\TemporalAccessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */