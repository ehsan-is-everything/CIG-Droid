/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.io.InvalidObjectException;
/*    */ import java.text.AttributedCharacterIterator;
/*    */ import java.text.FieldPosition;
/*    */ import java.text.Format;
/*    */ import java.text.Format.Field;
/*    */ import java.text.ParseException;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class MessageFormat extends UFormat
/*    */ {
/*    */   public static class Field extends Format.Field
/*    */   {
/*    */     protected Field(String name)
/*    */     {
/* 21 */       super();throw new RuntimeException("Stub!"); }
/* 22 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); }
/*    */     
/* 24 */     public static final Field ARGUMENT = null; }
/*    */   
/* 26 */   public MessageFormat(String pattern) { throw new RuntimeException("Stub!"); }
/* 27 */   public MessageFormat(String pattern, Locale locale) { throw new RuntimeException("Stub!"); }
/* 28 */   public MessageFormat(String pattern, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setLocale(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 31 */   public Locale getLocale() { throw new RuntimeException("Stub!"); }
/* 32 */   public ULocale getULocale() { throw new RuntimeException("Stub!"); }
/* 33 */   public void applyPattern(String pttrn) { throw new RuntimeException("Stub!"); }
/* 34 */   public void applyPattern(String pattern, MessagePattern.ApostropheMode aposMode) { throw new RuntimeException("Stub!"); }
/* 35 */   public MessagePattern.ApostropheMode getApostropheMode() { throw new RuntimeException("Stub!"); }
/* 36 */   public String toPattern() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setFormatsByArgumentIndex(Format[] newFormats) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setFormatsByArgumentName(Map<String, Format> newFormats) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setFormats(Format[] newFormats) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setFormatByArgumentIndex(int argumentIndex, Format newFormat) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setFormatByArgumentName(String argumentName, Format newFormat) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setFormat(int formatElementIndex, Format newFormat) { throw new RuntimeException("Stub!"); }
/* 43 */   public Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); }
/* 44 */   public Format[] getFormats() { throw new RuntimeException("Stub!"); }
/* 45 */   public Set<String> getArgumentNames() { throw new RuntimeException("Stub!"); }
/* 46 */   public Format getFormatByArgumentName(String argumentName) { throw new RuntimeException("Stub!"); }
/* 47 */   public final StringBuffer format(Object[] arguments, StringBuffer result, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 48 */   public final StringBuffer format(Map<String, Object> arguments, StringBuffer result, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 49 */   public static String format(String pattern, Object... arguments) { throw new RuntimeException("Stub!"); }
/* 50 */   public static String format(String pattern, Map<String, Object> arguments) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean usesNamedArguments() { throw new RuntimeException("Stub!"); }
/* 52 */   public final StringBuffer format(Object arguments, StringBuffer result, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 53 */   public AttributedCharacterIterator formatToCharacterIterator(Object arguments) { throw new RuntimeException("Stub!"); }
/* 54 */   public Object[] parse(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 55 */   public Map<String, Object> parseToMap(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 56 */   public Object[] parse(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/* 57 */   public Map<String, Object> parseToMap(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/* 58 */   public Object parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 59 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 61 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 62 */   public static String autoQuoteApostrophe(String pattern) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\MessageFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */