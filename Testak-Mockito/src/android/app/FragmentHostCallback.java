/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentSender;
/*    */ import android.content.IntentSender.SendIntentException;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.View;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class FragmentHostCallback<E>
/*    */   extends FragmentContainer
/*    */ {
/* 21 */   public FragmentHostCallback(Context context, Handler handler, int windowAnimations) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onDump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean onShouldSaveFragmentState(Fragment fragment) { throw new RuntimeException("Stub!"); }
/* 24 */   public LayoutInflater onGetLayoutInflater() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean onUseFragmentManagerInflaterFactory() { throw new RuntimeException("Stub!"); }
/*    */   public abstract E onGetHost();
/* 27 */   public void onInvalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
/* 28 */   public void onStartActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 30 */   public void onRequestPermissionsFromFragment(Fragment fragment, String[] permissions, int requestCode) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean onHasWindowAnimations() { throw new RuntimeException("Stub!"); }
/* 32 */   public int onGetWindowAnimations() { throw new RuntimeException("Stub!"); }
/* 33 */   public void onAttachFragment(Fragment fragment) { throw new RuntimeException("Stub!"); }
/* 34 */   public <T extends View> T onFindViewById(int id) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean onHasView() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\FragmentHostCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */