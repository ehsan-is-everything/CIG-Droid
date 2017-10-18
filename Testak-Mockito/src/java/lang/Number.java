/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class Number
/*    */   implements Serializable
/*    */ {
/* 30 */   public Number() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int intValue();
/*    */   public abstract long longValue();
/*    */   public abstract float floatValue();
/*    */   public abstract double doubleValue();
/* 35 */   public byte byteValue() { throw new RuntimeException("Stub!"); }
/* 36 */   public short shortValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Number.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */