/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Dialog;
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnDismissListener;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.widget.AdapterView;
/*    */ import android.widget.AdapterView.OnItemClickListener;
/*    */ import android.widget.ListAdapter;
/*    */ import android.widget.ListView;
/*    */ 
/*    */ 
/*    */ public final class PreferenceScreen
/*    */   extends PreferenceGroup
/*    */   implements AdapterView.OnItemClickListener, DialogInterface.OnDismissListener
/*    */ {
/*    */   PreferenceScreen()
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null);throw new RuntimeException("Stub!"); }
/* 23 */   public ListAdapter getRootAdapter() { throw new RuntimeException("Stub!"); }
/* 24 */   protected ListAdapter onCreateRootAdapter() { throw new RuntimeException("Stub!"); }
/* 25 */   public void bind(ListView listView) { throw new RuntimeException("Stub!"); }
/* 26 */   protected void onClick() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onDismiss(DialogInterface dialog) { throw new RuntimeException("Stub!"); }
/* 28 */   public Dialog getDialog() { throw new RuntimeException("Stub!"); }
/* 29 */   public void onItemClick(AdapterView parent, View view, int position, long id) { throw new RuntimeException("Stub!"); }
/* 30 */   protected boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
/* 31 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 32 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\preference\PreferenceScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */