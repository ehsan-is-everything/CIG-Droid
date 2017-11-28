/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ArrayAdapter<T>
/*    */   extends BaseAdapter
/*    */   implements Filterable, ThemedSpinnerAdapter
/*    */ {
/* 22 */   public ArrayAdapter(Context context, int resource) { throw new RuntimeException("Stub!"); }
/* 23 */   public ArrayAdapter(Context context, int resource, int textViewResourceId) { throw new RuntimeException("Stub!"); }
/* 24 */   public ArrayAdapter(Context context, int resource, T[] objects) { throw new RuntimeException("Stub!"); }
/* 25 */   public ArrayAdapter(Context context, int resource, int textViewResourceId, T[] objects) { throw new RuntimeException("Stub!"); }
/* 26 */   public ArrayAdapter(Context context, int resource, List<T> objects) { throw new RuntimeException("Stub!"); }
/* 27 */   public ArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects) { throw new RuntimeException("Stub!"); }
/* 28 */   public void add(T object) { throw new RuntimeException("Stub!"); }
/* 29 */   public void addAll(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); }
/* 30 */   public void addAll(T... items) { throw new RuntimeException("Stub!"); }
/* 31 */   public void insert(T object, int index) { throw new RuntimeException("Stub!"); }
/* 32 */   public void remove(T object) { throw new RuntimeException("Stub!"); }
/* 33 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 34 */   public void sort(Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); }
/* 35 */   public void notifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setNotifyOnChange(boolean notifyOnChange) { throw new RuntimeException("Stub!"); }
/* 37 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 39 */   public T getItem(int position) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getPosition(T item) { throw new RuntimeException("Stub!"); }
/* 41 */   public long getItemId(int position) { throw new RuntimeException("Stub!"); }
/* 42 */   public View getView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setDropDownViewResource(int resource) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setDropDownViewTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 45 */   public Resources.Theme getDropDownViewTheme() { throw new RuntimeException("Stub!"); }
/* 46 */   public View getDropDownView(int position, View convertView, ViewGroup parent) { throw new RuntimeException("Stub!"); }
/* 47 */   public static ArrayAdapter<CharSequence> createFromResource(Context context, int textArrayResId, int textViewResId) { throw new RuntimeException("Stub!"); }
/* 48 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 49 */   public CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ArrayAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */