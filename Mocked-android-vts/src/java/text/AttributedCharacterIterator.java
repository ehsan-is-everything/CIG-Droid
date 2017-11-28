/*    */ package java.text;
/*    */ 
/*    */ import java.io.InvalidObjectException;
/*    */ import java.io.Serializable;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public abstract interface AttributedCharacterIterator
/*    */   extends CharacterIterator
/*    */ {
/*    */   public abstract int getRunStart();
/*    */   
/*    */   public abstract int getRunStart(Attribute paramAttribute);
/*    */   
/*    */   public abstract int getRunStart(Set<? extends Attribute> paramSet);
/*    */   
/*    */   public abstract int getRunLimit();
/*    */   
/*    */   public abstract int getRunLimit(Attribute paramAttribute);
/*    */   
/*    */   public abstract int getRunLimit(Set<? extends Attribute> paramSet);
/*    */   
/*    */   public abstract Map<Attribute, Object> getAttributes();
/*    */   
/*    */   public abstract Object getAttribute(Attribute paramAttribute);
/*    */   
/*    */   public abstract Set<Attribute> getAllAttributeKeys();
/*    */   
/*    */   public static class Attribute
/*    */     implements Serializable
/*    */   {
/* 33 */     protected Attribute(String name) { throw new RuntimeException("Stub!"); }
/* 34 */     public final boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 35 */     public final int hashCode() { throw new RuntimeException("Stub!"); }
/* 36 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */     protected String getName() { throw new RuntimeException("Stub!"); }
/* 38 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 42 */     public static final Attribute READING = null; public static final Attribute LANGUAGE = null; public static final Attribute INPUT_METHOD_SEGMENT = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\text\AttributedCharacterIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */