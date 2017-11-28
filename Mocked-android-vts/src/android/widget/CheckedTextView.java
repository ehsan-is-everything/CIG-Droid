/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CheckedTextView
/*    */   extends TextView
/*    */   implements Checkable
/*    */ {
/*    */   public CheckedTextView(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public CheckedTextView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public CheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public CheckedTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public void toggle() { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty
/* 28 */   public boolean isChecked() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setCheckMarkDrawable(int resId) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setCheckMarkDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setCheckMarkTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 33 */   public ColorStateList getCheckMarkTintList() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setCheckMarkTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 35 */   public PorterDuff.Mode getCheckMarkTintMode() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 37 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 38 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 39 */   public Drawable getCheckMarkDrawable() { throw new RuntimeException("Stub!"); }
/* 40 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 42 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 43 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 44 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 46 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 47 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\CheckedTextView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */