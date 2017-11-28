/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Rect;
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
/*    */ public abstract class ActionMode
/*    */ {
/*    */   public static final int DEFAULT_HIDE_DURATION = -1;
/*    */   public static final int TYPE_FLOATING = 1;
/*    */   public static final int TYPE_PRIMARY = 0;
/*    */   
/*    */   public static abstract class Callback2
/*    */     implements ActionMode.Callback
/*    */   {
/* 30 */     public Callback2() { throw new RuntimeException("Stub!"); }
/* 31 */     public void onGetContentRect(ActionMode mode, View view, Rect outRect) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   public ActionMode() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setTag(Object tag) { throw new RuntimeException("Stub!"); }
/* 35 */   public Object getTag() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setTitle(CharSequence paramCharSequence);
/*    */   public abstract void setTitle(int paramInt);
/*    */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*    */   public abstract void setSubtitle(int paramInt);
/* 40 */   public void setTitleOptionalHint(boolean titleOptional) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean getTitleOptionalHint() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isTitleOptional() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setCustomView(View paramView);
/* 44 */   public void setType(int type) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getType() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void invalidate();
/* 47 */   public void invalidateContentRect() { throw new RuntimeException("Stub!"); }
/* 48 */   public void hide(long duration) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void finish();
/*    */   public abstract Menu getMenu();
/*    */   public abstract CharSequence getTitle();
/*    */   public abstract CharSequence getSubtitle();
/*    */   public abstract View getCustomView();
/*    */   public abstract MenuInflater getMenuInflater();
/* 55 */   public void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */     
/*    */     public abstract boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu);
/*    */     
/*    */     public abstract boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem);
/*    */     
/*    */     public abstract void onDestroyActionMode(ActionMode paramActionMode);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ActionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */