/*    */ package android.content;
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
/*    */ public class ClipboardManager
/*    */   extends android.text.ClipboardManager
/*    */ {
/* 25 */   ClipboardManager() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setPrimaryClip(ClipData clip) { throw new RuntimeException("Stub!"); }
/* 27 */   public ClipData getPrimaryClip() { throw new RuntimeException("Stub!"); }
/* 28 */   public ClipDescription getPrimaryClipDescription() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean hasPrimaryClip() { throw new RuntimeException("Stub!"); }
/* 30 */   public void addPrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); }
/* 31 */   public void removePrimaryClipChangedListener(OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 33 */   public CharSequence getText() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   public void setText(CharSequence text) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public boolean hasText() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnPrimaryClipChangedListener
/*    */   {
/*    */     public abstract void onPrimaryClipChanged();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\ClipboardManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */