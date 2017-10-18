/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface ViewParent
/*    */ {
/*    */   public abstract void requestLayout();
/*    */   
/*    */   public abstract boolean isLayoutRequested();
/*    */   
/*    */   public abstract void requestTransparentRegion(View paramView);
/*    */   
/*    */   public void onDescendantInvalidated(View child, View target)
/*    */   {
/* 23 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public abstract void invalidateChild(View paramView, Rect paramRect);
/*    */   
/*    */   @Deprecated
/*    */   public abstract ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect);
/*    */   
/*    */   public abstract ViewParent getParent();
/*    */   
/*    */   public abstract void requestChildFocus(View paramView1, View paramView2);
/*    */   
/*    */   public abstract void recomputeViewAttributes(View paramView);
/*    */   
/*    */   public abstract void clearChildFocus(View paramView);
/*    */   
/*    */   public abstract boolean getChildVisibleRect(View paramView, Rect paramRect, Point paramPoint);
/*    */   
/*    */   public abstract View focusSearch(View paramView, int paramInt);
/*    */   
/*    */   public abstract View keyboardNavigationClusterSearch(View paramView, int paramInt);
/*    */   
/*    */   public abstract void bringChildToFront(View paramView);
/*    */   
/*    */   public abstract void focusableViewAvailable(View paramView);
/*    */   
/*    */   public abstract boolean showContextMenuForChild(View paramView);
/*    */   
/*    */   public abstract boolean showContextMenuForChild(View paramView, float paramFloat1, float paramFloat2);
/*    */   
/*    */   public abstract void createContextMenu(ContextMenu paramContextMenu);
/*    */   
/*    */   public abstract ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback);
/*    */   
/*    */   public abstract ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt);
/*    */   
/*    */   public abstract void childDrawableStateChanged(View paramView);
/*    */   
/*    */   public abstract void requestDisallowInterceptTouchEvent(boolean paramBoolean);
/*    */   
/*    */   public abstract boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean);
/*    */   
/*    */   public abstract boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent);
/*    */   
/*    */   public abstract void childHasTransientStateChanged(View paramView, boolean paramBoolean);
/*    */   
/*    */   public abstract void requestFitSystemWindows();
/*    */   
/*    */   public abstract ViewParent getParentForAccessibility();
/*    */   
/*    */   public abstract void notifySubtreeAccessibilityStateChanged(View paramView1, View paramView2, int paramInt);
/*    */   
/*    */   public abstract boolean canResolveLayoutDirection();
/*    */   
/*    */   public abstract boolean isLayoutDirectionResolved();
/*    */   
/*    */   public abstract int getLayoutDirection();
/*    */   
/*    */   public abstract boolean canResolveTextDirection();
/*    */   
/*    */   public abstract boolean isTextDirectionResolved();
/*    */   
/*    */   public abstract int getTextDirection();
/*    */   
/*    */   public abstract boolean canResolveTextAlignment();
/*    */   
/*    */   public abstract boolean isTextAlignmentResolved();
/*    */   
/*    */   public abstract int getTextAlignment();
/*    */   
/*    */   public abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt);
/*    */   
/*    */   public abstract void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt);
/*    */   
/*    */   public abstract void onStopNestedScroll(View paramView);
/*    */   
/*    */   public abstract void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   public abstract void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt);
/*    */   
/*    */   public abstract boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean);
/*    */   
/*    */   public abstract boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2);
/*    */   
/*    */   public abstract boolean onNestedPrePerformAccessibilityAction(View paramView, int paramInt, Bundle paramBundle);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\ViewParent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */