/*    */ package android.view;
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
/*    */ public final class ViewTreeObserver
/*    */ {
/* 53 */   ViewTreeObserver() { throw new RuntimeException("Stub!"); }
/* 54 */   public void addOnWindowAttachListener(OnWindowAttachListener listener) { throw new RuntimeException("Stub!"); }
/* 55 */   public void removeOnWindowAttachListener(OnWindowAttachListener victim) { throw new RuntimeException("Stub!"); }
/* 56 */   public void addOnWindowFocusChangeListener(OnWindowFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 57 */   public void removeOnWindowFocusChangeListener(OnWindowFocusChangeListener victim) { throw new RuntimeException("Stub!"); }
/* 58 */   public void addOnGlobalFocusChangeListener(OnGlobalFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 59 */   public void removeOnGlobalFocusChangeListener(OnGlobalFocusChangeListener victim) { throw new RuntimeException("Stub!"); }
/* 60 */   public void addOnGlobalLayoutListener(OnGlobalLayoutListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 62 */   public void removeGlobalOnLayoutListener(OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); }
/* 63 */   public void removeOnGlobalLayoutListener(OnGlobalLayoutListener victim) { throw new RuntimeException("Stub!"); }
/* 64 */   public void addOnPreDrawListener(OnPreDrawListener listener) { throw new RuntimeException("Stub!"); }
/* 65 */   public void removeOnPreDrawListener(OnPreDrawListener victim) { throw new RuntimeException("Stub!"); }
/* 66 */   public void addOnDrawListener(OnDrawListener listener) { throw new RuntimeException("Stub!"); }
/* 67 */   public void removeOnDrawListener(OnDrawListener victim) { throw new RuntimeException("Stub!"); }
/* 68 */   public void addOnScrollChangedListener(OnScrollChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 69 */   public void removeOnScrollChangedListener(OnScrollChangedListener victim) { throw new RuntimeException("Stub!"); }
/* 70 */   public void addOnTouchModeChangeListener(OnTouchModeChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 71 */   public void removeOnTouchModeChangeListener(OnTouchModeChangeListener victim) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean isAlive() { throw new RuntimeException("Stub!"); }
/* 73 */   public final void dispatchOnGlobalLayout() { throw new RuntimeException("Stub!"); }
/*    */   
/* 75 */   public final boolean dispatchOnPreDraw() { throw new RuntimeException("Stub!"); }
/* 76 */   public final void dispatchOnDraw() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnScrollChangedListener
/*    */   {
/*    */     public abstract void onScrollChanged();
/*    */   }
/*    */   
/*    */   public static abstract interface OnTouchModeChangeListener
/*    */   {
/*    */     public abstract void onTouchModeChanged(boolean paramBoolean);
/*    */   }
/*    */   
/*    */   public static abstract interface OnDrawListener
/*    */   {
/*    */     public abstract void onDraw();
/*    */   }
/*    */   
/*    */   public static abstract interface OnPreDrawListener
/*    */   {
/*    */     public abstract boolean onPreDraw();
/*    */   }
/*    */   
/*    */   public static abstract interface OnGlobalLayoutListener
/*    */   {
/*    */     public abstract void onGlobalLayout();
/*    */   }
/*    */   
/*    */   public static abstract interface OnGlobalFocusChangeListener
/*    */   {
/*    */     public abstract void onGlobalFocusChanged(View paramView1, View paramView2);
/*    */   }
/*    */   
/*    */   public static abstract interface OnWindowFocusChangeListener
/*    */   {
/*    */     public abstract void onWindowFocusChanged(boolean paramBoolean);
/*    */   }
/*    */   
/*    */   public static abstract interface OnWindowAttachListener
/*    */   {
/*    */     public abstract void onWindowAttached();
/*    */     
/*    */     public abstract void onWindowDetached();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\ViewTreeObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */