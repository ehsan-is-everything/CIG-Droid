/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class QuickContactBadge
/*    */   extends ImageView
/*    */   implements View.OnClickListener
/*    */ {
/*    */   public QuickContactBadge(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public QuickContactBadge(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public QuickContactBadge(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public QuickContactBadge(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 28 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public void setMode(int size) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setPrioritizedMimeType(String prioritizedMimeType) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setImageToDefault() { throw new RuntimeException("Stub!"); }
/* 34 */   public void assignContactUri(Uri contactUri) { throw new RuntimeException("Stub!"); }
/* 35 */   public void assignContactFromEmail(String emailAddress, boolean lazyLookup) { throw new RuntimeException("Stub!"); }
/* 36 */   public void assignContactFromEmail(String emailAddress, boolean lazyLookup, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 37 */   public void assignContactFromPhone(String phoneNumber, boolean lazyLookup) { throw new RuntimeException("Stub!"); }
/* 38 */   public void assignContactFromPhone(String phoneNumber, boolean lazyLookup, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setOverlay(Drawable overlay) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onClick(View v) { throw new RuntimeException("Stub!"); }
/* 41 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setExcludeMimes(String[] excludeMimes) { throw new RuntimeException("Stub!"); }
/* 43 */   protected String[] mExcludeMimes = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\QuickContactBadge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */