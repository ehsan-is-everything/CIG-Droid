/*    */ package java.text;
/*    */ 
/*    */ import java.io.InvalidObjectException;
/*    */ import java.util.Locale;
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
/*    */ public class MessageFormat
/*    */   extends Format
/*    */ {
/*    */   public static class Field
/*    */     extends Format.Field
/*    */   {
/*    */     protected Field(String name)
/*    */     {
/* 47 */       super();throw new RuntimeException("Stub!"); }
/* 48 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); }
/*    */     
/* 50 */     public static final Field ARGUMENT = null; }
/*    */   
/* 52 */   public MessageFormat(String pattern) { throw new RuntimeException("Stub!"); }
/* 53 */   public MessageFormat(String pattern, Locale locale) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/* 55 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/*    */   
/* 57 */   public void applyPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 58 */   public String toPattern() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setFormatsByArgumentIndex(Format[] newFormats) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setFormats(Format[] newFormats) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setFormatByArgumentIndex(int argumentIndex, Format newFormat) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setFormat(int formatElementIndex, Format newFormat) { throw new RuntimeException("Stub!"); }
/* 63 */   public Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); }
/* 64 */   public Format[] getFormats() { throw new RuntimeException("Stub!"); }
/* 65 */   public final StringBuffer format(Object[] arguments, StringBuffer result, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 66 */   public static String format(String pattern, Object... arguments) { throw new RuntimeException("Stub!"); }
/* 67 */   public final StringBuffer format(Object arguments, StringBuffer result, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 68 */   public AttributedCharacterIterator formatToCharacterIterator(Object arguments) { throw new RuntimeException("Stub!"); }
/* 69 */   public Object[] parse(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 70 */   public Object[] parse(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/* 71 */   public Object parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 72 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 74 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\MessageFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */