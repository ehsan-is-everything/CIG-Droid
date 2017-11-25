/*     */ package android.widget;
/*     */ 
/*     */ import android.app.ActionBar.LayoutParams;
/*     */ import android.content.Context;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View.OnClickListener;
/*     */ import android.view.ViewGroup;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ import android.view.ViewGroup.MarginLayoutParams;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Toolbar
/*     */   extends ViewGroup
/*     */ {
/*     */   public static class LayoutParams
/*     */     extends ActionBar.LayoutParams
/*     */   {
/*     */     public LayoutParams(Context c, AttributeSet attrs)
/*     */     {
/*  28 */       super();throw new RuntimeException("Stub!"); }
/*  29 */     public LayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); }
/*  30 */     public LayoutParams(int width, int height, int gravity) { super();throw new RuntimeException("Stub!"); }
/*  31 */     public LayoutParams(int gravity) { super();throw new RuntimeException("Stub!"); }
/*  32 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  33 */     public LayoutParams(ActionBar.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  34 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  35 */     public LayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); } }
/*     */   
/*  37 */   public Toolbar(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  38 */   public Toolbar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  39 */   public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  40 */   public Toolbar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*  41 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/*  42 */   public void setPopupTheme(int resId) { throw new RuntimeException("Stub!"); }
/*  43 */   public int getPopupTheme() { throw new RuntimeException("Stub!"); }
/*  44 */   public void setTitleMargin(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/*  45 */   public int getTitleMarginStart() { throw new RuntimeException("Stub!"); }
/*  46 */   public void setTitleMarginStart(int margin) { throw new RuntimeException("Stub!"); }
/*  47 */   public int getTitleMarginTop() { throw new RuntimeException("Stub!"); }
/*  48 */   public void setTitleMarginTop(int margin) { throw new RuntimeException("Stub!"); }
/*  49 */   public int getTitleMarginEnd() { throw new RuntimeException("Stub!"); }
/*  50 */   public void setTitleMarginEnd(int margin) { throw new RuntimeException("Stub!"); }
/*  51 */   public int getTitleMarginBottom() { throw new RuntimeException("Stub!"); }
/*  52 */   public void setTitleMarginBottom(int margin) { throw new RuntimeException("Stub!"); }
/*  53 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*  54 */   public void setLogo(int resId) { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean isOverflowMenuShowing() { throw new RuntimeException("Stub!"); }
/*  56 */   public boolean showOverflowMenu() { throw new RuntimeException("Stub!"); }
/*  57 */   public boolean hideOverflowMenu() { throw new RuntimeException("Stub!"); }
/*  58 */   public void dismissPopupMenus() { throw new RuntimeException("Stub!"); }
/*  59 */   public void setLogo(Drawable drawable) { throw new RuntimeException("Stub!"); }
/*  60 */   public Drawable getLogo() { throw new RuntimeException("Stub!"); }
/*  61 */   public void setLogoDescription(int resId) { throw new RuntimeException("Stub!"); }
/*  62 */   public void setLogoDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/*  63 */   public CharSequence getLogoDescription() { throw new RuntimeException("Stub!"); }
/*  64 */   public boolean hasExpandedActionView() { throw new RuntimeException("Stub!"); }
/*  65 */   public void collapseActionView() { throw new RuntimeException("Stub!"); }
/*  66 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/*  67 */   public void setTitle(int resId) { throw new RuntimeException("Stub!"); }
/*  68 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/*  69 */   public CharSequence getSubtitle() { throw new RuntimeException("Stub!"); }
/*  70 */   public void setSubtitle(int resId) { throw new RuntimeException("Stub!"); }
/*  71 */   public void setSubtitle(CharSequence subtitle) { throw new RuntimeException("Stub!"); }
/*  72 */   public void setTitleTextAppearance(Context context, int resId) { throw new RuntimeException("Stub!"); }
/*  73 */   public void setSubtitleTextAppearance(Context context, int resId) { throw new RuntimeException("Stub!"); }
/*  74 */   public void setTitleTextColor(int color) { throw new RuntimeException("Stub!"); }
/*  75 */   public void setSubtitleTextColor(int color) { throw new RuntimeException("Stub!"); }
/*  76 */   public CharSequence getNavigationContentDescription() { throw new RuntimeException("Stub!"); }
/*  77 */   public void setNavigationContentDescription(int resId) { throw new RuntimeException("Stub!"); }
/*  78 */   public void setNavigationContentDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/*  79 */   public void setNavigationIcon(int resId) { throw new RuntimeException("Stub!"); }
/*  80 */   public void setNavigationIcon(Drawable icon) { throw new RuntimeException("Stub!"); }
/*  81 */   public Drawable getNavigationIcon() { throw new RuntimeException("Stub!"); }
/*  82 */   public void setNavigationOnClickListener(View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/*  83 */   public Menu getMenu() { throw new RuntimeException("Stub!"); }
/*  84 */   public void setOverflowIcon(Drawable icon) { throw new RuntimeException("Stub!"); }
/*  85 */   public Drawable getOverflowIcon() { throw new RuntimeException("Stub!"); }
/*  86 */   public void inflateMenu(int resId) { throw new RuntimeException("Stub!"); }
/*  87 */   public void setOnMenuItemClickListener(OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
/*  88 */   public void setContentInsetsRelative(int contentInsetStart, int contentInsetEnd) { throw new RuntimeException("Stub!"); }
/*  89 */   public int getContentInsetStart() { throw new RuntimeException("Stub!"); }
/*  90 */   public int getContentInsetEnd() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setContentInsetsAbsolute(int contentInsetLeft, int contentInsetRight) { throw new RuntimeException("Stub!"); }
/*  92 */   public int getContentInsetLeft() { throw new RuntimeException("Stub!"); }
/*  93 */   public int getContentInsetRight() { throw new RuntimeException("Stub!"); }
/*  94 */   public int getContentInsetStartWithNavigation() { throw new RuntimeException("Stub!"); }
/*  95 */   public void setContentInsetStartWithNavigation(int insetStartWithNavigation) { throw new RuntimeException("Stub!"); }
/*  96 */   public int getContentInsetEndWithActions() { throw new RuntimeException("Stub!"); }
/*  97 */   public void setContentInsetEndWithActions(int insetEndWithActions) { throw new RuntimeException("Stub!"); }
/*  98 */   public int getCurrentContentInsetStart() { throw new RuntimeException("Stub!"); }
/*  99 */   public int getCurrentContentInsetEnd() { throw new RuntimeException("Stub!"); }
/* 100 */   public int getCurrentContentInsetLeft() { throw new RuntimeException("Stub!"); }
/* 101 */   public int getCurrentContentInsetRight() { throw new RuntimeException("Stub!"); }
/* 102 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 103 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 104 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 106 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 107 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 108 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 109 */   protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 110 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 111 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static abstract interface OnMenuItemClickListener
/*     */   {
/*     */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*     */   }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\Toolbar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */