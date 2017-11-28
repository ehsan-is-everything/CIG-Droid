/*    */ package android.text;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ public final class BidiFormatter
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 22 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder(boolean rtlContext) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder(Locale locale) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder stereoReset(boolean stereoReset) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setTextDirectionHeuristic(TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
/* 27 */     public BidiFormatter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   BidiFormatter() { throw new RuntimeException("Stub!"); }
/* 30 */   public static BidiFormatter getInstance() { throw new RuntimeException("Stub!"); }
/* 31 */   public static BidiFormatter getInstance(boolean rtlContext) { throw new RuntimeException("Stub!"); }
/* 32 */   public static BidiFormatter getInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isRtlContext() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean getStereoReset() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isRtl(String str) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isRtl(CharSequence str) { throw new RuntimeException("Stub!"); }
/* 37 */   public String unicodeWrap(String str, TextDirectionHeuristic heuristic, boolean isolate) { throw new RuntimeException("Stub!"); }
/* 38 */   public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristic heuristic, boolean isolate) { throw new RuntimeException("Stub!"); }
/* 39 */   public String unicodeWrap(String str, TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
/* 40 */   public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristic heuristic) { throw new RuntimeException("Stub!"); }
/* 41 */   public String unicodeWrap(String str, boolean isolate) { throw new RuntimeException("Stub!"); }
/* 42 */   public CharSequence unicodeWrap(CharSequence str, boolean isolate) { throw new RuntimeException("Stub!"); }
/* 43 */   public String unicodeWrap(String str) { throw new RuntimeException("Stub!"); }
/* 44 */   public CharSequence unicodeWrap(CharSequence str) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\BidiFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */