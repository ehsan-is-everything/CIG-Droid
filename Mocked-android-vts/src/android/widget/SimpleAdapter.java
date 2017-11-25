/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ public class SimpleAdapter
/*    */   extends BaseAdapter
/*    */   implements Filterable, ThemedSpinnerAdapter
/*    */ {
/* 26 */   public SimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 28 */   public Object getItem(int position) { throw new RuntimeException("Stub!"); }
/* 29 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); }
/* 30 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setDropDownViewTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 33 */   public Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
/* 34 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 35 */   public ViewBinder getViewBinder() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setViewBinder(ViewBinder viewBinder) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setViewImage(ImageView v, int value) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setViewImage(ImageView v, String value) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setViewText(TextView v, String text) { throw new RuntimeException("Stub!"); }
/* 40 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ViewBinder
/*    */   {
/*    */     public abstract boolean setViewValue(View paramView, Object paramObject, String paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\SimpleAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */