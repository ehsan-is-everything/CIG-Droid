/*    */ package android.transition;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
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
/*    */ public final class Scene
/*    */ {
/* 20 */   public Scene(ViewGroup sceneRoot) { throw new RuntimeException("Stub!"); }
/* 21 */   public Scene(ViewGroup sceneRoot, View layout) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public Scene(ViewGroup sceneRoot, ViewGroup layout) { throw new RuntimeException("Stub!"); }
/* 24 */   public static Scene getSceneForLayout(ViewGroup sceneRoot, int layoutId, Context context) { throw new RuntimeException("Stub!"); }
/* 25 */   public ViewGroup getSceneRoot() { throw new RuntimeException("Stub!"); }
/* 26 */   public void exit() { throw new RuntimeException("Stub!"); }
/* 27 */   public void enter() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setEnterAction(Runnable action) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setExitAction(Runnable action) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\transition\Scene.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */