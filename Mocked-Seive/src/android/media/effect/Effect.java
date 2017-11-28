/*    */ package android.media.effect;
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
/*    */ public abstract class Effect
/*    */ {
/* 21 */   public Effect() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String getName();
/*    */   public abstract void apply(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   public abstract void setParameter(String paramString, Object paramObject);
/* 25 */   public void setUpdateListener(EffectUpdateListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void release();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\effect\Effect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */