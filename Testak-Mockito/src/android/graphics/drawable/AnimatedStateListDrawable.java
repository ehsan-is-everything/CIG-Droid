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
/*    */ public class AnimatedStateListDrawable
/*    */   extends StateListDrawable
/*    */ {
/* 21 */   public AnimatedStateListDrawable() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 23 */   public void addState(int[] stateSet, Drawable drawable, int id) { throw new RuntimeException("Stub!"); }
/* 24 */   public <T extends Drawable,  extends Animatable> void addTransition(int fromId, int toId, T transition, boolean reversible) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 26 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 27 */   public void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
/* 28 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void applyTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 30 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 31 */   protected void setConstantState(DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\drawable\AnimatedStateListDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */