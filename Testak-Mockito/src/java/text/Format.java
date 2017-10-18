/*    */ package java.text;
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
/*    */ public abstract class Format
/*    */   implements Serializable, Cloneable
/*    */ {
/*    */   public static class Field
/*    */     extends AttributedCharacterIterator.Attribute
/*    */   {
/*    */     protected Field(String name)
/*    */     {
/* 46 */       super();throw new RuntimeException("Stub!"); } }
/*    */   
/* 48 */   protected Format() { throw new RuntimeException("Stub!"); }
/* 49 */   public final String format(Object obj) { throw new RuntimeException("Stub!"); }
/*    */   public abstract StringBuffer format(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/* 51 */   public AttributedCharacterIterator formatToCharacterIterator(Object obj) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Object parseObject(String paramString, ParsePosition paramParsePosition);
/* 53 */   public Object parseObject(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/* 54 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\Format.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */