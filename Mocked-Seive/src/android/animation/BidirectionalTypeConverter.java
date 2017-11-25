/*    */ package android.animation;
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
/*    */ public abstract class BidirectionalTypeConverter<T, V>
/*    */   extends TypeConverter<T, V>
/*    */ {
/*    */   public BidirectionalTypeConverter(Class<T> fromClass, Class<V> toClass)
/*    */   {
/* 20 */     super((Class)null, (Class)null);throw new RuntimeException("Stub!"); }
/*    */   public abstract T convertBack(V paramV);
/* 22 */   public BidirectionalTypeConverter<V, T> invert() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\BidirectionalTypeConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */