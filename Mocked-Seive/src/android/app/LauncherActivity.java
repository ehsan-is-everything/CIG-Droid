/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Bundle;
/*    */ import android.view.View;
/*    */ import android.widget.ListView;
/*    */ 
/*    */ public abstract class LauncherActivity extends ListActivity
/*    */ {
/*    */   public static class ListItem
/*    */   {
/*    */     public String className;
/*    */     public Bundle extras;
/*    */     public Drawable icon;
/*    */     public CharSequence label;
/*    */     public String packageName;
/*    */     public ResolveInfo resolveInfo;
/*    */     
/*    */     public ListItem()
/*    */     {
/* 23 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public class IconResizer
/*    */   {
/* 33 */     public IconResizer() { throw new RuntimeException("Stub!"); }
/* 34 */     public Drawable createIconThumbnail(Drawable icon) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   public LauncherActivity() { throw new RuntimeException("Stub!"); }
/* 37 */   protected void onCreate(Bundle icicle) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onSetContentView() { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onListItemClick(ListView l, View v, int position, long id) { throw new RuntimeException("Stub!"); }
/* 42 */   protected Intent intentForPosition(int position) { throw new RuntimeException("Stub!"); }
/* 43 */   protected ListItem itemForPosition(int position) { throw new RuntimeException("Stub!"); }
/* 44 */   protected Intent getTargetIntent() { throw new RuntimeException("Stub!"); }
/* 45 */   protected java.util.List<ResolveInfo> onQueryPackageManager(Intent queryIntent) { throw new RuntimeException("Stub!"); }
/* 46 */   public java.util.List<ListItem> makeListItems() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\LauncherActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */