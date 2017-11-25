/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.SurfaceTexture;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
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
/*    */ public class TextureView
/*    */   extends View
/*    */ {
/*    */   public TextureView(Context context)
/*    */   {
/* 28 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public TextureView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public TextureView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 31 */   public TextureView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setOpaque(boolean opaque) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setLayerType(int layerType, Paint paint) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setLayerPaint(Paint paint) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getLayerType() { throw new RuntimeException("Stub!"); }
/* 38 */   public void buildLayer() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setForeground(Drawable foreground) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); }
/* 41 */   public final void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 42 */   protected final void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 43 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 44 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setTransform(Matrix transform) { throw new RuntimeException("Stub!"); }
/* 46 */   public Matrix getTransform(Matrix transform) { throw new RuntimeException("Stub!"); }
/* 47 */   public Bitmap getBitmap() { throw new RuntimeException("Stub!"); }
/* 48 */   public Bitmap getBitmap(int width, int height) { throw new RuntimeException("Stub!"); }
/* 49 */   public Bitmap getBitmap(Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isAvailable() { throw new RuntimeException("Stub!"); }
/* 51 */   public Canvas lockCanvas() { throw new RuntimeException("Stub!"); }
/* 52 */   public Canvas lockCanvas(Rect dirty) { throw new RuntimeException("Stub!"); }
/* 53 */   public void unlockCanvasAndPost(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 54 */   public SurfaceTexture getSurfaceTexture() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setSurfaceTexture(SurfaceTexture surfaceTexture) { throw new RuntimeException("Stub!"); }
/* 56 */   public SurfaceTextureListener getSurfaceTextureListener() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setSurfaceTextureListener(SurfaceTextureListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface SurfaceTextureListener
/*    */   {
/*    */     public abstract void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2);
/*    */     
/*    */     public abstract void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2);
/*    */     
/*    */     public abstract boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture);
/*    */     
/*    */     public abstract void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\TextureView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */