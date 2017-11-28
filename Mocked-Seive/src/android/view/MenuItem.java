/*    */ package android.view;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface MenuItem
/*    */ {
/*    */   public static final int SHOW_AS_ACTION_ALWAYS = 2;
/*    */   public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
/*    */   public static final int SHOW_AS_ACTION_IF_ROOM = 1;
/*    */   public static final int SHOW_AS_ACTION_NEVER = 0;
/*    */   public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
/*    */   
/*    */   public abstract int getItemId();
/*    */   
/*    */   public abstract int getGroupId();
/*    */   
/*    */   public abstract int getOrder();
/*    */   
/*    */   public abstract MenuItem setTitle(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract MenuItem setTitle(int paramInt);
/*    */   
/*    */   public abstract CharSequence getTitle();
/*    */   
/*    */   public abstract MenuItem setTitleCondensed(CharSequence paramCharSequence);
/*    */   
/*    */   public abstract CharSequence getTitleCondensed();
/*    */   
/*    */   public abstract MenuItem setIcon(Drawable paramDrawable);
/*    */   
/*    */   public abstract MenuItem setIcon(int paramInt);
/*    */   
/*    */   public abstract Drawable getIcon();
/*    */   
/* 40 */   public MenuItem setIconTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 41 */   public ColorStateList getIconTintList() { throw new RuntimeException("Stub!"); }
/* 42 */   public MenuItem setIconTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 43 */   public PorterDuff.Mode getIconTintMode() { throw new RuntimeException("Stub!"); }
/*    */   public abstract MenuItem setIntent(Intent paramIntent);
/*    */   public abstract Intent getIntent();
/*    */   public abstract MenuItem setShortcut(char paramChar1, char paramChar2);
/* 47 */   public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) { throw new RuntimeException("Stub!"); }
/*    */   public abstract MenuItem setNumericShortcut(char paramChar);
/* 49 */   public MenuItem setNumericShortcut(char numericChar, int numericModifiers) { throw new RuntimeException("Stub!"); }
/*    */   public abstract char getNumericShortcut();
/* 51 */   public int getNumericModifiers() { throw new RuntimeException("Stub!"); }
/*    */   public abstract MenuItem setAlphabeticShortcut(char paramChar);
/* 53 */   public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) { throw new RuntimeException("Stub!"); }
/*    */   public abstract char getAlphabeticShortcut();
/* 55 */   public int getAlphabeticModifiers() { throw new RuntimeException("Stub!"); }
/*    */   public abstract MenuItem setCheckable(boolean paramBoolean);
/*    */   public abstract boolean isCheckable();
/*    */   public abstract MenuItem setChecked(boolean paramBoolean);
/*    */   public abstract boolean isChecked();
/*    */   public abstract MenuItem setVisible(boolean paramBoolean);
/*    */   public abstract boolean isVisible();
/*    */   public abstract MenuItem setEnabled(boolean paramBoolean);
/*    */   public abstract boolean isEnabled();
/*    */   public abstract boolean hasSubMenu();
/*    */   public abstract SubMenu getSubMenu();
/*    */   public abstract MenuItem setOnMenuItemClickListener(OnMenuItemClickListener paramOnMenuItemClickListener);
/*    */   public abstract ContextMenu.ContextMenuInfo getMenuInfo();
/*    */   public abstract void setShowAsAction(int paramInt);
/*    */   public abstract MenuItem setShowAsActionFlags(int paramInt);
/*    */   public abstract MenuItem setActionView(View paramView);
/*    */   public abstract MenuItem setActionView(int paramInt);
/*    */   public abstract View getActionView();
/*    */   public abstract MenuItem setActionProvider(ActionProvider paramActionProvider);
/*    */   public abstract ActionProvider getActionProvider();
/*    */   public abstract boolean expandActionView();
/*    */   public abstract boolean collapseActionView();
/*    */   public abstract boolean isActionViewExpanded();
/*    */   public abstract MenuItem setOnActionExpandListener(OnActionExpandListener paramOnActionExpandListener);
/* 79 */   public MenuItem setContentDescription(CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
/* 80 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 81 */   public MenuItem setTooltipText(CharSequence tooltipText) { throw new RuntimeException("Stub!"); }
/* 82 */   public CharSequence getTooltipText() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnActionExpandListener
/*    */   {
/*    */     public abstract boolean onMenuItemActionExpand(MenuItem paramMenuItem);
/*    */     
/*    */     public abstract boolean onMenuItemActionCollapse(MenuItem paramMenuItem);
/*    */   }
/*    */   
/*    */   public static abstract interface OnMenuItemClickListener
/*    */   {
/*    */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\MenuItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */