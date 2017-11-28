/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.view.ActionProvider;
/*    */ import android.view.SubMenu;
/*    */ import android.view.View;
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
/*    */ public class ShareActionProvider
/*    */   extends ActionProvider
/*    */ {
/*    */   public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
/*    */   
/*    */   public ShareActionProvider(Context context)
/*    */   {
/* 25 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 26 */   public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener listener) { throw new RuntimeException("Stub!"); }
/* 27 */   public View onCreateActionView() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean hasSubMenu() { throw new RuntimeException("Stub!"); }
/* 29 */   public void onPrepareSubMenu(SubMenu subMenu) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setShareHistoryFileName(String shareHistoryFile) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setShareIntent(Intent shareIntent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnShareTargetSelectedListener
/*    */   {
/*    */     public abstract boolean onShareTargetSelected(ShareActionProvider paramShareActionProvider, Intent paramIntent);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ShareActionProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */