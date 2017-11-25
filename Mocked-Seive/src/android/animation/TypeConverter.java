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
/*    */ 
/*    */ public abstract class TypeConverter<T, V>
/*    */ {
/*    */   public TypeConverter(Class<T> fromClass, Class<V> toClass)
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract V convert(T paramT);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\TypeConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */