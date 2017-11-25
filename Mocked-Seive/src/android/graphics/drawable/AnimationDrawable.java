/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AnimationDrawable
/*    */   extends DrawableContainer
/*    */   implements Runnable, Animatable
/*    */ {
/* 22 */   public AnimationDrawable() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 24 */   public void start() { throw new RuntimeException("Stub!"); }
/* 25 */   public void stop() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isRunning() { throw new RuntimeException("Stub!"); }
/* 27 */   public void run() { throw new RuntimeException("Stub!"); }
/* 28 */   public void unscheduleSelf(Runnable what) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getNumberOfFrames() { throw new RuntimeException("Stub!"); }
/* 30 */   public Drawable getFrame(int index) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getDuration(int i) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isOneShot() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setOneShot(boolean oneShot) { throw new RuntimeException("Stub!"); }
/* 34 */   public void addFrame(Drawable frame, int duration) { throw new RuntimeException("Stub!"); }
/* 35 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 37 */   protected void setConstantState(DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\AnimationDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */