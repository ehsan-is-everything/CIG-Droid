/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import org.xmlpull.v1.XmlPullParser;
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
/*    */ public abstract class LayoutInflater
/*    */ {
/* 34 */   protected LayoutInflater(Context context) { throw new RuntimeException("Stub!"); }
/* 35 */   protected LayoutInflater(LayoutInflater original, Context newContext) { throw new RuntimeException("Stub!"); }
/* 36 */   public static LayoutInflater from(Context context) { throw new RuntimeException("Stub!"); }
/*    */   public abstract LayoutInflater cloneInContext(Context paramContext);
/* 38 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 39 */   public final Factory getFactory() { throw new RuntimeException("Stub!"); }
/* 40 */   public final Factory2 getFactory2() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setFactory(Factory factory) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setFactory2(Factory2 factory) { throw new RuntimeException("Stub!"); }
/* 43 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setFilter(Filter filter) { throw new RuntimeException("Stub!"); }
/* 45 */   public View inflate(int resource, ViewGroup root) { throw new RuntimeException("Stub!"); }
/* 46 */   public View inflate(XmlPullParser parser, ViewGroup root) { throw new RuntimeException("Stub!"); }
/* 47 */   public View inflate(int resource, ViewGroup root, boolean attachToRoot) { throw new RuntimeException("Stub!"); }
/* 48 */   public View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot) { throw new RuntimeException("Stub!"); }
/* 49 */   public final View createView(String name, String prefix, AttributeSet attrs) throws ClassNotFoundException, InflateException { throw new RuntimeException("Stub!"); }
/* 50 */   protected View onCreateView(String name, AttributeSet attrs) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 51 */   protected View onCreateView(View parent, String name, AttributeSet attrs) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Factory2
/*    */     extends LayoutInflater.Factory
/*    */   {
/*    */     public abstract View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
/*    */   }
/*    */   
/*    */   public static abstract interface Factory
/*    */   {
/*    */     public abstract View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet);
/*    */   }
/*    */   
/*    */   public static abstract interface Filter
/*    */   {
/*    */     public abstract boolean onLoadClass(Class paramClass);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\LayoutInflater.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */