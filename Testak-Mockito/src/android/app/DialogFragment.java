/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnCancelListener;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.os.Bundle;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DialogFragment
/*    */   extends Fragment
/*    */   implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
/*    */ {
/*    */   public static final int STYLE_NORMAL = 0;
/*    */   public static final int STYLE_NO_FRAME = 2;
/*    */   public static final int STYLE_NO_INPUT = 3;
/*    */   public static final int STYLE_NO_TITLE = 1;
/*    */   
/* 22 */   public DialogFragment() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setStyle(int style, int theme) { throw new RuntimeException("Stub!"); }
/* 24 */   public void show(FragmentManager manager, String tag) { throw new RuntimeException("Stub!"); }
/* 25 */   public int show(FragmentTransaction transaction, String tag) { throw new RuntimeException("Stub!"); }
/* 26 */   public void dismiss() { throw new RuntimeException("Stub!"); }
/* 27 */   public void dismissAllowingStateLoss() { throw new RuntimeException("Stub!"); }
/* 28 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getTheme() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setCancelable(boolean cancelable) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isCancelable() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setShowsDialog(boolean showsDialog) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean getShowsDialog() { throw new RuntimeException("Stub!"); }
/* 34 */   public void onAttach(Context context) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onDetach() { throw new RuntimeException("Stub!"); }
/* 36 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 37 */   public Dialog onCreateDialog(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onCancel(DialogInterface dialog) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 41 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 42 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onStop() { throw new RuntimeException("Stub!"); }
/* 44 */   public void onDestroyView() { throw new RuntimeException("Stub!"); }
/* 45 */   public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\DialogFragment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */